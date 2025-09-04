import java.util.ArrayList;
import java.util.List;

import turma.Aluno;
import turma.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma();

        ArrayList<Aluno> alunos = turma.getAlunos();

        for (Aluno aluno: alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
