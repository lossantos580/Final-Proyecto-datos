/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class NodoFac {
    private DatosFactura elementoFac;
    private NodoFac siguienteFac;

    
    public NodoFac(){

        this.siguienteFac = null;
        this.elementoFac = null;
     
    }

    /**
     * @return the elementoFac
     */
    public DatosFactura getElementoFac() {
        return elementoFac;
    }

    /**
     * @param elementoFac the elementoFac to set
     */
    public void setElementoFac(DatosFactura elementoFac) {
        this.elementoFac = elementoFac;
    }

    /**
     * @return the siguienteFac
     */
    public NodoFac getSiguienteFac() {
        return siguienteFac;
    }

    /**
     * @param siguienteFac the siguienteFac to set
     */
    public void setSiguienteFac(NodoFac siguienteFac) {
        this.siguienteFac = siguienteFac;
    }

}