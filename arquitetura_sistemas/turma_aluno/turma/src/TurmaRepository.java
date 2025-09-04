package turma;
public class TurmaRepository {
    public Turma load(int id) {
        Turma turma = new Turma();
        turma.add(new Aluno("iago", 10));
        turma.add(new Aluno("Pandora", 9));
        return turma;
    }

    public void save(Turma turma) {
        System.out.println("Turma salva, total de: " + turma.getAlunos().size() + " alunos.");
    }

    public void update(Turma turma) {
        System.out.println("Turma atualizada.");
    }

    public void delete(Turma turma) {
        System.out.println("Turma deletada.");
    }
}