import animal.Animal;

public class Gato extends Animal {

    public Gato (String nome, String som) {
        super.setNome(nome);
        super.setSom(som);
        super.fome = true;
        super.dormir = false;
    }

    public String ronronar(){
        return "ronronando";
    }

    public String emitirSom(){
        return "gato miando" + super.getSom();
    }

    @Override
    public String toString() {
        return "Gato [] Nome: " + super.getNome() + " Som: " + super.getSom() + 
        " Dormindo? " + super.isDormir() + " Fome? " + super.isFome();
    }
}
