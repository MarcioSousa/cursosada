package dpjsingleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {
	
	//static quer dizer que terá somente um na memória. (Somente uma instancia daquele objeto)
	private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
	
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonEAGER() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);
	}
	
	public static AgendaSingletonEAGER getInstance() {
		return INSTANCE;
	}

	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}

	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}
}
