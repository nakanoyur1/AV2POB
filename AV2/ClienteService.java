package AV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

   
    public boolean incluir(Cliente cliente) {
        return clientes.add(cliente);
    }

    
    public boolean alterar(int id, Cliente clienteAtualizado) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setEndereco(clienteAtualizado.getEndereco());
                cliente.setPostalCode(clienteAtualizado.getPostalCode());
                cliente.setPais(clienteAtualizado.getPais());
                cliente.setCpf(clienteAtualizado.getCpf());
                cliente.setPassaporte(clienteAtualizado.getPassaporte());
                cliente.setEmail(clienteAtualizado.getEmail());
                cliente.setDataNascimento(clienteAtualizado.getDataNascimento());
                return true;
            }
        }
        return false;
    }

    public List<Cliente> listar() {
        return clientes;
    }

    public void excluir(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }
}
