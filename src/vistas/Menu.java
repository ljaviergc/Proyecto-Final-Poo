
package vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Ayuda = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenuItem();
        AyudaMenu = new javax.swing.JMenuItem();
        SalirMenu = new javax.swing.JMenuItem();
        Busqueda = new javax.swing.JMenu();
        MenuBuscar = new javax.swing.JMenuItem();
        AgregarMascota = new javax.swing.JMenuItem();
        Adopciones = new javax.swing.JMenu();
        NuevaAdopcion = new javax.swing.JMenuItem();
        ListaAdopciones = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        Ayuda.setText("Menu");

        MenuCliente.setText("Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        Ayuda.add(MenuCliente);

        MenuUsuario.setText("Usuario");
        MenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarioActionPerformed(evt);
            }
        });
        Ayuda.add(MenuUsuario);

        AyudaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help-circle.png"))); // NOI18N
        AyudaMenu.setText("Ayuda");
        AyudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaMenuActionPerformed(evt);
            }
        });
        Ayuda.add(AyudaMenu);

        SalirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-run.png"))); // NOI18N
        SalirMenu.setText("Salir");
        SalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuActionPerformed(evt);
            }
        });
        Ayuda.add(SalirMenu);

        jMenuBar1.add(Ayuda);

        Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog.png"))); // NOI18N
        Busqueda.setText("Mascotas");

        MenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnify.png"))); // NOI18N
        MenuBuscar.setText("Buscar ");
        MenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarActionPerformed(evt);
            }
        });
        Busqueda.add(MenuBuscar);

        AgregarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus-circle.png"))); // NOI18N
        AgregarMascota.setText("Agregar");
        AgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMascotaActionPerformed(evt);
            }
        });
        Busqueda.add(AgregarMascota);

        jMenuBar1.add(Busqueda);

        Adopciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archive.png"))); // NOI18N
        Adopciones.setText("Adopcion");

        NuevaAdopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-document-edit.png"))); // NOI18N
        NuevaAdopcion.setText("Nueva Adopcion");
        NuevaAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaAdopcionActionPerformed(evt);
            }
        });
        Adopciones.add(NuevaAdopcion);

        ListaAdopciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/format-list-bulleted.png"))); // NOI18N
        ListaAdopciones.setText("Lista de Adopciones");
        Adopciones.add(ListaAdopciones);

        jMenuBar1.add(Adopciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirMenuActionPerformed

    private void NuevaAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaAdopcionActionPerformed
        AdopcionForm af = new AdopcionForm();
        CentrarVentana(af);
    }//GEN-LAST:event_NuevaAdopcionActionPerformed

    private void AyudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaMenuActionPerformed
        // TODO agregar codigo
    }//GEN-LAST:event_AyudaMenuActionPerformed

    private void MenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarActionPerformed
        Busqueda bf = new Busqueda();
        CentrarVentana(bf);
    }//GEN-LAST:event_MenuBuscarActionPerformed

    private void AgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMascotaActionPerformed
        AgregarMascotaForm amf = new AgregarMascotaForm();
        CentrarVentana(amf);
    }//GEN-LAST:event_AgregarMascotaActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        ClienteForm cf = new ClienteForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void MenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarioActionPerformed
        UsuarioForm uf = new UsuarioForm();
        CentrarVentana(uf);
    }//GEN-LAST:event_MenuUsuarioActionPerformed

    //TODO Agregar el InternalFrame de la mascota! 
    /*
    {
    MascotaForm mf = new MascotaForm();
    CentrarVentana(mf);
    }
    */
    
    
    void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation( (dimension.width - Dframe.height)/2 , (dimension.height - Dframe.width)/2);
        frame.show();
    }
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Adopciones;
    private javax.swing.JMenuItem AgregarMascota;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem AyudaMenu;
    private javax.swing.JMenu Busqueda;
    private javax.swing.JMenuItem ListaAdopciones;
    private javax.swing.JMenuItem MenuBuscar;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuUsuario;
    private javax.swing.JMenuItem NuevaAdopcion;
    private javax.swing.JMenuItem SalirMenu;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
