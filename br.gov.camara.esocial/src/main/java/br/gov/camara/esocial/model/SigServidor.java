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
@Table(name = "usr_folhacd.servidor")
//@Table(name = "servidor", schema = "USR_FOLHACD")
public class SigServidor {
	@Id
	private Long ideobjeto;
	@Column
	private int numponto;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datiniciohistorico", columnDefinition = "TIMESTAMP")
	private LocalDate datiniciohistorico;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datfimhistorico;
	
	@ManyToOne
	@JoinColumn  (name = "idegrupo")
	private SigGrupo grupo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datcancelamento;
	
	@ManyToOne
	@JoinColumn  (name = "idepessoafisica")
	private SigPessoaFisica pessoafisica;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name= "datcriacao", columnDefinition = "TIMESTAMP")
	private LocalDateTime datcriacao;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name= "datultimaalteracao", columnDefinition = "TIMESTAMP")
	private LocalDateTime datultimaalteracao;



	
}
