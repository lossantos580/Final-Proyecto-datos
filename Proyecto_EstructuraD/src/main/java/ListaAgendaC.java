
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class ListaAgendaC { //Lista doble circular
    
    
    private NodoDP inicio1;
    private NodoDP fin1;
    
    private NodoDA inicio2;
    private NodoDA fin2;

    public ListaAgendaC() {
        this.inicio1 = null;
        this.fin1 = null;
        this.inicio2 = null;
        this.fin2 = null;
    }
//----------------------------------------------------------------------------------------------------
    public boolean vacia1() {
        if (inicio1 == null) {
            return true;
        } else {
            return false;
        }
    }
//----------------------------------------------------------------------------------------------------
    public boolean vacia2() {
        if (inicio2 == null) {
            return true;
        } else {
            return false;
        }
    }
    //----------------------------------------------------------------------------------------------------
    public void insertar1() {
        DatosPersona dp = new DatosPersona();
        dp.setId(Integer.parseInt(
                JOptionPane.showInputDialog("")));
        dp.setNombre(JOptionPane.showInputDialog(""));
        dp.setTelCel(Integer.parseInt(
                JOptionPane.showInputDialog("")));
        dp.setCorreo(JOptionPane.showInputDialog(""));
        
        
   
        NodoDP nuevo = new NodoDP();
        nuevo.setElementoPer(dp);

        if (vacia1()) {
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
//------------------------------------------------------------------------------------------
    public void insertar2() {
        DatosAnimal dc = new DatosAnimal();
        
        dc.setDatosAnimal(JOptionPane.showInputDialog("Datos del animal:"));
        

        dc.setIdA(Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el ID-clinico animal")));
        
        NodoDA nuevo = new NodoDA();
        nuevo.setElementoDA(dc);

        if (vacia2()) {
            inicio2 = nuevo;
            fin2 = nuevo;
            fin2.setSiguienteDA(inicio2);
            inicio2.setAnteriorDA(fin2);
        } else if (dc.getIdA()< inicio2.getElementoDA().getIdA()) {
            nuevo.setSiguienteDA(inicio2);
            inicio2 = nuevo;
            fin2.setSiguienteDA(inicio2);
            inicio2.setAnteriorDA(fin2);
        } else if (dc.getIdA()>= fin2.getElementoDA().getIdA()) {
            fin2.setSiguienteDA(nuevo);
            fin2 = fin2.getSiguienteDA(); //fin=nuevo
            fin2.setSiguienteDA(inicio2);
            inicio2.setSiguienteDA(fin2);
        } else {
            NodoDA aux = inicio2;
            while (aux.getSiguienteDA().getElementoDA().getIdA()< dc.getIdA()) {
                aux = aux.getSiguienteDA();
            }
            nuevo.setSiguienteDA(aux.getSiguienteDA());
            nuevo.setAnteriorDA(aux);
            aux.setSiguienteDA(nuevo);
            nuevo.getSiguienteDA().setAnteriorDA(nuevo);
        }
    }
    //--------------------------------------------------------------------------------------------------
    public void extraer1() {
        if (!vacia1()) {
            inicio1 = inicio1.getSiguientePer();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");
        }
    }
//---------------------------------------------------------------------------------------------
    public void extraer2() {
        if (!vacia2()) {
            inicio2 = inicio2.getSiguienteDA();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");
        }
    }
//---------------------------------------------------------------------------------------------
 
   public void mostrarElementosInversa() {
        String s = "";
        NodoDA aux = fin2;
        s += aux.getElementoDA().getDatosAnimal()+ "/"
                + aux.getElementoDA().getIdA()+ "/";
        
        aux = aux.getAnteriorDA();
        while (aux != fin2) {
            s += " DAtos del animal: " +aux.getElementoDA().getDatosAnimal()+ 
               "ID-Clinico animal: " + aux.getElementoDA().getIdA();
            
            aux = aux.getAnteriorDA();
        }
        JOptionPane.showMessageDialog(null, "La lista a la inversa contiene\n" + s);
    }
   
   public void mostrarElementosInversa2() {
        String s = "";
        NodoDP aux = fin1;
            s +=  "Nombre del cliente"+aux.getElementoPer().getNombre()+ "/"
              + "ID del cliente" + aux.getElementoPer().getId()+ "/"
               + "Telefono del cliente"+ aux.getElementoPer().getTelCel()
                +"Correo Electrónico del cliente"+ aux.getElementoPer().getCorreo();
        
        aux = aux.getAnteriorPer();
        while (aux != fin1) {
            s +=  "Nombre del cliente"+aux.getElementoPer().getNombre()+ "/"
              + "ID del cliente" + aux.getElementoPer().getId()+ "/"
               + "Telefono del cliente"+ aux.getElementoPer().getTelCel()
                +"Correo Electrónico del cliente"+ aux.getElementoPer().getCorreo();
            
            aux = aux.getAnteriorPer();
        }
        JOptionPane.showMessageDialog(null, "La lista a la inversa contiene\n" + s);
    }
   
}


    
    
