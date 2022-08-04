package br.gov.camara.esocial.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "usr_folhacd.HISTORICOREQUISICAOSERVIDOR")
public class SigHistoricoRequisicaoServidor {
	@Id
	private Long ideobjeto;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datiniciohistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datiniciohistorico;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datfimhistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datfimhistorico;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datcancelamento", columnDefinition = "TIMESTAMP")
	private LocalDate datcancelamento;
	
	private String nummatriculaorgaoorigem;
	private String nomcargoorgaoorigem;
	private String desemail;
	private String codregimejuridico;
	private String indtipocargorequisitado;

	
	
	@OneToOne(optional=	true)
	@JoinColumn( name = "ideservidor")
	private SigServidor servidor;
	

	
	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
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
	public LocalDate getDatcancelamento() {
		return datcancelamento;
	}
	public void setDatcancelamento(LocalDate datcancelamento) {
		this.datcancelamento = datcancelamento;
	}
	
	public String getNummatriculaorgaoorigem() {
		return nummatriculaorgaoorigem;
	}
		public void setNummatriculaorgaoorigem(String nummatriculaorgaoorigem) {
		this.nummatriculaorgaoorigem = nummatriculaorgaoorigem;
	}
	
	public String getNomcargoorgaoorigem() {
			return nomcargoorgaoorigem;
		}
		public void setNomcargoorgaoorigem(String nomcargoorgaoorigem) {
			this.nomcargoorgaoorigem = nomcargoorgaoorigem;
		}
	public String getDesemail() {
		return desemail;
	}
	public void setDesemail(String desemail) {
		this.desemail = desemail;
	}
	public String getCodregimejuridico() {
		return codregimejuridico;
	}
	public void setCodregimejuridico(String codregimejuridico) {
		this.codregimejuridico = codregimejuridico;
	}
	public String getIndtipocargorequisitado() {
		return indtipocargorequisitado;
	}
	public void setIndtipocargorequisitado(String indtipocargorequisitado) {
		this.indtipocargorequisitado = indtipocargorequisitado;
	}
	public SigServidor getServidor() {
		return servidor;
	}
	public void setServidor(SigServidor servidor) {
		this.servidor = servidor;
	}
	

}
