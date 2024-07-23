package Controller;

import DTO.UsuarioDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UsuarioService;
import view.Farmacia;
import view.Login;
import view.Prefeitura;

public class UsuarioController {

    private UsuarioService usuService;

    public UsuarioController() {
        this.usuService = new UsuarioService();
    }

    public void autenticar(String login, String senha, Login loginView) {
        try {
            UsuarioDTO usuDTO = this.usuService.autenticar(login, senha);

            if (usuDTO != null) {
                switch (usuDTO.getTipo()) {
                    case ADMIN -> {
                        loginView.dispose();
                        Farmacia telaF = new Farmacia(usuDTO);
                        telaF.setVisible(true);
                    }
                    case PREFEITURA -> {
                        loginView.dispose();
                        Prefeitura telaP = new Prefeitura(usuDTO);
                        telaP.setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na autentificação.");
        }

    }

}
