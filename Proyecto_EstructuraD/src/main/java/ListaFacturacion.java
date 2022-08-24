
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class ListaFacturacion { //Colas
    private NodoFac inicio1;
    private NodoFac fin1;
    
    private NodoDA inicio2;
    private NodoDA fin2;
    
    private NodoDP inicio3;
    private NodoDP fin3;
    
    public ListaFacturacion(){
        this.inicio1 = null;
        this.fin1 = null;
        
        this.inicio2 = null;
        this.fin2 = null;
      
        this.inicio3 = null;
        this.fin3 = null;
        
    }
    //---------------------------------------------------------------------------------------------
    public boolean Vacia1(){ // Nodo Factura
        if (inicio1 == null){
            return true;
        }else{
            return false;
        }
    }
    //---------------------------------------------------------------------------------------------
    public boolean Vacia2(){ // Nodo Datos animal
        if (inicio2 == null){
            return true;
        }else{
            return false;
        }
    }
    //---------------------------------------------------------------------------------------------
    public boolean Vacia3(){ // Nodo Datos Persona
        if (inicio3 == null){
            return true;
        }else{
            return false;
        }
    }
    
        //-----------------------------------------------------------------------------------------
        public void encolarDA(){
         
            DatosAnimal da = new DatosAnimal();
        
         
            da.setDatosAnimal(JOptionPane.showInputDialog("Ingrese los datos del animal: "));
            da.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal(meses): ")));
            da.setVacunas(JOptionPane.showInputDialog("Tipo de vacunas que tiene: "));
            

            
             NodoDA nuevo = new NodoDA();
        nuevo.setElementoDA(da);
        if (Vacia2()) {
            inicio2 = nuevo;
            fin2 = nuevo;
        }else{
            fin2.setSiguienteDA(nuevo);
        }
        }
        //-----------------------------------------------------------------------------------------
        public void encolarDP(){
         
            DatosPersona dp = new DatosPersona();
        
           
            dp.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
            dp.setTelCel(Integer.parseInt(JOptionPane.showInputDialog("Telefono: ")));
            dp.setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico: "));
            
            NodoDP nuevo = new NodoDP();
            nuevo.setElementoPer(dp);
            if (Vacia3()){
                inicio3 = nuevo;
                fin3 = nuevo;
            }else{
                fin3.setSiguientePer(nuevo);
               
            }
        }
        //---------------------------------------------------------------------------------------------
        public void encolarFac(){
            DatosFactura df = new DatosFactura();
            
            df.setFechaC(Integer.parseInt(JOptionPane.showInputDialog("Fecha de la Cita")));
            df.setnFactura(Integer.parseInt(JOptionPane.showInputDialog("Número factura")));
            df.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Costo de Cita")));
            

            NodoFac nuevo = new NodoFac();
        nuevo.setElementoFac(df);
        if (Vacia1()) {
            inicio1 = nuevo;
            fin1 = nuevo;
        } else {
            fin1.setSiguienteFac(nuevo);
            fin1 = nuevo;
        }
    }
        //-----------------------------------------------------------------------------------------
        
        public void desencolarFac(){
            if(!Vacia1()){

               inicio1 = inicio1.getSiguienteFac();
               JOptionPane.showMessageDialog(null, "El elemento fue estraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extrear, cola vacía");
        }
    }
        //----------------------------------------------------------------------------------
    public void desencolarDA(){
            if(!Vacia2()){

               inicio2 = inicio2.getSiguienteDA();
               JOptionPane.showMessageDialog(null, "El elemento fue estraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extrear, cola vacía");
        }
    }
        //----------------------------------------------------------------------------------
    public void desencolarDP(){
            if(!Vacia3()){

               inicio3 = inicio3.getSiguientePer();
               JOptionPane.showMessageDialog(null, "El elemento fue estraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extrear, cola vacía");
        }
    }
        //----------------------------------------------------------------------------------
    
   
        public String toString1fac() {
        String s = "";
        if (!Vacia1()) {
            NodoFac aux = inicio1;

            
            while (aux != null) {
                s +=  "\nFactura Clinica Veterinaria ########"+
                        "\nFactura de Cita: " + aux.getElementoFac().getnFactura() 
                      +"\nFecha de Factura: "+ aux.getElementoFac().getFechaC()
                      +"\nCosto de Cita"+ aux.getElementoFac().getCosto();
   
                
                aux = aux.getSiguienteFac();
          
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar",
                    "Cola Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return s;
        
            }
        //------------------------------------------------------------------------------------------------------------------------
        public String toString2fac() {
        String s = "";
        if (!Vacia2()) {

            NodoDA aux2 = inicio2;
 
            
            while (aux2 != null) {
                s +=  "\nFactura Clinica Veterinaria ########"
                       
                    +"\nDatos del animal: "+ aux2.getElementoDA().getDatosAnimal()
                    +"\nEdad: "+ aux2.getElementoDA().getEdad()
                    +"\nVacunas: "+ aux2.getElementoDA().getVacunas();
                    
                 

                aux2= aux2.getSiguienteDA();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar",
                    "Cola Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return s;
        
            }
        //------------------------------------------------------------------------------------------
        public String toString3fac() {
        String s = "";
        if (!Vacia3()) {

            NodoDP aux3 = inicio3;
            
            while (aux3 != null) {
                s +=  "\nFactura Clinica Veterinaria ########"
                    

                    +"\nNombre Cliente"+ aux3.getElementoPer().getNombre()
                    +"\nTeléfono"+ aux3.getElementoPer().getTelCel()
                    +"\nCorreo"+ aux3.getElementoPer().getCorreo();

                aux3 = aux3.getSiguientePer();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar",
                    "Cola Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return s;
        
            }
}
        
        
    
    


    

