package com.furb.poo.exercicios.lista05.view;

import com.furb.poo.exercicios.lista05.model.Ponto;
import com.furb.poo.exercicios.lista05.model.Quadrante;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class AppUi extends javax.swing.JFrame {

    /**
     * Creates new form AppUi
     */
    public AppUi() {
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
        tfEixoX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEixoY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbEixoX = new javax.swing.JCheckBox();
        cbEixoY = new javax.swing.JCheckBox();
        cbPrimeiroQuadrante = new javax.swing.JCheckBox();
        cbSegundoQuadrante = new javax.swing.JCheckBox();
        cbTerceiroQuadrante = new javax.swing.JCheckBox();
        cbQuartoQuadrante = new javax.swing.JCheckBox();
        btAvaliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Eixo X:");

        jLabel2.setText("Eixo Y:");

        jLabel3.setText("Posição:");

        cbEixoX.setText("Incide sobre o Eixo X");
        cbEixoX.setEnabled(false);

        cbEixoY.setText("Incide sobre o Eixo Y");
        cbEixoY.setEnabled(false);
        cbEixoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEixoYActionPerformed(evt);
            }
        });

        cbPrimeiroQuadrante.setText("No 1º Quadrante");
        cbPrimeiroQuadrante.setEnabled(false);

        cbSegundoQuadrante.setText("No 2º Quadrante");
        cbSegundoQuadrante.setEnabled(false);

        cbTerceiroQuadrante.setText("No 3º Quadrante");
        cbTerceiroQuadrante.setEnabled(false);

        cbQuartoQuadrante.setText("No 4º Quadrante");
        cbQuartoQuadrante.setEnabled(false);

        btAvaliar.setText("Avaliar");
        btAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AoClicarNoBotaoAvaliar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(btAvaliar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPrimeiroQuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSegundoQuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTerceiroQuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbQuartoQuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btAvaliar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbEixoX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEixoY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPrimeiroQuadrante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSegundoQuadrante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTerceiroQuadrante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbQuartoQuadrante)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEixoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEixoYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEixoYActionPerformed

    private void AoClicarNoBotaoAvaliar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AoClicarNoBotaoAvaliar
        int x = Integer.parseInt(tfEixoX.getText());
        int y = Integer.parseInt(tfEixoY.getText());
        
        Ponto meuPonto = new Ponto(x, y);
        
        cbEixoX.setSelected(meuPonto.estaIncidindoSobreX());
        cbEixoY.setSelected(meuPonto.estaIncidindoSobreY());
        
        cbPrimeiroQuadrante.setSelected(meuPonto.identificarQuadrante() == Quadrante.PRIMEIRO);
        cbSegundoQuadrante.setSelected(meuPonto.identificarQuadrante() == Quadrante.SEGUNDO);
        cbTerceiroQuadrante.setSelected(meuPonto.identificarQuadrante() == Quadrante.TERCEIRO);
        cbQuartoQuadrante.setSelected(meuPonto.identificarQuadrante() == Quadrante.QUARTO);
    }//GEN-LAST:event_AoClicarNoBotaoAvaliar

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
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvaliar;
    private javax.swing.JCheckBox cbEixoX;
    private javax.swing.JCheckBox cbEixoY;
    private javax.swing.JCheckBox cbPrimeiroQuadrante;
    private javax.swing.JCheckBox cbQuartoQuadrante;
    private javax.swing.JCheckBox cbSegundoQuadrante;
    private javax.swing.JCheckBox cbTerceiroQuadrante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfEixoX;
    private javax.swing.JTextField tfEixoY;
    // End of variables declaration//GEN-END:variables
}
