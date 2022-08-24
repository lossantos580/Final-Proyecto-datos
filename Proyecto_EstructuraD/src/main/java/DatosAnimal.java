/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yostin Arias
 */
public class DatosAnimal {
    
    private String DatosAnimal; //datos del animal
    private int edad;
    private String Vacunas;
    private int idA;
    
    public DatosAnimal(){
        this.DatosAnimal = "";
        this.edad = 0;
        this.Vacunas = "";
        this.idA = 0;
    }

    /**
     * @return the DatosAnimal
     */
    public String getDatosAnimal() {
        return DatosAnimal;
    }

    /**
     * @param DatosAnimal the DatosAnimal to set
     */
    public void setDatosAnimal(String DatosAnimal) {
        this.DatosAnimal = DatosAnimal;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the Vacunas
     */
    public String getVacunas() {
        return Vacunas;
    }

    /**
     * @param Vacunas the Vacunas to set
     */
    public void setVacunas(String Vacunas) {
        this.Vacunas = Vacunas;
    }

    /**
     * @return the idA
     */
    public int getIdA() {
        return idA;
    }

    /**
     * @param idA the idA to set
     */
    public void setIdA(int idA) {
        this.idA = idA;
    }
}
