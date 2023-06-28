// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.table.DefaultTableModel;

public class PainelCorretor extends javax.swing.JFrame {

    private static PainelCorretor p_unico;
    private String entrada;
    Apartamento a;
    Casa c;
    Kitnet k;
    Pousada p;
    
    private PainelCorretor() {
        initComponents();
        this.setLocationRelativeTo(null);
        entrada = "";
    }
    public static PainelCorretor getPainelCorretor(){
        if(p_unico == null)
            p_unico = new PainelCorretor();
        return p_unico;
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
        lbNome = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxTelefone = new javax.swing.JTextField();
        tbCorrImvs = new javax.swing.JScrollPane();
        tbCorrImv = new javax.swing.JTable();
        btVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Painel do corretor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Painel do corretor");

        lbNome.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lbNome.setText("Nome do corretor");

        lbTelefone.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lbTelefone.setText("Telefone do corretor");

        cxNome.setEditable(false);
        cxNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cxNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cxTelefone.setEditable(false);
        cxTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cxTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tbCorrImv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "UF", "CEP", "Área (em m2)", "#"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCorrImv.setToolTipText("Clique na linha para ver mais sobre o imovel.");
        tbCorrImv.getTableHeader().setReorderingAllowed(false);
        tbCorrImv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCorrImvMouseClicked(evt);
            }
        });
        tbCorrImvs.setViewportView(tbCorrImv);
        if (tbCorrImv.getColumnModel().getColumnCount() > 0) {
            tbCorrImv.getColumnModel().getColumn(0).setResizable(false);
            tbCorrImv.getColumnModel().getColumn(1).setResizable(false);
            tbCorrImv.getColumnModel().getColumn(2).setResizable(false);
            tbCorrImv.getColumnModel().getColumn(3).setResizable(false);
            tbCorrImv.getColumnModel().getColumn(4).setResizable(false);
        }

        btVoltar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbCorrImvs)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone)
                    .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCorrImvs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btVoltar2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carrDados();
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void btVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltar2ActionPerformed

    private void tbCorrImvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCorrImvMouseClicked
        selecTab();
    }//GEN-LAST:event_tbCorrImvMouseClicked
    public void selecTab(){
        String tipo;
        String matricula;
        int posLin = tbCorrImv.getSelectedRow();
        tipo = tbCorrImv.getModel().getValueAt(posLin, 4).toString();
        matricula = tbCorrImv.getModel().getValueAt(posLin, 0).toString();
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
    public void carrDados(){
        a = new Apartamento();
        a.getContrato().getCorretor().setNome(entrada);
        a = Banco.getBanco().consApCorretor(a);
        c = new Casa();
        c.getContrato().getCorretor().setNome(entrada);
        c = Banco.getBanco().consCsCorretor(c);
        k = new Kitnet();
        k.getContrato().getCorretor().setNome(entrada);
        k = Banco.getBanco().consKnCorretor(k);
        p = new Pousada();
        p.getContrato().getCorretor().setNome(entrada);
        p = Banco.getBanco().consPsCorretor(p);
        cxNome.setText(entrada);
        if(a!=null)
            cxTelefone.setText(a.getContrato().getCorretor().getTelefone());
        else if(c!=null)
            cxTelefone.setText(c.getContrato().getCorretor().getTelefone());
        else if(k!=null)
            cxTelefone.setText(k.getContrato().getCorretor().getTelefone());
        else if(p!=null)
            cxTelefone.setText(p.getContrato().getCorretor().getTelefone());
    }
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbCorrImv.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Apartamento a : Banco.getBanco().getBdAp()){
            if(entrada.equals(a.getContrato().getCorretor().getNome())){
                tabModel.insertRow(posLin, new Object[]{a.getContrato().getMatricula(),a.getLocal().getReg().getUf(),a.getLocal().getReg().getCep(),a.getArea(),"Apartamento"});
                posLin++;
            }
        }
        for(Casa c : Banco.getBanco().getBdCs()){
            if(entrada.equals(c.getContrato().getCorretor().getNome())){
                tabModel.insertRow(posLin, new Object[]{c.getContrato().getMatricula(),c.getLocal().getReg().getUf(),c.getLocal().getReg().getCep(),c.getArea(),"Casa"});
                posLin++;
            }
        }
        for(Kitnet k : Banco.getBanco().getBdKn()){
            if(entrada.equals(k.getContrato().getCorretor().getNome())){
                tabModel.insertRow(posLin, new Object[]{k.getContrato().getMatricula(),k.getLocal().getReg().getUf(),k.getLocal().getReg().getCep(),k.getArea(),"Kitnet"});
                posLin++;
            }
        }
        for(Pousada p : Banco.getBanco().getBdPs()){
            if(entrada.equals(p.getContrato().getCorretor().getNome())){
                tabModel.insertRow(posLin, new Object[]{p.getContrato().getMatricula(),p.getLocal().getReg().getUf(),p.getLocal().getReg().getCep(),p.getArea(),"Pousada"});
                posLin++;
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar2;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbCorrImv;
    private javax.swing.JScrollPane tbCorrImvs;
    // End of variables declaration//GEN-END:variables
}
