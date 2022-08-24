/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class nodoCLiente {
    private datosCliente elemento;
    private nodoCLiente siguiente;
    private nodoCLiente anterior;
    
    public nodoCLiente(){
    siguiente=null;
    anterior=null;
    
    
    }
    public nodoCLiente getSiguiente(){
    return siguiente;
    
    } 
    public void setSiguiente(nodoCLiente siguiente){
    this.siguiente=siguiente;
    
    }
    
   public nodoCLiente getAnterior(){
   return anterior;
   }
  public void setAnterioro(nodoCLiente anterior){
  this.anterior=anterior;
  }  
  public datosCliente getElemento(){
  return elemento;
  }
  public void setElemento(datosCliente elemento){
  this.elemento=elemento;
  }
}
