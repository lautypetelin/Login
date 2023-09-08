package gui;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    //Constructor
    public Ventana() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonIniciarSesion = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        etiquetaContrasenia = new javax.swing.JLabel();
        cajaContrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIniciarSesion.setBackground(new java.awt.Color(0, 0, 255));
        botonIniciarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        panel.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, 30));

        botonSalir.setBackground(new java.awt.Color(0, 0, 255));
        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, 30));

        etiquetaUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("Usuario:");
        panel.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 100, -1));

        cajaUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        panel.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 210, 30));

        etiquetaContrasenia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContrasenia.setText("Contraseña:");
        panel.add(etiquetaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

        cajaContrasenia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 256, 256));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        panel.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuarioActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        
        String usuarioCorrecto = "alumno@ulp.edu.ar";
        String contraseniaCorrecta = "12345678";
        
        if(usuarioCorrecto.equals(cajaUsuario.getText())){
            
            String contrasenia = "";
            
            for (char c : cajaContrasenia.getPassword()) {
                contrasenia += c;
            }
            
            if(contraseniaCorrecta.equals(contrasenia)){
                JOptionPane.showMessageDialog(this, "Ingresaste al sistema."); 
            }else{
                JOptionPane.showMessageDialog(this, "Error, contraseña desconocida."); 
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Error, usuario desconocido.");
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField cajaContrasenia;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel etiquetaContrasenia;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}