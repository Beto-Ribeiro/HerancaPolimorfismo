package beans;

import java.util.Objects;

public class Pessoa {
    protected String RG;
    protected String nome;
    protected String email;

    public Pessoa(String RG, String nome, String email) {
        this.RG = RG;
        this.nome = nome;
        this.email = email;
    }

    public String getRG() {
        return RG;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "RG= '" + RG + '\'' +
                ", nome= '" + nome + '\'' +
                ", email= '" + email + '\'' +
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

        final Pessoa other = (Pessoa) obj;
        if(!Objects.equals(this.RG, other.RG)){
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RG, nome);
    }
}
