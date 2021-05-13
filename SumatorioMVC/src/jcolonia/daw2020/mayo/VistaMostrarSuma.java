package jcolonia.daw2020.mayo;

import java.util.ArrayList;
import java.util.Scanner;



public class VistaMostrarSuma extends VistaGeneral{

    /**
     * Constructor
     * @param in Scanner
     */
	
	public VistaMostrarSuma(Scanner in) {
		super(in);
	}
	   /**
     * Mostrar listado de canciones
     * @param arrayConunto Listado de datos de canciones en cadena
     */
	
	public void mostrarListado(ArrayList<String> arrayConjunto) {
		mostrarMensaje("Listado de Canciones");
		for (String conjuntoCancion : arrayConjunto) {
			mostrarMensaje("Datos de la cancion");
			mostrarMensaje(conjuntoCancion);
			
		}
	}
	

	}
	
