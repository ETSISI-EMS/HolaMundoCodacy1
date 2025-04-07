package org.trabajo3;

import java.math.BigInteger;

//Por Ley, la reducción de jornada como mínimo debe ser un octavo (1/8) y como máximo la mitad (1/2) de la jornada.

public class EmpleadoAsalariadoOficina {
	public String nombre; 
	public String apellido;
	public String nss;
	public double salarioSemanal;
	public double reduccion; // solo válido si es un valor entre 0.125 y 0.5

	public EmpleadoAsalariadoOficina( String nombre, String apellido, String nss, double salario, double reduccion ) {this.nombre = nombre; this.apellido = apellido;setNss(nss); setSalarioSemanal( salario );setReduccion(reduccion);
		} 
	
	public void setNombre( String nombre ){
		this.nombre = nombre;
	} 
	
	public String getNombre(){
		return this.nombre;
	} 
	
	public void setApellido( String apellido) {
		this.apellido = apellido;
		}

	public String getApellido(){
		return this.apellido;
		}

	public void setNss( String nssg ){
		this.nss = (validarNss(nssg))? nssg : "00-00000000-00" ;
		} 
	
	public static boolean validarNss (String id) { 
		   int provincia, secuencia, digControl, resto;
		   BigInteger dividendo;
			//el input puede venir con guiones y sin guiones!!	 
		 if (id.length() == 14) { // input string lleva guiones 
			   provincia = Integer.parseInt( id.substring(0, 2) ) ;
			   secuencia =   Integer.parseInt( id.substring(3,11));
			   digControl =   Integer.parseInt( id.substring(12,14));
			   dividendo = new BigInteger (id.substring(0, 2) +  id.substring(3,11));
			   resto = dividendo.remainder( new BigInteger("97")).intValue();
			   return (resto == digControl);
		   } else if (id.length() == 12) {  // entrada sin guiones 
			   System.out.println(id.length());
			   provincia = Integer.parseInt( id.substring(0, 2) ) ;
			   secuencia = Integer.parseInt( id.substring(2,10));
			   digControl = Integer.parseInt( id.substring(10,12));
			   dividendo = new BigInteger (id.substring(0, 2) +  id.substring(2,10));
			   resto = dividendo.remainder( new BigInteger("97")).intValue();
			   return (resto == digControl);
		   } else return false;  
		} 
	
	public String getNss() {
		return this.nss;
		} 
     
	public void setSalarioSemanal (double salario){
		salarioSemanal = salario < 0.0 ? 0.0 : salario;
		} 
	
	
	public void setSalarioSemanal_ (double salario){
		double x;	
		x = salario;
		if ( salario < 0.0) x = 0.0; 
		else if (reduccion >= 0.125 && reduccion <= 0.5 ) 
			x = salario * (1-reduccion);
		else x = salario;
		salarioSemanal = x;
		} 
	
	public void setReduccion( double red ){
		this.reduccion = red;
	} 
	
	public double getReduccion(){
		return this.reduccion;
	} 
	
	
	public double getSalarioSemanal() {
		return salarioSemanal;
		} 
	
	public double ingresos(){
		if (reduccion >= 0.125 && reduccion <= 0.5 ) 
			return salarioSemanal * (1-reduccion);
		else return getSalarioSemanal();
	  } 
	
	public String toString(){String salida = new String("Nombre: " + getNombre() + ' ' + getApellido() + '\n');
	salida = salida + "nss: " + getNss() + '\n';
	salida = salida + "regimen: asalariado \n";
	salida = salida + "salario semanal: " + salarioSemanal + '\n';
	salida = salida + "ingresos: " + ingresos() + '\n';
	salida = salida + "------------------------" + '\n';
	return salida;
	} 
} 
