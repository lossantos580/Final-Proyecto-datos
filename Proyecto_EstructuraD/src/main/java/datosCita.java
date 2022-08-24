/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class datosCita {
    private String nombreCita;
    private int diaCita;
    private int hora;
    private String tipoCita;
    public datosCita(){
    this.nombreCita=" ";
    
    this.diaCita=00;
    this.tipoCita="";
    
    this.hora=00;
    
    
    }
public String getNOmbrecita(){

return nombreCita;
}
public void setNombrecita(String nombreCita){
this.nombreCita=nombreCita;


}
public String getTipocita(){
return tipoCita;

}
public void setTipocita(String tipoCita){
this.tipoCita=tipoCita;

}
 public int getDiacita(){
 return diaCita;
 }     
public void setDiacita(int diaCita){
this.diaCita=diaCita;

}
public int getHora(){
return hora;
}
public void setHora(int hora){
this.hora=hora;

}

}
