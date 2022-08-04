package br.gov.camara.esocial.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "usr_folhacd.HISTORICOCARGOCOMISSIONADO")
public class SigHistoricoCargoComissionado {
	@Id
	private Long ideobjeto;
	
	@Column
	private String codtipoevento;
	
	@Column
	private String texdescricao;
	
	private String descargopublato;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datiniciohistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datiniciohistorico;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datfimhistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datfimhistorico;
	
	@ManyToOne
	@JoinColumn  (name = "idetabelaitem")
	private SigTabelaItem tabelaitem;

	public Long getIdeobjeto() {
		return ideobjeto;
	}

	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
	}

	public String getCodtipoevento() {
		return codtipoevento;
	}

	public void setCodtipoevento(String codtipoevento) {
		this.codtipoevento = codtipoevento;
	}

	public String getTexdescricao() {
		return texdescricao;
	}

	public void setTexdescricao(String texdescricao) {
		this.texdescricao = texdescricao;
	}

	public LocalDate getDatiniciohistorico() {
		return datiniciohistorico;
	}

	public void setDatiniciohistorico(LocalDate datiniciohistorico) {
		this.datiniciohistorico = datiniciohistorico;
	}

	
	public LocalDate getDatfimhistorico() {
		return datfimhistorico;
	}

	public void setDatfimhistorico(LocalDate datfimhistorico) {
		this.datfimhistorico = datfimhistorico;
	}

	public SigTabelaItem getTabelaitem() {
		return tabelaitem;
	}

	public void setTabelaitem(SigTabelaItem tabelaitem) {
		this.tabelaitem = tabelaitem;
	}

	public String getDescargopublato() {
		return descargopublato;
	}

	public void setDescargopublato(String descargopublato) {
		this.descargopublato = descargopublato;
	}
	

	
	

}