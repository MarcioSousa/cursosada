package dpjfactorymethod.solucao;

import java.util.Calendar;

import dpjfactorymethod.Produto;
import dpjfactorymethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

	public static void main(String[] args) {
		Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
		Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
		
		System.out.println(produtoFisico);
		System.out.println(produtoDigital);
		
		Calendar instance = Calendar.getInstance();
	}

}
