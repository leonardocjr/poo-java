// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.table.DefaultTableModel;

public class RelatImoveis extends javax.swing.JFrame {

    private static RelatImoveis r_unico;
    
    private RelatImoveis() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static RelatImoveis getRelatImoveis(){
        if(r_unico == null)
            r_unico = new RelatImoveis();
        return r_unico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbFiltro = new javax.swing.JLabel();
        cbAp = new javax.swing.JCheckBox();
        cbCs = new javax.swing.JCheckBox();
        cbKn = new javax.swing.JCheckBox();
        cbPs = new javax.swing.JCheckBox();
        cbDisponivel = new javax.swing.JCheckBox();
        cbIndisponivel = new javax.swing.JCheckBox();
        btAtualizar = new javax.swing.JButton();
        tbBancoImv = new javax.swing.JScrollPane();
        tbBdImv = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Banco de Imóveis");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Banco de Imóveis");
        lbTitulo.setToolTipText("");

        lbFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbFiltro.setText("Filtrar por:");

        cbAp.setSelected(true);
        cbAp.setText("Apartamentos");

        cbCs.setSelected(true);
        cbCs.setText("Casas");

        cbKn.setSelected(true);
        cbKn.setText("Kitnets");

        cbPs.setSelected(true);
        cbPs.setText("Pousadas");

        cbDisponivel.setSelected(true);
        cbDisponivel.setText("Não ocupados");

        cbIndisponivel.setSelected(true);
        cbIndisponivel.setText("Ocupados");

        btAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setToolTipText("Clique para atualizar a tabela com filtros.");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        tbBdImv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbBdImv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Matrícula", "Área", "UF", "CEP", "Ocupado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBdImv.setToolTipText("Clique na linha para ver mais sobre o imovel.");
        tbBdImv.getTableHeader().setReorderingAllowed(false);
        tbBdImv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBdImvMouseClicked(evt);
            }
        });
        tbBancoImv.setViewportView(tbBdImv);
        if (tbBdImv.getColumnModel().getColumnCount() > 0) {
            tbBdImv.getColumnModel().getColumn(0).setResizable(false);
            tbBdImv.getColumnModel().getColumn(1).setResizable(false);
            tbBdImv.getColumnModel().getColumn(2).setResizable(false);
            tbBdImv.getColumnModel().getColumn(3).setResizable(false);
            tbBdImv.getColumnModel().getColumn(4).setResizable(false);
            tbBdImv.getColumnModel().getColumn(5).setResizable(false);
        }

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Clique para voltar ao menu.");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbBancoImv)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFiltro)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbAp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCs))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(cbDisponivel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbIndisponivel)
                            .addComponent(cbKn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btAtualizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbAp)
                                .addComponent(cbCs)
                                .addComponent(lbFiltro))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbDisponivel)
                                .addComponent(cbPs)))
                        .addComponent(btAtualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbKn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbBancoImv, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbBdImvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBdImvMouseClicked
        selecTab();
    }//GEN-LAST:event_tbBdImvMouseClicked

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        listarTab();
    }//GEN-LAST:event_btAtualizarActionPerformed
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbBdImv.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        if(cbAp.isSelected()){
            for(Apartamento a : Banco.getBanco().getBdAp()){
                if(cbDisponivel.isSelected() && cbIndisponivel.isSelected()){
                    tabModel.insertRow(posLin, new Object[]{"Apartamento",a.getContrato().getMatricula(),a.getArea(),a.getLocal().getReg().getUf(),a.getLocal().getReg().getCep(),a.getContrato().getOcupado()});
                    posLin++;
                }
                if(!cbDisponivel.isSelected() && cbIndisponivel.isSelected() && a.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Apartamento",a.getContrato().getMatricula(),a.getArea(),a.getLocal().getReg().getUf(),a.getLocal().getReg().getCep(),a.getContrato().getOcupado()});
                    posLin++;
                }
                if(cbDisponivel.isSelected() && !cbIndisponivel.isSelected() && !a.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Apartamento",a.getContrato().getMatricula(),a.getArea(),a.getLocal().getReg().getUf(),a.getLocal().getReg().getCep(),a.getContrato().getOcupado()});
                    posLin++;
                }
            }
        }
        if(cbCs.isSelected()){
            for(Casa c : Banco.getBanco().getBdCs()){
                if(cbDisponivel.isSelected() && cbIndisponivel.isSelected()){
                    tabModel.insertRow(posLin, new Object[]{"Casa",c.getContrato().getMatricula(),c.getArea(),c.getLocal().getReg().getUf(),c.getLocal().getReg().getCep(),c.getContrato().getOcupado()});
                    posLin++;
                }
                if(!cbDisponivel.isSelected() && cbIndisponivel.isSelected() && c.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Casa",c.getContrato().getMatricula(),c.getArea(),c.getLocal().getReg().getUf(),c.getLocal().getReg().getCep(),c.getContrato().getOcupado()});
                    posLin++;
                }
                if(cbDisponivel.isSelected() && !cbIndisponivel.isSelected() && !c.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Casa",c.getContrato().getMatricula(),c.getArea(),c.getLocal().getReg().getUf(),c.getLocal().getReg().getCep(),c.getContrato().getOcupado()});
                    posLin++;
                }
            }
        }
        if(cbKn.isSelected()){
            for(Kitnet k : Banco.getBanco().getBdKn()){
                if(cbDisponivel.isSelected() && cbIndisponivel.isSelected()){
                    tabModel.insertRow(posLin, new Object[]{"Kitnet",k.getContrato().getMatricula(),k.getArea(),k.getLocal().getReg().getUf(),k.getLocal().getReg().getCep(),k.getContrato().getOcupado()});
                    posLin++;
                }
                if(!cbDisponivel.isSelected() && cbIndisponivel.isSelected() && k.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Kitnet",k.getContrato().getMatricula(),k.getArea(),k.getLocal().getReg().getUf(),k.getLocal().getReg().getCep(),k.getContrato().getOcupado()});
                    posLin++;
                }
                if(cbDisponivel.isSelected() && !cbIndisponivel.isSelected() && !k.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Kitnet",k.getContrato().getMatricula(),k.getArea(),k.getLocal().getReg().getUf(),k.getLocal().getReg().getCep(),k.getContrato().getOcupado()});
                    posLin++;
                }
            }
        }
        if(cbPs.isSelected()){
            for(Pousada p : Banco.getBanco().getBdPs()){
                if(cbDisponivel.isSelected() && cbIndisponivel.isSelected()){
                    tabModel.insertRow(posLin, new Object[]{"Pousada",p.getContrato().getMatricula(),p.getArea(),p.getLocal().getReg().getUf(),p.getLocal().getReg().getCep(),p.getContrato().getOcupado()});
                    posLin++;
                }
                if(!cbDisponivel.isSelected() && cbIndisponivel.isSelected() && p.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Pousada",p.getContrato().getMatricula(),p.getArea(),p.getLocal().getReg().getUf(),p.getLocal().getReg().getCep(),p.getContrato().getOcupado()});
                    posLin++;
                }
                if(cbDisponivel.isSelected() && !cbIndisponivel.isSelected() && !p.getContrato().getOcupado()){
                    tabModel.insertRow(posLin, new Object[]{"Pousada",p.getContrato().getMatricula(),p.getArea(),p.getLocal().getReg().getUf(),p.getLocal().getReg().getCep(),p.getContrato().getOcupado()});
                    posLin++;
                }
            }
        }
    }
    public void selecTab(){
        String tipo;
        String matricula;
        int posLin = tbBdImv.getSelectedRow();
        tipo = tbBdImv.getModel().getValueAt(posLin, 0).toString();
        matricula = tbBdImv.getModel().getValueAt(posLin, 1).toString();
        switch(tipo) {
            case "Apartamento" -> {
                ExibeAp.getExibeAp().setEntrada(matricula);
                ExibeAp.getExibeAp().setVisible(true);
            }
            case "Casa" -> {
                ExibeCs.getExibeCs().setEntrada(matricula);
                ExibeCs.getExibeCs().setVisible(true);
            }
            case "Kitnet" -> {
                ExibeKn.getExibeKn().setEntrada(matricula);
                ExibeKn.getExibeKn().setVisible(true);
            }
            case "Pousada" -> {
                ExibePs.getExibePs().setEntrada(matricula);
                ExibePs.getExibePs().setVisible(true);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox cbAp;
    private javax.swing.JCheckBox cbCs;
    private javax.swing.JCheckBox cbDisponivel;
    private javax.swing.JCheckBox cbIndisponivel;
    private javax.swing.JCheckBox cbKn;
    private javax.swing.JCheckBox cbPs;
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane tbBancoImv;
    private javax.swing.JTable tbBdImv;
    // End of variables declaration//GEN-END:variables
}
