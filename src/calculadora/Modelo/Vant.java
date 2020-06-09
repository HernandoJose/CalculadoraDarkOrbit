package calculadora.Modelo;

public class Vant {

	private String nombre;
	private String imagePath;
	private int numRanuras;
	private int nivel;
	private int nivelMejora;
	private double bonoDMG;
	private double bonoSDH;
	
	
	public Vant(String nombre, String imagePath, int numRanuras, int nivel, int nivelMejora, double bonoDMG,
			double bonoSDH) {
		super();
		this.nombre = nombre;
		this.imagePath = imagePath;
		this.numRanuras = numRanuras;
		this.nivel = nivel;
		this.nivelMejora = nivelMejora;
		this.bonoDMG = bonoDMG;
		this.bonoSDH = bonoSDH;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public int getNumRanuras() {
		return numRanuras;
	}


	public void setNumRanuras(int numRanuras) {
		this.numRanuras = numRanuras;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getNivelMejora() {
		return nivelMejora;
	}


	public void setNivelMejora(int nivelMejora) {
		this.nivelMejora = nivelMejora;
	}


	public double getBonoDMG() {
		return bonoDMG;
	}


	public void setBonoDMG(double bonoDMG) {
		this.bonoDMG = bonoDMG;
	}


	public double getBonoSDH() {
		return bonoSDH;
	}


	public void setBonoSDH(double bonoSDH) {
		this.bonoSDH = bonoSDH;
	}


	@Override
	public String toString() {
		return nombre;
	}
	
	
	
}
