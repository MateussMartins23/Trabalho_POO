import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nome;
    private ArrayList<Aluno> alunos;


    public Curso(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public double conceitoEnade(){
        double media = this.mediaSimples();

        if (media < 2.0) {
            return 1;}
        else if (media < 4.0) {
            return 2;
        } else if (media < 6.0) {
            return 3;
        } else if (media < 8.0) {
            return 4;
        } else {
            return 5;
        }
    }

    public double mediaSimples(){
        double soma = 0;
        int qtd = 0;

        for (Aluno a : this.alunos) {
            if (a instanceof Concluinte c) {
                soma += c.calcularNota();
                qtd++;
            }
        }

        if (qtd == 0) {
            return 0;
        }
        return soma / qtd;
    }

    public ArrayList<Ingressante> ingressantes() {
        ArrayList<Ingressante> resultado = new ArrayList<>();

        for (Aluno a : this.alunos) {
            if (a instanceof Ingressante i) {
                resultado.add(i);
            }
        }
        return resultado;
    }
    public ArrayList<Ingressante> ingressantes(int semestre) {
        ArrayList<Ingressante> resultado = new ArrayList<>();

        for (Ingressante i : this.ingressantes()) {
            if (i.getSemIngresso() == semestre) {
                resultado.add(i);
            }
        }
        return resultado;
    }
    public void adicionarAluno(Aluno a){
        this.alunos.add(a);
        System.out.println("Aluno cadastrado com Sucesso!");
    }


    public String toString() {
        return this.nome + " - " + this.codigo;
    }


    public String getCodigo() {
        return this.codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
}
