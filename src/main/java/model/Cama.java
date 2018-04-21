package model;

public class Cama {

	private String tipo; // casal ou solteiro
	private boolean isBeliche;

	public Cama() {
	}

	public Cama(String tipo, boolean isBeliche) {
		this.tipo = tipo;
		this.isBeliche = isBeliche;
	}

	public boolean isBeliche() {
		return isBeliche;
	}

	public void setBeliche(boolean isBeliche) {
		this.isBeliche = isBeliche;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
