package geometria;

public class Quadrado extends Formas {
    private String cor;

    public Quadrado(double base, double altura, String cor) {
        super(base, altura);
        this.cor = cor;
    }

    @Override
    public double calcularArea(){
        return this.getBase() * this.getAltura();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Quadrado [cor=" + cor + "]";
    }
}
