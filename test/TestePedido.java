
import Controller.Lista;
import model.Medicamento;
import model.Usuario;
import model.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        try{
            //Instânciando os objetos necessários para o objeto pedido
            Usuario usuarTest = new Usuario(1, "PrefeituraOsorio", "prefeitura", "prefeitura");
            Lista lista = new Lista();
            lista.adicionar(new Medicamento("dipirona", 32, 20, "60", false));
            lista.adicionar(new Medicamento("ozenic", 1, 1, "1", true));
            lista.adicionar(new Medicamento("dorflex", 20, 20, "20", false));
            lista.adicionar(new Medicamento("ibuprofeno", 50, 40, "5", false));
            lista.adicionar(new Medicamento("torsilax", 40, 20, "10", false));
            
            //TESTE DE FRACASSO
            Pedido pedTest = new Pedido(null, lista, 2);
            //Usuario deve ser definido
            
            //Pedido pedTest = new Pedido(usuarTest, null, 2);
            //Lista deve ser definida
            
            //Pedido pedTest = new Pedido(usuarTest, lista, -42);
            //Código deve ser positivo
            
            //TESTE DE SUCESSO
            //Pedido pedTest = new Pedido(usuarTest, lista, 2);
            
        } catch(IllegalArgumentException exp){
            System.out.println("Erro: "+exp);
        } catch(Exception ex){
            System.out.println("Erro 2: "+ex);
        }
    }
}
