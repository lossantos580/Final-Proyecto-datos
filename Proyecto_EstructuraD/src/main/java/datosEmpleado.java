/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class datosEmpleado {
     String nombre;
    String apellidos;
    int cedula;
    //una variable para referirnos al empleado 
   int nEmpleado;
   public datosEmpleado(){
   this.nombre="";
   this.apellidos="";
   this.cedula=0;
   this.nEmpleado=0;
   
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
public int getNempleado(){
return nEmpleado;
}
public void setNempleado(int nEmpleado){
this.nEmpleado=nEmpleado;
}
}
