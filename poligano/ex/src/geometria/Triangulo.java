package geometria;

public class Triangulo extends Formas {

    private String tipo;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }
    public double calcularArea(){
        return this.getBase() * this.getAltura();
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Triangulo [tipo=" + tipo + "]";
    }
}
