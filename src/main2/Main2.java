package main2;
import frequencia.FrequenciaCardiaca;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a data de nascimento (ano-mes-data): ");
        String dataNascimentoStr = entrada.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        FrequenciaCardiaca frequencia = new FrequenciaCardiaca("","",null);

        frequencia.setNome(nome);
        frequencia.setSobrenome(sobrenome);
        frequencia.setDataNascimento(dataNascimento);

        System.out.println("Informacoes do Perfil de Saude:");
        System.out.println("Nome: " + frequencia.getNome() + " " + frequencia.getSobrenome());
        System.out.println("Data de nascimento: " + frequencia.getDataNascimento());
        System.out.println("Frequencia cardiaca Maxima: " + frequencia.calcularFrequenciaCardiacaMaxima() + " bpm");

        System.out.println("Frequencia cardiaca Alvo: " + frequencia.calcularFrequenciaCardiacaAlvo() + " bpm");
    }
}
