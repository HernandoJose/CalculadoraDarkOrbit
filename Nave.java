package calculadora.Modelo;

public class Nave {

	private String nombreNave;
	private String imagePath;
	private int velocidad;
	private int carga;
	private int numLaseres;
	private int numGeneradores;
	private int puntosVida;
	private int extras;
	private int modMejora;
	private double bonoPV;
	private double bonoSDH;
	private double bonoDMG;
	private double bonoPH;
	private double bonoPE;

	public Nave(String nombreNave, String imagePath, int velocidad, int carga, int numLaseres, int numGeneradores, int puntosVida, int extras, int modMejora,
			double bonoPV, double bonoSDH, double bonoDMG, double bonoPH, double bonoPE) {
		this.nombreNave = nombreNave;
		this.imagePath = imagePath;
		this.velocidad = velocidad;
		this.carga = carga;
		this.numLaseres = numLaseres;
		this.numGeneradores = numGeneradores;
		this.puntosVida = puntosVida;
		this.extras = extras;
		this.modMejora = modMejora;
		this.bonoPV = bonoPV;
		this.bonoSDH = bonoSDH;
		this.bonoDMG = bonoDMG;
		this.bonoPH = bonoPH;
		this.bonoPE = bonoPE;
	}

	public String getNombreNave() {
		return nombreNave;
	}

	public void setNombreNave(String nombreNave) {
		this.nombreNave = nombreNave;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getNumLaseres() {
		return numLaseres;
	}

	public void setNumLaseres(int numLaseres) {
		this.numLaseres = numLaseres;
	}

	public int getNumGeneradores() {
		return numGeneradores;
	}

	public void setNumGeneradores(int numGeneradores) {
		this.numGeneradores = numGeneradores;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}

	public int getModMejora() {
		return modMejora;
	}

	public void setModMejora(int modMejora) {
		this.modMejora = modMejora;
	}

	public double getBonoPV() {
		return bonoPV;
	}

	public void setBonoPV(double bonoPV) {
		this.bonoPV = bonoPV;
	}

	public double getBonoSDH() {
		return bonoSDH;
	}

	public void setBonoSDH(double bonoSDH) {
		this.bonoSDH = bonoSDH;
	}

	public double getBonoDMG() {
		return bonoDMG;
	}

	public void setBonoDMG(double bonoDMG) {
		this.bonoDMG = bonoDMG;
	}

	public double getBonoPH() {
		return bonoPH;
	}

	public void setBonoPH(double bonoPH) {
		this.bonoPH = bonoPH;
	}

	public double getBonoPE() {
		return bonoPE;
	}

	public void setBonoPE(double bonoPE) {
		this.bonoPE = bonoPE;
	}

	@Override
	public String toString() {
		return nombreNave;
	}


}
