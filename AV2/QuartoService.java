package AV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;


public class QuartoService {
    private List<Quarto> quartos = new ArrayList<>();

  
    public boolean incluir(Quarto quarto) {
        return quartos.add(quarto);
    }

   
    public boolean alterar(int id, Quarto quartoAtualizado) {
        for (Quarto quarto : quartos) {
            if (quarto.getId() == id) {
                quarto.setNomeQuarto(quartoAtualizado.getNomeQuarto());
                quarto.setQtdeCamas(quartoAtualizado.getQtdeCamas());
                quarto.setTemBanheiro(quartoAtualizado.isTemBanheiro());
                quarto.setDescricao(quartoAtualizado.getDescricao());
                return true;
            }
        }
        return false;
    }
    public List<Quarto> listar() {
        return quartos;
    }

    public void excluir(int id) {
        quartos.removeIf(quarto -> quarto.getId() == id);
    }

    // Listar quartos disponíveis
    public List<Quarto> listarDisponiveis(Date dataInicio, Date dataFim) {
        return quartos.stream()
                .filter(quarto -> quarto.isDisponivel(dataInicio, dataFim))
                .collect(Collectors.toList());
    }
}