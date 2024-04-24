package animal;

public abstract class Animal {

    protected String nome, som;
    protected boolean dormir, fome;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.dormir = false;
        this.fome = true;
    }

    public Animal(){
        this.dormir = false;
        this.fome = true;
    }

    public String emitirSom() {
        return "Som: " + som;
    }

    public void comer() {
        fome = false;
    }

    public void dormir() {
        dormir = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isDormir() {
        return dormir;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", som=" + som + ", dormir=" + dormir + ", fome=" + fome + "]";
    }
}
