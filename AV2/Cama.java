package AV2;

public class Cama {
    private int id;
    private String codigoCama;
    private boolean isBeliche;
    private String posicao;
    private String descricao;
    private boolean isOcupada;

    public Cama(int id, String codigoCama, boolean isBeliche, String posicao, String descricao, boolean isOcupada) {
        this.id = id;
        this.codigoCama = codigoCama;
        this.isBeliche = isBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
        this.isOcupada = isOcupada;
    }

	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoCama() {
		return codigoCama;
	}
	public void setCodigoCama(String codigoCama) {
		this.codigoCama = codigoCama;
	}
	public boolean isBeliche() {
		return isBeliche;
	}
	public void setEhBeliche(boolean ehBeliche) {
		this.isBeliche = ehBeliche;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		 return id;
	}
}
