import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nome;
    private ArrayList<Aluno> alunos;

    public void adicionarAluno(Aluno a){
        this.alunos.add(a);
        System.out.println("Aluno cadastrado com Sucesso!");
    }


    public String toString() {
        return this.nome + " - " + this.codigo;
    }
}
