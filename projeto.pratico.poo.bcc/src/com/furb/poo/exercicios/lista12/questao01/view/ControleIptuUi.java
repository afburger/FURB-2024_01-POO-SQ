package com.furb.poo.exercicios.lista12.questao01.view;

import com.furb.poo.exercicios.lista12.questao01.model.Bairro;
import com.furb.poo.exercicios.lista12.questao01.model.Finalidade;
import static com.furb.poo.exercicios.lista12.questao01.model.Finalidade.COMERCIAL;
import static com.furb.poo.exercicios.lista12.questao01.model.Finalidade.INDUSTRIAL;
import static com.furb.poo.exercicios.lista12.questao01.model.Finalidade.RESIDENCIAL;
import com.furb.poo.exercicios.lista12.questao01.model.Imovel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ControleIptuUi extends javax.swing.JFrame {

    /**
     * Creates new form ControleIptuUi
     */
    public ControleIptuUi() {
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

        bgFinalidade = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbResidencial = new javax.swing.JRadioButton();
        rbComercial = new javax.swing.JRadioButton();
        rbIndustrial = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNomeBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfCoeficiente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbValorIptu = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle IPTU");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imóvel"));

        jLabel1.setText("Endereço:");

        jLabel2.setText("Área:");

        jLabel3.setText("Finalidade:");

        bgFinalidade.add(rbResidencial);
        rbResidencial.setText("Residencial");

        bgFinalidade.add(rbComercial);
        rbComercial.setText("Comercial");

        bgFinalidade.add(rbIndustrial);
        rbIndustrial.setText("Industrial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbResidencial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbComercial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbIndustrial)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbResidencial)
                    .addComponent(rbComercial)
                    .addComponent(rbIndustrial))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        jLabel4.setText("Nome:");

        jLabel5.setText("Coeficiente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeBairro)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AoClicarNoBotaoCalcular(evt);
            }
        });

        jLabel6.setText("IPTU:");

        lbValorIptu.setText("lbValorIptu");

        jButton2.setText("Serializar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Desserializar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbValorIptu, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbValorIptu))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AoClicarNoBotaoCalcular(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AoClicarNoBotaoCalcular
        // TODO add your handling code here:       
        try {
            Bairro bairro = new Bairro();
            bairro.setNome(tfNomeBairro.getText());

            try {
                double coeficiente = Double.parseDouble(tfCoeficiente.getText());
                bairro.setCoeficienteIptu(coeficiente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Coeficiente IPTU inválido ou não informado!");
                return;
            }
            /*catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;
        }*/

            Imovel imovel = new Imovel();
            imovel.setEndereco(tfEndereco.getText());

            try {
                int area = Integer.parseInt(tfArea.getText());
                imovel.setArea(area);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Área do imóvel inválida ou não informada!");
                return;
            }
            //catch (IllegalArgumentException e){
            //    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            //     return;
            // }

            if (rbComercial.isSelected()) {
                imovel.setFinalidade(Finalidade.COMERCIAL);
            } else if (rbIndustrial.isSelected()) {
                imovel.setFinalidade(Finalidade.INDUSTRIAL);
            } else if (rbResidencial.isSelected()) {
                imovel.setFinalidade(Finalidade.RESIDENCIAL);
            }

            imovel.setBairro(bairro);
            DecimalFormat df = new DecimalFormat("R$ 0.00");

            //try{
            lbValorIptu.setText(df.format(imovel.calcularIptu()));
            //}
            // catch (IllegalArgumentException e){
            //     JOptionPane.showMessageDialog(rootPane, e.getMessage());
            //     return;
            // }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;
        }

    }//GEN-LAST:event_AoClicarNoBotaoCalcular

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        try {
            Bairro bairro = new Bairro();
            bairro.setNome(tfNomeBairro.getText());

            try {
                double coeficiente = Double.parseDouble(tfCoeficiente.getText());
                bairro.setCoeficienteIptu(coeficiente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Coeficiente IPTU inválido ou não informado!");
                return;
            }
            /*catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;
        }*/

            Imovel imovel = new Imovel();
            imovel.setEndereco(tfEndereco.getText());

            try {
                int area = Integer.parseInt(tfArea.getText());
                imovel.setArea(area);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Área do imóvel inválida ou não informada!");
                return;
            }
            //catch (IllegalArgumentException e){
            //    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            //     return;
            // }

            if (rbComercial.isSelected()) {
                imovel.setFinalidade(Finalidade.COMERCIAL);
            } else if (rbIndustrial.isSelected()) {
                imovel.setFinalidade(Finalidade.INDUSTRIAL);
            } else if (rbResidencial.isSelected()) {
                imovel.setFinalidade(Finalidade.RESIDENCIAL);
            }

            imovel.setBairro(bairro);
            DecimalFormat df = new DecimalFormat("R$ 0.00");

            //try{
            lbValorIptu.setText(df.format(imovel.calcularIptu()));
            
            
            File arquivo = new File("Imovel.ser");
            FileOutputStream fos;
            ObjectOutputStream obj;
            try {
                fos = new FileOutputStream(arquivo);
                obj = new ObjectOutputStream(fos);

                obj.writeObject(imovel);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
            
            
            //}
            // catch (IllegalArgumentException e){
            //     JOptionPane.showMessageDialog(rootPane, e.getMessage());
            //     return;
            // }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //desserializar
        Imovel meuImovelDesserializado = null;
        File arquivoD = new File("Imovel.ser");
        try{
          FileInputStream fis = new FileInputStream(arquivoD);
          ObjectInputStream objD = new ObjectInputStream(fis);
          meuImovelDesserializado = (Imovel)objD.readObject();
          
          
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
         tfEndereco.setText(meuImovelDesserializado.getEndereco());
         tfArea.setText(String.valueOf(meuImovelDesserializado.getArea()));
         tfCoeficiente.setText(String.valueOf(meuImovelDesserializado.getBairro().getCoeficienteIptu()));
         tfNomeBairro.setText(meuImovelDesserializado.getBairro().getNome());
         
         switch(meuImovelDesserializado.getFinalidade()){
             case COMERCIAL : rbComercial.setSelected(true);
             break;
             case RESIDENCIAL : rbResidencial.setSelected(true);
             break;
             case INDUSTRIAL  : rbIndustrial.setSelected(true);
             break;
         }
         
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControleIptuUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleIptuUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleIptuUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleIptuUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleIptuUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFinalidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbValorIptu;
    private javax.swing.JRadioButton rbComercial;
    private javax.swing.JRadioButton rbIndustrial;
    private javax.swing.JRadioButton rbResidencial;
    private javax.swing.JTextField tfArea;
    private javax.swing.JTextField tfCoeficiente;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNomeBairro;
    // End of variables declaration//GEN-END:variables
}
