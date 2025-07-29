import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JanelaConsultarVeiculoCarga implements ActionListener {

	private BDVeiculos bdVeiculos;
	private static Carga resultadoVeiculoCarga = null;

	private static JFrame janelaConsultarVeiculoCarga = new JFrame("Consultar / Excluir pela placa");

	private static final String[] COLUNAS_VEICULO_CARGA = { "Placa", "Marca", "Modelo", "Cor", "Velocidade Máxima", "Qtd. Rodas", "Qtd. Pistões", "Potência", "Carga Máxima", "Tara" };
	private static final int larg = 1000, alt = 350;

	private DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);
	private JTable tabelaCargaDados = new JTable(modeloTabela);
	private JScrollPane barraRolagem = new JScrollPane(tabelaCargaDados);

	private JButton botaoConsultar = new JButton("Consultar");
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSair = new JButton("Sair");
	private JTextField campoPlaca = new JTextField(10);

	public JanelaConsultarVeiculoCarga(BDVeiculos bdVeiculos) {
		this.bdVeiculos = bdVeiculos;
		inicializar();
	}

	@Override
	public void actionPerformed(ActionEvent act) {

		if (act.getSource().equals(botaoConsultar)) {
			consultarVeiculoCargaPorPlaca();

		} else if (act.getSource().equals(botaoExcluir)) {

			if (excluirVeiculoCarga()) {
				JOptionPane.showMessageDialog(null, "Veículo removido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);
				campoPlaca.setText("");
				tabelaCargaDados.setModel(modeloTabela);
			}

		} else if (act.getSource().equals(botaoSair)) {
			janelaConsultarVeiculoCarga.dispose();
		}
	}

	public void inicializar() {

		janelaConsultarVeiculoCarga = new JFrame("Consultar / Excluir pela placa");
		janelaConsultarVeiculoCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janelaConsultarVeiculoCarga.setSize(larg, alt);
		janelaConsultarVeiculoCarga.setLayout(new GridLayout(7, 1));
		janelaConsultarVeiculoCarga.setResizable(false);
		janelaConsultarVeiculoCarga.setLocationRelativeTo(null);

		JLabel labelPlaca = new JLabel("Informe a placa para consultar: ");
		campoPlaca.setText("");
		janelaConsultarVeiculoCarga.add(labelPlaca);
		janelaConsultarVeiculoCarga.add(campoPlaca);

		botaoConsultar.setMnemonic('C');
		botaoConsultar.addActionListener(this);

		botaoExcluir.setMnemonic('E');
		botaoExcluir.addActionListener(this);

		botaoSair.setMnemonic('S');
		botaoSair.addActionListener(this);

		janelaConsultarVeiculoCarga.add(barraRolagem);
		janelaConsultarVeiculoCarga.add(botaoConsultar);
		janelaConsultarVeiculoCarga.add(botaoExcluir);
		janelaConsultarVeiculoCarga.add(botaoSair);

		janelaConsultarVeiculoCarga.setVisible(true);
	}

	private boolean excluirVeiculoCarga() {

		if (campoPlaca.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Você precisa informar uma placa", "Aviso", JOptionPane.WARNING_MESSAGE);
		} else {

			if (resultadoVeiculoCarga != null && resultadoVeiculoCarga.getPlaca().equals(campoPlaca.getText())) {

				if (bdVeiculos.excluirVeiculoCarga(resultadoVeiculoCarga)) {
					return true;
				}
			} else {
				Carga carga = bdVeiculos.listarTodosVeiculosCarga().stream().filter(i -> i.getPlaca().equals(campoPlaca.getText())).findFirst().orElse(null);

				if (carga == null) {
					JOptionPane.showMessageDialog(null, "Não existe nenhum Veículo de Carga com placa: " + campoPlaca.getText(), "Aviso", JOptionPane.WARNING_MESSAGE);
				} else {

					if (bdVeiculos.excluirVeiculoCarga(carga)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private void consultarVeiculoCargaPorPlaca() {

		if (campoPlaca.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Informe uma placa para consultar:", "Aviso", JOptionPane.WARNING_MESSAGE);
		} else {

			modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);
			resultadoVeiculoCarga = bdVeiculos.listarTodosVeiculosCarga().stream().filter(i -> i.getPlaca().equals(campoPlaca.getText())).findFirst().orElse(null);

			if (resultadoVeiculoCarga != null) {
				String[] dados = {
						resultadoVeiculoCarga.getPlaca(),
						resultadoVeiculoCarga.getMarca(),
						resultadoVeiculoCarga.getModelo(),
						resultadoVeiculoCarga.getCor(),
						String.valueOf(resultadoVeiculoCarga.getVelocMax()),
						String.valueOf(resultadoVeiculoCarga.getQtdRodas()),
						String.valueOf(resultadoVeiculoCarga.getMotor().getQtdPist()),
						String.valueOf(resultadoVeiculoCarga.getMotor().getPotencia()),
						String.valueOf(resultadoVeiculoCarga.getCargaMax()),
						String.valueOf(resultadoVeiculoCarga.getTara()),
				};

				modeloTabela.addRow(dados);
				janelaConsultarVeiculoCarga.setLayout(new GridLayout(4, 1));
				tabelaCargaDados.setModel(modeloTabela);
			} else {
				JOptionPane.showMessageDialog(null, "Não existe nenhum Veículo de Carga com a placa: " + campoPlaca.getText(), "Aviso", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}