package org.trabajo3;

import java.math.BigInteger;

public class EmpleadoPorHorasOficina {

	   public String nombre;
	   public String apellido;
	   public String nss;
	   private double sueldo; 
	   private double horas; 
	  
	   public EmpleadoPorHorasOficina ( String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas ) {
		   this.nombre = nombre;
		   this.apellido = apellido; 
		   this.nss = nss;
		   setSueldo( sueldoPorHoras );
		   setHoras( horasTrabajadas );
		   } 

	   public void setNombre (String nombre) {
		   this.nombre = nombre;
		   } 
	   
	   public String getNombre() {
		   return this.nombre;} 
	   
	   public void setApellido( String apellido ) {
		   this.apellido = apellido;
		   }
	   
	   public String getApellido() {
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


	   public String getNss()  {
		   return this.nss;
		   } 
	   
	   public void setSueldo( double sueldoPorHoras ) {
		   sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
	   } 
	   
	   public double getSueldo()
	   {return sueldo;} 
	   
	   public void setHoras( double horasTrabajadas ) { 
		   horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ? horasTrabajadas : 0.0;
		   } 
	   
	   public double getHoras()  {
		   return horas;
		   } 
	   
	   public double ingresos() {
		   if ( getHoras() <= 40 ) 
			   return getSueldo() * getHoras(); 
		   else return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
		   } 
	   
	   public String toString(){
		   String salida = new String("Nombre: " + getNombre() + ' ' + getApellido() + '\n');
			salida = salida + "nss: " + getNss() + '\n';
			salida = salida + "regimen: por horas \n";
		   salida = salida + "sueldo por hora: " + sueldo + "; horas trabajadas: " + horas + '\n';
		   salida = salida + "ingresos: " + ingresos() + '\n';
		   salida = salida + "------------------------" + '\n';
	 	   return salida;
	   } 
}

