package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

public class Archivos {	
	
	public File leertxt(File txt){
		FileReader fr ;
        BufferedReader br;
		try{
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda.
//            archivo = new File ("C:\\Users\\luis felipe\\Desktop\\taller experimental\\mailsunsj.txt");
             fr = new FileReader (txt);
             br = new BufferedReader(fr);
            
            // Lectura del fichero
//            String linea="";
////          
//            while((linea=br.readLine())!=null){               
//            	System.out.println(linea); 
//              }
          
    }catch(Exception e){
        e.printStackTrace();
    }
       
     
	return null;
	}
	
	public ArrayList<String> AlmacenarContenidoTxt(File archivo){ 
		
		ArrayList<String> datos=new ArrayList<>();
//		File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	     try{
	             // Apertura del fichero y creacion de BufferedReader para poder
	             // hacer una lectura comoda (disponer del metodo readLine()).
//	             archivo = new File ("C:\\Users\\luis felipe\\Desktop\\taller experimental\\mailsunsj.txt");
	             fr = new FileReader (archivo);
	             br = new BufferedReader(fr);
	             
	             // Lectura del fichero
	             String linea;
//	             int i=0;
	             while((linea=br.readLine())!=null){
	            	 datos.add(linea);
//	                System.out.println(datos.get(i));        
//	             i++;
	     }
	             return datos;
	     }catch(Exception e){
//	         e.printStackTrace();
	     }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
//	            e2.printStackTrace();
	         }
	      }
		return null;
	}	
	
		public ArrayList<String> devolverDominios(ArrayList<String> dominios){
			String[] datos=new String[dominios.size()+1];
			ArrayList<String> cadena=new ArrayList<>();
			
			try{
			for (int i = 0; i < dominios.size(); i++) {
				datos=dominios.get(i).split("@");
				if(datos[0] != null  ){
						cadena.add(datos[1]);
				}
			}
			return cadena;
			}catch(Exception e){
//					System.out.println("archivo terminado");
			}
					
			return cadena;
			
		}		
		
	
	
	public ArrayList<String> devolverDominio(ArrayList<String> cantidadD){
		
//		ArrayList<String> datos=devolverDominios(cantidadD);
		ArrayList<String> dominio=new ArrayList<>();
		String[] datos1=new String[cantidadD.size()+1];
		
		for (int i = 0; i < cantidadD.size(); i++) {
			datos1=cantidadD.get(i).split("/");
			if(datos1[0]!=null){				
				dominio.add(datos1[0]);
//				System.out.println("Dominio:"+dominio.get(i));
			}
		}		
		return dominio;
	}
	
	public ArrayList<String> contarPorDominios(ArrayList<String> tama�o){
		ArrayList<String> dominio1=new ArrayList<>();
		ArrayList<String> numeroD=new ArrayList<>();
		ArrayList<String> separarD=new ArrayList<>();
		ArrayList<String> cuenta=new ArrayList<>();
		try{
//			System.out.println("contar por dominios");
			numeroD=devolverDominios(tama�o);
			dominio1=devolverDominio(numeroD);
			separarD=separarDominio(dominio1);
			int cont=0;
//			System.out.println(numeroD.size());
//			System.out.println(dominio1.size());
//			System.out.println(separarD.size());
			
			for (int i = 0; i < dominio1.size(); i++) {
				cont=cuentaDominios(dominio1,separarD.get(i) );
//				System.out.println(cont);
//				System.out.println(cont);
				if(cuenta.isEmpty()){
				cuenta.add(dominio1.get(i)+" : "+cont);
//				System.out.println(cuenta.get(i)+" : "+cont);
				}else{
//					System.out.println("contiene el string del else");
					if(cuenta.contains(dominio1.get(i))){
						continue;
					}else{
						cuenta.add(dominio1.get(i)+" : "+cont);
//						System.out.println(cuenta.get(i));
					}
				}
//						System.out.println(cuenta.get(i));
			}
//			System.out.println(cuenta.size());
			return cuenta;
			
		}catch(Exception e){
			
		}
		
		
		return cuenta;
	}
	
	
	public int cuentaDominios(ArrayList<String> correos,String cadena){
		int acum=0;
		for (int i = 0; i < correos.size(); i++) {
			if(cadena.equals(correos.get(i))){
				acum++;
			}
		}
//		System.out.println(acum);
		return acum;
		
	}
	
//	public  ArrayList<String> mirarDominio(ArrayList<String> correos){
//		ArrayList<String> 
//		return correos;
		
//	}
	
	public ArrayList<String> separarDominio(ArrayList<String> dominio){
			
			ArrayList<String> dominios=new ArrayList<>();
			String acum=null;
//			int con=0;
			try{
				
				for (int i = 0; i <dominio.size(); i++) {
					acum=dominio.get(i);					
					if(dominios.isEmpty()==true){
						dominios.add(acum);
					}else{
						if(dominios.contains(acum)){
							continue;
						}else{
							dominios.add(acum);
						}
						}
					}
				
				
				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("no se pudo hacer ");
			}
				
				return dominios;
	}
	
	public ArrayList<String> cuentaDominiosfacultades(ArrayList<String> facultades){
		ArrayList<String> cont=new ArrayList<>();
		ArrayList<String> facultad=devolverFacultad(facultades);
		ArrayList<String> correos=devolverDominios(facultades);
		ArrayList<String> dominio=devolverDominio(correos);
		String acum="";
		for (String string : facultades) {
			for (int i = 0; i < dominio.size(); i++) {				
				for (int j=0;j< facultad.size();j++) {
					acum=contarDominio(correos, dominio.get(i), facultad.get(j));
//						System.out.println("cont no esta vacia"+acum);
					if(cont.contains(dominio.get(i)) && cont.contains(facultad.get(j))){
						continue;
					}else{
						cont.add(dominio.get(i) + " : "+ facultad.get(j));
					}
			} {
						
					}
//					if(cont.size()>3){
//						
//						System.out.println(cont.get(0)+"--"+cont.get(1)+"--"+cont.get(2)+"--");
//					}
					
				}
			if(cont.size()==facultad.size()){
				return cont;
			}
			
		}
		
//		System.out.println(cont.get(0));
		return cont;
	}
	
	public ArrayList<String> DominiosPorFacultad(ArrayList<String> correos, String facultad){
		
		ArrayList<String> cont= devolverDominios(correos);
		 
		ArrayList<String> acum= new ArrayList<>();
		for (int i = 0; i < correos.size(); i++) {
				
				if(acum.isEmpty()){
					acum.add(cont.get(i));
				}else{
					if((correos.get(i).contains(facultad))){
							if(acum.contains(correos.get(i))){
								continue;
							}else{	
								acum.add(correos.get(i));
							}
								
						
					}
					else{
						continue;
					}
			}
												
					}
		System.out.println(acum);
		return acum;
	}
	
	public ArrayList<String> devolverFacultad(ArrayList<String> cantidadD){
		
		ArrayList<String> dominio=new ArrayList<>();
		String[] datos1=new String[2];
		
		for (int i = 0; i < cantidadD.size(); i++) {
			datos1=cantidadD.get(i).split("/");
				if(dominio.isEmpty()){
					dominio.add(datos1[1]);
				}else{
					if(dominio.contains(datos1[1])){
						continue;
					}else{
						dominio.add(datos1[1]);
//						System.out.println(dominio.get(i));
					}
				}
//				System.out.println("facultad:"+dominio.get(i));
			}
		return dominio;
	}
	
	public String contarDominio(ArrayList<String> correos,String facultad,String dominio){
		int c=0;
		int con=0;
		String acum=null;
		for (int i = 0; i < correos.size(); i++) {
			if(correos.get(i).contains(facultad)){
				if(correos.get(i).contains(dominio)){
					c++;
				}else{
					continue;					
				}
				if(c>con){
					con=c;
				}
			}
			acum=correos.get(i);
		}
		return acum;
	}

	
	
	 

	
}
