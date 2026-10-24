public class Concluinte extends Aluno{
    private double notaFormacaoGeral;
    private double notaComponentEspecifico;
    private boolean presente;

    public Concluinte(String n,String m){
        super(n,m);
        this.notaComponentEspecifico=0;
        this.notaFormacaoGeral=0;
    }


    public String toString() {
        return super.toString() + " - CONCLUINTE";
    }
}
