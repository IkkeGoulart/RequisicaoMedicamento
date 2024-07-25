package Service;

import Service.MedicamentoService;
import DAO.PedidoMedicamentoDAO;
import DTO.PedidoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Medicamento;
import model.PedidoMedicamento;

public class PedidoMedicamentoService {

    private final PedidoMedicamentoDAO medPedDAO;

    public PedidoMedicamentoService() {
        this.medPedDAO = new PedidoMedicamentoDAO();
    }

    public void validar(int idPedido, int idMedicamento, int quantidade) {
        if (idPedido <= 0 || idMedicamento <= 0 || quantidade <= 0) {
            throw new IllegalArgumentException("Este medicamento não consta no sistema");
        }
    }

    public void adicionar(int idPedido, int idMedicamento, int quantidade) throws SQLException {
        validar(idPedido, idMedicamento, quantidade);
        if (this.medPedDAO.verificarMedicamentosIguais(idPedido, idMedicamento)) {
            throw new IllegalArgumentException("Este medicamento já foi adicionado ao pedido");
        }
        medPedDAO.adicionar(idPedido, idMedicamento, quantidade);
    }

    public void excluir(int idMedicamento, int idPedido) throws SQLException {
        this.medPedDAO.excluir(idMedicamento, idPedido);
    }

    public void editarQuantidade(int idPedido, int idMedicamento, int novaQuantidade) throws SQLException {
        validar(idPedido, idMedicamento, novaQuantidade);
        this.medPedDAO.editarQuantidade(idMedicamento, idPedido, novaQuantidade);
    }

    public ArrayList<PedidoDTO> listarMedicamentos(int idPedido) throws SQLException {
        ArrayList<PedidoMedicamento> pedMedList = medPedDAO.listarMedicamentos(idPedido);
        ArrayList<Medicamento> medList = new MedicamentoService().listarMedicamentos(pedMedList);

        Map<Integer, PedidoDTO> mapa = new HashMap();

        for (PedidoMedicamento pedMed : pedMedList) {
            int idMedicamento = pedMed.getIdMedicamento();

            if (!mapa.containsKey(idMedicamento)) {
                PedidoDTO pedDTO = new PedidoDTO();
                pedDTO.setIdPedido(pedMed.getIdPedido());
                pedDTO.setIdMedicamento(idMedicamento);
                pedDTO.setQuantidade(pedMed.getQuantidade());
                mapa.put(idMedicamento, pedDTO);
            }
        }

        for (Medicamento med : medList) {
            int idMedicamento = med.getId();

            if (mapa.containsKey(idMedicamento)) {
                PedidoDTO pedDTO = mapa.get(idMedicamento);
                pedDTO.setLote(med.getLote());
                pedDTO.setNomeMedicamento(med.getNome());
                pedDTO.setTipo(med.getTipo());
                mapa.put(idMedicamento, pedDTO);
            }
        }

        ArrayList<PedidoDTO> lista = new ArrayList<>(mapa.values());

        return lista;
    }

}
