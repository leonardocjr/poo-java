//Nome: Leonardo Canuto Junior -  RA: 2453533
package com.mycompany.lista5;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private static String placatxt = "";
    
    public static String getPlacaTxt(){
        return placatxt;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        sTitulo = new javax.swing.JSeparator();
        lbPlaca = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        mnBar = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnCad = new javax.swing.JMenu();
        mnCadPasseio = new javax.swing.JMenuItem();
        sMenu1 = new javax.swing.JPopupMenu.Separator();
        mnCadCarga = new javax.swing.JMenuItem();
        sMenu2 = new javax.swing.JPopupMenu.Separator();
        mnItRelatGeral = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Central de Veículos");
        lbTitulo.setMaximumSize(new java.awt.Dimension(112, 16));

        lbPlaca.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbPlaca.setText("Digite a placa:");

        cxPlaca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPlacaActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar placa");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar veículo");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir veículo");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        mnMenu.setText("Menu");

        mnCad.setText("Cadastrar novo véiculo");

        mnCadPasseio.setText("Novo veículo de passeio...");
        mnCadPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadPasseioActionPerformed(evt);
            }
        });
        mnCad.add(mnCadPasseio);
        mnCad.add(sMenu1);

        mnCadCarga.setText("Novo veículo de carga...");
        mnCadCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadCargaActionPerformed(evt);
            }
        });
        mnCad.add(mnCadCarga);

        mnMenu.add(mnCad);
        mnMenu.add(sMenu2);

        mnItRelatGeral.setText("Relatório geral...");
        mnItRelatGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItRelatGeralActionPerformed(evt);
            }
        });
        mnMenu.add(mnItRelatGeral);

        mnBar.add(mnMenu);

        jMenu1.setText("Sobre");

        jMenuItem1.setText("Documentação");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("GitHub");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mnBar.add(jMenu1);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbPlaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(sTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consulPlaca();
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        placatxt = cxPlaca.getText();
        editPlaca();
        limpar();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        remPlaca();
        limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try { 
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/leonardocjr"); 
        } 
        catch (IOException ex) 
        { System.out.println(ex.getMessage()); 
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnCadPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadPasseioActionPerformed
        CadPasseio.getCadPasseio().setVisible(true);
    }//GEN-LAST:event_mnCadPasseioActionPerformed

    private void mnCadCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadCargaActionPerformed
        CadCarga.getCadCarga().setVisible(true);
    }//GEN-LAST:event_mnCadCargaActionPerformed

    private void mnItRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItRelatGeralActionPerformed
        RelatGeral.getRelatGeral().setVisible(true);
    }//GEN-LAST:event_mnItRelatGeralActionPerformed

    private void cxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPlacaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void editPlaca(){
        Passeio p = new Passeio();
        p.setPlaca(cxPlaca.getText());
        p = BancoVeic.getBancoVeic().consPasseioPlaca(p);
        
        Carga c = new Carga();
        c.setPlaca(cxPlaca.getText());
        c = BancoVeic.getBancoVeic().consCargaPlaca(c);
        if(p!=null || c!=null){
            if(p!=null){
                EditPasseio.getEditPasseio().setVisible(true);
            }
            if(c!=null){
                EditCarga.getEditCarga().setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(
                null,
                "VEICULO NAO ENCONTRADO!",
                "Alteracao de Veiculos",
                1
            );
        }
    }
        public void remPlaca(){
        
        Passeio p = new Passeio();
        p.setPlaca(cxPlaca.getText());
        p = BancoVeic.getBancoVeic().consPasseioPlaca(p);
        
        Carga c = new Carga();
        c.setPlaca(cxPlaca.getText());
        c = BancoVeic.getBancoVeic().consCargaPlaca(c);
        if(p!=null || c!=null){
            if(p!=null){
                int resp = JOptionPane.showConfirmDialog(
                    null,
                    "VEICULO ENCONTRADO!\n\nCadastrado em "+p.getDataCadastro()+
                    "\nPlaca...........: "+p.getPlaca()+
                    "\nMarca..........: "+p.getMarca()+
                    "\nModelo.........: "+p.getModelo()+
                    "\nCor...............: "+p.getCor()+
                    "\nQtd. rodas..........: "+p.getQtdRodas()+
                    "\nQtd. pistoes........: "+p.getMotor().getQtdPistoes()+
                    "\nPotencia.............: "+p.getMotor().getPotencia()+" W"+
                    "\nVelocidade máx..: "+p.calcVel()+ " m/h"+
                    "\nQtd. passageiros: "+p.getQtdePassageiro()+
                    "\n\nTem certeza que deseja remover?",
                    "Remocao de veiculo",
                    JOptionPane.YES_NO_OPTION
                );
                if(resp == 0){
                    if(BancoVeic.getBancoVeic().delPasseio(p) == null){
                        JOptionPane.showMessageDialog(
                null,
                      "VEICULO REMOVIDO COM SUCESSO!",
                        "Remocao de veiculo",
                    1
                        );
                    }else{
                        JOptionPane.showMessageDialog(
                null,
                      "NAO FOI POSSIVEL REMOVER ESTE VEICULO!",
                        "Remocao de veiculo",
                    0
                        );
                    }
                }
            }
            if(c!=null){
                int resp = JOptionPane.showConfirmDialog(
                    null,
                    "VEICULO ENCONTRADO!\n\nCadastrado em "+c.getDataCadastro()+
                    "\nPlaca...........: "+c.getPlaca()+
                    "\nMarca..........: "+c.getMarca()+
                    "\nModelo.........: "+c.getModelo()+
                    "\nCor...............: "+c.getCor()+
                    "\nQtd. rodas..........: "+c.getQtdRodas()+
                    "\nQtd. pistoes........: "+c.getMotor().getQtdPistoes()+
                    "\nPotencia.............: "+c.getMotor().getPotencia()+" W"+
                    "\nVelocidade máx..: "+c.calcVel()+ " m/h"+
                    "\nTara..........: "+c.getTara()+" kg"+
                    "\nCarga max: "+c.getCargaMax()+" kg"+
                    "\n\nTem certeza que deseja remover?",
                    "Remocao de veiculo",
                    JOptionPane.YES_NO_OPTION
                );
                if(resp == 0){
                    if(BancoVeic.getBancoVeic().delCarga(c) == null){
                        JOptionPane.showMessageDialog(
                null,
                      "VEICULO REMOVIDO COM SUCESSO!",
                        "Remocao de veiculo",
                    1
                        );
                    }else{
                        JOptionPane.showMessageDialog(
                null,
                      "NAO FOI POSSIVEL REMOVER ESTE VEICULO!",
                        "Remocao de veiculo",
                    0
                        );
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(
                null,
                "VEICULO NAO ENCONTRADO!",
                "Remocao de veiculo",
                1
            );
        }
    }
    public void consulPlaca(){
        Passeio p = new Passeio();
        p.setPlaca(cxPlaca.getText());
        p = BancoVeic.getBancoVeic().consPasseioPlaca(p);
        
        Carga c = new Carga();
        c.setPlaca(cxPlaca.getText());
        c = BancoVeic.getBancoVeic().consCargaPlaca(c);
        if(p!=null || c!=null){
            if(p!=null){
                JOptionPane.showMessageDialog(
                    null,
                    "VEICULO ENCONTRADO!\n\nCadastrado em "+p.getDataCadastro()+
                    "\nPlaca...........: "+p.getPlaca()+
                    "\nMarca..........: "+p.getMarca()+
                    "\nModelo.........: "+p.getModelo()+
                    "\nCor...............: "+p.getCor()+
                    "\nQtd. rodas..........: "+p.getQtdRodas()+
                    "\nQtd. pistoes........: "+p.getMotor().getQtdPistoes()+
                    "\nPotencia.............: "+p.getMotor().getPotencia()+" W"+
                    "\nVelocidade máx..: "+p.calcVel()+ " m/h"+
                    "\nQtd. passageiros: "+p.getQtdePassageiro(),
                    "Consulta de Veiculos",
                    1
                );
            }
            if(c!=null){
                JOptionPane.showMessageDialog(
                    null,
                    "VEICULO ENCONTRADO!\n\nCadastrado em "+c.getDataCadastro()+
                    "\nPlaca...........: "+c.getPlaca()+
                    "\nMarca..........: "+c.getMarca()+
                    "\nModelo.........: "+c.getModelo()+
                    "\nCor...............: "+c.getCor()+
                    "\nQtd. rodas..........: "+c.getQtdRodas()+
                    "\nQtd. pistoes........: "+c.getMotor().getQtdPistoes()+
                    "\nPotencia.............: "+c.getMotor().getPotencia()+" W"+
                    "\nVelocidade máx..: "+c.calcVel()+ " m/h"+
                    "\nTara..........: "+c.getTara()+" kg"+
                    "\nCarga max: "+c.getCargaMax()+" kg",
                    "Consulta de Veiculos",
                    1
                );
            }
        }else{
            JOptionPane.showMessageDialog(
                null,
                "VEICULO NAO ENCONTRADO!",
                "Consulta de Veiculos",
                1
            );
        }
    }
    public void limpar(){
		cxPlaca.setText("");
		cxPlaca.requestFocus();
    }
    public void sair(){
	int resp = JOptionPane.showConfirmDialog(
		null,
		"Tem certeza que deseja sair?",
		"Confirmacao de saida",
		JOptionPane.YES_NO_OPTION
	);
	if(resp == 0){
		System.exit(0);	
            }
	}
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenuItem mnCadCarga;
    private javax.swing.JMenuItem mnCadPasseio;
    private javax.swing.JMenuItem mnItRelatGeral;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JPopupMenu.Separator sMenu1;
    private javax.swing.JPopupMenu.Separator sMenu2;
    private javax.swing.JSeparator sTitulo;
    // End of variables declaration//GEN-END:variables
}