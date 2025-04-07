package org.trabajo3;

public class PruebaSistemaNomina  {	

   public PruebaSistemaNomina()  {
	   
	   
	   Empresa empresaPDD = new Empresa(1, "PDD_SL", "arboleda S/N", 28031, "Madrid"); 
	   Fabrica fabricaPDD = new Fabrica(2, "PDD_Manufactures_SL", "Albert Einstein S/N", 46500 ,"Sagunto");
	   Oficina oficinaPDD = new Oficina(3, "PDD_Office_SL", "Paseo de la castellana 259, Torre Espacio", 28046, "Madrid");
      
	   empresaPDD.setOficina(oficinaPDD);
	   empresaPDD.setFabrica(fabricaPDD);
	   
	   EmpleadoAsalariadoFabrica[] empleadosAsalariadosFabrica = new EmpleadoAsalariadoFabrica[8];
	   EmpleadoPorHorasFabrica[] empleadosPorHorasFabrica = new EmpleadoPorHorasFabrica[5];
	   
	   empleadosAsalariadosFabrica[0] = new EmpleadoAsalariadoFabrica("John", "Smith", "01-12345678-84", 800.00);
	   empleadosAsalariadosFabrica[1] = new EmpleadoAsalariadoFabrica("Karen", "Prince", "02-45678123-15", 700.00);
	   empleadosAsalariadosFabrica[2] = new EmpleadoAsalariadoFabrica("Peter", "Jackson", "34-12388888-86", 650.00);
	   empleadosAsalariadosFabrica[3] = new EmpleadoAsalariadoFabrica("Manuel", "Black", "14-65656565-48", 800.00);
	   empleadosAsalariadosFabrica[4] = new EmpleadoAsalariadoFabrica("Marina", "Garcia", "19-74684234-41", 300.00);
	   empleadosAsalariadosFabrica[5] = new EmpleadoAsalariadoFabrica("Janis", "South", "28-74836736-12", 900.00);
	   empleadosAsalariadosFabrica[6] = new EmpleadoAsalariadoFabrica("Igor", "Perez", "01-00000001-00", 860.00);
	   empleadosAsalariadosFabrica[7] = new EmpleadoAsalariadoFabrica("Borja", "Ruiz", "01-00000001-00", 400.00);
	   
	   empleadosPorHorasFabrica[0] = new EmpleadoPorHorasFabrica("Katy","Garcia","23-12987654-53", 60, 10);
	   empleadosPorHorasFabrica[1] = new EmpleadoPorHorasFabrica("Ana","Martinez","22-43458123-25", 55, 13);
	   empleadosPorHorasFabrica[2] = new EmpleadoPorHorasFabrica("Gema","Suarez","24-12387568-90", 33, 20);
	   empleadosPorHorasFabrica[3] = new EmpleadoPorHorasFabrica("Alicia","Llaves","01-00000001-00", 44, 8);
	   empleadosPorHorasFabrica[4] = new EmpleadoPorHorasFabrica("Angelica","Gracia","01-00000001-00", 70, 33);
	   
	   for (int i=0; i< empleadosAsalariadosFabrica.length; i++){
		   fabricaPDD.altaEmpleadoAsalariado(empleadosAsalariadosFabrica[i]);
	   }
	   for (int i=0; i< empleadosPorHorasFabrica.length; i++){
		   fabricaPDD.altaEmpleadoPorHoras(empleadosPorHorasFabrica[i]);
	   }	   
	   
	   
	   EmpleadoAsalariadoOficina[] empleadosAsalariadosOficina = new EmpleadoAsalariadoOficina[3];
	   EmpleadoPorHorasOficina[] empleadosPorHorasOficina = new EmpleadoPorHorasOficina[4];
	   EmpleadoComisionPorVentas[] empleadosComisionPorVentas = new EmpleadoComisionPorVentas[2];
	   
	   empleadosAsalariadosOficina[0] = new EmpleadoAsalariadoOficina("Michel", "Olwer", "25-56444444-35", 900.00, 1);
	   empleadosAsalariadosOficina[1] = new EmpleadoAsalariadoOficina("Anastasia", "Pearson", "25-66666666-09", 800.00, 0.5);
	   empleadosAsalariadosOficina[2] = new EmpleadoAsalariadoOficina("Javier", "Rodriguez", "25-90000007-00", 950.00, 0.125);
	   
	   empleadosPorHorasOficina[0] = new EmpleadoPorHorasOficina("Rosa","Smith","01-00000001-00", 33, 12);
	   empleadosPorHorasOficina[1] = new EmpleadoPorHorasOficina("Alvaro","Camas","01-00000001-00", 45, 20);
	   empleadosPorHorasOficina[2] = new EmpleadoPorHorasOficina("Daniel","Benaben","01-00000001-00", 40, 18);
	   empleadosPorHorasOficina[3] = new EmpleadoPorHorasOficina("Alex","Roseau","01-00000001-00", 70, 18);

	   empleadosComisionPorVentas[0] = new EmpleadoComisionPorVentas("Marta","Fernandez","15-90000027-83", 2000, 0.3);
	   empleadosComisionPorVentas[1] = new EmpleadoComisionPorVentas("David","Pit","15-90000037-93", 2500, 0.4);

	   for (int i=0; i< empleadosAsalariadosOficina.length; i++){
		   oficinaPDD.altaEmpleadoAsalariado(empleadosAsalariadosOficina[i]);
	   }
	   for (int i=0; i< empleadosPorHorasOficina.length; i++){
		   oficinaPDD.altaEmpleadoPorHoras(empleadosPorHorasOficina[i]);
	   }
	   for (int i=0; i< empleadosComisionPorVentas.length; i++){
		   oficinaPDD.altaEmpleadoComisionPorVentas(empleadosComisionPorVentas[i]);
	   }	   
	   
       String nomina = empresaPDD.getNomina();
       System.out.println(nomina);


   }
   
   public static void main( String args[] ) {
	 new PruebaSistemaNomina();
	  }
} 