package Funcionario;
import beans.Pessoa;

import java.util.Objects;

public class Aluno extends Pessoa {
    protected String RA;
    protected String curso;
    protected Integer semestre;
    protected String emailAcad;

    public Aluno(String RG, String nome, String email, String RA, String curso, Integer semestre, String emeailAcad) {
        super(RG, nome, email);
        this.RA = RA;
        this.curso = curso;
        this.semestre = semestre;
        this.emailAcad = emeailAcad;
    }

    public String getRA() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public String getEmailAcad() {
        return emailAcad;
    }

    public void setEmailAcad(String emailAcad) {
        this.emailAcad = emailAcad;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RG= '" + RG + '\'' +
                ", nome= '" + nome + '\'' +
                ", email= '" + email + '\'' +
                "emailAcad='" + emailAcad + '\'' +
                ", RA='" + RA + '\'' +
                ", curso='" + curso + '\'' +
                ", semestre=" + semestre +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }

        final Aluno other = (Aluno) obj;
        if(!Objects.equals(this.RA, other.RA)){
            return false;
        }
        if(!Objects.equals(this.RG, other.RG)){
            return false;
        }
        if(!Objects.equals(this.nome, other.nome)){
            return false;
        }

        return Objects.equals(this.RA, other.RA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), RA);
    }


}
