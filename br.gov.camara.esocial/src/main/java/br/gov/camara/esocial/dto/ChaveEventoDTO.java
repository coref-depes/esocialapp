package br.gov.camara.esocial.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChaveEventoDTO {
	
	private long ideobjeto;
	
	private String codorigem;

	private String codtipochave;

	private String codsituacao;
	
	private Integer codgrupo;
	
	private String numponto;
	
	private String numcpf;
	
	private String codtipoafastamento;	

	private LocalDate   datcolecao;
	
	private LocalDate   datreferencia;	

	private LocalDateTime dathoracriacao;

	private LocalDateTime dathorasituacao;

	private Integer tipoApuracao;

	private String periodoApuracao;
	

	private String codigoRubrica;
	

	private Integer tipoRubrica;
	
	
	private String mesReferencia;

	
	private String nomeEventoExclusao;
	

	private String numReciboESocialExclusao;
	
	private String numreciboesocial;


}
