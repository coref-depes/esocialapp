package br.gov.camara.esocial.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigHistoricoServidorCargoCom;
	

@Repository
public interface SigHistoricoServCargoComRepository extends JpaRepository<SigHistoricoServidorCargoCom, Long> {

	@Query("select histservcargocom from SigHistoricoServidorCargoCom histservcargocom  "+
			"where servidor.numponto = ?1 "+
			"order by histservcargocom.datexercicio ")
			List<SigHistoricoServidorCargoCom> findByNum_ponto(int numponto);
	


}
