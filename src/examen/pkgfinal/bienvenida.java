/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form bienvenida
     */
    public bienvenida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Slir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuadrotexto = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cantidad1 = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("DISPENSADORA EL ROCK AND ROLL");

        jButton1.setText("Productos Coca~Cola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Productos Pepsi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Quitar Producto");

        Slir.setText("Salir");
        Slir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlirActionPerformed(evt);
            }
        });

        cuadrotexto.setColumns(20);
        cuadrotexto.setRows(5);
        jScrollPane1.setViewportView(cuadrotexto);

        jButton6.setText("Agregar Producto");

        jButton7.setText("Calcule su total a Pagar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Cantidad");

        jLabel3.setText("Ingrese Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton4)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(precio1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(Slir)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(Slir)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cocacola coca = new Cocacola();
        coca.tipoenvase ="En Coca~Cola Company disponemos de tres tipos de envase para la linea de Coca~Cola" + "\n"
                + "" + "\n"
                + "Embase de Vidrio" + "\n"
                + "Embase de plastico desechable" + "\n"
                + "Embase de plastico reutilizable" + "\n"
                + ""+ "\n"
                + "";
        coca.sabor ="Tenemos con azucar y sin azucar" + "\n"
                + "";
        coca.costo ="Los costos serian los siguientes:" + "\n"
                + "" + "\n"
                + "Embase de Vidrio Q3.00" + "\n"
                + "Embase de plastico desechable Q5.00" + "\n"
                + "Embase de plastico reutilizable Q4.00" + "\n"
                + ""+ "\n"
                + ""; 
        
        Fanta fanta =new Fanta();
        fanta.tipoenvase ="En Coca~Cola Company disponemos de dos tipos de envase para la linea de Fanta" + "\n"
                + "" + "\n"
                + "Embase de Vidrio" + "\n"
                + "Embase de plastico desechable" + "\n"
                + ""+ "\n"
                + "";
        fanta.sabor ="Tenemos con azucar y sin azucar" + "\n"
                + "";
        fanta.costo ="Los costos serian los siguientes:" + "\n"
                + "" + "\n"
                + "Embase de Vidrio Q5.00" + "\n"
                + "Embase de plastico desechable Q8.00" + "\n"
                + ""+ "\n"
                + ""; 
        Sprite sprite =new Sprite();
        sprite.tipoenvase ="En Coca~Cola Company disponemos de dos tipos de envase para la linea de Sprite" + "\n" 
                + "" + "\n"
                + "Embase de Vidrio" + "\n"
                + "Embase de Aluminio" + "\n"
                + "" + "\n"
                + "";
        sprite.sabor ="Tenemos con azucar y sin azucar" + "\n"
                + "";
        sprite.costo ="Los costos serian los siguientes:" + "\n"
                + "" + "\n"
                + "Embase de Vidrio Q4.00" + "\n"
                + "Embase de Aluminio Q3.50" + "\n"
                + ""+ "\n"
                + ""; 
        
        cuadrotexto.setText(coca.tipoenvase + coca.sabor +"\n"+ coca.costo + fanta.tipoenvase + fanta.sabor +"\n"+ fanta.costo + sprite.tipoenvase + sprite.sabor +"\n"+ sprite.costo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Producto mirin =new Producto();
        cuadrotexto.setText(mirin.mirinda()+"\n"+ mirin.seven() +"\n"+ mirin.lipton());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SlirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlirActionPerformed
        
    }//GEN-LAST:event_SlirActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         totalidad totalizador = new totalidad( Integer.parseInt(cantidad1.getText()), Float.parseFloat(precio1.getText()));
        cuadrotexto.setText("El total es de: Q." + totalizador.resultado);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new bienvenida().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Slir;
    private javax.swing.JTextField cantidad1;
    private javax.swing.JTextArea cuadrotexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio1;
    // End of variables declaration//GEN-END:variables
}
