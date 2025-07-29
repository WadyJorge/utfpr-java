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

public class JanelaExibirTodosVeiculosPasseio implements ActionListener {

	private BDVeiculos bdVeiculos;
	private static JFrame janelaImprimirVeiculosPasseio = new JFrame("Imprimir / Excluir Todos");

	private static final String[] COLUNAS_VEICULO_PASSEIO = { "Placa", "Marca", "Modelo", "Cor", "Velocidade Máxima", "Qtd. Rodas", "Qtd. Pistões", "Potência", "Qtd. Passageiros" };
	private static final int larg = 1000, alt = 450;

	private DefaultTableModel modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);
	private JTable tabelaPasseioDados = new JTable(modeloTabela);
	private JScrollPane barraRolagem = new JScrollPane(tabelaPasseioDados);

	private JButton botaoImprimirTodos = new JButton("Imprimir Todos");
	private JButton botaoExcluirTodos = new JButton("Excluir Todos");
	private JButton botaoSair = new JButton("Sair");

	public JanelaExibirTodosVeiculosPasseio(BDVeiculos bdVeiculos) {
		this.bdVeiculos = bdVeiculos;
		inicializar();
	}

	@Override
	public void actionPerformed(ActionEvent act) {

		if (act.getSource().equals(botaoImprimirTodos)) {
			imprimirVeiculosPasseio();

		} else if (act.getSource().equals(botaoExcluirTodos)) {

			if (excluirTodosDados()) {
				JOptionPane.showMessageDialog(null, "Veículos removidos com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel model = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);
				tabelaPasseioDados.setModel(model);
			}

		} else if (act.getSource().equals(botaoSair)) {
			janelaImprimirVeiculosPasseio.dispose();
		}
	}

	public void inicializar() {

		janelaImprimirVeiculosPasseio = new JFrame("Imprimir / Excluir Todos");
		janelaImprimirVeiculosPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janelaImprimirVeiculosPasseio.setLayout(new GridLayout(4, 1));
		janelaImprimirVeiculosPasseio.setSize(larg, alt);
		janelaImprimirVeiculosPasseio.setResizable(false);
		janelaImprimirVeiculosPasseio.setLocationRelativeTo(null);

		botaoImprimirTodos.setMnemonic('I');
		botaoImprimirTodos.addActionListener(this);

		botaoExcluirTodos.setMnemonic('E');
		botaoExcluirTodos.addActionListener(this);

		botaoSair.setMnemonic('S');
		botaoSair.addActionListener(this);

		janelaImprimirVeiculosPasseio.add(barraRolagem);
		janelaImprimirVeiculosPasseio.add(botaoImprimirTodos);
		janelaImprimirVeiculosPasseio.add(botaoExcluirTodos);
		janelaImprimirVeiculosPasseio.add(botaoSair);

		janelaImprimirVeiculosPasseio.setVisible(true);
	}

	private void imprimirVeiculosPasseio() {

		List<Passeio> listaPasseio = bdVeiculos.listarTodosVeiculosPasseio();

		if (listaPasseio.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem Veículos de Passeio cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {

			modeloTabela = new DefaultTableModel(COLUNAS_VEICULO_PASSEIO, 0);

			for (Passeio veiculoPasseio : listaPasseio) {
				String[] dados = {
						veiculoPasseio.getPlaca(),
						veiculoPasseio.getMarca(),
						veiculoPasseio.getModelo(),
						veiculoPasseio.getCor(),
						String.valueOf(veiculoPasseio.getVelocMax()),
						String.valueOf(veiculoPasseio.getQtdRodas()),
						String.valueOf(veiculoPasseio.getMotor().getQtdPist()),
						String.valueOf(veiculoPasseio.getMotor().getPotencia()),
						String.valueOf(veiculoPasseio.getQtdPassageiros()),
				};

				modeloTabela.addRow(dados);
			}

			janelaImprimirVeiculosPasseio.setLayout(new GridLayout(4, 1));
			tabelaPasseioDados.setModel(modeloTabela);
		}
	}

	public boolean excluirTodosDados() {

		List<Passeio> listaPasseio = bdVeiculos.listarTodosVeiculosPasseio();

		if (listaPasseio.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem dados para serem removidos", "ERRO", JOptionPane.ERROR_MESSAGE);
			return false;
		} else {
			bdVeiculos.excluirTodosVeiculosPasseio(listaPasseio);
		}
		return true;
	}

}