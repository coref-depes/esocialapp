package br.gov.camara.esocial.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.esocial.model.SigHistoricoRequisicaoServidor;
import br.gov.camara.esocial.repository.SigHistoricoRequisicaoServidorRepository;

@Service
public class HistoricoServidorRequisicaoService {
	
	
	@Autowired
	private SigHistoricoRequisicaoServidorRepository requisicaodao;
	
	public List<SigHistoricoRequisicaoServidor>  buscarequisicao(int numponto, LocalDate datbase){
		
		
		List<SigHistoricoRequisicaoServidor> requisicoes= new   ArrayList<SigHistoricoRequisicaoServidor>();

	
		requisicoes = requisicaodao.findByRequisitado(numponto, datbase);
		
		return requisicoes;
	}

}
