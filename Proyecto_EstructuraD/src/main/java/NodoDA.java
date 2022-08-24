/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class NodoDA {
    private DatosAnimal elementoDA;
    private NodoDA siguienteDA;
    private NodoDA anteriorDA;
    
    public NodoDA(){
        this.siguienteDA = null;
        this.anteriorDA = null;
    }

    /**
     * @return the elementoDA
     */
    public DatosAnimal getElementoDA() {
        return elementoDA;
    }

    /**
     * @param elementoDA the elementoDA to set
     */
    public void setElementoDA(DatosAnimal elementoDA) {
        this.elementoDA = elementoDA;
    }

    /**
     * @return the siguienteDA
     */
    public NodoDA getSiguienteDA() {
        return siguienteDA;
    }

    /**
     * @param siguienteDA the siguienteDA to set
     */
    public void setSiguienteDA(NodoDA siguienteDA) {
        this.siguienteDA = siguienteDA;
    }

    /**
     * @return the anteriorDA
     */
    public NodoDA getAnteriorDA() {
        return anteriorDA;
    }

    /**
     * @param anteriorDA the anteriorDA to set
     */
    public void setAnteriorDA(NodoDA anteriorDA) {
        this.anteriorDA = anteriorDA;
    }

 
    
        
}
