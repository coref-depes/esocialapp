package br.gov.camara.esocial.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.esocial.model.SigHistoricoServidorCargoSP;
import br.gov.camara.esocial.repository.SigHistoricoServCargoSpRepository;


@Service
public class HistoricoServidorCargoSpService {
	
	private List<SigHistoricoServidorCargoSP> histservcargosp;
	@Autowired
	private SigHistoricoServCargoSpRepository histservcargospdao;


	public List<SigHistoricoServidorCargoSP> servidorponto(int numponto){
		histservcargosp = histservcargospdao.findByNum_ponto(numponto);
			
		return histservcargosp;		
	}

	public List<SigHistoricoServidorCargoSP> AlteracaoSPPonto( LocalDate inicio, LocalDate fim){
		histservcargosp = histservcargospdao.findAlteracaoSP(inicio, fim);
			
		return histservcargosp;		
	}
	

}
