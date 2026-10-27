public class Concluinte extends Aluno{
    private double notaFormacaoGeral;
    private double notaComponentEspecifico;
    private boolean presente;

    public Concluinte(String n,String m){
        super(n,m);
        this.notaComponentEspecifico=0;
        this.notaFormacaoGeral=0;
        this.presente = false;
    }

    public double getNotaFormacaoGeral() {
        return this.notaFormacaoGeral;
    }

    public double getNotaComponentEspecifico() {
        return this.notaComponentEspecifico;
    }

    public boolean isPresente() {
        return this.presente;
    }

    public void cadastrarProva(double n1, double n2) {
        this.notaFormacaoGeral = n1;
        this.notaComponentEspecifico = n2;
        this.presente = true;
    }

    public double calcularNota() {
        return (3 * this.notaFormacaoGeral + 7 * this.notaComponentEspecifico) / 10;
    }

    public boolean regular() {
        return super.regular() && this.presente;
    }

    public String toString() {
        return super.toString() + " - CONCLUINTE";
    }
}
