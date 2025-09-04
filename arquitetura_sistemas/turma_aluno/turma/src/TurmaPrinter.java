package turma;

public class TurmaPrinter {
    public void imprimeDados(Turma turma) {
        System.out.println("=== Dados da Turma ===");
        for (Aluno a : turma.getAlunos()) {
            System.out.println("Aluno: " + a.getNome() + " | Nota: " + a.getNota());
        }
        System.out.println("Média da Turma: " + turma.calcMedia());
    }

    public void mostraDados(Turma turma) {
        System.out.println("Turma com " + turma.getAlunos().size() + " alunos.");
    }
}
