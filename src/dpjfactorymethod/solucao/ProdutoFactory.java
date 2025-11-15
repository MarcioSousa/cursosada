package dpjfactorymethod.solucao;

import dpjfactorymethod.Produto;
import dpjfactorymethod.ProdutoDigital;
import dpjfactorymethod.ProdutoFisico;
import dpjfactorymethod.TipoProdutoEnum;

public class ProdutoFactory {
	
	public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
		switch (tipoProdutoEnum) {
			case FISICO:
				ProdutoFisico produtoFisico = new ProdutoFisico();
				produtoFisico.setPossuiDimensoesFisicas(true);
				return produtoFisico;
			case DIGITAL:
				ProdutoDigital produtoDigital = new ProdutoDigital();
				produtoDigital.setPossuiDimensoesFisicas(false);
				return produtoDigital;
			default:
				throw new IllegalArgumentException("Tipo de Produto não disponível.");
		}
	}
}
