
import model.Usuario;

public class TesteUsuario {
    public static void main(String[] args) {
        try{
            //TESTE DE FRACASSO
            Usuario usuarioTeste = new Usuario(1, "PrefeituraOsorio", "prefeitura", null);
            //Tipo de Usuário deve ser informado
            
            //Usuario usuarioTeste = new Usuario(1, "PrefeituraOsorio", "prefeitura", "motorista");
            //Tipo inválido
            
            //Usuario usuarioTeste = new Usuario(1, "PrefeituraOsorio", null, "prefeitura");
            //Senha deve ser definida
            
            //Usuario usuarioTeste = new Usuario(1, null, "prefeitura", "prefeitura");
            //Usuário deve ser definido
            
            //Usuario usuarioTeste = new Usuario(-5, "PrefeituraOsorio", "prefeitura", "prefeitura");
            //id deve ser positivo
            
            //TESTE DE SUCESSO
            //Usuario usuarioTeste = new Usuario(1, "PrefeituraOsorio", "prefeitura", "prefeitura");
            //Usuario usuarioTeste = new Usuario(10, "Farmacia", "farmacia", "admin");
        } catch(IllegalArgumentException exp){
            System.out.println("Erro: "+exp);
        } catch(Exception ex){
            System.out.println("Erro 2: "+ex);
        }
    }
}
