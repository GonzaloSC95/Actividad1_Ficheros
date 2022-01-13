package Test;

import BackEnd.AlmacenDeCoches;
import BackEnd.Coche;
import BackEnd.ManejadorDeFicheros;

public class Test {

    public static void main(String[] args) {
        //COCHES/////////////
        Coche c1 = new Coche(1, "MAD-5005", "Aston Martin", "X543", "Granate");
        Coche c2 = new Coche(2, "MAD-6554", "Audi", "F113", "Negro");
        Coche c3 = new Coche(3, "MAD-9911", "Bugatti", "R958", "Blanco");
        Coche c4 = new Coche(4, "MAD-2012", "BMW", "JL98", "Azul");
        Coche c5 = new Coche(5, "MAD-0154", "Alfa Romeo", "UHR9", "Rojo");
        ////ALMACEN DE COCHES
        AlmacenDeCoches almacen = new AlmacenDeCoches();
        almacen.add(c1);
        almacen.add(c2);
        almacen.add(c3);
        almacen.add(c4);
        almacen.add(c5);
        //MANEJADOR DE FICHEROS////////////////
        ManejadorDeFicheros mf = new ManejadorDeFicheros();
        mf.CreacionDeAlmacenAtravesDefichero(almacen);
        //mf.cargarCochesEn_fichero_dat(almacen);
        mf.exportacionDeCochesAlFichero_coches_txt(almacen);
        ///////BORRADO DE COCHES POR ID////////////////////////
        System.out.println("\nCoche borrado: "+almacen.borrarCochePorId(10));
        //////////CONSULTAR COCHE POR ID//////////////////////////////
        System.out.println("\nCoche consultado: "+almacen.buscarCochePorId(1)+"\n");
        //////////INSERTAR OTRO COCHE/////////////////
        almacen.insertarCocheSinDuplicar_MATRICULA_ni_ID(new Coche(1, "MAD-1111", "Alfa Romeo", "UHR9", "Rojo"));
        ////////LISTADO DE COCHES////////////////////////////////////
        for (Coche coche : almacen) {
            System.out.println(coche);
        }
        
        
        
    }

}
