package Funcionario;

import beans.Pessoa;

public abstract class Funcionario extends Pessoa implements Empregado {
    protected String matricula;
    protected String departamento;
    protected String lotado;
    protected String cargo;

    public Funcionario(String RG, String nome, String email, String matricula, String departamento, String lotado) {
        super(RG, nome, email);
        this.matricula = matricula;
        this.departamento = departamento;
        this.lotado = lotado;
    }

    @Override
    public double SalarioLiquido() {
        return SalarioBruto()-INSS()-IRRF();
    }

    @Override
    public double INSS() {
        return SalarioBruto()*0.11;
    }

    @Override
    public double IRRF() {
        return SalarioBruto()*0.27;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", lotado='" + lotado + '\'' +
                ", cargo='" + cargo + '\'' +
                ", RG='" + RG + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
