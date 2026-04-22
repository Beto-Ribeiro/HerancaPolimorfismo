package Funcionario;

public class Mensalista extends Funcionario{
    protected String cargo;

    public Mensalista(String RG, String nome, String email, String matricula, String departamento, String lotado, String cargo) {
        super(RG, nome, email, matricula, departamento, lotado);
        this.cargo = cargo;
    }

    @Override
    public double SalarioBruto() {
        if (cargo.equalsIgnoreCase("Repositor"))
            return 1600;
        else if (cargo.equalsIgnoreCase("Caixa"))
            return 3200;
        else if (cargo.equalsIgnoreCase("Vendedor"))
            return 2600;
        else if (cargo.equalsIgnoreCase("Gerente"))
            return 5000;

        return 0;
    }
}
