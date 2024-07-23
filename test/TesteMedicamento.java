
import model.Medicamento;


public class TesteMedicamento {
    public static void main(String[] args) {
        try{
            //TESTE DE FRACASSO
            //Medicamento medTest = new Medicamento("dipirona", 2, 20, null, false);
            //Lote deve ser informado
            
            //Medicamento medTest = new Medicamento("dipirona", 2, -5, "da", false);
            //Quantidade da caixa deve ser positiva
            
            //Medicamento medTest = new Medicamento("dipirona", -7, 20, "20", false);
            //Quantidade pedida deve ser positiva
            
            //Medicamento medTest = new Medicamento(null, 2, 6, "20", false);
            //Nome deve ser informado
            
            //TESTE DE SUCESSO
            //Medicamento medTest = new Medicamento("dipirona", 32, 20, "60", false);
            //Medicamento medTest = new Medicamento("ozenic", 1, 1, "1", true);
            Medicamento medTest = new Medicamento("vitamina d", 50, "1aab22c", true, 50);
            System.out.println(medTest);
        } catch(IllegalArgumentException exp){
            System.out.println("Erro: "+exp);
        } catch(Exception ex){
            System.out.println("Erro 2: "+ex);
        }
    }
}
