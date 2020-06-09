package calculadora.Presentacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import calculadora.Modelo.Datos;
import calculadora.Modelo.Generador;
import calculadora.Modelo.Nave;

public class main1 {



	public static void main(String[] args) {
		Gson gson = new Gson();

		List<Nave> naves = new ArrayList<Nave>();
		Nave nave;

		nave = new Nave("Yamato", "/top/yamato_top.png", 260, 1000, 8, 12, 260000, 2, 3, 1, 1, 1, 1, 1);
		naves.add(nave);
		nave = new Nave("Defcom", "/top/defcom_top.png", 340, 800, 12, 8, 250000, 2, 3, 1, 1, 1, 1, 1);
		naves.add(nave);
		
		Datos datos = new Datos(naves, null, null, null, 0);

		String json = gson.toJson(datos);
		System.out.println(json);
		guardarInfo(json);
		
		
/*
		String leido = cargarInfo();
		
		@SuppressWarnings("unchecked")
		Datos datosLeidos = gson.fromJson(leido, Datos.class);
		List<Nave> navesLeidas = datosLeidos.getNaves();
		navesLeidas.sort(new NaveNameSorter());

		for(Nave n : navesLeidas) {
			System.out.println(n);
		}
		*/
	}
	

	private static boolean guardarInfo(String content) {
		boolean correcto = false;

		try (FileWriter writer = new FileWriter("info.json");
				BufferedWriter bw = new BufferedWriter(writer)) {

			bw.write(content);

		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		return correcto;
	}

	private static String cargarInfo() {
		String content = "";

		try(BufferedReader reader = new BufferedReader(new FileReader("info.json"))){

			content = reader.readLine();
		}catch(IOException e){
			System.out.println("Error E/S: "+e);
		}

		return content;
	}


}
