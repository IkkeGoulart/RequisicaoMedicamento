
package view;

import DAO.MedicamentoDAO;
import DAO.PedidoDAO;
import DAO.PedidoMedicamentoDAO;
import DTO.UsuarioDTO;
import database.DBFacade;
import java.io.IOException;
import java.sql.SQLException;
import static util.TipoUsuario.ADMIN;
import static util.TipoUsuario.PREFEITURA;


public class Main {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        DBFacade.getConnection("henrique", "1234");
//        Login login = new Login();
//        login.setVisible(true);
//        
        UsuarioDTO usuario = new UsuarioDTO(3, "PrefeituraImbe", PREFEITURA);
        NovaRequisicao nreq = new NovaRequisicao(usuario);
        nreq.setVisible(true);
        
        MedicamentoDAO med = new MedicamentoDAO();
        med.listarTudo();
        
        PedidoMedicamentoDAO pedmed = new PedidoMedicamentoDAO();
        //pedmed.excluirTudo();
        
        PedidoDAO ped = new PedidoDAO();
        //ped.deletarTudo();
        ped.mostrarTudo();
        
//        Farmacia telaF = new Farmacia(usuario);
//        telaF.show();
    }

}
