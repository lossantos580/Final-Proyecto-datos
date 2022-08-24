/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrebalmer
 */
public class NodoEM {
    
    private nombre dato;
    private NodoEM siguiente;

    public NodoEM() {
        this.siguiente = null;
    }

    /**
     * @return the dato
     */
    public nombre getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(nombre dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoEM getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoEM siguiente) {
        this.siguiente = siguiente;
    }

    void setDato(Empleados a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class nombre {

        public nombre() {
        }

        String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
