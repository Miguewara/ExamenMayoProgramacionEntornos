package jcolonia.daw2020.mayo;

import java.io.PrintStream;
import java.util.Scanner;


public class VistaAgregarValor extends VistaGeneral{

	 private PrintStream out;
	 
	  /**
	     * Controlador
	     * @param in Scanner
	     */
	public VistaAgregarValor(String nombre, Scanner in) {
		super(nombre, in);
		out = System.out;		
	}

		  /**
	     * Formulario de alta de nueva cancion
	     * @return Cancion dada de alta
	     */
		
	
			public boolean gestionarSumando(String nuevoNum) {
				
			boolean datosCorrectos=false;
			
			do {
					try {
			
			
				out.println("Recoger numero");
				mostrarMensaje("Numero: ");
				nuevoNum.setNum(recogerNum());
			
				
				datosCorrectos=true; }
					catch (VistasAltasException e ){
						mostrarAviso("Codigo introducido incorreto. ");
					}
			}  while(!datosCorrectos);
			
		
					
	return datosCorrectos;
}
			
		 

	