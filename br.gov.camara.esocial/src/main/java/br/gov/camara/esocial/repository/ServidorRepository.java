package br.gov.camara.esocial.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigPessoaFisica;
import br.gov.camara.esocial.model.SigServidor;

@Repository
public interface ServidorRepository extends JpaRepository<SigServidor, Long> {

	@Query("select servidor from SigServidor servidor where numponto = ?1 ")
	SigServidor findByNum_ponto(int numponto);
	
	@Query("select servidor from SigServidor servidor  "+
			"WHERE  ((TRUNC(servidor.datcriacao) BETWEEN trunc(?1)  AND trunc(?2)) or "+
			" (TRUNC(servidor.datultimaalteracao) BETWEEN trunc(?3)  AND trunc(?4))) and servidor.numponto between 1 and 999999 order by servidor.numponto")
	List<SigServidor> findByDatLancamento(LocalDate data1,LocalDate data2,LocalDate data3,LocalDate data4);

	
	
	@Query("select servidor from SigServidor servidor where servidor.pessoafisica = ?1 and servidor.datfimhistorico is null")
	List<SigServidor> findByPessoafisica(SigPessoaFisica pessoaFisica);
	
}
