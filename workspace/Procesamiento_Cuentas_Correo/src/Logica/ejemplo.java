package Logica;

import java.io.File;
import java.util.ArrayList;

public class ejemplo {

	public static void main(String[] args)  {
		Archivos arc=  new Archivos();
		File archivo=arc.leertxt(new File("C:/Users/luis felipe/Desktop/taller experimental/mailsunsj.txt"));
		ArrayList<String> datos=arc.AlmacenarContenidoTxt(archivo);
	}

		

}
