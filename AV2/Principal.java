package AV2;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        ClienteService clienteService = new ClienteService();
        CamaService camaService = new CamaService();
        QuartoService quartoService = new QuartoService();
        ReservaService reservaService = new ReservaService();

        Cliente cliente1 = new Cliente(1, "Joao", "Estrada dos Tres Rios, 123", "12345-678", "Brasil", "123.456.789-00", "123456789", "joao@gmail.com", new Date());
        clienteService.incluir(cliente1);

        Cliente cliente2 = new Cliente(2, "Maria", "Rua Clarimundo de Melo, 456", "98765-432", "Brasil", "987.654.321-00", "987654321", "maria@gmail.com", new Date());
        clienteService.incluir(cliente2);

        Cliente cliente3 = new Cliente(3, "Paulo", "Estrada do Bananal, 789", "45678-123", "Brasil", "456.789.123-00", "456789123", "paulo@gmail.com", new Date());
        clienteService.incluir(cliente3);

        Cliente cliente4 = new Cliente(4, "Ana", "Estrada do Pau Ferro, 159", "32198-765", "Brasil", "321.987.654-00", "321987654", "ana@gmail.com", new Date());
        clienteService.incluir(cliente4);

        Cliente cliente5 = new Cliente(5, "Pedro", "Alameda das Margaridas, 321", "65432-198", "Brasil", "654.321.987-00", "654321987", "pedro@gmail.com", new Date());
        clienteService.incluir(cliente5);

        
        Cama cama = new Cama(1, "Cama 1", false, "Perto da janela", "Cama de solteiro", false);
        camaService.incluir(cama);

                List<Cama> listaCamas = new ArrayList<>();
        listaCamas.add(cama);

        Quarto quarto = new Quarto(1, "Quarto 1", 1, true, "Quarto individual", listaCamas);
        quartoService.incluir(quarto);

        Reserva reserva2 = new Reserva(2, quarto.getId(), cama.getId(), cliente2.getId(), new Date(), new Date());
        reservaService.incluir(reserva2);

        Reserva reserva3 = new Reserva(3, quarto.getId(), cama.getId(), cliente3.getId(), new Date(), new Date());
        reservaService.incluir(reserva3);

        List<Cliente> todosClientes = clienteService.listar();
        for (Cliente c : todosClientes) {
            System.out.println("Cliente: " + c.getNome());
        }

        List<Cama> todasCamas = camaService.listar();
        for (Cama c : todasCamas) {
            System.out.println("Cama: " + c.getCodigoCama());
        }

        List<Quarto> todosQuartos = quartoService.listar();
        for (Quarto q : todosQuartos) {
            System.out.println("Quarto: " + q.getNomeQuarto());
        }

        List<Reserva> todasReservas = reservaService.listar();
        for (int i = 0; i < todasReservas.size(); i++) {
            Reserva r = todasReservas.get(i);
            System.out.println("======================");
            System.out.println("Reserva " + (i+1));
            System.out.println("ID: " + r.getId());
            System.out.println("ID do Quarto: " + r.getIdQuarto());
            System.out.println("ID da Cama: " + r.getIdCama());
            System.out.println("ID do Cliente: " + r.getIdCliente());
            System.out.println("Data de Entrada: " + r.getDataEntrada());
            System.out.println("Data de Saída: " + r.getDataSaida());
            System.out.println();
        }
    }
}
