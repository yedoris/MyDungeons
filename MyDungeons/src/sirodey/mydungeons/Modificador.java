package sirodey.mydungeons;

public class Modificador {
	private String fuente;
	private String atributo;
	private int valor;

	public Modificador(String fuente, String atributo, int valor) {
			super();
			this.fuente = fuente;
			this.atributo = atributo;
			this.valor = valor;
		
	}
	
	public Modificador() {
		// TODO Auto-generated constructor stub
	}

	public String getAtributo() {
		return atributo;
	}
	
	public String getFuente() {
		return fuente;
	}

	public int getValor() {
		return valor;
	}
}
