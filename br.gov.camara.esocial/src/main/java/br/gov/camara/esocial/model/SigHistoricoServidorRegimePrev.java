package br.gov.camara.esocial.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;



	@Entity
	@Table(name = "usr_folhacd.historicoservidorregimeprev")
	public class SigHistoricoServidorRegimePrev {
		
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
		
		
		@ManyToOne
		@JoinColumn  (name = "ideservidor")
		private SigServidor servidor;
	
		
		@ManyToOne(optional=	true)								
		@JoinColumn( name = "ideregimeprevidencia")
		private SigRegimePrevidencia regimeprevidencia;
	
}
