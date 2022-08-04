package br.gov.camara.esocial.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "usr_folhacd.HISTORICOSERVIDORCARGOSP")
public class SigHistoricoServidorCargoSP {
	@Id
	private Long ideobjeto;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datnomeacao", columnDefinition = "TIMESTAMP")
	private LocalDate datnomeacao;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datposse", columnDefinition = "TIMESTAMP")
	private LocalDate datposse;
	@DateTimeFormat(iso = ISO.DATE)

	@ManyToOne
	@JoinColumn  (name = "ideservidor")
	private SigServidor servidor;
	
	
	@Column  (name = "idesehvencimento")
	private Long idesehvencimento;
	
	@Column  (name = "idesehgrg" )
	private Long idesehgrg;
	
	//@ManyToOne
//	@JoinColumn  (name = "idesehvencimento" )
	//@Fetch(FetchMode.JOIN)
//	private SigServidorEventoHistorico serveventohist;
	
	//@ManyToOne
	//@JoinColumn  (name = "idesehgrg")
//	private SigServidorEventoHistorico historicogrg;

	@ManyToOne
	@JoinColumn  (name = "idecargosp")
	private SigCargoComissionadoSP cargocomissionado;
	
	@ManyToOne
	@JoinColumn  (name = "idedocumentonomeacao")
	private SigDocumento documentonomeacao;
	@ManyToOne
	@JoinColumn  (name = "idedocumentoexoneracao")
	private SigDocumento documentoexoneracao;
	public Long getIdeobjeto() {
		return ideobjeto;
	}
	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
	}
	public LocalDate getDatnomeacao() {
		return datnomeacao;
	}
	public void setDatnomeacao(LocalDate datnomeacao) {
		this.datnomeacao = datnomeacao;
	}
	public LocalDate getDatposse() {
		return datposse;
	}
	public void setDatposse(LocalDate datposse) {
		this.datposse = datposse;
	}
	public SigServidor getServidor() {
		return servidor;
	}
	public void setServidor(SigServidor servidor) {
		this.servidor = servidor;
	}
	
	
	public SigCargoComissionadoSP getCargocomissionado() {
		return cargocomissionado;
	}
	public void setCargocomissionado(SigCargoComissionadoSP cargocomissionado) {
		this.cargocomissionado = cargocomissionado;
	}
	public SigDocumento getDocumentonomeacao() {
		return documentonomeacao;
	}
	public void setDocumentonomeacao(SigDocumento documentonomeacao) {
		this.documentonomeacao = documentonomeacao;
	}
	public SigDocumento getDocumentoexoneracao() {
		return documentoexoneracao;
	}
	public void setDocumentoexoneracao(SigDocumento documentoexoneracao) {
		this.documentoexoneracao = documentoexoneracao;
	}
	
	
	public Long getIdesehgrg() {
		return idesehgrg;
	}
	public void setIdesehgrg(Long idesehgrg) {
		this.idesehgrg = idesehgrg;
	}

	
	
	
	
}

