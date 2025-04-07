package org.trabajo3;


public class Empresa {

    int id;
    String nombre;
    String direccion;
    int codigoPostal;
    String ciudad;
    Oficina oficina;
    Fabrica fabrica;

    public Empresa(int id, String nombre, String direccion, int codigoPostal, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.oficina = null;
        this.fabrica = null;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Oficina getOficina() {
        return this.oficina;
    }

    public void eliminarOficina() {
        this.oficina = null;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public Fabrica getFabrica() {
        return this.fabrica;
    }

    public void eliminarFabrica() {
        this.fabrica = null;
    }

    public String getNomina() {
        String nomina = new String("");
        nomina = nomina + "------------------------------- \n";
        nomina = nomina + "NOMINA DEL PERSONAL DE FABRICA: \n";
        nomina = nomina + "------------------------------- \n";
        nomina = nomina + this.fabrica.getNominaFabrica();
        nomina = nomina + "\n";
        nomina = nomina + "------------------------------- \n";
        nomina = nomina + "NOMINA DEL PERSONAL DE OFICINA \n";
        nomina = nomina + "------------------------------- \n";
        nomina = nomina + this.oficina.getNominaOficina();
        return nomina;
    }


}
