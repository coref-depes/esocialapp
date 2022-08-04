package br.gov.camara.esocial.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "usr_folhacd.historicobeneficiopc")
public class SigHistoricoBeneficioPC {
	
	@Id
	private Long ideobjeto;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datiniciohistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datiniciohistorico;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDate datfimhistorico;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDate datcancelamento;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime datcriacao;
	
	@ManyToOne
	@JoinColumn  (name = "idebeneficiariopc")
	private SigBeneficiarioPensaoCivil beneficiariopensaocivil;
	
	@ManyToOne
	@JoinColumn  (name = "idesehtipobeneficio")
	private SigServidorEventoHistorico tipobeneficio;
	
}
