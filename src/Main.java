import Academico.Aluno;
import beans.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pessoa pessoa01 = new Pessoa("123456789" , "GiovanaLevindo", "giovana@levindo");
    Pessoa pessoa02 = pessoa01;
    Pessoa pessoa03 = null;
    Pessoa pessoa04 = new Pessoa("123456789" , "GiovanaLevindo", "giovana@levindo");
    Aluno aluno01 = new Aluno(pessoa01.getRG(),pessoa01.getNome(), pessoa01.getEmail(), "987654321", "ADS", 4, "Giovana@fatec");
    Aluno aluno02 = null;
    Aluno aluno03 = new Aluno(pessoa01.getRG(),pessoa01.getNome(), pessoa01.getEmail(), "987654321", "ADS", 4, "Giovana@fatec");
    Aluno aluno04 = aluno01;

    if(pessoa01.equals(pessoa02)){
        System.out.println("igual");
    }

    if (!pessoa02.equals(pessoa03)){
        System.out.println("null");
    }

    if (pessoa01.equals(pessoa04)){
        System.out.println("equals");
    }


    if(aluno01.equals(aluno04)){
        System.out.println("aluno igual");
    }

    if (!aluno04.equals(aluno02)){
        System.out.println("aluno null");
    }

    if (aluno01.equals(aluno03)){
        System.out.println("aluno equals");
    }

    System.out.println("Humberto Ribeiro");
}
