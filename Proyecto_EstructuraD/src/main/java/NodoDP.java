/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class NodoDP {
    
    private DatosPersona elementoPer;
    private NodoDP siguientePer;
    private NodoDP anteriorPer;
    
   public NodoDP(){
       this.siguientePer = null;
        this.anteriorPer = null;
   }

    /**
     * @return the elementoPer
     */
    public DatosPersona getElementoPer() {
        return elementoPer;
    }

    /**
     * @param elementoPer the elementoPer to set
     */
    public void setElementoPer(DatosPersona elementoPer) {
        this.elementoPer = elementoPer;
    }

    /**
     * @return the siguientePer
     */
    public NodoDP getSiguientePer() {
        return siguientePer;
    }

    /**
     * @param siguientePer the siguientePer to set
     */
    public void setSiguientePer(NodoDP siguientePer) {
        this.siguientePer = siguientePer;
    }

    /**
     * @return the anteriorPer
     */
    public NodoDP getAnteriorPer() {
        return anteriorPer;
    }

    /**
     * @param anteriorPer the anteriorPer to set
     */
    public void setAnteriorPer(NodoDP anteriorPer) {
        this.anteriorPer = anteriorPer;
    }
}