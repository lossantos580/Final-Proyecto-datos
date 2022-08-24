/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class NodoCita {
private datosCita elemento;
private NodoCita siguiente;
public NodoCita(){
this.siguiente=null;
}
public datosCita getElemento(){
return elemento;
        
}
public void setElemento(datosCita elemento){
this.elemento=elemento;
}
public NodoCita getSiguiente(){
return siguiente;
}
public void setSiguiente(NodoCita siguiente){
this.siguiente=siguiente;
}


}
