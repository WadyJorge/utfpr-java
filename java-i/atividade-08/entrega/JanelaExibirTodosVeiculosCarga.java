import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JanelaExibirTodosVeiculosCarga implements ActionListener {

	private BDVeiculos bdVeiculos;
	private static JFrame janelaImprimirVeiculosCarga = new JFrame("Imprimir / Excluir Todos");

	private static final String[] COLUNAS_VEICULO_CARGA = { "Placa", "Marca", "Modelo", "Cor", "Velocidade Máxima", "Qtd. Rodas", "Qtd. Pistões", "Potência", "Carga Máxima", "Tara" };
	private static final int larg = 1000, alt = 450;

	private DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);
	private JTable tabelaCargaDados = new JTable(modeloTabela);
	private JScrollPane barraRolagem = new JScrollPane(tabelaCargaDados);

	private JButton botaoImprimirTodos = new JButton("Imprimir Todos");
	private JButton botaoExcluirTodos = new JButton("Excluir Todos");
	private JButton botaoSair = new JButton("Sair");


	public JanelaExibirTodosVeiculosCarga(BDVeiculos bdVeiculos) {
		this.bdVeiculos = bdVeiculos;
		inicializar();
	}

	@Override
	public void actionPerformed(ActionEvent act) {

		if (act.getSource().equals(botaoImprimirTodos)) {
			imprimirVeiculosCarga();

		} else if (act.getSource().equals(botaoExcluirTodos)) {

			if (excluirTodosDados()) {
				JOptionPane.showMessageDialog(null, "Veiculos removidos com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel model = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);
				tabelaCargaDados.setModel(model);
			}

		} else if (act.getSource().equals(botaoSair)) {
			janelaImprimirVeiculosCarga.dispose();
		}
	}

	public void inicializar() {

		janelaImprimirVeiculosCarga = new JFrame("Imprimir / Excluir Todos");
		janelaImprimirVeiculosCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janelaImprimirVeiculosCarga.setLayout(new GridLayout(4, 1));
		janelaImprimirVeiculosCarga.setSize(larg, alt);
		janelaImprimirVeiculosCarga.setResizable(false);
		janelaImprimirVeiculosCarga.setLocationRelativeTo(null);

		botaoImprimirTodos.setMnemonic('I');
		botaoImprimirTodos.addActionListener(this);

		botaoExcluirTodos.setMnemonic('E');
		botaoExcluirTodos.addActionListener(this);

		botaoSair.setMnemonic('S');
		botaoSair.addActionListener(this);

		janelaImprimirVeiculosCarga.add(barraRolagem);
		janelaImprimirVeiculosCarga.add(botaoImprimirTodos);
		janelaImprimirVeiculosCarga.add(botaoExcluirTodos);
		janelaImprimirVeiculosCarga.add(botaoSair);

		janelaImprimirVeiculosCarga.setVisible(true);
	}

	private void imprimirVeiculosCarga() {

		List<Carga> listaCarga = bdVeiculos.listarTodosVeiculosCarga();

		if (listaCarga.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem Veículos de Carga cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {

			modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_CARGA, 0);

			for (Carga veiculoCarga : listaCarga) {
				String[] dados = { 
						veiculoCarga.getPlaca(),
						veiculoCarga.getMarca(), 
						veiculoCarga.getModelo(), 
						veiculoCarga.getCor(), 
						String.valueOf(veiculoCarga.getVelocMax()), 
						String.valueOf(veiculoCarga.getQtdRodas()), 
						String.valueOf(veiculoCarga.getMotor().getQtdPist()), 
						String.valueOf(veiculoCarga.getMotor().getPotencia()), 
						String.valueOf(veiculoCarga.getCargaMax()), 
						String.valueOf(veiculoCarga.getTara()), 
				};

				modeloTabela.addRow(dados);
			}

			janelaImprimirVeiculosCarga.setLayout(new GridLayout(4, 1));
			tabelaCargaDados.setModel(modeloTabela);
		}
	}

	public boolean excluirTodosDados() {

		List<Carga> listaCarga = bdVeiculos.listarTodosVeiculosCarga();

		if (listaCarga.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem dados para serem removidos", "Erro", JOptionPane.ERROR_MESSAGE);
			return false;
		} else {

			bdVeiculos.excluirTodosVeiculosCarga(listaCarga);
		}
		return true;
	}

}