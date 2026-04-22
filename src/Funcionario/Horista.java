package Funcionario;

import beans.Pessoa;

public class Horista extends Funcionario {
    protected double valorHora;
    protected double totalHora;

    public Horista(String RG, String nome, String email, String matricula, String departamento, String lotado, double valorHora, double totalHora) {
        super(RG, nome, email, matricula, departamento, lotado);
        this.valorHora = valorHora;
        this.totalHora = totalHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalHora() {
        return totalHora;
    }

    public void setTotalHora(double totalHora) {
        this.totalHora = totalHora;
    }


    @Override
    public double SalarioBruto() {
        return valorHora * totalHora * 4;
    }
}
