package turma;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public void add(Aluno aluno) {
        alunos.add(aluno);
    }

    public void remove(Aluno aluno) {
        alunos.remove(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public float calcMedia() {
        if (alunos.isEmpty()) return 0;
        float soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }
}
