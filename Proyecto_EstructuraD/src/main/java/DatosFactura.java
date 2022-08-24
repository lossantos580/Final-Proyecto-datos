/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class DatosFactura {
    private int nFactura;
    private int fechaC;
    private int costo;

    
    public DatosFactura(){
        this.nFactura=0;
        this.fechaC=0;
        this.costo=0;
    }

    /**
     * @return the nFactura
     */
    public int getnFactura() {
        return nFactura;
    }

    /**
     * @param nFactura the nFactura to set
     */
    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    /**
     * @return the fechaC
     */
    public int getFechaC() {
        return fechaC;
    }

    /**
     * @param fechaC the fechaC to set
     */
    public void setFechaC(int fechaC) {
        this.fechaC = fechaC;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
}