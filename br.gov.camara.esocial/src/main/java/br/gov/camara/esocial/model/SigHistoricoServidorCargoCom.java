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
@Table(name = "usr_folhacd.HISTORICOSERVIDORCARGOcom")
public class SigHistoricoServidorCargoCom {
	@Id
	private Long ideobjeto;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datnomeacao", columnDefinition = "TIMESTAMP")
	private LocalDate datnomeacao;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datposse", columnDefinition = "TIMESTAMP")
	private LocalDate datposse;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datexercicio", columnDefinition = "TIMESTAMP")
	private LocalDate datexercicio;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datdispensa", columnDefinition = "TIMESTAMP")
	private LocalDate datdispensa;
	
	@ManyToOne
	@JoinColumn  (name = "ideservidor")
	private SigServidor servidor;

	@ManyToOne
	@JoinColumn  (name = "idecargocomissionado")
	private SigCargoComissionado cargocomissionado;
	
	@ManyToOne
	@JoinColumn  (name = "idedocumentonomeacao")
	private SigDocumento documentonomeacao;
	@ManyToOne
	@JoinColumn  (name = "idedocumentoexoneracao")
	private SigDocumento documentoexoneracao;
	
	@ManyToOne
	@JoinColumn  (name = "ideserveventohist")
	private SigServidorEventoHistorico serveventohist;

	
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

	public LocalDate getDatexercicio() {
		return datexercicio;
	}

	public void setDatexercicio(LocalDate datexercicio) {
		this.datexercicio = datexercicio;
	}

	public LocalDate getDatdispensa() {
		return datdispensa;
	}

	public void setDatdispensa(LocalDate datdispensa) {
		this.datdispensa = datdispensa;
	}

	public SigServidor getServidor() {
		return servidor;
	}

	public void setServidor(SigServidor servidor) {
		this.servidor = servidor;
	}

	public SigCargoComissionado getCargocomissionado() {
		return cargocomissionado;
	}

	public void setCargocomissionado(SigCargoComissionado cargocomissionado) {
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

	public SigServidorEventoHistorico getServeventohist() {
		return serveventohist;
	}

	public void setServeventohist(SigServidorEventoHistorico serveventohist) {
		this.serveventohist = serveventohist;
	}
	
	
}
