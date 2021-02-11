
public class Cine {
	private String reproduciendo;
	private double precioEntrada;
	private boolean asiento[][]=new boolean[8][9];
	
	public Cine(String reproduciendo, double precioEntrada) {
		super();
		this.reproduciendo = reproduciendo;
		this.precioEntrada = precioEntrada;
	}
	
	public String getReproduciendo() {
		return reproduciendo;
	}
	public void setReproduciendo(String reproduciendo) {
		this.reproduciendo = reproduciendo;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	public boolean[][] getAsiento() {
		return asiento;
	}
	public void setAsiento(boolean[][] asiento) {
		this.asiento = asiento;
	}

	
	
	
}
