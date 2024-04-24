package geometria;

public abstract class Formas {
    protected double base, altura;

    public Formas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double calcularArea();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Formas [base=" + base + ", altura=" + altura + "]";
    }
}
