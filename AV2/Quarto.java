package AV2;
import java.util.Date;
import java.util.List;


public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;
    private List<Cama> camas;
    private List<Reserva> reservas;



    public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao, List<Cama> camas) {
        this.id = id;
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;
        this.camas = camas;
    }

    public boolean isDisponivel(Date dataInicio, Date dataFim) {
        for (Reserva reserva : reservas) {
            if (reserva.getDataEntrada().before(dataFim) && reserva.getDataSaida().after(dataInicio)) {
                return false;
            }
        }
        return true;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeQuarto() {
		return nomeQuarto;
	}
	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	public int getQtdeCamas() {
		return qtdeCamas;
	}
	public void setQtdeCamas(int qtdeCamas) {
		this.qtdeCamas = qtdeCamas;
	}
	public boolean isTemBanheiro() {
		return temBanheiro;
	}
	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
