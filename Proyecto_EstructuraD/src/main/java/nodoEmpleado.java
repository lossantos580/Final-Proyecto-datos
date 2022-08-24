/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class nodoEmpleado {
    private datosEmpleado element;
   private nodoEmpleado siguiente1;
   private nodoEmpleado anterior1;
    public nodoEmpleado(){
   siguiente1=null;
   anterior1=null;
    }
    
    public nodoEmpleado getSiguiente1(){
    return siguiente1;
    }
    public void setSiguiente1(nodoEmpleado siguiente1){
    this.siguiente1=siguiente1;
  }
    public nodoEmpleado getAnterior1(){
    return anterior1;
    }
    public void setAnterior1(nodoEmpleado anterior1){
    this.anterior1=anterior1;
    }
   public datosEmpleado getElement(){
       return element;
    }
   public void setElement(datosEmpleado element){
   this.element=element;
   }
}
