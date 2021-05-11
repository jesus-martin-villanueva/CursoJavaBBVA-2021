package archivos;

import java.io.File;

public class ListarDirectorios {

	public ListarDirectorios() {}

	public static void main(String[] args) {
		
		File dir = new File("C:\\repoBBVA_local\\CursoJavaBBVA-2021\\CursoJava\\src\\archivos");
		String[] ficheros = dir.list();
		if (ficheros == null)
			  System.out.println("No hay ficheros en el directorio especificado");
			else { 
			  for (int x=0;x<ficheros.length;x++)
			    System.out.println(ficheros[x]);
			}
		

	}

}
