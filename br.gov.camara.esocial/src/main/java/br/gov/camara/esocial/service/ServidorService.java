package br.gov.camara.esocial.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.esocial.model.SigServidor;
import br.gov.camara.esocial.repository.ServidorRepository;

@Service
public class ServidorService {
	
	@Autowired
	private ServidorRepository servidordao;
				
	public SigServidor buscaservidor(int numponto) {		

	SigServidor servidor = new SigServidor();
		
	servidor = servidordao.findByNum_ponto(servidor.getNumponto());
	

			return servidor;	
	}
	
	
}
