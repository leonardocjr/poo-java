// Versao NetBeans: Apache NetBeans IDE 17
// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Apartamento a = new Apartamento();
    private Casa c = new Casa();
    private Kitnet k = new Kitnet();
    private Pousada p = new Pousada();
    private String entrada;
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cxEntrada.setText("Digite o conteudo aqui...");
        entrada = "";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        cxEntrada = new javax.swing.JTextField();
        cbOpcao = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        PainelAviso = new javax.swing.JScrollPane();
        cxAviso = new javax.swing.JTextArea();
        bmPrincipal = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        mCad = new javax.swing.JMenu();
        mItCadAp = new javax.swing.JMenuItem();
        mtItCadCs = new javax.swing.JMenuItem();
        mnItCadKn = new javax.swing.JMenuItem();
        mnItCadPs = new javax.swing.JMenuItem();
        sArquivo = new javax.swing.JPopupMenu.Separator();
        mItSair = new javax.swing.JMenuItem();
        mVer = new javax.swing.JMenu();
        mItBancoImv = new javax.swing.JMenuItem();
        mItListaCorretores = new javax.swing.JMenuItem();
        mSobre = new javax.swing.JMenu();
        mItGithub = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Imobiliario");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Sistema Imobiliário");
        lbTitulo.setToolTipText("");

        cxEntrada.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        cxEntrada.setToolTipText("Digite o que deseja pesquisar.");
        cxEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxEntradaMouseClicked(evt);
            }
        });
        cxEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEntradaActionPerformed(evt);
            }
        });

        cbOpcao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opcao", "Matricula de Imovel", "Nome do Corretor" }));
        cbOpcao.setToolTipText("");

        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setBorderPainted(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cxAviso.setEditable(false);
        cxAviso.setColumns(20);
        cxAviso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cxAviso.setLineWrap(true);
        cxAviso.setRows(5);
        cxAviso.setText("Para alterar, excluir, ver comissao e simular parcelamento de algum imovel:\n\nAcesse a pagina de exibicao do imovel atraves da busca por matricula, acesso ao imovel no painel do corretor ou acessando pelo banco de imoveis.");
        cxAviso.setToolTipText("Aviso sobre o sistema!");
        cxAviso.setWrapStyleWord(true);
        cxAviso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cxAviso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cxAviso.setFocusable(false);
        PainelAviso.setViewportView(cxAviso);

        mArquivo.setText("Arquivo");

        mCad.setText("Cadastrar novo imóvel...");

        mItCadAp.setText("Novo apartamento...");
        mItCadAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItCadApActionPerformed(evt);
            }
        });
        mCad.add(mItCadAp);

        mtItCadCs.setText("Nova casa...");
        mtItCadCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtItCadCsActionPerformed(evt);
            }
        });
        mCad.add(mtItCadCs);

        mnItCadKn.setText("Nova kitnet...");
        mnItCadKn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadKnActionPerformed(evt);
            }
        });
        mCad.add(mnItCadKn);

        mnItCadPs.setText("Nova pousada...");
        mnItCadPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadPsActionPerformed(evt);
            }
        });
        mCad.add(mnItCadPs);

        mArquivo.add(mCad);
        mArquivo.add(sArquivo);

        mItSair.setText("Sair");
        mItSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItSairActionPerformed(evt);
            }
        });
        mArquivo.add(mItSair);

        bmPrincipal.add(mArquivo);

        mVer.setText("Ver");

        mItBancoImv.setText("Banco de imóveis...");
        mItBancoImv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItBancoImvActionPerformed(evt);
            }
        });
        mVer.add(mItBancoImv);

        mItListaCorretores.setText("Lista de corretores...");
        mItListaCorretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItListaCorretoresActionPerformed(evt);
            }
        });
        mVer.add(mItListaCorretores);

        bmPrincipal.add(mVer);

        mSobre.setText("Sobre");

        mItGithub.setText("Github");
        mItGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItGithubActionPerformed(evt);
            }
        });
        mSobre.add(mItGithub);

        bmPrincipal.add(mSobre);

        setJMenuBar(bmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(PainelAviso)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbTitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItGithubActionPerformed
        try{ 
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/leonardocjr"); 
        }catch (IOException ex){ 
            System.out.println(ex.getMessage()); 
        }
    }//GEN-LAST:event_mItGithubActionPerformed

    private void mItSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItSairActionPerformed
        sair();
    }//GEN-LAST:event_mItSairActionPerformed

    private void cxEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEntradaActionPerformed

    }//GEN-LAST:event_cxEntradaActionPerformed

    private void cxEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxEntradaMouseClicked
        if (!cxEntrada.getText().isEmpty())
            cxEntrada.setText("");
    }//GEN-LAST:event_cxEntradaMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void mItCadApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItCadApActionPerformed
        CadAp.getCadAp().setVisible(true);
    }//GEN-LAST:event_mItCadApActionPerformed

    private void mtItCadCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtItCadCsActionPerformed
        CadCs.getCadCs().setVisible(true);
    }//GEN-LAST:event_mtItCadCsActionPerformed

    private void mnItCadKnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadKnActionPerformed
        CadKn.getCadKn().setVisible(true);
    }//GEN-LAST:event_mnItCadKnActionPerformed

    private void mnItCadPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadPsActionPerformed
        CadPs.getCadPs().setVisible(true);
    }//GEN-LAST:event_mnItCadPsActionPerformed

    private void mItBancoImvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItBancoImvActionPerformed
                if(Banco.getBanco().getBdAp().size() == 0 && Banco.getBanco().getBdCs().size() == 0 && Banco.getBanco().getBdKn().size() == 0 && Banco.getBanco().getBdPs().size() == 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "Nao ha nenhum imovel cadastrado ainda.\nVa cadastrar!",
                    "Alerta de Banco de Imoveis",
                    0
                );
        }else{
            RelatImoveis.getRelatImoveis().setVisible(true);
        }
    }//GEN-LAST:event_mItBancoImvActionPerformed

    private void mItListaCorretoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItListaCorretoresActionPerformed
        if(Banco.getBanco().getBdAp().size() == 0 && Banco.getBanco().getBdCs().size() == 0 && Banco.getBanco().getBdKn().size() == 0 && Banco.getBanco().getBdPs().size() == 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "Nao ha nenhum imovel cadastrado ainda.\nVa cadastrar!",
                    "Alerta de Lista de Corretores",
                    0
                );
        }else{
            ListaCorretor.getListaCorretor().setVisible(true);
        }
    }//GEN-LAST:event_mItListaCorretoresActionPerformed
    public void buscar(){
        switch(cbOpcao.getSelectedItem().toString()) {
            case "Escolha uma opcao" -> {
                JOptionPane.showMessageDialog(
                    null,
                    "Escolha uma opcao!",
                    "Alerta!",
                    0
                );
            }
            case "Matricula de Imovel" -> {
                a = new Apartamento();
                a.getContrato().setMatricula(cxEntrada.getText());
                c = new Casa();
                c.getContrato().setMatricula(cxEntrada.getText());
                k = new Kitnet();
                k.getContrato().setMatricula(cxEntrada.getText());
                p = new Pousada();
                p.getContrato().setMatricula(cxEntrada.getText());
                if(Banco.getBanco().consApMatricula(a)!= null || Banco.getBanco().consCsMatricula(c)!=null || Banco.getBanco().consKnMatricula(k)!=null || Banco.getBanco().consPsMatricula(p)!=null){
                    entrada = cxEntrada.getText();
                    if(Banco.getBanco().consApMatricula(a)!= null){
                        ExibeAp.getExibeAp().setEntrada(entrada);
                        ExibeAp.getExibeAp().setVisible(true);
                    }
                    if(Banco.getBanco().consCsMatricula(c)!= null){
                        ExibeCs.getExibeCs().setEntrada(entrada);
                        ExibeCs.getExibeCs().setVisible(true);
                    }
                    if(Banco.getBanco().consKnMatricula(k)!= null){
                        ExibeKn.getExibeKn().setEntrada(entrada);
                        ExibeKn.getExibeKn().setVisible(true);
                    }
                    if(Banco.getBanco().consPsMatricula(p)!= null){
                        ExibePs.getExibePs().setEntrada(entrada);
                        ExibePs.getExibePs().setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(
         null,
               "Imovel nao encontrado!",
                "Alerta!",
                    0
                    );
                }
            }
            case "Nome do Corretor" -> {
                a = new Apartamento();
                a.getContrato().getCorretor().setNome(cxEntrada.getText());
                c = new Casa();
                c.getContrato().getCorretor().setNome(cxEntrada.getText());
                k = new Kitnet();
                k.getContrato().getCorretor().setNome(cxEntrada.getText());
                p = new Pousada();
                p.getContrato().getCorretor().setNome(cxEntrada.getText());
                if(Banco.getBanco().consApCorretor(a)!= null || Banco.getBanco().consCsCorretor(c)!=null || Banco.getBanco().consKnCorretor(k)!=null || Banco.getBanco().consPsCorretor(p)!=null){
                    entrada = cxEntrada.getText();
                    limpar();
                    PainelCorretor.getPainelCorretor().setEntrada(entrada);
                    PainelCorretor.getPainelCorretor().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(
         null,
               "Corretor nao encontrado!",
                "Alerta!",
                    0
                    );
                }
                    
            }
            default -> {
            }
        }
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
    public void limpar(){
		cxEntrada.setText("");
		cxEntrada.requestFocus();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelAviso;
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JTextArea cxAviso;
    private javax.swing.JTextField cxEntrada;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenu mCad;
    private javax.swing.JMenuItem mItBancoImv;
    private javax.swing.JMenuItem mItCadAp;
    private javax.swing.JMenuItem mItGithub;
    private javax.swing.JMenuItem mItListaCorretores;
    private javax.swing.JMenuItem mItSair;
    private javax.swing.JMenu mSobre;
    private javax.swing.JMenu mVer;
    private javax.swing.JMenuItem mnItCadKn;
    private javax.swing.JMenuItem mnItCadPs;
    private javax.swing.JMenuItem mtItCadCs;
    private javax.swing.JPopupMenu.Separator sArquivo;
    // End of variables declaration//GEN-END:variables
}
