public class Ingressante extends Aluno  {
    private int semIngresso;


    public String toString() {
        return super.toString() + " - INGRESSANTE";
    }


    public Ingressante(String n,String m,int semestre ){
        super(n,m);
        this.semIngresso=semestre;

    }
}
