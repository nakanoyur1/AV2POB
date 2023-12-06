package AV2;
import java.util.ArrayList;
import java.util.List;

public class CamaService {
    private List<Cama> camas = new ArrayList<>();

 
    public boolean incluir(Cama cama) {
        return camas.add(cama);
    }

   
    public boolean alterar(int id, Cama camaAtualizada) {
        for (Cama cama : camas) {
            if (cama.getId() == id) {
                cama.setCodigoCama(camaAtualizada.getCodigoCama());
                cama.setEhBeliche(camaAtualizada.isBeliche());
                cama.setPosicao(camaAtualizada.getPosicao());
                cama.setDescricao(camaAtualizada.getDescricao());
                return true;
            }
        }
        return false;
    }
    

    public List<Cama> listar() {
        return camas;
    }

    public void excluir(int id) {
        camas.removeIf(cama -> cama.getId() == id);
    }
}