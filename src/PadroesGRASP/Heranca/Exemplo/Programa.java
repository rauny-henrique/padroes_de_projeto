package PadroesGRASP.Heranca.Exemplo;

public class Programa {

    public static void main(String args[]) {

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 18;
        aluno.matricula = "152464";

        System.out.println("Nome = " + aluno.nome + "\nIdade = " + aluno.idade + "\nMatricula = " + aluno.matricula);

        Professor professor = new Professor();
        professor.nome = "Thiago";
        professor.idade = 28;
        professor.disciplina = "Matematica";

        System.out.println("\nNome = " + professor.nome + "\nIdade = " + professor.idade + "\nDisciplina = " + professor.disciplina);

    }

}
