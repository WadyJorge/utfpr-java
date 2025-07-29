import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Leitura {

    public String entDados(String prompt) {
        System.out.println(prompt);

        // Usando InputStreamReader para ler dados do console
        InputStreamReader teclado = new InputStreamReader(System.in);
        // Usando BufferedReader para ler linhas de texto de forma eficiente
        BufferedReader buffer = new BufferedReader(teclado);

        String ret = " ";

        try {
            ret = buffer.readLine();
        } catch (IOException e) {
            System.out.println("\n Erro de sistema!" + e.getMessage());
        }

        return ret;
    }

}