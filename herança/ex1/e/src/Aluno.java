import inter.Pessoa;

public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;
    protected int nota;

    public Aluno(String nome, int idade, String endereco, int matricula, String curso, int nota) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.nota = nota;
    }

    public String situacao() {
        if (this.getNota() > 6) {
            return "aprovado pia" + this.getNota();
        }
        return "reprovado";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + ", nota=" + nota + "]";
    }
}
