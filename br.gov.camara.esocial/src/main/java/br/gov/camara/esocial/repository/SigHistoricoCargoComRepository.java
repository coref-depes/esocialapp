package br.gov.camara.esocial.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigHistoricoCargoComissionado;


	

@Repository
public interface SigHistoricoCargoComRepository extends JpaRepository<SigHistoricoCargoComissionado, Long> {

	@Query("select historicocargocomissionado from SigHistoricoCargoComissionado historicocargocomissionado  "+
			"where idecargocomissionado = ?1 "+
			"order by historicocargocomissionado.datiniciohistorico ")
			List<SigHistoricoCargoComissionado> findByIdeCargo(Long idecargocomissionado);
	
	@Query("select historicocargocomissionado from SigHistoricoCargoComissionado historicocargocomissionado  "+
			"where idecargocomissionado = ?1 and datiniciohistorico <= ?2 "+
			"order by historicocargocomissionado.datiniciohistorico desc ")
			List<SigHistoricoCargoComissionado> findByIdeCargoData(Long idecargocomissionado, LocalDate datiniciohistorico);

}
