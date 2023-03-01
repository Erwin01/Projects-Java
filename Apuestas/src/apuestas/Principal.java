/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apuestas;

import java.awt.Color;

/**
 *
 * @Erwin Hernando Parales D.
 */
public class Principal extends javax.swing.JFrame {

    int Dinero = 0; //indica la cantidad de dinero que tenemos
    private boolean desBloquear;
    private boolean bDesbloquear;
    
    private void Refrescar(){
        
        jLabel1.setText("Dinero: " + Dinero ); //actualiza la informacion que tenemos de las variables de los textfields
    }
    
    private boolean Triple(String letra){//creo una funcion que nos diga si aparecen una letra de las 3 elementos
        
        if (!C1.getText().equals(letra)) return false;
        if (!C2.getText().equals(letra)) return false;
        if (!C3.getText().equals(letra)) return false;
        desBloquear();
        return true;
    
}
    
    private void IncrementarPremio(){//creo el metodo si son iguales las figuras
        
        if (Triple("J")){//aumenta el dinero en 30
            Dinero += 30;
        }
        if (Triple("Q")){//aumenta el dinero en 50
            Dinero += 50;
        }
        if (Triple("K")){//aumenta el dinero en 80
            Dinero += 80;
        }
        if (Triple("A")){//aumenta el dinero en 100
            Dinero += 100;
        }
        if (Triple("10")){//aumenta el dinero en 150
            Dinero += 150;
        }
        if (Triple("$")){//aumenta el dinero en 200
            Dinero += 200;
        }
    }
    
    //metodo que utilice si esta bloqueado o no con un Array
    boolean Bloqueo[]={false, false, false};
    
    //creo el metodo bloquear dobles
    private void BloquearDobles(){
        if (C1.getText().equals(C2.getText())){//si son iguales bloquea los elementos
            Bloqueo[0]= true;//Me muestra los bloqueados
            Bloqueo[1]= true;
        }
        if (C2.getText().equals(C3.getText())){//si son iguales bloquea los elementos
            Bloqueo[1]= true;//Me muestra los bloqueados
            Bloqueo[2]= true;
        }
        if (C1.getText().equals(C3.getText())){//si son iguales bloquea los elementos
            Bloqueo[0]= true;//Me muestra los bloqueados
            Bloqueo[2]= true;
        }
    }
    
    //creo el metodo desbloquear
    private void desBloquear(){
        
        Bloqueo[0] = false;
        Bloqueo[1] = false;
        Bloqueo[2] = false; 
    }
    
    //creo el metodo verbloqueos
    private void verBloqueos(){//creo el metodo verbloqueos
        
        b1.setVisible(Bloqueo[0]);//coloco los label, visualiza los textos Bloqueado
        b2.setVisible(Bloqueo[1]);//coloco los label, visualiza los textos Bloqueado
        b3.setVisible(Bloqueo[2]);//coloco los label, visualiza los textos Bloqueado
    }
    
    //creo metodo donde pone en el label una casilla al azar una letra
    private void setCasillasAlAzar(javax.swing.JLabel destino){
        
        //probabilidad de que unas aparezcan mas
        if (Math.random() < 0.30)
        {//valor aleatorio
        destino.setText("J");//letra usada la J(mas facil que aparezca)
        destino.setForeground(Color.green);//cambio el color de la letra
        return;
        }
        //probabilidad de que unas aparezcan mas
        if (Math.random() < 0.30)
        {//valor aleatorio
        destino.setText("Q");//letra usada la Q(mas facil que aparezca)
        destino.setForeground(Color.cyan);//cambio el color de la letra
        return;
        }
        //probabilidad de que unas aparezcan mas
        if (Math.random() < 0.30)
        {//valor aleatorio
        destino.setText("K");//letra usada la K(mas facil que aparezca)
        destino.setForeground(Color.magenta);//cambio el color de la letra
        return;
        }
        //probabilidad de que unas aparezcan mas
        if (Math.random() < 0.30)
        {//valor aleatorio
        destino.setText("A");//letra usada la Q(mas facil que aparezca)
        destino.setForeground(Color.pink);//cambio el color de la letra
        return;
        }
        //probabilidad de que  unas aparezcan mas
        if (Math.random() < 0.30){//valor aleatorio
        destino.setText("10");//letra usada la Q(mas facil que aparezca)
        destino.setForeground(Color.orange);//cambio el color de la letra
        
        }
        //probabilidad de que unas aparezcan mas
        if (Math.random() < 0.30){//valor aleatorio
        destino.setText("$");//letra usada la J(mas facil que aparezca)
        destino.setForeground(Color.white);//cambio el color de la letra
        
        }
    }
                
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);//INICIALIZA LA VENTANA EN EL CENTRO PANTALLA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JbInicarPartida = new javax.swing.JButton();
        JbApostar = new javax.swing.JButton();
        JbPasar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dinero: 0");

        JbInicarPartida.setBackground(new java.awt.Color(255, 0, 0));
        JbInicarPartida.setFont(new java.awt.Font("Curlz MT", 1, 14)); // NOI18N
        JbInicarPartida.setText("INICIAR PARTIDA");
        JbInicarPartida.setBorder(null);
        JbInicarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbInicarPartidaActionPerformed(evt);
            }
        });

        JbApostar.setBackground(new java.awt.Color(0, 0, 204));
        JbApostar.setFont(new java.awt.Font("Curlz MT", 1, 14)); // NOI18N
        JbApostar.setText("APOSTAR");
        JbApostar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JbApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbApostarActionPerformed(evt);
            }
        });

        JbPasar.setBackground(new java.awt.Color(255, 255, 0));
        JbPasar.setFont(new java.awt.Font("Curlz MT", 1, 14)); // NOI18N
        JbPasar.setText("PASAR");
        JbPasar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JbPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbPasarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbInicarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JbApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JbPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbInicarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        C1.setFont(new java.awt.Font("Curlz MT", 1, 60)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setText("A");
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C2.setFont(new java.awt.Font("Curlz MT", 1, 60)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setText("A");
        C2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C3.setFont(new java.awt.Font("Curlz MT", 1, 60)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setText("A");
        C3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 0, 0));
        b1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setText("Bloqueado");
        b1.setToolTipText("");

        b2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(204, 0, 0));
        b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setText("Bloqueado");

        b3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(204, 0, 0));
        b3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setText("Bloqueado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbInicarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbInicarPartidaActionPerformed
        // TODO add your handling code here:
        
        Dinero=1000;//pone el numero al pulsar el boton
        
        Refrescar();
    }//GEN-LAST:event_JbInicarPartidaActionPerformed

    @SuppressWarnings("SleepWhileInLoop")
    private void JbApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbApostarActionPerformed
        // TODO add your handling code here:
        
        //decrementa el dinero y refresca
        if (Dinero >= 10 ){//si tiene dinero pondra al azar 3 casillas
            
            for (int n=0; n<10; n++){//Se hace una pequenia animacion con un for
                
                //variable para que no se bloquen todos los elementos, solo durante un turno
                //sino consigues premios se desbloquean automaticamente
                boolean bdesbloquear = Bloqueo[0] || Bloqueo[1] || Bloqueo[2];
                
                if (!Bloqueo[0])setCasillasAlAzar(C1);//solamente en el caso que no esten bloqueadas
                if (!Bloqueo[1])setCasillasAlAzar(C2);
                if (!Bloqueo[2])setCasillasAlAzar(C3);
                this.paintComponents(this.getGraphics());//repinta todos los graficos
                try{//utilizo el metodo para evitar error 
                    Thread.sleep(60);//metodo hilos, mover en un tiempo determinado
                }catch(InterruptedException e){//sejecuta al capturar la excepcion
                    
                }
            }
            BloquearDobles();//si encuentra bloquea 2
            IncrementarPremio();//Si aparecen las 3 figuras incremente el dinero apostado
            boolean bdesBloquear = false;//sera true cuando uno de los elementos esten bloqueados
            if (bdesBloquear) desBloquear();//si esta bloqueado, llama a desbloquear
            verBloqueos();//se visualizan los label
            Dinero -= 10;//decrementa el dinero apostado
            Refrescar();//y refresca los datos
        }
    }//GEN-LAST:event_JbApostarActionPerformed

    private void JbPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbPasarActionPerformed
        // TODO add your handling code here:
        desBloquear();//pasar
        verBloqueos();// y visualizar el desbloqueo que hemos hecho
    }//GEN-LAST:event_JbPasarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JButton JbApostar;
    private javax.swing.JButton JbInicarPartida;
    private javax.swing.JButton JbPasar;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
