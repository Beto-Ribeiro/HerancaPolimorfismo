package Funcionario;

public class Professor extends Funcionario{
    protected String titulo;
    protected String nivel;

    public Professor(String RG, String nome, String email, String matricula, String departamento, String lotado, String titulo, String nivel) {
        super(RG, nome, email, matricula, departamento, lotado);
        this.titulo = titulo;
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double ConsTitulo(){
        return switch (nivel){
            case "A" -> 0.1;
            case "B" -> 0.2;
            case "C" -> 0.3;
            default -> 0;
        };
    }

    public double ConsNivel(){
        return switch (titulo){
            case "A" -> 0.1;
            case "B" -> 0.2;
            case "C" -> 0.3;
            default -> 0;
        };
    }

    @Override
    public double SalarioBruto() {
        return 0;
    }
}
