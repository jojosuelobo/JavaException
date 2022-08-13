public class App {
    public static void main(String[] args){
        Conexao con = null;
        try{
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Erro de conexão");
        } finally {
            con.fecha();
        }
    }
}
