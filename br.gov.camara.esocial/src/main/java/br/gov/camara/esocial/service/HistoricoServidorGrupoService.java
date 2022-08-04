package br.gov.camara.esocial.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.esocial.model.SigHistoricoServidorGrupo;
import br.gov.camara.esocial.repository.SigHistoricoServidorGrupoRepository;

@Service
public class HistoricoServidorGrupoService {
	
	private List<SigHistoricoServidorGrupo> histservgrupo;
	@Autowired
	private SigHistoricoServidorGrupoRepository histservgrupodao;

	public List<SigHistoricoServidorGrupo> cadastroInicial(LocalDate inicio, String codgrupo){
		histservgrupo = histservgrupodao.findCadastroInicial(inicio, codgrupo);
		return histservgrupo;		
	}
	
	

}
