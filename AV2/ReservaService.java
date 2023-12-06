package AV2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;

public class ReservaService {
    private List<Reserva> reservas = new ArrayList<>();

   
    public boolean incluir(Reserva reserva) {
        return reservas.add(reserva);
    }

    
    public boolean alterar(int id, Reserva reservaAtualizada) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                reserva.setIdCama(reservaAtualizada.getIdCama());
                reserva.setDataEntrada(reservaAtualizada.getDataEntrada());
                reserva.setDataSaida(reservaAtualizada.getDataSaida());
                return true;
            }
        }
        return false;
    }

    public List<Reserva> listar() {
        return reservas;
    }

    public void excluir(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
    }

   
    public boolean isCamaDisponivel(int idCama, Date dataInicio, Date dataFim) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdCama() == idCama &&
                reserva.getDataEntrada().before(dataFim) &&
                reserva.getDataSaida().after(dataInicio)) {
                return false;
            }
        }
        return true;
    }

    
    public void fazerReserva(Reserva novaReserva) {
        if (isCamaDisponivel(novaReserva.getIdCama(), novaReserva.getDataEntrada(), novaReserva.getDataSaida())) {
            reservas.add(novaReserva);
        } else {
            System.out.println("Desculpe, a cama não está disponível para as datas selecionadas.");
        }
    }
}