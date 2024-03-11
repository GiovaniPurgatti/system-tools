package model.entities;

public class Tools {
	
	private String modelo;
	private String descricao;
	private String codigoOriginal;
	private String codigoSm;
	
	
	public Tools() {
	}
	
	public Tools(String modelo, String descricao, String codigoOriginal, String codigoSm) {
		super();
		this.modelo = modelo;
		this.descricao = descricao;
		this.codigoOriginal = codigoOriginal;
		this.codigoSm = codigoSm;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoOriginal() {
		return codigoOriginal;
	}

	public void setCodigoOriginal(String codigoOriginal) {
		this.codigoOriginal = codigoOriginal;
	}

	public String getCodigoSm() {
		return codigoSm;
	}

	public void setCodigoSm(String codigoSm) {
		this.codigoSm = codigoSm;
	}

	public void getInfo() {
		System.out.println(getModelo() + "\n" + getDescricao() + "\n" + getCodigoOriginal() + "\n" + getCodigoSm());
	}
	
	
	
}
