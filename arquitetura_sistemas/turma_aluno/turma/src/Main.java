package turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.add(new Aluno("iago", 9));
        turma.add(new Aluno("pan", 7));
        turma.add(new Aluno("spike", 8));

        TurmaPrinter printer = new TurmaPrinter();
        printer.imprimeDados(turma);

        TurmaRepository repo = new TurmaRepository();
        repo.save(turma);
    }
}