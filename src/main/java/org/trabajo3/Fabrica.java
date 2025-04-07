package org.trabajo3;
import java.util.Vector;

public class Fabrica {

	int id;
	String nombre;
	String direccion;
	int codigoPostal;
	String ciudad;
	Vector<EmpleadoAsalariadoFabrica> empleadosAsalariados;
	Vector<EmpleadoPorHorasFabrica> empleadosPorHoras;
	
	public Fabrica(int id, String nombre, String direccion, int codigoPostal, String ciudad){
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.empleadosAsalariados = new Vector<EmpleadoAsalariadoFabrica>(0,1);
		this.empleadosPorHoras = new Vector<EmpleadoPorHorasFabrica>(0,1);
	}
	
	   public void setId( int id ){
	      this.id = id;
	   } 

	   public int getId (){
	      return this.id;
	   } 
	   
	   public void setNombre( String nombre )  {
	      this.nombre = nombre;
	   } 

	   public String getNombre() {
	      return this.nombre;
	   } 

	   public void setDireccion( String direccion ) {
	      this.direccion = direccion;
	   } 

	   public String getDireccion() {
	      return this.direccion;
	   } 

	   public void setCodigoPostal( int codigoPostal )  {
	      this.codigoPostal = codigoPostal;
	   } 

	   public int getCodigoPostal() {
	      return this.codigoPostal;
	   } 

	   public void setCiudad( String ciudad ) {
	      this.ciudad = ciudad;
	   } 

	   public String getCiudad() {
	      return this.ciudad;
	   } 	
	   
	   public void altaEmpleadoAsalariado(EmpleadoAsalariadoFabrica empleado){
		   this.empleadosAsalariados.add(empleado);
	   }
	   
	   public void bajaEmpleadoAsalariado(EmpleadoAsalariadoFabrica empleado){
		   this.empleadosAsalariados.removeElement(empleado);
	   }
	   
	   public void altaEmpleadoPorHoras(EmpleadoPorHorasFabrica empleado){
		   this.empleadosPorHoras.add(empleado);
	   }
	   
	   public void bajaEmpleadoPorHoras(EmpleadoPorHorasFabrica empleado){
		   this.empleadosPorHoras.removeElement(empleado);
	   }
	   
	   public String getNominaFabrica(){
	   	   String nomina = new String("");
    	   for (int i=0; i<this.empleadosAsalariados.size(); i++){
    		   nomina = nomina + this.empleadosAsalariados.elementAt(i).toString();
    	   }  	 
    	   for (int i=0; i<this.empleadosPorHoras.size(); i++){
    		   nomina = nomina + this.empleadosPorHoras.elementAt(i).toString();
    	   }      	   
    	   return nomina;
       }
	
	   
}
