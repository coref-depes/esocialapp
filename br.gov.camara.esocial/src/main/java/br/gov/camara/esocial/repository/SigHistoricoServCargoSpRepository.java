package br.gov.camara.esocial.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigHistoricoServidorCargoSP;


	

@Repository
public interface SigHistoricoServCargoSpRepository extends JpaRepository<SigHistoricoServidorCargoSP, Long> {

	@Query("select histservcargosp  from SigHistoricoServidorCargoSP histservcargosp  "+
			"where servidor.numponto = ?1 "+
			"order by histservcargosp.datposse ")
			List<SigHistoricoServidorCargoSP> findByNum_ponto(int numponto);
	


	@Query("SELECT  distinct(histservcargosp) "+
	"from SigHistoricoServidorCargoSP histservcargosp "+
	"inner join SigServidorEventoHistorico  sev  "+
	"on ((sev.ideobjeto   = histservcargosp.idesehvencimento) or (sev.ideobjeto = histservcargosp.idesehgrg) ) "+
	"where trunc(histservcargosp.datposse) between ?1 and ?2 "+
	"and sev.servidor.grupo.codobjeto = 06 "+
	" 	and exists ( "+
	" SELECT histservcargosp2 "+
	"from SigHistoricoServidorCargoSP histservcargosp2   "+
	"inner join SigServidorEventoHistorico  sev2  "+
	"on ((sev2.ideobjeto   = histservcargosp2.idesehvencimento) or (sev2.ideobjeto = histservcargosp2.idesehgrg) ) "+
	"where  histservcargosp2.servidor.numponto = histservcargosp.servidor.numponto "+
	"and ((sev2.datfimhistorico is not null) "+
	"and trunc(sev.datiniciohistorico)=  (trunc(sev2.datfimhistorico)+1) ) "+ " ) "+
	" order by  histservcargosp.datposse ")
	List<SigHistoricoServidorCargoSP> findAlteracaoSP(LocalDate inicio, LocalDate fim);
	
	


	
	
}
