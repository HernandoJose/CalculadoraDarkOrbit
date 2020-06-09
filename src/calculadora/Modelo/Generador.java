package calculadora.Modelo;

public class Generador {
	
	public static final boolean ESCUDO = true;
	public static final boolean MOTOR = false;
	
	private String nombre;
	private boolean tipo;
	private int valor;
	private int nivelMejora;
	private double absorcion;
	private double bonoReg;


	public Generador(String nombre, boolean tipo, int valor, int nivelMejora, double absorcion, double bonoReg) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
		this.nivelMejora = nivelMejora;
		this.absorcion = absorcion;
		this.bonoReg = bonoReg;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isTipo() {
		return tipo;
	}


	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getNivelMejora() {
		return nivelMejora;
	}


	public void setNivelMejora(int nivelMejora) {
		this.nivelMejora = nivelMejora;
	}


	public double getAbsorcion() {
		return absorcion;
	}


	public void setAbsorcion(double absorcion) {
		this.absorcion = absorcion;
	}


	public double getBonoReg() {
		return bonoReg;
	}


	public void setBonoReg(double bonoReg) {
		this.bonoReg = bonoReg;
	}


	@Override
	public String toString() {
		return nombre;
	}
	

	

}
