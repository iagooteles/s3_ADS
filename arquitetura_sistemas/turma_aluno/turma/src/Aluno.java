package turma;
public class Aluno {
    private String nome;
    private float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }
}
