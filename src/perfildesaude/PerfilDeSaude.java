package perfildesaude;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    public double calculasIMC() {
        return peso / (altura * altura);
    }

    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int fcMaxima = calcularFrequenciaCardiacaMaxima();
        int alvoInferior = (int) (0.5 * fcMaxima);
        int alvoSuperior = (int) (0.85 * fcMaxima);
        return alvoInferior + " - " + alvoSuperior + " bpm";
    }

}
