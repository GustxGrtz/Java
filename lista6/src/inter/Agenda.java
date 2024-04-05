package inter;
import java.util.List;

public class Agenda {
    
    private List<Contato> contatos;

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Contato buscarContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                return contatos.get(i);
            }
        }
        return null;
    }

    public void criarContato(Contato novoContato){
        if(buscarContato(novoContato.getNome()) == null){
            contatos.add(novoContato);
        }
    }

    public void removerContato(Contato novoContato){
        if(buscarContato(novoContato.getNome()) != null){
            contatos.remove(novoContato);
        }
    }


    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

}
