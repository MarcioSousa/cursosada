package dpjfactorymethod;

import lombok.ToString;

public class Produto {
	private String descricao;
	private String preco;
	private Boolean possuiDimensoesFisicas;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public Boolean getPossuiDimensoesFisicas() {
		return possuiDimensoesFisicas;
	}
	public void setPossuiDimensoesFisicas(Boolean possuiDimensoesFisicas) {
		this.possuiDimensoesFisicas = possuiDimensoesFisicas;
	}
	
	@Override
	public String toString() {
		return "Produto{" +
				"descricao='" + descricao + '\'' +
				"preco='" + preco + '\'' +
				"possuiDimensoesFisicas='" + possuiDimensoesFisicas +
				'}';
	}
	
}
