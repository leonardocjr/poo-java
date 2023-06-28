// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.DefaultListModel;

public class ListaCorretor extends javax.swing.JFrame {

    private static ListaCorretor list_unico;
    private String entrada;

    private ListaCorretor() {
        initComponents();
        this.setLocationRelativeTo(null);
        entrada = "";
    }
    public static ListaCorretor getListaCorretor(){
        if(list_unico == null)
            list_unico = new ListaCorretor();
        return list_unico;
    }
    public String getEntrada(){
        return entrada;
    }
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbCorrAp = new javax.swing.JLabel();
        PainelListAp = new javax.swing.JScrollPane();
        corrListAp = new javax.swing.JList<>();
        lbCorrCs = new javax.swing.JLabel();
        PainelListCs = new javax.swing.JScrollPane();
        corrListCs = new javax.swing.JList<>();
        lbCorrKn = new javax.swing.JLabel();
        PainelListKn = new javax.swing.JScrollPane();
        corrListKn = new javax.swing.JList<>();
        lbCorrPs = new javax.swing.JLabel();
        PainelListPs = new javax.swing.JScrollPane();
        corrListPs = new javax.swing.JList<>();
        btVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Corretores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Lista de Corretores");
        lbTitulo.setToolTipText("");

        lbCorrAp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCorrAp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrAp.setText("Corretores de Apartamentos");

        corrListAp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        corrListAp.setToolTipText("Clique na linha para ver mais sobre o corretor.");
        corrListAp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corrListApMouseClicked(evt);
            }
        });
        PainelListAp.setViewportView(corrListAp);

        lbCorrCs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCorrCs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrCs.setText("Corretores de Casas");

        corrListCs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        corrListCs.setToolTipText("Clique na linha para ver mais sobre o corretor.");
        corrListCs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corrListCsMouseClicked(evt);
            }
        });
        PainelListCs.setViewportView(corrListCs);

        lbCorrKn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCorrKn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrKn.setText("Corretores de Kitnets");

        corrListKn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        corrListKn.setToolTipText("Clique na linha para ver mais sobre o corretor.");
        corrListKn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corrListKnMouseClicked(evt);
            }
        });
        PainelListKn.setViewportView(corrListKn);

        lbCorrPs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCorrPs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrPs.setText("Corretores de Pousadas");

        corrListPs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        corrListPs.setToolTipText("Clique na linha para ver mais sobre o corretor.");
        corrListPs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corrListPsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                corrListPsMouseEntered(evt);
            }
        });
        PainelListPs.setViewportView(corrListPs);

        btVoltar2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btVoltar2.setText("Voltar");
        btVoltar2.setToolTipText("Clique para voltar ao menu.");
        btVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelListAp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCorrAp, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelListCs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCorrCs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PainelListKn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lbCorrKn, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelListPs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lbCorrPs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCorrAp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelListAp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCorrCs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelListCs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCorrKn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelListKn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCorrPs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelListPs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btVoltar2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarCorrAp();
        listarCorrCs();
        listarCorrKn();
        listarCorrPs();
    }//GEN-LAST:event_formWindowActivated

    private void corrListApMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corrListApMouseClicked
        selectListaAp();
    }//GEN-LAST:event_corrListApMouseClicked

    private void btVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltar2ActionPerformed

    private void corrListCsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corrListCsMouseClicked
        selectListaCs();
    }//GEN-LAST:event_corrListCsMouseClicked

    private void corrListKnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corrListKnMouseClicked
        selectListaKn();
    }//GEN-LAST:event_corrListKnMouseClicked

    private void corrListPsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corrListPsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_corrListPsMouseEntered

    private void corrListPsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corrListPsMouseClicked
        selectListaPs();
    }//GEN-LAST:event_corrListPsMouseClicked
    public void listarCorrAp(){
        DefaultListModel modLst = new DefaultListModel();
        for(Apartamento a : Banco.getBanco().getBdAp()){
           modLst.addElement("Nome: "+a.getContrato().getCorretor().getNome()+" | Telefone: "+a.getContrato().getCorretor().getTelefone()); 
        }
        corrListAp.setModel(modLst);
    }
    public void selectListaAp(){
        int posLin = corrListAp.getSelectedIndex();
        String valLin = corrListAp.getSelectedValue().toString();
        int iniInd = valLin.indexOf("Nome: ") + 6;
        int fimInd = valLin.indexOf(" |");
        entrada = valLin.substring(iniInd, fimInd);
        PainelCorretor.getPainelCorretor().setEntrada(entrada);
        PainelCorretor.getPainelCorretor().setVisible(true);
    }
    public void listarCorrCs(){
        DefaultListModel modLst = new DefaultListModel();
        for(Casa c : Banco.getBanco().getBdCs()){
           modLst.addElement("Nome: "+c.getContrato().getCorretor().getNome()+" | Telefone: "+c.getContrato().getCorretor().getTelefone()); 
        }
        corrListCs.setModel(modLst);
    }
    public void selectListaCs(){
        int posLin = corrListCs.getSelectedIndex();
        String valLin = corrListCs.getSelectedValue().toString();
        int iniInd = valLin.indexOf("Nome: ") + 6;
        int fimInd = valLin.indexOf(" |");
        entrada = valLin.substring(iniInd, fimInd);
        PainelCorretor.getPainelCorretor().setEntrada(entrada);
        PainelCorretor.getPainelCorretor().setVisible(true);
     }
    public void listarCorrKn(){
        DefaultListModel modLst = new DefaultListModel();
        for(Kitnet k : Banco.getBanco().getBdKn()){
           modLst.addElement("Nome: "+k.getContrato().getCorretor().getNome()+" | Telefone: "+k.getContrato().getCorretor().getTelefone()); 
        }
        corrListKn.setModel(modLst);
    }
    public void selectListaKn(){
        int posLin = corrListKn.getSelectedIndex();
        String valLin = corrListKn.getSelectedValue().toString();
        int iniInd = valLin.indexOf("Nome: ") + 6;
        int fimInd = valLin.indexOf(" |");
        entrada = valLin.substring(iniInd, fimInd);
        PainelCorretor.getPainelCorretor().setEntrada(entrada);
        PainelCorretor.getPainelCorretor().setVisible(true);
     }
    public void listarCorrPs(){
        DefaultListModel modLst = new DefaultListModel();
        for(Pousada p : Banco.getBanco().getBdPs()){
           modLst.addElement("Nome: "+p.getContrato().getCorretor().getNome()+" | Telefone: "+p.getContrato().getCorretor().getTelefone()); 
        }
        corrListPs.setModel(modLst);
    }
    public void selectListaPs(){
        int posLin = corrListPs.getSelectedIndex();
        String valLin = corrListPs.getSelectedValue().toString();
        int iniInd = valLin.indexOf("Nome: ") + 6;
        int fimInd = valLin.indexOf(" |");
        entrada = valLin.substring(iniInd, fimInd);
        PainelCorretor.getPainelCorretor().setEntrada(entrada);
        PainelCorretor.getPainelCorretor().setVisible(true);
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelListAp;
    private javax.swing.JScrollPane PainelListCs;
    private javax.swing.JScrollPane PainelListKn;
    private javax.swing.JScrollPane PainelListPs;
    private javax.swing.JButton btVoltar2;
    private javax.swing.JList<String> corrListAp;
    private javax.swing.JList<String> corrListCs;
    private javax.swing.JList<String> corrListKn;
    private javax.swing.JList<String> corrListPs;
    private javax.swing.JLabel lbCorrAp;
    private javax.swing.JLabel lbCorrCs;
    private javax.swing.JLabel lbCorrKn;
    private javax.swing.JLabel lbCorrPs;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
