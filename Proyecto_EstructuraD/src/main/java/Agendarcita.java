
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class Agendarcita {
    private NodoCita pie;
    public Agendarcita(){
    this.pie=null;
    }
public boolean Vacia() {
        if (pie == null) {
            return true;
        } else {
            return false;
        }
    }
public void apilarCita(){
datosCita o=new datosCita();

  o.setDiacita(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el dia de la cita: ")));
   o.setHora(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la hora de la cita: ")));
   o.setTipocita(JOptionPane.showInputDialog(null,"ingrese la razon de la cita: "));
   o.setNombrecita(JOptionPane.showInputDialog(null,"ingrese el nombre del solicitante de la cita: "));
   NodoCita nuevo=new NodoCita();
   nuevo.setElemento(o);
   if(!Vacia()){
   
   pie=nuevo;
   }else{
           nuevo.setSiguiente(pie);
           pie=nuevo;
           }
   
   }
   public void Eliminarcita() {
        if (!Vacia()) {
            pie= pie.getSiguiente();
            JOptionPane.showMessageDialog(null, "se eleminino la cita ","se elimino la cita", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "no hay citas ",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
String z="";
NodoCita auxiliar=pie;
if(!Vacia()){
while(auxiliar!=null){
z+="la persona "+auxiliar.getElemento().getNOmbrecita()+"\n"+
        "agendo la cita"+auxiliar.getElemento().getTipocita()+"\n"+
        "para el dia "+auxiliar.getElemento().getDiacita()+"\n"+
        "a la hora "+auxiliar.getElemento().getHora();
auxiliar=auxiliar.getSiguiente();
       

}
JOptionPane.showMessageDialog(null, "La pila de citas es: \n" + z,"citas", JOptionPane.INFORMATION_MESSAGE);
}else{
JOptionPane.showMessageDialog(null, "no se han agendado citas","Pila vacía", JOptionPane.INFORMATION_MESSAGE);
}

return z;
}


}


