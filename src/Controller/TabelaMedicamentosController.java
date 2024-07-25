package Controller;

import DTO.PedidoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Service.PedidoMedicamentoService;
import Service.PedidoService;


public class TabelaMedicamentosController {
    
    private final PedidoMedicamentoService pedMedService;
    private final PedidoService pedService;
    private final DefaultTableModel model;
    
    public TabelaMedicamentosController(JTable tbl){
        this.pedMedService = new PedidoMedicamentoService();
        this.pedService = new PedidoService();
        this.model = (DefaultTableModel) tbl.getModel();
    }
    
    public void listarMedicamentos(int idPedido) {
        try {
            ArrayList<PedidoDTO> pedDTOLista = pedMedService.listarMedicamentos(idPedido);
            Collections.sort(pedDTOLista);
            model.setRowCount(0); //Reseta a JTable

            for (PedidoDTO pedDTO : pedDTOLista) {
                Object[] linha = {pedDTO.getNomeMedicamento(), pedDTO.getLote(), pedDTO.getQuantidade(), pedDTO.getTipo().getDescricao()};
                model.addRow(linha);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir a lista de medicamentos.");
        }
    }
    
    public void buscar(String busca, JTable tbl) {
        TableRowSorter<DefaultTableModel> buscador = new TableRowSorter<>(model);
        tbl.setRowSorter(buscador);
        String filtroAa = "(?i)" + busca; //(?i) ignora a diferença entre letras maiúsculas e minúsculas
        RowFilter<DefaultTableModel, Object> filtroLinha = RowFilter.regexFilter(filtroAa, 0, 1); //Busca apenas na coluna 0(Nome) e 1(Lote)
        buscador.setRowFilter(filtroLinha);
        if (busca.length() == 0) {
            buscador.setRowFilter(null);
        }
    }
    
    public void atualizarTabela(int idUsuario){
        try {
            int idPedido = this.pedService.getIdPedidoEdicao(idUsuario);
            listarMedicamentos(idPedido);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela");
        }
        
    }
}
