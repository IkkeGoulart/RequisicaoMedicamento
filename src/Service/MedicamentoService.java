package Service;

import DAO.MedicamentoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Medicamento;
import model.PedidoMedicamento;
import util.TipoMedicamento;

public class MedicamentoService {

    private final MedicamentoDAO medDAO;

    public MedicamentoService() {
        this.medDAO = new MedicamentoDAO();
    }

    public void validar(Medicamento med) {
        if (med.getQuantidadeCaixa() <= 0) {
            throw new IllegalArgumentException("Quantidade da caixa deve ser maior que 0.");
        }

        if (med.getNome() == null || med.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do medicamento é obrigatório.");
        }

        if (med.getLote() == null || med.getLote().isEmpty()) {
            throw new IllegalArgumentException("Lote do medicamento é obrigatório");
        }

        if (med.getTipo() != TipoMedicamento.TERMOLABIL && med.getTipo() != TipoMedicamento.NAO_TERMOLABIL) {
            throw new IllegalArgumentException("Tipo de medicamento inválido");
        }
    }

    public void adicionar(Medicamento med) throws SQLException {
        validar(med);
        medDAO.adicionar(med);
    }

    public int buscarIdPorNomeELote(String nome, String lote) throws SQLException {
        return this.medDAO.buscarIdPorNomeELote(nome, lote);
    }

    public ArrayList<Medicamento> listarMedicamentos(ArrayList<PedidoMedicamento> pedMedList) throws SQLException {
        ArrayList<Medicamento> medList = new ArrayList();

        for (PedidoMedicamento pedMed : pedMedList) {
            int idMedicamento = pedMed.getIdMedicamento();
            Medicamento med = medDAO.buscarPorId(idMedicamento);
            medList.add(med);
        }
        return medList;
    }

}
