package br.com.frwk.Atv8;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Aluno {
    //atributos que eu preciso coletar do usuário
    private Integer matricula;
    private String nome;
    private String turma;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaProva3;
    private Double notaEx;

    //atributos que são calculados via regra de negócio
    private Double total;
    private StatusAluno status;

    public Aluno(Integer matricula, String nome, String turma, Double notaProva1, Double notaProva2, Double notaProva3, Double notaEx) {
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaProva3 = notaProva3;
        this.notaEx = notaEx;
        this.total = calcularNotaTotal(notaProva1, notaProva2, notaProva3, notaEx);
        this.status = calcularStatusAprovacao(this.total);
    }

    private Double calcularNotaTotal(Double notaProva1, Double notaProva2, Double notaProva3, Double notaEx){
        Double totalNota = (notaEx + notaProva1 + notaProva2 + (notaProva3 * 2));

        if (totalNota > 100){
            totalNota = 100.0;
        }
        return totalNota;
    }

    public static StatusAluno calcularStatusAprovacao(Double total){
        if (total >= 60){
            return StatusAluno.Aprovado;
        }
        if (total >= 50 && total < 60){
            return StatusAluno.Recuparacao_1;
        }
        if (total >= 40 && total < 50){
            return StatusAluno.Recuperacao_2;
        }

        return StatusAluno.Reprovado;
    }

    @Override
    public String toString(){
        return "Matricula: " + this.matricula + "\n" +
                "Nome: " + this.nome + "\n" +
                "Turma: " + this.turma + "\n" +
                "Status: " + this.status;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(Double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public Double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(Double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public Double getNotaProva3() {
        return notaProva3;
    }

    public void setNotaProva3(Double notaProva3) {
        this.notaProva3 = notaProva3;
    }

    public Double getNotaEx() {
        return notaEx;
    }

    public void setNotaEx(Double notaEx) {
        this.notaEx = notaEx;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public StatusAluno getStatus() {
        return status;
    }

}
