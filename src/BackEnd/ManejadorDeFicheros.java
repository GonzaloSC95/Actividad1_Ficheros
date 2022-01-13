package BackEnd;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gonzalo
 */
public class ManejadorDeFicheros {

    //NOMBRES DE LOS FICHEROS A MANEJAR
    private final String fichero_dat = "coches.dat";
    private final String fichero_txt = "coches.txt";

    //VERIFICAMOS SI EXISTE O NO UN FICHERO DE COCHES
    //PARA CREAR UN AlmacenDeCoches A TRAVES DE DICHO FICHERO

    /**
     *
     * @param almacen
     */
    public void CreacionDeAlmacenAtravesDefichero(AlmacenDeCoches almacen) {
        File coches_dat = new File(fichero_dat);
        if (coches_dat.exists()) {
            try (FileInputStream file = new FileInputStream(coches_dat);
                    ObjectInputStream buffer = new ObjectInputStream(file);) {
                //END OF FILE
                boolean eof = false;
                Coche c;
                //MIENTRAS NO SE LLEGUE AL FINAL DEL FICHERO
                while (!eof) {
                    try {
                        c = (Coche) buffer.readObject();
                        almacen.add(c);
                    } catch (EOFException e1) {
                        eof = true;//FIN DEL FICHERO
                    } catch (IOException e2) {
                        System.out.println("Error al leer los coches del almacen");
                        System.out.println(e2.getMessage());
                    } catch (ClassNotFoundException e3) {
                        System.out.println("La clase Coche no está cargada en memoria");
                        System.out.println(e3.getMessage());
                    }
                }

            } catch (Exception e) {
            }
        } else {
            System.out.println("No existe aun ningún fichero que almacene coches");
            System.out.println("Creando fichero........");
            try {
                System.out.println("Fichero \"coches.dat\" creado satisfactoriamente");
                coches_dat.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    //CARGAMOS LOS COCHES ALMACENADOS EN EL AlmacenDeCoches 
    //AL FICHERO "coches.dat"

    /**
     *
     * @param almacen
     */
    public void cargarCochesEn_fichero_dat(AlmacenDeCoches almacen) {
        File coches_dat = new File(fichero_dat);
        try (FileOutputStream file = new FileOutputStream(coches_dat);
                ObjectOutputStream buffer = new ObjectOutputStream(file)) {
            for (Coche coche : almacen) {
                buffer.writeObject(coche);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nCoches cargados satisfactoriamente");
    }

    //EXPORTACION DE COCHES A UN FICHERO DE TEXTO

    /**
     *
     * @param almacen
     */
    public void exportacionDeCochesAlFichero_coches_txt(AlmacenDeCoches almacen) {
        File coches_txt = new File(fichero_txt);
        try (FileWriter file = new FileWriter(coches_txt);
                BufferedWriter buffer = new BufferedWriter(file);) {
            for (Coche coche : almacen) {
                buffer.write(coche.toString());
                buffer.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Coches exportados al fichero "
                + "\"coches.txt\" satisfactoriamente");
    }

}
