import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class Teste implements ActionListener {

	private static BDVeiculos bdVeiculos = new BDVeiculos();
	private static JFrame janelaInicial = new JFrame("Gestão de Veiculos");
	private static JFrame janelaPasseio = new JFrame("Gestão de Veiculos de Passeio");
	private static JFrame janelaCarga = new JFrame("Gestão de Veiculos de Carga");
	private static JPanel painel = new JPanel();

	private static JButton botaoVeiculoPasseio = new JButton("Veículos de Passeio");
	private static JButton botaoVeiculoCarga = new JButton("Veículos de Carga");
	private static int larg = 400, alt = 250;

	private static JButton botaoVeiculoPasseioCadastrar = new JButton("Cadastrar");
	private static JButton botaoVeiculoPasseioConsultar = new JButton("Consultar / Excluir pela placa");
	private static JButton botaoVeiculoPasseioImprimir = new JButton("Imprimir / Excluir Todos");
	private static JButton botaoVeiculoPasseioSair = new JButton("Sair");

	private static JButton botaoVeiculoCargaCadastrar = new JButton("Cadastrar");
	private static JButton botaoVeiculoCargaConsultar = new JButton("Consultar / Excluir pela placa");
	private static JButton botaoVeiculoCargaImprimir = new JButton("Imprimir / Excluir Todos");
	private static JButton botaoVeiculoCargaSair = new JButton("Sair");

	private static JFrame janelaCadastrarVeiculoPasseio = new JFrame("Cadastrar");
	private static JFrame janelaCadastrarVeiculoCarga = new JFrame("Cadastrar");

	private static Passeio resultadoVeiculoPasseio = null;
	private static Carga resultadoVeiculoCarga = null;

	static Teste principal = new Teste();

	public static void main(String[] args) {

		janelaInicial.setResizable(false);
		janelaInicial.setLocationRelativeTo(null);
		janelaInicial.setSize(larg, alt);
		janelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaInicial.setLayout(new FlowLayout());
		janelaInicial.add(botaoVeiculoPasseio);
		janelaInicial.add(botaoVeiculoCarga);

        botaoVeiculoPasseio.setBackground(Color.CYAN);
        botaoVeiculoPasseioCadastrar.addActionListener(principal);
        botaoVeiculoPasseioConsultar.addActionListener(principal);
        botaoVeiculoPasseioImprimir.addActionListener(principal);
        botaoVeiculoPasseioSair.addActionListener(principal);

        botaoVeiculoPasseio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {

				janelaPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				janelaPasseio.setSize(larg, alt);
				janelaPasseio.setLayout(new GridLayout(4, 1));
				janelaPasseio.setResizable(false);
				janelaPasseio.setLocationRelativeTo(null);

				janelaPasseio.add(botaoVeiculoPasseioCadastrar);
				janelaPasseio.add(botaoVeiculoPasseioConsultar);
				janelaPasseio.add(botaoVeiculoPasseioImprimir);
				janelaPasseio.add(botaoVeiculoPasseioSair);

				janelaPasseio.setVisible(true);
			}
		});

		botaoVeiculoCarga.setBackground(Color.GREEN);
		botaoVeiculoCargaCadastrar.addActionListener(principal);
		botaoVeiculoCargaConsultar.addActionListener(principal);
		botaoVeiculoCargaImprimir.addActionListener(principal);
		botaoVeiculoCargaSair.addActionListener(principal);

		botaoVeiculoCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {

				janelaCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				janelaCarga.setSize(larg, alt);
				janelaCarga.setLayout(new GridLayout(4, 1));
				janelaCarga.setResizable(false);
				janelaCarga.setLocationRelativeTo(null);

				janelaCarga.add(botaoVeiculoCargaCadastrar);
				janelaCarga.add(botaoVeiculoCargaConsultar);
				janelaCarga.add(botaoVeiculoCargaImprimir);
				janelaCarga.add(botaoVeiculoCargaSair);

				janelaCarga.setVisible(true);
			}
		});

		janelaInicial.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent act) {

		if (act.getSource().equals(botaoVeiculoPasseioCadastrar)) {

			cadastrarVeiculoPasseio();
		} else if (act.getSource().equals(botaoVeiculoPasseioConsultar)) {

			new JanelaConsultarVeiculoPasseio(bdVeiculos);
		} else if (act.getSource().equals(botaoVeiculoPasseioImprimir)) {

			new JanelaExibirTodosVeiculosPasseio(bdVeiculos);
		} else if (act.getSource().equals(botaoVeiculoPasseioSair)) {

			janelaPasseio.dispose();
		} else if (act.getSource().equals(botaoVeiculoCargaCadastrar)) {

			cadastrarVeiculoCarga();
		} else if (act.getSource().equals(botaoVeiculoCargaConsultar)) {

			new JanelaConsultarVeiculoCarga(bdVeiculos);
		} else if (act.getSource().equals(botaoVeiculoCargaImprimir)) {

			new JanelaExibirTodosVeiculosCarga(bdVeiculos);
		} else if (act.getSource().equals(botaoVeiculoCargaSair)) {

			janelaCarga.dispose();
		}
	}

	public static void cadastrarVeiculoPasseio() {

		try {
			janelaCadastrarVeiculoPasseio.setContentPane(new Container());
			janelaCadastrarVeiculoPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janelaCadastrarVeiculoPasseio.setResizable(false);
			janelaCadastrarVeiculoPasseio.setSize(larg, alt);
			janelaCadastrarVeiculoPasseio.setLocationRelativeTo(null);
			janelaCadastrarVeiculoPasseio.setLayout(new FlowLayout());

			JButton botaoCadastrar = new JButton("Cadastrar");
			JButton botaoLimpar = new JButton("Limpar");
			JButton botaoNovo = new JButton("Novo");
			JButton botaoSair = new JButton("Sair");

			Container container = janelaCadastrarVeiculoPasseio.getContentPane();
			JPanel painelVeiculo = new JPanel();
			painelVeiculo.setLayout(new BoxLayout(painelVeiculo, BoxLayout.Y_AXIS));

			JLabel qtdPassageirosLabel = new JLabel("Qtd. Passageiros: ");
			JFormattedTextField qtdPassageirosValue = numberFormat();
			painelVeiculo.add(qtdPassageirosLabel);
			painelVeiculo.add(qtdPassageirosValue);

			JLabel placaLabel = new JLabel("Placa: ");
			JTextField placaValue = new JTextField(10);
			painelVeiculo.add(placaLabel);
			painelVeiculo.add(placaValue);

			JLabel marcaLabel = new JLabel("Marca: ");
			JTextField marcaValue = new JTextField(10);
			painelVeiculo.add(marcaLabel);
			painelVeiculo.add(marcaValue);

			JLabel modeloLabel = new JLabel("Modelo: ");
			JTextField modeloValue = new JTextField(10);
			painelVeiculo.add(modeloLabel);
			painelVeiculo.add(modeloValue);

			JLabel corLabel = new JLabel("Cor: ");
			JTextField corValue = new JTextField(10);
			painelVeiculo.add(corLabel);
			painelVeiculo.add(corValue);

			JLabel velocMaxLabel = new JLabel("Velocidade Máxima: ");
			JFormattedTextField velocMaxValue = numberFormat();
			painelVeiculo.add(velocMaxLabel);
			painelVeiculo.add(velocMaxValue);

			JLabel qtdRodasLabel = new JLabel("Qtd. Rodas: ");
			JFormattedTextField qtdRodasValue = numberFormat();
			painelVeiculo.add(qtdRodasLabel);
			painelVeiculo.add(qtdRodasValue);

			JLabel qtdPistLabel = new JLabel("Qtd. Pistões: ");
			JFormattedTextField qtdPistValue = numberFormat();
			painelVeiculo.add(qtdPistLabel);
			painelVeiculo.add(qtdPistValue);

			JLabel potenciaLabel = new JLabel("Potência: ");
			JFormattedTextField potenciaValue = numberFormat();
			painelVeiculo.add(potenciaLabel);
			painelVeiculo.add(potenciaValue);

			botaoCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

                if (qtdPassageirosValue.getText().isEmpty() ||
					placaValue.getText().isEmpty() ||
                  	marcaValue.getText().isEmpty() ||
                	modeloValue.getText().isEmpty() ||
                	corValue.getText().isEmpty() ||
					velocMaxValue.getText().isEmpty() ||
                 	qtdRodasValue.getText().isEmpty() ||
                    qtdPistValue.getText().isEmpty() ||
                    potenciaValue.getText().isEmpty()) {

               			JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
						return;
					}
				
					Passeio novoPasseio = new Passeio(
							Integer.parseInt(qtdPassageirosValue.getText()),
							placaValue.getText(), 
                            marcaValue.getText(), 
                            modeloValue.getText(),
                        	corValue.getText(),
							Integer.parseInt(velocMaxValue.getText()), 
							Integer.parseInt(qtdRodasValue.getText()), 
                            Integer.parseInt(qtdPistValue.getText()), 
                            Integer.parseInt(potenciaValue.getText()));
						
					try {

						if (bdVeiculos.listarTodosVeiculosPasseio().stream().anyMatch(i -> i.getPlaca().equalsIgnoreCase(placaValue.getText()))) {
							throw new VeicExistException();
						}

						try {
							novoPasseio.setVelocMaxPasseio(Integer.parseInt(velocMaxValue.getText()));
						} catch (VelocException e) {

							JOptionPane.showMessageDialog(null, e.mensagemErro(), "Aviso", JOptionPane.WARNING_MESSAGE);
						}

						if (bdVeiculos.cadastrarPasseio(novoPasseio)) {

							int resultado = JOptionPane.showConfirmDialog(null,
									"Veículo de Passeio criado. Deseja adicionar mais? ", "Sucesso",
									JOptionPane.YES_NO_OPTION);

							if (resultado == 0) {
								botaoNovo.doClick();
							} else {

								janelaCadastrarVeiculoPasseio.dispose();
							}
						} else {

							JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o Veículo de Passeio",
									"Erro", JOptionPane.ERROR_MESSAGE);
							janelaCadastrarVeiculoPasseio.dispose();
						}

					
					} catch (VeicExistException e) {

						JOptionPane.showMessageDialog(null, e.mensagemErro(), "Erro", JOptionPane.ERROR_MESSAGE);
						janelaCadastrarVeiculoPasseio.dispose();
					}
				}
			});

			botaoSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					janelaCadastrarVeiculoPasseio.dispose();
				}
			});
		
			botaoNovo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					qtdPassageirosValue.setText("0");
                    placaValue.setText("");
                    marcaValue.setText("");
					modeloValue.setText("");
					corValue.setText("");
					velocMaxValue.setText("0");
					qtdRodasValue.setText("0");
					qtdPistValue.setText("0");
					potenciaValue.setText("0");
				}
			});

			botaoLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					qtdPassageirosValue.setText("0");
					placaValue.setText("");
					marcaValue.setText("");
					modeloValue.setText("");
					corValue.setText("");
					velocMaxValue.setText("0");
					qtdRodasValue.setText("0");
					qtdPistValue.setText("0");
					potenciaValue.setText("0");
				}
			});

			container.add(painelVeiculo);

			janelaCadastrarVeiculoPasseio.add(botaoCadastrar);
			janelaCadastrarVeiculoPasseio.add(botaoLimpar);
			janelaCadastrarVeiculoPasseio.add(botaoNovo);
			janelaCadastrarVeiculoPasseio.add(botaoSair);

			janelaCadastrarVeiculoPasseio.pack();
			janelaCadastrarVeiculoPasseio.setVisible(true);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Os dados informados são inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
			janelaCadastrarVeiculoPasseio.dispose();
		}
	}
	
    public static void cadastrarVeiculoCarga() {

		try {
			janelaCadastrarVeiculoCarga.setContentPane(new Container());
			janelaCadastrarVeiculoCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janelaCadastrarVeiculoCarga.setResizable(false);
			janelaCadastrarVeiculoCarga.setSize(larg, alt);
			janelaCadastrarVeiculoCarga.setLocationRelativeTo(null);
			janelaCadastrarVeiculoCarga.setLayout(new FlowLayout());

			JButton botaoCadastrar = new JButton("Cadastrar");
			JButton botaoLimpar = new JButton("Limpar");
			JButton botaoNovo = new JButton("Novo");
			JButton botaoSair = new JButton("Sair");

			Container container = janelaCadastrarVeiculoCarga.getContentPane();
			JPanel painelCarga = new JPanel();
			painelCarga.setLayout(new BoxLayout(painelCarga, BoxLayout.Y_AXIS));

			JLabel cargaMaxLabel = new JLabel("Carga Máxima: ");
			JFormattedTextField cargaMaxValue = numberFormat();
			painelCarga.add(cargaMaxLabel);
			painelCarga.add(cargaMaxValue);

			JLabel taraLabel = new JLabel("Tara: ");
			JFormattedTextField taraValue = numberFormat();
			painelCarga.add(taraLabel);
			painelCarga.add(taraValue);

			JLabel placaLabel = new JLabel("Placa: ");
			JTextField placaValue = new JTextField(10);
			painelCarga.add(placaLabel);
			painelCarga.add(placaValue);

			JLabel marcaLabel = new JLabel("Marca: ");
			JTextField marcaValue = new JTextField(10);
			painelCarga.add(marcaLabel);
			painelCarga.add(marcaValue);

			JLabel modeloLabel = new JLabel("Modelo: ");
			JTextField modeloValue = new JTextField(10);
			painelCarga.add(modeloLabel);
			painelCarga.add(modeloValue);

			JLabel corLabel = new JLabel("Cor: ");
			JTextField corValue = new JTextField(10);
			painelCarga.add(corLabel);
			painelCarga.add(corValue);

			JLabel velocMaxLabel = new JLabel("Velocidade Máxima: ");
			JFormattedTextField velocMaxValue = numberFormat();
			painelCarga.add(velocMaxLabel);
			painelCarga.add(velocMaxValue);

			JLabel qtdRodasLabel = new JLabel("Qtd. Rodas: ");
			JFormattedTextField qtdRodasValue = numberFormat();
			painelCarga.add(qtdRodasLabel);
			painelCarga.add(qtdRodasValue);

			JLabel qtdPistLabel = new JLabel("Qtd. Pistões: ");
			JFormattedTextField qtdPistValue = numberFormat();
			painelCarga.add(qtdPistLabel);
			painelCarga.add(qtdPistValue);

			JLabel potenciaLabel = new JLabel("Potência: ");
			JFormattedTextField potenciaValue = numberFormat();
			painelCarga.add(potenciaLabel);
			painelCarga.add(potenciaValue);

			container.add(painelCarga);

			botaoCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					if (cargaMaxValue.getText().isEmpty() ||
					taraValue.getText().isEmpty() ||
					placaValue.getText().isEmpty() ||
                  	marcaValue.getText().isEmpty() ||
                	modeloValue.getText().isEmpty() ||
                	corValue.getText().isEmpty() ||
					velocMaxValue.getText().isEmpty() ||
                 	qtdRodasValue.getText().isEmpty() ||
                    qtdPistValue.getText().isEmpty() ||
                    potenciaValue.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
				}

					Carga novoCarga = new Carga(
						Integer.parseInt(cargaMaxValue.getText()),
						Integer.parseInt(taraValue.getText()),
						placaValue.getText(),
						marcaValue.getText(), 
						modeloValue.getText(), 
						corValue.getText(),
						Integer.parseInt(velocMaxValue.getText()),
						Integer.parseInt(qtdRodasValue.getText()), 
						Integer.parseInt(qtdPistValue.getText()),
						Integer.parseInt(potenciaValue.getText()));

					try {

						if (bdVeiculos.listarTodosVeiculosPasseio().stream().anyMatch(i -> i.getPlaca().equalsIgnoreCase(placaValue.getText()))) {
							throw new VeicExistException();
						}

						try {
							novoCarga.setVelocMaxCarga(Integer.parseInt(velocMaxValue.getText()));
						} catch (VelocException e) {

							JOptionPane.showMessageDialog(null, e.mensagemErro(), "Aviso", JOptionPane.WARNING_MESSAGE);
						}

						if (bdVeiculos.cadastrarCarga(novoCarga)) {

							int resultado = JOptionPane.showConfirmDialog(null,
									"Veículo de Carga criado. Deseja adicionar mais? ", "Sucesso",
									JOptionPane.YES_NO_OPTION);

							if (resultado == 0) {
								botaoNovo.doClick();
							} else {
								janelaCadastrarVeiculoCarga.dispose();
							}

						} else {

							JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o VeÍculo de Carga", "Erro", JOptionPane.ERROR_MESSAGE);
							janelaCadastrarVeiculoCarga.dispose();
						}

					} catch (VeicExistException e) {

						JOptionPane.showMessageDialog(null, e.mensagemErro(), "Erro", JOptionPane.ERROR_MESSAGE);
						janelaCadastrarVeiculoCarga.dispose();
					}
				}
			});

			botaoSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					janelaCadastrarVeiculoCarga.dispose();
				}
			});

			botaoNovo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					placaValue.setText("");
					marcaValue.setText("");
					modeloValue.setText("");
					corValue.setText("");
					velocMaxValue.setText("0");
					qtdRodasValue.setText("0");
					qtdPistValue.setText("0");
					potenciaValue.setText("0");
					cargaMaxValue.setText("0");
					taraValue.setText("0");
				}
			});

			botaoLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent act) {

					placaValue.setText("");
					marcaValue.setText("");
					modeloValue.setText("");
					corValue.setText("");
					velocMaxValue.setText("0");
					qtdRodasValue.setText("0");
					qtdPistValue.setText("0");
					potenciaValue.setText("0");
					cargaMaxValue.setText("0");
					taraValue.setText("0");
				}
			});

			janelaCadastrarVeiculoCarga.setContentPane(container);
			janelaCadastrarVeiculoCarga.add(botaoCadastrar);
			janelaCadastrarVeiculoCarga.add(botaoLimpar);
			janelaCadastrarVeiculoCarga.add(botaoNovo);
			janelaCadastrarVeiculoCarga.add(botaoSair);

			janelaCadastrarVeiculoCarga.pack();
			janelaCadastrarVeiculoCarga.setVisible(true);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Os dados informados são inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
			janelaCadastrarVeiculoCarga.dispose();
		}
	}

	private static JFormattedTextField numberFormat() {

		NumberFormat numberInstance = NumberFormat.getNumberInstance();

		NumberFormatter numberFormatter = new NumberFormatter(numberInstance);
		numberFormatter.setAllowsInvalid(false);
		numberFormatter.setMinimum(0);
		numberFormatter.setMaximum(999);

		JFormattedTextField numberFormat = new JFormattedTextField(numberFormatter);
		numberFormat.setColumns(10);
		numberFormat.setText("0");

		return numberFormat;
	}

}