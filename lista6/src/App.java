import java.util.LinkedList;

import inter.Agenda;
import inter.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda(new LinkedList<>());
        Contato contato1 = new Contato("alek", 123);
        Contato contato2 = new Contato("zoio", 456);

        agenda.criarContato(contato1);
        agenda.criarContato(contato2);

        System.out.println(agenda);

        agenda.removerContato(contato1);

        System.out.println(agenda);

        

        
    }
}
