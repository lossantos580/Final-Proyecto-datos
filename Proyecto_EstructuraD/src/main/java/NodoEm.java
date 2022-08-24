/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class NodoEm {
    
    private DatosPersona elementoPer;
    private NodoEm siguientePer;
    private NodoEm anteriorPer;
    
   public NodoEm(){
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
    public NodoEm getSiguientePer() {
        return siguientePer;
    }

    /**
     * @param siguientePer the siguientePer to set
     */
    public void setSiguientePer(NodoEm siguientePer) {
        this.siguientePer = siguientePer;
    }

    /**
     * @return the anteriorPer
     */
    public NodoEm getAnteriorPer() {
        return anteriorPer;
    }

    /**
     * @param anteriorPer the anteriorPer to set
     */
    public void setAnteriorPer(NodoEm anteriorPer) {
        this.anteriorPer = anteriorPer;
    }
}