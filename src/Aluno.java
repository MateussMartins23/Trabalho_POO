public class Aluno {
    private String nome;
    private String matricula;
    private boolean questionarioRespondido;

    public Aluno(String n, String m){
        this.nome=n;
        this.matricula=m;
        this.questionarioRespondido = false;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public boolean isQuestionarioRespondido() {
        return this.questionarioRespondido;
    }

    public boolean regular() {
        return this.questionarioRespondido;
    }

    public void cadastrarResposta() {
        this.questionarioRespondido = true;
    }

    public String toString(){
        return this.nome + " (" + this.matricula + ")";
    }
}


