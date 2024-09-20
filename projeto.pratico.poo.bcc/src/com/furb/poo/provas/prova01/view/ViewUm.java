package com.furb.poo.provas.prova01.view;

import com.furb.poo.provas.prova01.model.Estadia;
import com.furb.poo.provas.prova01.model.Periodo;
import java.text.DecimalFormat;

/**
 * Formulário para o cálculo de estadia.
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ViewUm extends javax.swing.JFrame {

    public ViewUm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDias = new javax.swing.JTextField();
        cbAlta = new javax.swing.JCheckBox();
        cbMedia = new javax.swing.JCheckBox();
        cbBaixa = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        cbCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quantidade dias:");

        jLabel2.setText("Período:");

        cbAlta.setText("Alta temporada");
        cbAlta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAltaItemStateChanged(evt);
            }
        });

        cbMedia.setText("Média temporada");
        cbMedia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMediaItemStateChanged(evt);
            }
        });

        cbBaixa.setText("Baixa temporada");
        cbBaixa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBaixaItemStateChanged(evt);
            }
        });

        jLabel3.setText("Valor total da hospedagem:");

        cbCalcular.setText("Calcular");
        cbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbBaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addComponent(cbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cbCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCalcularActionPerformed
       int quantidadeDias = Integer.parseInt(tfDias.getText());
        Periodo periodo = null;
        if (cbAlta.isSelected()) {
            periodo = Periodo.ALTA_TEMPORADA;
        } else if (cbMedia.isSelected()) {
            periodo = Periodo.MEDIA_TEMPORADA;
        } else if (cbBaixa.isSelected()) {
            periodo = Periodo.BAIXA_TEMPORADA;
        }
        
        Estadia estadia = new Estadia(periodo, quantidadeDias);
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        lbResultado.setText(df.format(estadia.precoPagar()));
    }//GEN-LAST:event_cbCalcularActionPerformed

    private void cbAltaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAltaItemStateChanged
        cbBaixa.setEnabled(!cbAlta.isSelected());
        cbMedia.setEnabled(!cbAlta.isSelected());
    }//GEN-LAST:event_cbAltaItemStateChanged

    private void cbMediaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMediaItemStateChanged
        cbBaixa.setEnabled(!cbMedia.isSelected());
        cbAlta.setEnabled(!cbMedia.isSelected());
    }//GEN-LAST:event_cbMediaItemStateChanged

    private void cbBaixaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBaixaItemStateChanged
        cbMedia.setEnabled(!cbBaixa.isSelected());
        cbAlta.setEnabled(!cbBaixa.isSelected());
    }//GEN-LAST:event_cbBaixaItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAlta;
    private javax.swing.JCheckBox cbBaixa;
    private javax.swing.JButton cbCalcular;
    private javax.swing.JCheckBox cbMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField tfDias;
    // End of variables declaration//GEN-END:variables
}
