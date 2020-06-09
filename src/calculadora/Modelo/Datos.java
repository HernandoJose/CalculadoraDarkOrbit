package calculadora.Modelo;

import java.util.List;

public class Datos {

	private List<Nave> naves;
	private List<Generador> generadores;
	private List<Laser> laseres;
	private List<Vant> vants;
	private int maxNivelMejora;
	private double ratioMejoraLaser;
	private double ratioMejoraEscudo;
	private double ratioMejoraVantSDH;
	private double ratioMejoraVantDMG;
	
	
	public Datos(List<Nave> naves, List<Generador> generadores, List<Laser> laseres, List<Vant> vants,
			int maxNivelMejora) {
		super();
		this.naves = naves;
		this.generadores = generadores;
		this.laseres = laseres;
		this.vants = vants;
		this.maxNivelMejora = maxNivelMejora;
	}


	public List<Nave> getNaves() {
		return naves;
	}


	public void setNaves(List<Nave> naves) {
		this.naves = naves;
	}


	public List<Generador> getGeneradores() {
		return generadores;
	}


	public void setGeneradores(List<Generador> generadores) {
		this.generadores = generadores;
	}


	public List<Laser> getLaseres() {
		return laseres;
	}


	public void setLaseres(List<Laser> laseres) {
		this.laseres = laseres;
	}


	public List<Vant> getVants() {
		return vants;
	}


	public void setVants(List<Vant> vants) {
		this.vants = vants;
	}


	public int getMaxNivelMejora() {
		return maxNivelMejora;
	}


	public void setMaxNivelMejora(int maxNivelMejora) {
		this.maxNivelMejora = maxNivelMejora;
	}
	

	
	
}
