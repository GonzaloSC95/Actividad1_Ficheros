package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class AlmacenDeCoches extends ArrayList<Coche> implements Serializable {

    //Constructor del Almacen de Coches
    /**
     *
     */
    public AlmacenDeCoches() {
    }

    //OPCION BUSCAR COCHE POR ID
    /**
     *
     * @param id
     * @return Coche
     */
    public Coche buscarCochePorId(int id) {

        for (Coche c : this) {

            if (c.getId() == id) {
                return c;
            }

        }
        return null;
    }

    //BORRAR COCHE POR ID
    /**
     *
     * @param id
     * @return boolean
     */
    public boolean borrarCochePorId(int id) {
        for (Coche c : this) {
            if (c.getId() == id) {
                return this.remove(c);
            }
        }
        return false;
    }

    //INSERTAR UN COCHE SIEMPRE Y CUANDO NO SE REPITAN
    //NI LA MATRICULA NI EL ID DE LOS QUE YA ESTAN EN LA LISTA
    /**
     *
     * @param coche
     * @return Coche
     */
    public Coche insertarCocheSinDuplicar_MATRICULA_ni_ID(Coche coche) {
        boolean insertarCoche = true;
        //RECORRER LISTA PARA CHEQUEAR
        for (Coche c : this) {
            if (coche.getId() == c.getId()
                    || coche.getMatricula().equalsIgnoreCase(c.getMatricula())) {
                insertarCoche = false;
            }
        }
        //FASE DE INSERCCION O DESECHO
        if (insertarCoche == true) {
            this.add(coche);
            return coche;
        } else {
            System.out.println("Ya existe un coche con el mismo id "
                    + "o matrícula en la bbdd, no se puede insertar");
            return null;
        }

    }

}
