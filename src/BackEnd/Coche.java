package BackEnd;

import java.io.Serializable;

/**
 *
 * @author Gonzalo
 */
public class Coche implements Serializable {

    //ATRIBUTOS
    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;

    //CONSTRUCTOR CON PARAMETROS
    /**
     *
     * @param id
     * @param matricula
     * @param marca
     * @param modelo
     * @param color
     */
    public Coche(int id, String matricula, String marca, String modelo, String color) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //CONSTRUCTOR SIN PARAMETROS
    /**
     *
     */
    public Coche() {
    }

    //GETTERS Y SETTERS
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }

}
