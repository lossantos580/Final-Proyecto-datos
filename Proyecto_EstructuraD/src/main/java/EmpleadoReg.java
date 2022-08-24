
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class EmpleadoReg {   //Registro de empleado

    private NodoDP dato;
    
    private NodoDP inicio1;
    private NodoDP fin1;
    
public EmpleadoReg(){
this.inicio1=null;
    this.fin1=null;
    this.fin1=null;

}
 

  public boolean vaciaE() {
        if (inicio1 == null) {
            return true;
        } else {
            return false;
        }
    }
   
   public void agregarEmpleado(){
  DatosPersona dp = new DatosPersona();
        dp.setId(Integer.parseInt(
                JOptionPane.showInputDialog("ID Cliente")));
        dp.setNombre(JOptionPane.showInputDialog("Nombre: "));
        dp.setTelCel(Integer.parseInt(
                JOptionPane.showInputDialog("Teléfono: ")));
        dp.setCorreo(JOptionPane.showInputDialog("Correo: "));
        
        
   
        NodoDP nuevo = new NodoDP();
        nuevo.setElementoPer(dp);

        if (vaciaE()) {
            inicio1 = nuevo;
            fin1 = nuevo;
            fin1.setSiguientePer(inicio1);
            inicio1.setAnteriorPer(fin1);
        } else if (dp.getId()< inicio1.getElementoPer().getId()) {
            nuevo.setSiguientePer(inicio1);
            inicio1 = nuevo;
            fin1.setSiguientePer(inicio1);
            inicio1.setAnteriorPer(fin1);
        } else if (dp.getId()>= fin1.getElementoPer().getId()) {
            fin1.setSiguientePer(nuevo);
            fin1 = fin1.getSiguientePer(); //fin=nuevo
            fin1.setSiguientePer(inicio1);
            inicio1.setAnteriorPer(fin1);
        } else {
            NodoDP aux = inicio1;
            while (aux.getSiguientePer().getElementoPer().getId()< dp.getId()) {
                aux = aux.getSiguientePer();
            }
            nuevo.setSiguientePer(aux.getSiguientePer());
            nuevo.setAnteriorPer(aux);
            aux.setSiguientePer(nuevo);
            nuevo.getSiguientePer().setAnteriorPer(nuevo);
        }
    }

   public void extraer2ag() {
        if (!vaciaE()) {
            inicio1 = inicio1.getSiguientePer();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");
        }
    }
     public void mostrarEmpleados(){
     String b = "";
        NodoDP auxo = inicio1;
        b += "\nNombre Empleado: \n" +auxo.getElementoPer().getNombre() + "/"
               +"ID:\n" + auxo.getElementoPer().getId()+ "/"
               +"Teléfono\n" + auxo.getElementoPer().getTelCel()+ " /"
               +"Correo\n" + auxo.getElementoPer().getCorreo();
        auxo = auxo.getSiguientePer();
        
        
        while (auxo != inicio1 ) {
            b += "\nNombre Empleado: \n" +auxo.getElementoPer().getNombre() + "/"
               +"ID:\n" + auxo.getElementoPer().getId()+ "/"
               +"Teléfono\n" + auxo.getElementoPer().getTelCel()+ " /"
               +"Correo\n" + auxo.getElementoPer().getCorreo();
        auxo = auxo.getSiguientePer();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene\n" + b);
    }

}
