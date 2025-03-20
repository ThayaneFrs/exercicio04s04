package main;

import perfildesaude.PerfilDeSaude;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite o sexo (M/F): ");
        String sexo = entrada.nextLine();

        System.out.println("Digite a data de nascimento (ano-mes-data): ");
        String dataNascimentoStr = entrada.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        System.out.println("Digite a altura (em metros): ");
        double altura= entrada.nextDouble();

        System.out.println("Digite o peso (em Kg): ");
        double peso = entrada.nextDouble();

        PerfilDeSaude perfil = new PerfilDeSaude("", "", "", null, 0.0, 0.0);

        perfil.setNome(nome);
        perfil.setSobrenome(sobrenome);
        perfil.setSexo(sexo);
        perfil.setDataNascimento(dataNascimento);
        perfil.setAltura(altura);
        perfil.setPeso(peso);

        System.out.println("Informacoes do Perfil de Saude:");
        System.out.println("Nome: " + perfil.getNome() + " " + perfil.getSobrenome());
        System.out.println("Sexo:" + perfil.getSexo());
        System.out.println("Data de nascimento: " + perfil.getDataNascimento());
        System.out.println("Altura: " + perfil.getAltura() + " metros");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("Idade: " + perfil.calcularIdade() + " anos");

        System.out.println("IMC: " + perfil.calculasIMC());

        System.out.println("Frequencia cardiaca Maxima: " + perfil.calcularFrequenciaCardiacaMaxima() + " bpm");

        System.out.println("Frequencia cardiaca Alvo: " + perfil.calcularFrequenciaCardiacaAlvo() + " bpm");
    }

}
