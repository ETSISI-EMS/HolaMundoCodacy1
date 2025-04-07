package org.trabajo3;

public class EmpleadoComisionPorVentas {
	public double ventasBrutas; 
	public double tarifaComision; 
	public String nombre;
	public String apellido;
	public String nss;
	
	public EmpleadoComisionPorVentas( String nombre, String apellido, String nss, double ventas, double tarifa ){
		setNombre(nombre);setApellido(apellido);setNss(nss);setVentasBrutas( ventas );setTarifaComision( tarifa );
		} 
	
	public void setNombre( String nombre){ 
		this.nombre = nombre;
		} 
	public String getNombre(){return this.nombre;} 
	public void setApellido( String apellido ){this.apellido = apellido;}
	public String getApellido(){return this.apellido;}
	public void setNss( String nss ){this.nss = nss; } 
	public String getNss(){return this.nss;} 
	public void setTarifaComision( double tarifa ){tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;} 
	public double getTarifaComision(){return tarifaComision;}    
	
	private double getIngresos() {
		return getTarifaComision() * getVentasBrutas();
		}  
		
	public void setVentasBrutas( double ventas ){ 
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	} 
	public double getVentasBrutas(){
		return ventasBrutas;
		} 
	
	public double ingresos() {
	 	return getTarifaComision() * getVentasBrutas();
	 	}
	 	
	public String toString() {
		String salida = new String("Nombre: " + getNombre() + ' ' + getApellido() + '\n');
		salida = salida + "nss: " + getNss() + '\n';
		salida = salida + "regimen: comisionado \n";
		salida = salida + "ventas brutas: " + ventasBrutas + "; tarifa de comisión: " + tarifaComision + '\n';
		salida = salida + "ingresos: " + ingresos() + '\n';
		salida = salida + "------------------------" + '\n';
	return salida;
	}
} 

