package dpjsingleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {
	//static quer dizer que terá somente um na memória. (Somente uma instancia daquele objeto)
	//utilizando LAZY só vai ser carregado quando necessário.
	private static AgendaSingletonLAZY INSTANCE = null;
		
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonLAZY() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);
	}
		
	public static AgendaSingletonLAZY getInstance() {
		if(Objects.isNull(INSTANCE)) {
			INSTANCE = new AgendaSingletonLAZY();
			return INSTANCE;
		}
		return INSTANCE;
	}

	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}

	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}
	
}
