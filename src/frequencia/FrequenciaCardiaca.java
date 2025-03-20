package frequencia;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
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
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
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


