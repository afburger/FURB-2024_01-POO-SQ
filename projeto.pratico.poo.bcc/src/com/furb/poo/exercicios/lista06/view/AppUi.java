package com.furb.poo.exercicios.lista06.view;

import com.furb.poo.exercicios.lista06.model.FaixaIrpf;
import static com.furb.poo.exercicios.lista06.model.FaixaIrpf.PRIMEIRA;
import static com.furb.poo.exercicios.lista06.model.FaixaIrpf.QUARTA;
import static com.furb.poo.exercicios.lista06.model.FaixaIrpf.QUINTA;
import static com.furb.poo.exercicios.lista06.model.FaixaIrpf.SEGUNDA;
import static com.furb.poo.exercicios.lista06.model.FaixaIrpf.TERCEIRA;
import com.furb.poo.exercicios.lista06.model.Funcionario;
import java.text.DecimalFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br).
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
        tfSalario = new javax.swing.JTextField();
        btAvaliar = new javax.swing.JButton();
        lbMensagemFaixa = new javax.swing.JLabel();
        lbMensagemImposto = new javax.swing.JLabel();
        cbFaixa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo IRPF");

        jLabel1.setText("Salário:");

        btAvaliar.setText("Avaliar");
        btAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AoClicarNoBotaoAvaliar(evt);
            }
        });

        lbMensagemFaixa.setText("jLabel2");

        lbMensagemImposto.setText("jLabel2");

        cbFaixa.setModel(new DefaultComboBoxModel<FaixaIrpf>(FaixaIrpf.values())
        );
        cbFaixa.setSelectedItem(null);
        cbFaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btAvaliar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMensagemFaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(lbMensagemImposto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btAvaliar)
                .addGap(28, 28, 28)
                .addComponent(lbMensagemFaixa)
                .addGap(12, 12, 12)
                .addComponent(cbFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMensagemImposto)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Teste 
     * @param evt 
     */
    private void AoClicarNoBotaoAvaliar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AoClicarNoBotaoAvaliar
        double salario = Double.parseDouble(tfSalario.getText());
        Funcionario func1 = new Funcionario("André", salario);
        
        String msgFaixa = "O salário está na ";
        FaixaIrpf identificarFaixaIrpf = func1.identificarFaixaIrpf();
        
        switch(identificarFaixaIrpf){
            case PRIMEIRA :
                msgFaixa += "1ª Faixa";
                break;
            case SEGUNDA :
                msgFaixa += "2ª Faixa";
                break;
            case TERCEIRA :
                msgFaixa += "3ª Faixa";
                break;
            case QUARTA :
                msgFaixa += "4ª Faixa";
                break;
            case QUINTA :
                msgFaixa += "5ª Faixa";
                break;
        }
        
        lbMensagemFaixa.setText(msgFaixa);
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        lbMensagemImposto.setText("O imposto a pagar é de "+
                                   df.format(func1.calcularIrpf()));
        
        cbFaixa.setSelectedItem(identificarFaixaIrpf);
    }//GEN-LAST:event_AoClicarNoBotaoAvaliar

    private void cbFaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFaixaActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvaliar;
    private javax.swing.JComboBox<FaixaIrpf> cbFaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMensagemFaixa;
    private javax.swing.JLabel lbMensagemImposto;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
