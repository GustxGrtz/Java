public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Aluno a = new Aluno("cu", 0, null, 0, null, 0);

        Professor p1 = new Professor("teste", 30, "casa do carajo", "portugues", 3000);
        
        System.out.println(p1);

        p1.aumentarSalario(30);

        System.out.println(p1);

        
    }
}
