package org.trabajo3;

import java.math.BigInteger;

public class EmpleadoAsalariadoFabrica {
public String nombre;
public String apellido;
public String nss;
public double salarioSemanal;
String salida;

public EmpleadoAsalariadoFabrica( String nombre, String apellido, String nss, double salario ) {	
	this.nombre = nombre;
	this.apellido = apellido;
	setNss(nss); 
	setApellido(apellido); 
	setNss(nss); 
	setSalarioSemanal( salario );
	} 

public void setNombre( String nombre) {
	this.nombre = nombre;
	} 
public String getNombre(){
	return this.nombre;
	} 

public void setApellido( String apellido ){
	this.apellido = apellido;
	}

public String getApellido(){
	return this.apellido;
	}

public void setNss( String nssg ){
	this.nss = (validarNss(nssg))? nssg : "00-00000000-00" ;
	} 

public String getNss(){
	return this.nss;
	} 

public void setSalarioSemanal( double salario ) {
	salarioSemanal = salario < 0.0 ? 0.0 : salario;
	} 

public double getSalarioSemanal(){
	return salarioSemanal;
	}

public double ingresos(){
	return getSalarioSemanal();
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

public String toString() {
	String salida = new String("Nombre: " + getNombre() + ' ' + getApellido() + '\n');
	salida = salida + "nss: " + getNss() + '\n';
	salida = salida + "regimen: asalariado \n";
    salida = salida + "salario semanal: " + salarioSemanal + '\n';
    salida = salida + "ingresos: " + ingresos() + '\n';
    salida = salida + "------------------------" + '\n';
   return salida; } 
} 
