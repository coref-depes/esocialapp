package br.gov.camara.esocial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usr_folhacd.tabelaitem")
public class SigTabelaItem {

			@Id
			private Long ideobjeto;

			
			@Column
			private String codobjeto;

			@Column
			private String texdescricao;

			public Long getIdeobjeto() {
				return ideobjeto;
			}

			public void setIdeobjeto(Long ideobjeto) {
				this.ideobjeto = ideobjeto;
			}

			public String getCodobjeto() {
				return codobjeto;
			}

			public void setCodobjeto(String codobjeto) {
				this.codobjeto = codobjeto;
			}

			public String getTexdescricao() {
				return texdescricao;
			}

			public void setTexdescricao(String texdescricao) {
				this.texdescricao = texdescricao;
			}
			
			

}



