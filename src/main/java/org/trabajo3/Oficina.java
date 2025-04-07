package org.trabajo3;
import java.util.Vector;

public class Oficina {
	public int id;	public String nombre;public String direccion; public int codigoPostal; public String ciudad; public Vector<EmpleadoAsalariadoOficina> empleadosAsalariados;	public Vector<EmpleadoPorHorasOficina> empleadosPorHoras; public Vector<EmpleadoComisionPorVentas> empleadosComision;
	public Oficina(int id, String nombre, String direccion, int codigoPostal, String ciudad){this.id = id;this.nombre = nombre;this.direccion = direccion;this.codigoPostal = codigoPostal;this.ciudad = ciudad;	this.empleadosAsalariados = new Vector<EmpleadoAsalariadoOficina>(0,1);this.empleadosPorHoras = new Vector<EmpleadoPorHorasOficina>(0,1); this.empleadosComision = new Vector<EmpleadoComisionPorVentas>(0,1);}
	//public Oficina(int id, String nombre) {
	//	 this.id = id;this.nombre = nombre;this.direccion = "";this.codigoPostal = 28000;this.ciudad = "";	
	//this.empleadosAsalariados = new Vector<EmpleadoAsalariadoOficina>(0,1);
	//this.empleadosPorHoras = new Vector<EmpleadoPorHorasOficina>(0,1);
	//this.empleadosComision = new Vector<EmpleadoComisionPorVentas>(0,1);}
 public void setId( int id ) {  this.id = id;} 
     public int getId() {return this.id; } 
   public void setNombre( String nombre ) {  this.nombre = nombre;} 
   public String getNombre() {  return this.nombre;   } 
   public void setDireccion( String direccion ) { this.direccion = direccion; } 
   public String getDireccion()  {return this.direccion;  } 
   public void setCodigoPostal( int codigoPostal )  { this.codigoPostal = codigoPostal;   } 
   public int getCodigoPostal() {return this.codigoPostal;   } 
   public void setCiudad( String ciudad ) { this.ciudad = ciudad;   } 
   public String getCiudad() { return this.ciudad;  } 	
   public void altaEmpleadoAsalariado(EmpleadoAsalariadoOficina empleado){ this.empleadosAsalariados.add(empleado);}
   public void bajaEmpleadoAsalariado(EmpleadoAsalariadoOficina empleado){ this.empleadosAsalariados.removeElement(empleado);}
   public void altaEmpleadoPorHoras(EmpleadoPorHorasOficina empleado){ this.empleadosPorHoras.add(empleado);}
   public void bajaEmpleadoPorHoras(EmpleadoPorHorasOficina empleado){ this.empleadosPorHoras.removeElement(empleado);}
   public void altaEmpleadoComisionPorVentas(EmpleadoComisionPorVentas empleado){ this.empleadosComision.add(empleado);}
   public void bajaEmpleadoComisionPorVentas(EmpleadoComisionPorVentas empleado){ this.empleadosComision.removeElement(empleado); }
   public String getNominaOficina(){
   	   String nomina = new String("");
   	   for (int i=0; i<this.empleadosAsalariados.size(); i++)  nomina = nomina + this.empleadosAsalariados.elementAt(i).toString();
       for (int i=0; i<this.empleadosPorHoras.size(); i++) { nomina = nomina + this.empleadosPorHoras.elementAt(i).toString();}     
       for (int i=0; i<this.empleadosComision.size(); i++){  nomina = nomina + this.empleadosComision.elementAt(i).toString();} 
      return nomina;
       } 
} //fin de la clase
