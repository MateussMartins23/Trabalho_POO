import java.util.ArrayList;

public class Sistema
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Area> areas;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunos;

    public Sistema() {
        this.areas = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    // gets

    public ArrayList<Area> getAreas() {
        return this.areas;
    }

    public ArrayList<Curso> getCursos() {
        return this.cursos;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    // cadastros

    public void cadastrarArea(Area area) {
        this.areas.add(area);
    }

    public void cadastrarCurso(Curso c, Area a) {
        this.cursos.add(c);
        a.adicionarCurso(c);
    }

    public void cadastrarAluno(Aluno a, Curso c) {
        this.alunos.add(a);
        c.adicionarAluno(a);
    }

    // buscas

    public Area buscarAreaPorCodigo(String codigo) {
        for (Area a : this.areas) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null;
    }

    public Area buscarAreaPorNome(String nome) {
        for (Area a : this.areas) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public Curso buscarCurso(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno a : this.alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    private Area buscarAreaDoCurso(Curso c) {
        for (Area a : this.areas) {
            if (a.getCursos().contains(c)) {
                return a;
            }
        }
        return null;
    }

    private Curso buscarCursoDoAluno(Aluno aluno) {
        for (Curso c : this.cursos) {
            if (c.getAlunos().contains(aluno)) {
                return c;
            }
        }
        return null;
    }
    //relatorios
    public ArrayList<String> listarResultados(int conceito) {
        ArrayList<String> linhas = new ArrayList<>();

        for (Curso c : this.cursos) {
            if (c.calcularConceito() == conceito) {
                Area a = this.buscarAreaDoCurso(c);
                linhas.add(c.getNome() + " (" + c.getCodigo() + ") - Área: "
                        + a.getNome() + " (" + a.getCodigo() + ")");
            }
        }
        return linhas;
    }

    public ArrayList<String> listarResultados(String nomeArea) {
        ArrayList<String> linhas = new ArrayList<>();
        Area a = this.buscarAreaPorNome(nomeArea);

        if (a == null) {
            return linhas;
        }

        for (Curso c : a.getCursos()) {
            linhas.add(c.getNome() + " (" + c.getCodigo() + "): " + c.calcularConceito());
        }
        return linhas;
    }
    public ArrayList<String> listarAlunosIrregulares() {
        ArrayList<String> linhas = new ArrayList<>();

        for (Aluno a : this.alunos) {
            if (!a.regular()) {
                Curso c = this.buscarCursoDoAluno(a);
                linhas.add(a + " - CURSO: " + c.getNome() + " (" + c.getCodigo() + ")");
            }
        }
        return linhas;
    }
}
