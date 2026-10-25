import java.util.ArrayList;

public class Sistema {
    private ArrayList<Area> areas;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunos;

    public Sistema() {
        this.areas = new ArrayList<>();
        this.cursos= new ArrayList<>();
        this.alunos=new ArrayList<>();

    }

    public void cadastrarArea(Area area) {
        this.areas.add(area);
    }

    public void cadastrarCurso(Curso c, Area a){
        this.cursos.add(c);
        a.adicionarCurso(c);

    }

    public void cadastrarAluno(Aluno a,Curso c){
        this.alunos.add(a);
        c.adicionarAluno(a);
    }

}
