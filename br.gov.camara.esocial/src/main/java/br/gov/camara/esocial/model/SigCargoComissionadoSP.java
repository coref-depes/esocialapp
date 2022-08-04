package br.gov.camara.esocial.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usr_folhacd.cargosp")
public class SigCargoComissionadoSP {
	@Id
	private Long ideobjeto;
	@Column
	private String codobjeto;

	public Long getIdeobjeto() {
		return ideobjeto;
	}
	private String descargo;
	
	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
	}

	public String getCodobjeto() {
		return codobjeto;
	}

	public void setCodobjeto(String codobjeto) {
		this.codobjeto = codobjeto;
	}

	public String getDescargo() {
		return descargo;
	}

	public void setDescargo(String descargo) {
		this.descargo = descargo;
	}
	
	

}

