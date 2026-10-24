public class Aluno {
    private String nome;
    private String matricula;
    private boolean questionarioRespondido;

   public Aluno(String n, String m){
       this.nome=n;
       this.matricula=m;

   }

    public String toString(){
        return this.nome + " (" + this.matricula + ")";
    }







}
