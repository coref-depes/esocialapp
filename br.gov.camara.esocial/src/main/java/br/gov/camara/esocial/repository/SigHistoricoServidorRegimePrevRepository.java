package br.gov.camara.esocial.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigHistoricoServidorRegimePrev;

@Repository
public interface SigHistoricoServidorRegimePrevRepository extends JpaRepository<SigHistoricoServidorRegimePrev, Long> {
	
	
	@Query("select histservregimeprev from SigHistoricoServidorRegimePrev histservregimeprev  "+
			"where histservregimeprev.servidor.numponto = ?1  "+
			"and trunc(histservregimeprev.datiniciohistorico) <=  ?2 "+
			"and ( (histservregimeprev.datfimhistorico is null) or (histservregimeprev.datfimhistorico > ?2) ) "+
			"and histservregimeprev.regimeprevidencia.indtiporegimeprevidencia = 'P' "+
			"and histservregimeprev.datcancelamento is null "+
			"order by histservregimeprev.servidor.numponto ")	
	List<SigHistoricoServidorRegimePrev>  findRegimePrevnaData(int numponto, LocalDate inicio);
	
	
	@Query("select histservregimeprev from SigHistoricoServidorRegimePrev histservregimeprev  "+
			"where histservregimeprev.servidor.numponto = ?1  "+
			"and trunc(histservregimeprev.datiniciohistorico) <=  ?2 "+
			"and ( (histservregimeprev.datfimhistorico is null) or (histservregimeprev.datfimhistorico > ?2) ) "+
			"and histservregimeprev.regimeprevidencia.indtiporegimeprevidencia = 'P' "+
			"and histservregimeprev.datcancelamento is null "+
			"order by histservregimeprev.servidor.numponto ")	
	List<SigHistoricoServidorRegimePrev>  findRegimePrevPeriodo(int numponto, LocalDate inicio, LocalDate fim);
	
	

}
