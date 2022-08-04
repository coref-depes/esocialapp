package br.gov.camara.esocial.repository;



import java.beans.JavaBean;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.esocial.model.SigGrupo;


@Repository
public interface SigGrupoRepository extends JpaRepository<SigGrupo, Long>{
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto = ?1 "+
	" order by grupo.codobjeto" )
			SigGrupo findByCodGrupo(int codgrupo);
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (1,2,5,6,13) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposEstatutarios();
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (2,6,13) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposSemVinculo();

	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (1,2,6,13) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposAfastamento();
	
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (1,2,5,6,13) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposAtivos();
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (3,9) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposInativos();
	
	@Query("select grupo from SigGrupo grupo  "+
			"where grupo.codobjeto in (7,10) "+
			" order by grupo.codobjeto")
			List<SigGrupo> findGruposPensionistas();


}
