package br.gov.camara.esocial.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "usr_folhacd.documento")
public class SigDocumento {
	@Id
	private Long ideobjeto;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datdocumento", columnDefinition = "TIMESTAMP")
	private LocalDate datdocumento;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datpublicacao", columnDefinition = "TIMESTAMP")
	private LocalDate datpublicacao;
	
	@Column(name="texnumerodocumento")
	private String texnumerodocumento;

	public Long getIdeobjeto() {
		return ideobjeto;
	}

	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
	}

	
	public String getTexnumerodocumento() {
		
		if (texnumerodocumento == null) {
			texnumerodocumento="0";
		}
		if (texnumerodocumento.isEmpty()) {
			texnumerodocumento="0";
		}
		return texnumerodocumento;
	}

	public void setTexnumerodocumento(String texnumerodocumento) {
		this.texnumerodocumento = texnumerodocumento;
	}

	public LocalDate getDatdocumento() {
		return datdocumento;
	}

	public void setDatdocumento(LocalDate datdocumento) {
		this.datdocumento = datdocumento;
	}

	public LocalDate getDatpublicacao() {
		return datpublicacao;
	}

	public void setDatpublicacao(LocalDate datpublicacao) {
		this.datpublicacao = datpublicacao;
	}


}
