import inter.Pessoa;

public class Professor extends Pessoa{
    protected String disciplina;
    protected double salario;
    
    public void aumentarSalario(int porcentagem){
        int aumento = porcentagem / 100; 
        this.salario *= aumento;
    }

    public Professor(String nome, int idade, String endereco, String disciplina, double salario) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", salario=" + salario + "]";
    } 
}
