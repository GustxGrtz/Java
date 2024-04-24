import animal.Animal;

public class Cachorro extends Animal {

    public Cachorro (String nome, String som){
        super(nome, som);
    }
    public String uivar(){
        return "dog uivamentos";
    }

    public String emitirSom(int i){
        return "cachorro latindo" + super.getSom();
    }
}
