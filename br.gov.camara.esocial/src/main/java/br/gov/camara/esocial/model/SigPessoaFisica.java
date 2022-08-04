package br.gov.camara.esocial.model;

import java.time.LocalDate;
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

@Entity
@Table(name = "usr_folhacd.pessoafisica")
public class SigPessoaFisica {
	@Id
	private Long ideobjeto;

	@Column
	private String nompessoafisica;
	
	@Column(length = 1)
	private String indsexo;
	
	@Column(length = 14)
	private String numcpf;
	
	@Column
	private String desemail;
	
	@Column
	private String numpispasep;
	@Column
	private String numidentidade;
	@Column
	private String nomexpedidoridentidade;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datemissaoidentidade", columnDefinition = "TIMESTAMP")
	private LocalDate datemissaoidentidade;
	@Column
	private String numtituloeleitor;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datnascimento", columnDefinition = "TIMESTAMP")
	private LocalDate  datnascimento;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datfalecimento", columnDefinition = "TIMESTAMP")
	private LocalDate datfalecimento;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datcriacao", columnDefinition = "TIMESTAMP")
	private LocalDate datcriacao;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "datultimaalteracao", columnDefinition = "TIMESTAMP")
	private LocalDate datultimaalteracao;

	
	@Column
	private String nompai;
	
	@Column
	private String nommae;

	public Long getIdeobjeto() {
		return ideobjeto;
	}

	public void setIdeobjeto(Long ideobjeto) {
		this.ideobjeto = ideobjeto;
	}

	public String getNompessoafisica() {
		return nompessoafisica;
	}

	public void setNompessoafisica(String nompessoafisica) {
		this.nompessoafisica = nompessoafisica;
	}

	public String getIndsexo() {
		return indsexo;
	}

	public void setIndsexo(String indsexo) {
		this.indsexo = indsexo;
	}

	public String getNumcpf() {
		return numcpf;
	}

	public void setNumcpf(String numcpf) {
		this.numcpf = numcpf;
	}

	public String getNumpispasep() {
		return numpispasep;
	}

	public void setNumpispasep(String numpispasep) {
		this.numpispasep = numpispasep;
	}

	public String getNumidentidade() {
		return numidentidade;
	}

	public void setNumidentidade(String numidentidade) {
		this.numidentidade = numidentidade;
	}

	public String getNomexpedidoridentidade() {
		return nomexpedidoridentidade;
	}

	public void setNomexpedidoridentidade(String nomexpedidoridentidade) {
		this.nomexpedidoridentidade = nomexpedidoridentidade;
	}

	public LocalDate getDatemissaoidentidade() {
		return datemissaoidentidade;
	}

	public void setDatemissaoidentidade(LocalDate datemissaoidentidade) {
		this.datemissaoidentidade = datemissaoidentidade;
	}

	public String getNumtituloeleitor() {
		return numtituloeleitor;
	}

	public void setNumtituloeleitor(String numtituloeleitor) {
		this.numtituloeleitor = numtituloeleitor;
	}

	public LocalDate getDatnascimento() {
		return datnascimento;
	}

	public void setDatnascimento(LocalDate datnascimento) {
		this.datnascimento = datnascimento;
	}

	public LocalDate getDatfalecimento() {
		return datfalecimento;
	}

	public void setDatfalecimento(LocalDate datfalecimento) {
		this.datfalecimento = datfalecimento;
	}

	public LocalDate getDatcriacao() {
		return datcriacao;
	}

	public void setDatcriacao(LocalDate datcriacao) {
		this.datcriacao = datcriacao;
	}

	public String getNompai() {
		return nompai;
	}

	public void setNompai(String nompai) {
		this.nompai = nompai;
	}

	public String getNommae() {
		return nommae;
	}

	public void setNommae(String nommae) {
		this.nommae = nommae;
	}

	public LocalDate getDatultimaalteracao() {
		return datultimaalteracao;
	}

	public void setDatultimaalteracao(LocalDate datultimaalteracao) {
		this.datultimaalteracao = datultimaalteracao;
	}


	


}
