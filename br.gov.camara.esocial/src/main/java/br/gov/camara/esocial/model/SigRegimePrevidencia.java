package br.gov.camara.esocial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


@Table(name = "regimeprevidencia")
public class SigRegimePrevidencia {
	
	@Id
	private Long ideobjeto;	
	
	@Column
	private String indtiporegimeprevidencia;


}
