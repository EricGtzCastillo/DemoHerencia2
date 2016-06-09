/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Eric Gtz Castillo
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    public Cliente (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
       
        
    }
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
       return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public String getOcupacion(){
        return this.ocupacion;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String telefono(){
        return this.telefono;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}

  