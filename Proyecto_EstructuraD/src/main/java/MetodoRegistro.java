
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class MetodoRegistro {
      private nodoCLiente inicio;
    private nodoCLiente fin;
    private nodoCLiente dato;
    private nodoEmpleado datoEmpleado;
    
private nodoEmpleado entrada;
private nodoEmpleado salida;
public MetodoRegistro(){
this.inicio=null;
    this.fin=null;
    this.salida=null;
    this.entrada=null;
}
  public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }  

  public boolean vaciaE() {
        if (entrada == null) {
            return true;
        } else {
            return false;
        }
    }
   public void agregarcliente(){
   datosCliente c=new datosCliente();
   c.setNombre(JOptionPane.showInputDialog(null,"ingrese el nombre del cliente"));
   c.setApellidos(JOptionPane.showInputDialog(null,"ingrese los apellidos del cliente"));
   c.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cedula del cliente")));
   c.setNcliente(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero del cliente")));
   
   
     nodoCLiente nuevo = new nodoCLiente();
     nuevo.setElemento(c);
       if (vacia()) {
            inicio = nuevo;
           fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterioro(fin);
        } else if (c.getNcliente() < inicio.getElemento().getNcliente()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
           fin.setSiguiente(inicio);
            inicio.setAnterioro(fin);
        } else if (c.ncliente>= fin.getElemento().getNcliente()) {
            fin.setSiguiente(inicio);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterioro(fin);
        } else {
            nodoCLiente aux = inicio;
            while (aux.getSiguiente().getElemento().getNcliente()< c.getNcliente()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterioro(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterioro(nuevo);
        }
    }
   
   public void agregarEmpleado(){
     
    datosEmpleado e=new datosEmpleado();
    e.setNombre(JOptionPane.showInputDialog(null,"ingrese el nombre del empleado"));
    e.setApellidos(JOptionPane.showInputDialog(null,"ingrese los apellidos"));
    e.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cedula   del empleado")));
    e.setNempleado(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero del empleado")));
   
    nodoEmpleado nuevo1 = new nodoEmpleado();
   nuevo1.setElement(e);
       if (vaciaE()) {
            entrada = nuevo1;
            salida = nuevo1;
            salida.setSiguiente1(entrada);
            entrada.setAnterior1(salida);
        } else if (e.getNempleado() < entrada.getElement().getNempleado()){
            nuevo1.setSiguiente1(entrada);
            entrada = nuevo1;
           salida.setSiguiente1(entrada);
            entrada.setAnterior1(salida);
        } else if (e.nEmpleado>= salida.getElement().getNempleado()) {
            salida.setSiguiente1(entrada);
            salida = salida.getSiguiente1();
            salida.setSiguiente1(entrada);
            entrada.setAnterior1(salida);
        } else {
            nodoEmpleado auxi = entrada;
            while (auxi.getSiguiente1().getElement().getNempleado()< e.getNempleado()) {
                auxi = auxi.getSiguiente1();
            }
            nuevo1.setSiguiente1(auxi.getSiguiente1());
            nuevo1.setAnterior1(auxi);
            auxi.setSiguiente1(nuevo1);
            nuevo1.getSiguiente1().setAnterior1(nuevo1);
        }
    }
   public void mostrarcliente(){
     String s = "";
        nodoCLiente auxe = inicio;
        s += auxe.getElemento().getNombre() + "/"
                + auxe.getElemento().getApellidos() + "/"
                + auxe.getElemento().getCedula() + " /"+ auxe.getElemento().getNcliente();
        auxe = auxe.getSiguiente();
        while (auxe != inicio) {
            s += auxe.getElemento().getNombre() + "/"
                    + auxe.getElemento().getApellidos() + "/"
                    + auxe.getElemento().getCedula() + "/"+ auxe.getElemento().getNcliente();
            auxe = auxe.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene\n" + s);
    }
     public void mostrarEmpleados(){
     String b = "";
        nodoEmpleado auxo = entrada;
        b += auxo.getElement().getNombre() + "/"
                + auxo.getElement().getApellidos() + "/"
                + auxo.getElement().getCedula() + " /"+ auxo.getElement().getNempleado();
        auxo = auxo.getSiguiente1();
        while (auxo != entrada ) {
            b += auxo.getElement().getNombre() + "/"
                    + auxo.getElement().getApellidos() + "/"
                    + auxo.getElement().getCedula() + "/"+ auxo.getElement().getNempleado();
            auxo = auxo.getSiguiente1();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene\n" + b);
    }

}
