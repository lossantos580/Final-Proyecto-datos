/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class datosCliente {
    String nombre;
    String apellidos;
    int cedula;
    //mismo tipo de variable solo que para distinguirlo mejor de los demas y una manera mas corta que buscar por cedula
    int ncliente;
    public datosCliente(){
    this.nombre="";
    this.apellidos="";
    this.ncliente=0;
    this.cedula=0;
 
    }
  public String getNombre(){
  return nombre;
  }
        
    public void setNombre(String nombre){
    this.nombre=nombre;
    
    }    
    public String getApellidos(){
    
    return apellidos;

    }
public void setApellidos(String apellidos){
this.apellidos=apellidos;
}
public int getCedula(){
return cedula;
}
public void setCedula(int cedula){
this.cedula=cedula;
}
public int getNcliente(){
return ncliente;
}
public void setNcliente(int ncliente){
this.ncliente=ncliente;

}
}
