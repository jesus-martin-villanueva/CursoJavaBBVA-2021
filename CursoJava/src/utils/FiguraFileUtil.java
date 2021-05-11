package utils;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraFileUtil {

	private ArrayList<Figura> figuras;
	private String nombreArchivo;
	private String path;
	
	public FiguraFileUtil(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		super();
		this.figuras = figuras;
		this.nombreArchivo = nombreArchivo;
		this.path = path;
	}
	
	public void generarArchivo() {
		FileWriter fichero = null;
        PrintWriter pw = null;
        int tipo = 0;
        //"C:\\repoBBVA_local\\CursoJavaBBVA-2021\\CursoJava\\src\\utils\\figuraFileUtilW.txt"
        try
        {
            fichero = new FileWriter(this.path + this.nombreArchivo);
            pw = new PrintWriter(fichero);
            
            for (Figura figura : figuras) {
            	if (figura instanceof Cuadrado)
            		tipo = 1;
            	else if (figura instanceof Circulo)
            		tipo = 2;
            	else if (figura instanceof Rectangulo)
            		tipo = 3;
            	else if (figura instanceof Triangulo)
            		tipo = 4;
            	else if (figura instanceof PoligonoRegular)
            		tipo = 5;
            	pw.println("{'Tipo':'" + tipo + "', 'nombre':'" + figura.getNombre() + "', 'valores':'" + figura.getValores() + "'},");
			}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        System.out.println("Fichero generado correctamente.");
	}
	
	public static void generarArchivo(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        int tipo = 0;

        try
        {
            fichero = new FileWriter(path + nombreArchivo);
            pw = new PrintWriter(fichero);
            
            for (Figura figura : figuras) {
            	if (figura instanceof Cuadrado)
            		tipo = 1;
            	else if (figura instanceof Circulo)
            		tipo = 2;
            	else if (figura instanceof Rectangulo)
            		tipo = 3;
            	else if (figura instanceof Triangulo)
            		tipo = 4;
            	else if (figura instanceof PoligonoRegular)
            		tipo = 5;
            	pw.println("{'Tipo':'" + tipo + "', 'nombre':'" + figura.getNombre() + "', 'valores':'" + figura.getValores() + "'},");
			}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        System.out.println("Fichero generado correctamente.");
	}
	
	public ArrayList<Figura> leerArchivo() {
		//"C:\\repoBBVA_local\\CursoJavaBBVA-2021\\CursoJava\\src\\utils\\figuraFileUtilR.txt"
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    ArrayList<Figura> figuras = new ArrayList<Figura>();
	    Map<String, String> map = new HashMap<String, String>();
	    String[] camposRegistro = null;

	    try {
	        archivo = new File (path + nombreArchivo);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);

	        String linea;
	        while((linea=br.readLine())!=null) {
	        	//Eliminamos los caracteres innecesarios
	        	linea = linea.replaceAll("[{}']*", "");
	        	
	        	camposRegistro = linea.split(",");
	        	
	        	//Obtengo los pares clave valor
	        	for(int i = 0; i < camposRegistro.length; i++) {
	        		String[] par = camposRegistro[i].split(":");
	        		map.put(par[0], par[1]); //Tipo, 1 ... nombre, cuad1 ... valores, l=10.0
	        	}
	        	
	        	switch(map.get("Tipo")) {
	        	case "1": //Cuadrado {'Tipo':'1', 'nombre':'cuad1', 'valores':'l=10.0'},
	        		String valorCua = map.get("valores"); //l=10.0
	        		float lado = Float.parseFloat(valorCua.substring(2));
	        		figuras.add(new Cuadrado(map.get("nombre"), lado));
	        		break;
	        	case "2": //Circulo {'Tipo':'2', 'nombre':'circ1', 'valores':'r=10.0'}
	        		String valorCir = map.get("valores"); //r=10.0
	        		float radio = Float.parseFloat(valorCir.substring(2));
	        		figuras.add(new Circulo(map.get("nombre"), radio));
	        		break;
	        	case "3": //Rectangulo {'Tipo':'3', 'nombre':'rect1', 'valores':'h=10, b=5'}
	        		String valoresRec = map.get("valores"); 
	        		float altura = Float.parseFloat(valoresRec.substring(2, valoresRec.indexOf(',')));
	        		float base = Float.parseFloat(valoresRec.substring(8));
	        		figuras.add(new Rectangulo(map.get("nombre"), altura, base));
	        		break;
	        	case "4": //Triangulo {'Tipo':'4', 'nombre':'tria1', 'valores':'h=3.0, b=4.0'}
	        		String valoresTri = map.get("valores"); 
	        		float alturaT = Float.parseFloat(valoresTri.substring(2, valoresTri.indexOf(',')));
	        		float baseT = Float.parseFloat(valoresTri.substring(9));
	        		figuras.add(new Triangulo(map.get("nombre"), alturaT, baseT));
	        		break;
	        	case "5": //Poligono Regular {'Tipo':'5', 'nombre':'poli1', 'valores':'a=4.0, l=6, cl=5'}
	        		String valoresPol = map.get("valores"); 
	        		float apotema = Float.parseFloat(valoresPol.substring(2, valoresPol.indexOf(',')));
	        		int ladoPol = Integer.parseInt(valoresPol.substring(9, valoresPol.indexOf(',')));
	        		int cantLados = Integer.parseInt(valoresPol.substring(15));
	        		figuras.add(new PoligonoRegular(map.get("nombre"), apotema, ladoPol, cantLados));
	        		break;
	        	}
	        		
	        	map.clear();
	        }
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try{                    
	    		if( null != fr ) {   
	    			fr.close();     
	            }  
	        } catch (Exception e2) { 
	            e2.printStackTrace();
	        }
	    }
	    
	    return figuras;
	}
	
	public static ArrayList<Figura> leerArchivo(String nombreArchivo, String path) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    ArrayList<Figura> figuras = new ArrayList<Figura>();
	    Map<String, String> map = new HashMap<String, String>();
	    String[] camposRegistro = null;

	    try {
	        archivo = new File (path + nombreArchivo);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);

	        String linea;
	        while((linea=br.readLine())!=null) {
	        	//Eliminamos los caracteres innecesarios
	        	linea = linea.replaceAll("[{}']*", "");
	        	
	        	camposRegistro = linea.split(",");
	        	
	        	//Obtengo los pares clave valor
	        	for(int i = 0; i < camposRegistro.length; i++) {
	        		String[] par = camposRegistro[i].split(":");
	        		map.put(par[0], par[1]); //Tipo, 1 ... nombre, cuad1 ... valores, l=10.0
	        	}
	        	
	        	switch(map.get("Tipo")) {
	        	case "1": //Cuadrado {'Tipo':'1', 'nombre':'cuad1', 'valores':'l=10.0'},
	        		String valorCua = map.get("valores"); //l=10.0
	        		float lado = Float.parseFloat(valorCua.substring(2));
	        		figuras.add(new Cuadrado(map.get("nombre"), lado));
	        		break;
	        	case "2": //Circulo {'Tipo':'2', 'nombre':'circ1', 'valores':'r=10.0'}
	        		String valorCir = map.get("valores"); //r=10.0
	        		float radio = Float.parseFloat(valorCir.substring(2));
	        		figuras.add(new Circulo(map.get("nombre"), radio));
	        		break;
	        	case "3": //Rectangulo {'Tipo':'3', 'nombre':'rect1', 'valores':'h=10, b=5'}
	        		String valoresRec = map.get("valores"); 
	        		float altura = Float.parseFloat(valoresRec.substring(2, valoresRec.indexOf(',')));
	        		float base = Float.parseFloat(valoresRec.substring(8));
	        		figuras.add(new Rectangulo(map.get("nombre"), altura, base));
	        		break;
	        	case "4": //Triangulo {'Tipo':'4', 'nombre':'tria1', 'valores':'h=3.0, b=4.0'}
	        		String valoresTri = map.get("valores"); 
	        		float alturaT = Float.parseFloat(valoresTri.substring(2, valoresTri.indexOf(',')));
	        		float baseT = Float.parseFloat(valoresTri.substring(9));
	        		figuras.add(new Triangulo(map.get("nombre"), alturaT, baseT));
	        		break;
	        	case "5": //Poligono Regular {'Tipo':'5', 'nombre':'poli1', 'valores':'a=4.0, l=6, cl=5'}
	        		String valoresPol = map.get("valores"); 
	        		float apotema = Float.parseFloat(valoresPol.substring(2, valoresPol.indexOf(',')));
	        		int ladoPol = Integer.parseInt(valoresPol.substring(9, valoresPol.indexOf(',')));
	        		int cantLados = Integer.parseInt(valoresPol.substring(15));
	        		figuras.add(new PoligonoRegular(map.get("nombre"), apotema, ladoPol, cantLados));
	        		break;
	        	}
	        		
	        	map.clear();
	        }
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try{                    
	    		if( null != fr ) {   
	    			fr.close();     
	            }  
	        } catch (Exception e2) { 
	            e2.printStackTrace();
	        }
	    }
	    
	    return figuras;
	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
