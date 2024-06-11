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

public class JanelaConsultarVeiculoPasseio implements ActionListener {

	private BDVeiculos bdVeiculos;
	private static Passeio resultadoVeiculoPasseio = null;

	private static JFrame janelaConsultarVeiculoPasseio = new JFrame("Consultar / Excluir pela placa");

	private static final String[] COLUNAS_VEICULO_PASSEIO = { "Placa", "Marca", "Modelo", "Cor", "Velocidade Máxima", "Qtd. Rodas", "Qtd. Pistões", "Potência", "Qtd. Passageiros" };
	private static final int larg = 1000, alt = 350;

	private DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);
	private JTable tabelaPasseioDados = new JTable(modeloTabela);
	private JScrollPane barraRolagem = new JScrollPane(tabelaPasseioDados);

	private JButton botaoConsultar = new JButton("Consultar");
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSair = new JButton("Sair");
	private JTextField campoPlaca = new JTextField(10);

	public JanelaConsultarVeiculoPasseio(BDVeiculos bdVeiculos) {
		this.bdVeiculos = bdVeiculos;
		inicializar();
	}

	@Override
	public void actionPerformed(ActionEvent act) {

		if (act.getSource().equals(botaoConsultar)) {
			consultarVeiculoPasseioPorPlaca();

		} else if (act.getSource().equals(botaoExcluir)) {

			if (excluirVeiculoPasseio()) {
				JOptionPane.showMessageDialog(null, "Veículo removido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);
				campoPlaca.setText("");
				tabelaPasseioDados.setModel(modeloTabela);
			}

		} else if (act.getSource().equals(botaoSair)) {
			janelaConsultarVeiculoPasseio.dispose();
		}
	}

	public void inicializar() {

		janelaConsultarVeiculoPasseio = new JFrame("Consultar / Excluir pela placa");
		janelaConsultarVeiculoPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janelaConsultarVeiculoPasseio.setSize(larg, alt);
		janelaConsultarVeiculoPasseio.setLayout(new GridLayout(7, 1));
		janelaConsultarVeiculoPasseio.setResizable(false);
		janelaConsultarVeiculoPasseio.setLocationRelativeTo(null);

		JLabel labelPlaca = new JLabel("Informe a placa para consultar: ");
		campoPlaca.setText("");
		janelaConsultarVeiculoPasseio.add(labelPlaca);
		janelaConsultarVeiculoPasseio.add(campoPlaca);

		botaoConsultar.setMnemonic('C');
		botaoConsultar.addActionListener(this);

		botaoExcluir.setMnemonic('E');
		botaoExcluir.addActionListener(this);

		botaoSair.setMnemonic('S');
		botaoSair.addActionListener(this);

		janelaConsultarVeiculoPasseio.add(barraRolagem);
		janelaConsultarVeiculoPasseio.add(botaoConsultar);
		janelaConsultarVeiculoPasseio.add(botaoExcluir);
		janelaConsultarVeiculoPasseio.add(botaoSair);

		janelaConsultarVeiculoPasseio.setVisible(true);
	}

	private boolean excluirVeiculoPasseio() {

		if (campoPlaca.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Você precisa informar uma placa", "Aviso", JOptionPane.WARNING_MESSAGE);
		} else {

			if (resultadoVeiculoPasseio != null && resultadoVeiculoPasseio.getPlaca().equals(campoPlaca.getText())) {
				if (bdVeiculos.excluirVeiculoPasseio(resultadoVeiculoPasseio)) {
					return true;
				}
			} else {
				Passeio passeio = bdVeiculos.listarTodosVeiculosPasseio().stream().filter(i -> i.getPlaca().equals(campoPlaca.getText())).findFirst().orElse(null);

				if (passeio == null) {
					JOptionPane.showMessageDialog(null, "Não existe nenhum Veículo de Passeio com a placa: " + campoPlaca.getText(), "Aviso", JOptionPane.WARNING_MESSAGE);
				} else {

					if (bdVeiculos.excluirVeiculoPasseio(passeio)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private void consultarVeiculoPasseioPorPlaca() {

		if (campoPlaca.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Informe uma placa para consultar:", "Aviso", JOptionPane.WARNING_MESSAGE);
		} else {

			modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);
			resultadoVeiculoPasseio = bdVeiculos.listarTodosVeiculosPasseio().stream().filter(i -> i.getPlaca().equals(campoPlaca.getText())).findFirst().orElse(null);

			if (resultadoVeiculoPasseio != null) {
				String[] dados = {
						resultadoVeiculoPasseio.getPlaca(),
						resultadoVeiculoPasseio.getMarca(),
						resultadoVeiculoPasseio.getModelo(),
						resultadoVeiculoPasseio.getCor(),
						String.valueOf(resultadoVeiculoPasseio.getVelocMax()),
						String.valueOf(resultadoVeiculoPasseio.getQtdRodas()),
						String.valueOf(resultadoVeiculoPasseio.getMotor().getQtdPist()),
						String.valueOf(resultadoVeiculoPasseio.getMotor().getPotencia()),
						String.valueOf(resultadoVeiculoPasseio.getQtdPassageiros()),
				};

				modeloTabela.addRow(dados);
				janelaConsultarVeiculoPasseio.setLayout(new GridLayout(4, 1));
				tabelaPasseioDados.setModel(modeloTabela);
			} else {
				JOptionPane.showMessageDialog(null, "Não existe nenhum Veículo de Passeio com placa: " + campoPlaca.getText(), "Aviso", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}