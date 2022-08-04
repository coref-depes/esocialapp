package br.gov.camara.esocial.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.esocial.model.SigAfastamento;
import br.gov.camara.esocial.repository.AfastamentoRepository;


@Service
public class AfastamentoService {
	
	@Autowired
	private AfastamentoRepository afastamentodao;
				
					
		public SigAfastamento buscaafastamentoporid(Long id) {		

			SigAfastamento  afastamento = afastamentodao.getById(id);
			

				return afastamento;	
		}
	

		public List<SigAfastamento> buscaafastamentoporperiodo(LocalDate inicio, LocalDate fim) {		

			List<SigAfastamento>  afastamentos = afastamentodao.find_PorPeriodo(inicio, fim);

				return afastamentos;	
		}
	
	
		
		
}
