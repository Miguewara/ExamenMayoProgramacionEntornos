package jcolonia.daw2020.mayo;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaMostrarValores extends VistaGeneral {

	  /**
     * Constructor
     * @param in Scanner
     */
	
	public VistaMostrarValores(String nombre, Scanner in) {
		super(nombre, in);
	}
	   /**
     * Mostrar listado de canciones
     * @param arrayConunto Listado de datos de canciones en cadena
     */
	
	public void mostrarValores(ArrayList<String> arrayValores) {
		mostrarMensaje("Listado de Valores");
		for (String conjuntoValores : arrayValores) {
			mostrarMensaje(conjuntoValores);
			
		}
	}
	

	}
