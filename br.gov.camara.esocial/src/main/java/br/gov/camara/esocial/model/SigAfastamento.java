package br.gov.camara.esocial.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "afastamento")
public class SigAfastamento {
	@Id
	private Long ideobjeto;
	
	@ManyToOne
	@JoinColumn  (name = "ideserveventohist")
	private SigServidorEventoHistorico serveventohist;
	
	
	
	
	
	



}
