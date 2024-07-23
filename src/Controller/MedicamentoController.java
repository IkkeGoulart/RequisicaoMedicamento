package Controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Medicamento;
import model.MedicamentoService;
import util.TipoMedicamento;

public class MedicamentoController {

    private final MedicamentoService medService;

    public MedicamentoController() {
        this.medService = new MedicamentoService();
    }

    public void adicionar(int id, String nome, String lote, int quantidadeCaixa, TipoMedicamento tipo) {
        Medicamento med = new Medicamento(nome, lote, quantidadeCaixa, tipo);
        try {
            medService.adicionar(med);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o medicamento");
        }
    }

    public int buscarIdPorNomeELote(String nome, String lote) {
        try {
            return this.medService.buscarIdPorNomeELote(nome, lote);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o medicamento");
            return -1;
        }
    }
}
