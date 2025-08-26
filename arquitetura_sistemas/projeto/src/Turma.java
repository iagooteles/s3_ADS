import java.util.ArrayList;
import java.util.List;

public class Turma {
    private ArrayList<Aluno> alunos;
    private TurmaDAO turmaDAO;

    public Turma() {
        turmaDAO = new TurmaDAO();
        alunos = turmaDAO.load();
    }

    public double calcMedia() {
        return 0.0;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public int getTotalAlunos() {
        return this.alunos.size();
    }

    public Aluno addAluno(Aluno aluno) {
        if (this.alunos.add(aluno)) {
            return aluno;
        } 
        return null;
    }

    public void deleteAluno(Aluno aluno) {
        this.alunos.remove(aluno.getMatricula());
    }
}
