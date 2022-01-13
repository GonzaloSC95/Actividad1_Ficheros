package FrontEnd;

import BackEnd.AlmacenDeCoches;
import BackEnd.Coche;
import BackEnd.ManejadorDeFicheros;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private AlmacenDeCoches almacen;
    private ManejadorDeFicheros manejador;

    public GUI() {
        almacen = new AlmacenDeCoches();
        manejador = new ManejadorDeFicheros();
        ///////////////VERIFICAMOS LA PERSISTENCIA DE EJECUCIONES ANTERIORES//////////////////////////
        manejador.CreacionDeAlmacenAtravesDefichero(almacen);
        //////////////////////////////////////////
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png")));
        //////////////////////////////////////////////
        id.requestFocus();
        //////////////////////////////////////////
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorDeficheros = new javax.swing.JFileChooser();
        panel = new javax.swing.JPanel();
        coche = new javax.swing.JLabel();
        addCar = new javax.swing.JButton();
        deleteCar = new javax.swing.JButton();
        findCar = new javax.swing.JButton();
        listarCoches = new javax.swing.JButton();
        exportarCoches = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        matricuLaLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        matricula = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaTexto_Mensaje = new javax.swing.JTextArea();

        selectorDeficheros.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        coche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coche.png"))); // NOI18N

        addCar.setBackground(new java.awt.Color(126, 125, 131));
        addCar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        addCar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        addCar.setText("Añadir coche");
        addCar.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        addCar.setBorderPainted(false);
        addCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCar.setFocusPainted(false);
        addCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarActionPerformed(evt);
            }
        });

        deleteCar.setBackground(new java.awt.Color(126, 125, 131));
        deleteCar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        deleteCar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        deleteCar.setText("Borrar coche ");
        deleteCar.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        deleteCar.setBorderPainted(false);
        deleteCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCar.setFocusPainted(false);
        deleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCarActionPerformed(evt);
            }
        });

        findCar.setBackground(new java.awt.Color(126, 125, 131));
        findCar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        findCar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        findCar.setText("Buscar coche");
        findCar.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        findCar.setBorderPainted(false);
        findCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findCar.setFocusPainted(false);
        findCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarActionPerformed(evt);
            }
        });

        listarCoches.setBackground(new java.awt.Color(126, 125, 131));
        listarCoches.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        listarCoches.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        listarCoches.setText("Listar coches");
        listarCoches.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        listarCoches.setBorderPainted(false);
        listarCoches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarCoches.setFocusPainted(false);
        listarCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCochesActionPerformed(evt);
            }
        });

        exportarCoches.setBackground(new java.awt.Color(126, 125, 131));
        exportarCoches.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        exportarCoches.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        exportarCoches.setText("Exportar coches");
        exportarCoches.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        exportarCoches.setBorderPainted(false);
        exportarCoches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportarCoches.setFocusPainted(false);
        exportarCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarCochesActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(126, 125, 131));
        exit.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        exit.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        exit.setText("Salir");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 3));
        exit.setBorderPainted(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        idLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("Id");

        matricuLaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        matricuLaLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        matricuLaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        matricuLaLabel.setText("Matrícula");

        marcaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        marcaLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        marcaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        marcaLabel.setText("Marca");

        modeloLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modeloLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        modeloLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modeloLabel.setText("Modelo");

        colorLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        colorLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        colorLabel.setText("Color");

        id.setBackground(panel.getBackground());
        id.setFont(marcaLabel.getFont());
        id.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(addCar.getBackground()));
        id.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        matricula.setBackground(panel.getBackground());
        matricula.setFont(marcaLabel.getFont());
        matricula.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        matricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        matricula.setBorder(javax.swing.BorderFactory.createLineBorder(addCar.getBackground()));
        matricula.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        marca.setBackground(panel.getBackground());
        marca.setFont(marcaLabel.getFont());
        marca.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        marca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        marca.setBorder(javax.swing.BorderFactory.createLineBorder(addCar.getBackground()));
        marca.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        modelo.setBackground(panel.getBackground());
        modelo.setFont(marcaLabel.getFont());
        modelo.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        modelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modelo.setBorder(javax.swing.BorderFactory.createLineBorder(addCar.getBackground()));
        modelo.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        color.setBackground(panel.getBackground());
        color.setFont(marcaLabel.getFont());
        color.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        color.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        color.setBorder(javax.swing.BorderFactory.createLineBorder(addCar.getBackground()));
        color.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        jScrollPane1.setBorder(null);

        cajaTexto_Mensaje.setEditable(false);
        cajaTexto_Mensaje.setBackground(new java.awt.Color(0, 0, 0));
        cajaTexto_Mensaje.setColumns(1);
        cajaTexto_Mensaje.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cajaTexto_Mensaje.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        cajaTexto_Mensaje.setLineWrap(true);
        cajaTexto_Mensaje.setRows(5);
        cajaTexto_Mensaje.setText("Welcome to CarLooker....");
        cajaTexto_Mensaje.setBorder(new javax.swing.border.LineBorder(deleteCar.getBackground(), 3, true));
        cajaTexto_Mensaje.setCaretColor(exit.getBackground());
        cajaTexto_Mensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(cajaTexto_Mensaje);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findCar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addGap(85, 85, 85)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(matricuLaLabel)
                                .addGap(37, 37, 37)
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(marcaLabel)
                                .addGap(58, 58, 58)
                                .addComponent(marca))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloLabel)
                                    .addComponent(colorLabel))
                                .addGap(51, 51, 51)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelo)
                                    .addComponent(color))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exportarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coche))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCar)
                    .addComponent(idLabel)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(coche, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matricuLaLabel)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcaLabel)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeloLabel)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorLabel)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(deleteCar)
                        .addGap(15, 15, 15)
                        .addComponent(findCar)
                        .addGap(15, 15, 15)
                        .addComponent(listarCoches)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportarCoches)
                        .addGap(20, 20, 20)
                        .addComponent(exit)
                        .addGap(61, 61, 61))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ////BOTON AÑADIR COCHE/////////////////////////
    private void addCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarActionPerformed
        try {
            int idCoche = Integer.parseInt(id.getText());
            String matriculaCoche = matricula.getText();
            String marcaCoche = marca.getText();
            String modeloCoche = modelo.getText();
            String colorCoche = color.getText();
            ///////////////////////////////////////////
            if (matriculaCoche.isEmpty() || marcaCoche.isEmpty()
                    || modeloCoche.isEmpty() || colorCoche.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "El id del coche debe ser un número entero\n"
                        + "y los demás campos no pueden estar vacios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            //////////////////////////////////////////
            Coche insertado = almacen.insertarCocheSinDuplicar_MATRICULA_ni_ID(new Coche(idCoche, matriculaCoche,
                    marcaCoche, modeloCoche, colorCoche));
            ///////////////////////////////////////////
            if (!insertado.equals(null)) {
                cajaTexto_Mensaje.setText("Coche insertado--> " + insertado.toString());
            }
            /////////////////////
            manejador.cargarCochesEn_fichero_dat(almacen);
            ////////////////////
            limpiezaDeCajas();
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null,
                    "El id del coche debe ser un número entero\n"
                    + "y los demás campos no pueden estar vacios",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.err.println(e1.getLocalizedMessage());
        } catch (NullPointerException e2) {
            System.err.println(e2.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,
                    "Ya existe un coche con el mismo id "
                    + "o matrícula en la bbdd, no se puede insertar",
                    "Alert",
                    JOptionPane.WARNING_MESSAGE);
            cajaTexto_Mensaje.setText("Ya existe un coche con el mismo id "
                    + "o matrícula en la bbdd, no se puede insertar.");
        }
    }//GEN-LAST:event_addCarActionPerformed
    ////BOTON SALIR/////////////////////////
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed
    //BOTON BORRAR COCHE/////////////////////////////////////////
    private void deleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCarActionPerformed
        try {
            int idCoche = Integer.parseInt(id.getText());
            ////////////////////////////////////////////////
            Coche aux = almacen.buscarCochePorId(idCoche);
            boolean borrado = almacen.borrarCochePorId(idCoche);
            ////////////////////////////////////////////////////
            if (borrado == true) {
                cajaTexto_Mensaje.setText("Coche borrado--> " + aux.toString());
            } else {
                cajaTexto_Mensaje.setText("El coche con id " + idCoche
                        + " ,no esta registrado en la bbdd.");
            }
            /////////////////////
            manejador.cargarCochesEn_fichero_dat(almacen);
            ////////////////////
            limpiezaDeCajas();
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null,
                    "El id del coche debe ser un número entero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.err.println(e1.getLocalizedMessage());
        }
    }//GEN-LAST:event_deleteCarActionPerformed
    //BUSCAR COCHE POR ID///////////////
    private void findCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCarActionPerformed
        try {
            int idCoche = Integer.parseInt(id.getText());
            ////////////////////////////////////////////////
            Coche aux = almacen.buscarCochePorId(idCoche);
            ////////////////////////////////////////////////////
            if (!aux.equals(null)) {
                cajaTexto_Mensaje.setText("Coche encontrado--> " + aux.toString());
            }
            ////////////////////
            limpiezaDeCajas();
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null,
                    "El id del coche debe ser un número entero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.err.println(e1.getLocalizedMessage());
        } catch (NullPointerException e2) {
            System.err.println(e2.getLocalizedMessage());
            cajaTexto_Mensaje.setText("El coche con id " + id.getText()
                    + " ,no esta registrado en la bbdd.");
            ////////////////////
            limpiezaDeCajas();
        }
    }//GEN-LAST:event_findCarActionPerformed
    //BOTON LISTAR COCHES//////////////////
    private void listarCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCochesActionPerformed
        limpiezaDeCajas();
        cajaTexto_Mensaje.setText("");
        /////////////////////////////////
        if (almacen.size() == 0) {
            cajaTexto_Mensaje.setText("No hay ningún coche almacenado en la bbdd.");
        } else {
            for (Coche coche : almacen) {
                cajaTexto_Mensaje.append(coche.toString() + "\n");
            }
        }
    }//GEN-LAST:event_listarCochesActionPerformed
    //EXPORTAR COCHES A "coches.txt"
    private void exportarCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarCochesActionPerformed
        manejador.exportacionDeCochesAlFichero_coches_txt(almacen);
        cajaTexto_Mensaje.setText("Coches exportados al fichero "
                + "\"coches.txt\" satisfactoriamente.");
    }//GEN-LAST:event_exportarCochesActionPerformed

    public static void main(String args[]) {
        new GUI();
    }

    ///LIMPIEZA DE CAJAS//////////////
    public void limpiezaDeCajas() {
        id.setText("");
        matricula.setText("");
        marca.setText("");
        modelo.setText("");
        color.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCar;
    private javax.swing.JTextArea cajaTexto_Mensaje;
    private javax.swing.JLabel coche;
    private javax.swing.JTextField color;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JButton deleteCar;
    private javax.swing.JButton exit;
    private javax.swing.JButton exportarCoches;
    private javax.swing.JButton findCar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarCoches;
    private javax.swing.JTextField marca;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JLabel matricuLaLabel;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JFileChooser selectorDeficheros;
    // End of variables declaration//GEN-END:variables
}
