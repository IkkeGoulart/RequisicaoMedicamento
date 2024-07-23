
import Controller.Lista;
import model.Medicamento;
        
public class TesteLista {
    public static void main(String[] args) {
        try{
            Lista lista = new Lista();
            lista.adicionar(new Medicamento("dipirona", 32, 20, "60", false));
            lista.adicionar(new Medicamento("ozenic", 1, 1, "1", true));
            lista.adicionar(new Medicamento("dorflex", 20, 20, "20", false));
            lista.adicionar(new Medicamento("ibuprofeno", 50, 40, "5", false));
            lista.adicionar(new Medicamento("torsilax", 40, 20, "10", false));
            
            lista.listar();
            
        }catch(IllegalArgumentException exp){
            System.out.println("ERRO: " +exp);
        }
    }
    
}
