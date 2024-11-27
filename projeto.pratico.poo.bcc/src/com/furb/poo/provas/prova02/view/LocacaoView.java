package com.furb.poo.provas.prova02.view;

import com.furb.poo.provas.prova02.model.Locacao;
import com.furb.poo.provas.prova02.model.LocacaoPessoaFisica;
import com.furb.poo.provas.prova02.model.LocacaoPessoaJuridica;
import com.furb.poo.provas.prova02.model.Pessoa;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LocacaoView extends javax.swing.JFrame {

    private Locacao locacao;
    
    /**
     * Creates new form Localcao
     */
    public LocacaoView() {
        initComponents();
    }

    private Locacao getLocacao() {
        // Se a locação ainda não existir vai criar e ler os dados informados na tela.
        if (locacao == null) {
            validaCampos();
            int quantidadeDiarias = Integer.parseInt(tfQtdDiarias.getText());
            String cpfCnpj = tfCpfCnpj.getText();
            String nome = tfNome.getText();
            String telefone = tfTelefone.getText();
            String email = tfEmail.getText();
            boolean fisica = rbTipoPesspaFisica.isSelected();
            
            Pessoa pessoa = new Pessoa();
            pessoa.setCpfCnpj(cpfCnpj);
            pessoa.setNome(nome);
            pessoa.setTelefone(telefone);
            pessoa.setEmail(email);
            pessoa.setFisica(fisica);
            
            if (fisica) {
                locacao = new LocacaoPessoaFisica();
            } else {
                locacao = new LocacaoPessoaJuridica();
            }
            
            locacao.setPessoa(pessoa);
            locacao.setQuantidadeDias(Integer.parseInt(tfQtdDiarias.getText()));
        } 
        return locacao;
    }
    
    private void validaCampos() {
        if (tfQtdDiarias.getText() == null) {
            geraErro("Quantidade de diárias");
        }
        
        if (tfCpfCnpj.getText() == null) {
            geraErro("CPF /CNPJ");
        }
        
        if (tfNome.getText() == null) {
            geraErro("Nome");
        }
        
        if (tfTelefone.getText() == null) {
            geraErro("Telefone");
        }
        
        if (tfTelefone.getText() == null) {
            geraErro("e-mail");
        }
        
        if (!rbTipoPesspaFisica.isSelected() && !rbTipoPesspaJuridica.isSelected()) {
            geraErro("Tipo");
        }
    }
    
    private void geraErro(String campo) {
        throw new IllegalArgumentException("Valor para o campo " + campo + " está incorreto");
    }
    
    private VeiculoView abreVeiculoView() {
        VeiculoView veiculoView = new VeiculoView(this, true);
        veiculoView.setVisible(true);
        return veiculoView;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPessoa = new javax.swing.ButtonGroup();
        jpLocacao = new javax.swing.JPanel();
        tfQtdDiarias = new javax.swing.JTextField();
        lbQtdDiarias = new javax.swing.JLabel();
        jpPessoa = new javax.swing.JPanel();
        lbCpfCnpj = new javax.swing.JLabel();
        tfCpfCnpj = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbTipoPessoa = new javax.swing.JLabel();
        rbTipoPesspaJuridica = new javax.swing.JRadioButton();
        rbTipoPesspaFisica = new javax.swing.JRadioButton();
        btIncluirVeiculo = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpLocacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        lbQtdDiarias.setText("Quantidade de diárias:");

        javax.swing.GroupLayout jpLocacaoLayout = new javax.swing.GroupLayout(jpLocacao);
        jpLocacao.setLayout(jpLocacaoLayout);
        jpLocacaoLayout.setHorizontalGroup(
            jpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbQtdDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQtdDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLocacaoLayout.setVerticalGroup(
            jpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLocacaoLayout.createSequentialGroup()
                .addGroup(jpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQtdDiarias)
                    .addComponent(tfQtdDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        lbCpfCnpj.setText("CPF / CNPJ:");

        lbNome.setText("Nome");

        lbTelefone.setText("Telefone:");

        lbEmail.setText("e-mail:");

        lbTipoPessoa.setText("Tipo:");

        bgTipoPessoa.add(rbTipoPesspaJuridica);
        rbTipoPesspaJuridica.setText("Jurídica");

        bgTipoPessoa.add(rbTipoPesspaFisica);
        rbTipoPesspaFisica.setText("Física");

        javax.swing.GroupLayout jpPessoaLayout = new javax.swing.GroupLayout(jpPessoa);
        jpPessoa.setLayout(jpPessoaLayout);
        jpPessoaLayout.setHorizontalGroup(
            jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPessoaLayout.createSequentialGroup()
                        .addComponent(lbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTipoPesspaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(rbTipoPesspaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpPessoaLayout.createSequentialGroup()
                            .addComponent(lbCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPessoaLayout.createSequentialGroup()
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPessoaLayout.createSequentialGroup()
                            .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPessoaLayout.createSequentialGroup()
                            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpPessoaLayout.setVerticalGroup(
            jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpfCnpj)
                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoPessoa)
                    .addComponent(rbTipoPesspaFisica)
                    .addComponent(rbTipoPesspaJuridica))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btIncluirVeiculo.setText("Incluir Veículo");
        btIncluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirVeiculoActionPerformed(evt);
            }
        });

        btRelatorio.setText("Gerar relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btIncluirVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirVeiculo)
                    .addComponent(btRelatorio))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirVeiculoActionPerformed
        if (getLocacao().getPessoa().isFisica()) {
            LocacaoPessoaFisica locacaoPF = ((LocacaoPessoaFisica) locacao);
            // Valida se já foi informado um veículo, se já tiver informado, lança exceção.
            if (locacaoPF.getVeiculo() != null) {
                throw new IllegalArgumentException("Veículo já informado");
            } else {
                VeiculoView view = abreVeiculoView();
                locacaoPF.setVeiculo(view.getVeiculo());
            }
        } else {
            VeiculoView view = abreVeiculoView();
            LocacaoPessoaJuridica locacaoPJ = ((LocacaoPessoaJuridica) locacao);
            locacaoPJ.incluirVeiculo(view.getVeiculo());
        }
    }//GEN-LAST:event_btIncluirVeiculoActionPerformed

    
    
    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        RelatorioView relatorioView = new RelatorioView(this, true);
        relatorioView.mostraRelatorio("Informações da Locação", getLocacao());
        relatorioView.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoPessoa;
    private javax.swing.JButton btIncluirVeiculo;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JPanel jpLocacao;
    private javax.swing.JPanel jpPessoa;
    private javax.swing.JLabel lbCpfCnpj;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQtdDiarias;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTipoPessoa;
    private javax.swing.JRadioButton rbTipoPesspaFisica;
    private javax.swing.JRadioButton rbTipoPesspaJuridica;
    private javax.swing.JTextField tfCpfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfQtdDiarias;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
