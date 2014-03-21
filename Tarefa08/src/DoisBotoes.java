public class DoisBotoes{
JFrame quadro;
JLabel rotulo;
public static void main(String[] args){
DoisBotoes gui = new DoisBotoes();
gui.vai();
}
public void vai(){
quadro = new JFrame();
quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton btnRotulo = new JButton("Altera Rotulo");
btnRotulo.addActionListener(new RotuloListener());
JButton btnMensagem = new JButton("Exibe Mensagem");
btnMensagem.addActionListener(new MensagemListener());
rotulo = new JLabel("Eu sou um rótulo!");
quadro.getContentPane().add(BorderLayout.SOUTH, btnMensagem);
quadro.getContentPane().add(BorderLayout.NORTH, btnRotulo);
quadro.getContentPane().add(BorderLayout.WEST,rotulo);
quadro.setSize(300,300);
quadro.setVisible(true);
}
class RotuloListener implements ActionListener{
public void actionPerformed(ActionEvent event){
rotulo.setText("Mudando...");
}
}
class MensagemListener implements ActionListener{
public void actionPerformed(ActionEvent event){
JOptionPane.showMessageDialog(null, "Parabens, tudo funcionando bem!");
}
}
}
    /*@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     
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
            java.util.logging.Logger.getLogger(BorderLayoutTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorderLayoutTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorderLayoutTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorderLayoutTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorderLayoutTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}*/
