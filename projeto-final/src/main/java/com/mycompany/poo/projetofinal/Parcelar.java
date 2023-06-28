// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class Parcelar extends javax.swing.JFrame {

    private static Parcelar p_unico;
    private String entrada;
    Apartamento a;
    Casa c;
    Kitnet k;
    Pousada p;
    
    private Parcelar() {
        initComponents();
        this.setLocationRelativeTo(null);
        entrada = "";
    }
    public static Parcelar getParcelar(){
        if(p_unico == null)
            p_unico = new Parcelar();
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
        cxValorV = new javax.swing.JTextField();
        lbParcelas = new javax.swing.JLabel();
        spParcelas = new javax.swing.JSpinner();
        cxValorP = new javax.swing.JTextField();
        cxMsgFinal = new javax.swing.JTextField();
        btSimular = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parcelamento de Imoveis");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Parcelar Imovel");
        lbTitulo.setToolTipText("");

        cxValorV.setEditable(false);
        cxValorV.setBackground(new java.awt.Color(214, 217, 223));
        cxValorV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cxValorV.setToolTipText("Valor da compra a vista.");
        cxValorV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor total a vista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxValorV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxValorVActionPerformed(evt);
            }
        });

        lbParcelas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbParcelas.setText("Parcelas:");

        cxValorP.setEditable(false);
        cxValorP.setBackground(new java.awt.Color(214, 217, 223));
        cxValorP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cxValorP.setToolTipText("Valor da compra a vista.");
        cxValorP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor total parcelado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxValorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxValorPActionPerformed(evt);
            }
        });

        cxMsgFinal.setEditable(false);
        cxMsgFinal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cxMsgFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btSimular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSimular.setText("Simular");
        btSimular.setToolTipText("Clique para simular o parcelamento.");
        btSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimularActionPerformed(evt);
            }
        });

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
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbParcelas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSimular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cxValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cxValorP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cxMsgFinal)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbParcelas)
                    .addComponent(spParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSimular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxValorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cxMsgFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxValorVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorVActionPerformed

    private void cxValorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorPActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        limpar();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimularActionPerformed
        parcelar();
    }//GEN-LAST:event_btSimularActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carrDados();
    }//GEN-LAST:event_formWindowActivated

    public void parcelar(){
        if((int)spParcelas.getValue()<=1)
            JOptionPane.showMessageDialog(
                    null, 
                    "O NUMERO DE PARCELAS DEVE SER MAIOR QUE 1.", 
                    "Aviso sobre parcelas",
                    0
            );
        else{
            a = new Apartamento();
            c = new Casa();
            k = new Kitnet();
            p = new Pousada();
            a.getContrato().setMatricula(entrada);
            a = Banco.getBanco().consApMatricula(a);
            c.getContrato().setMatricula(entrada);
            c = Banco.getBanco().consCsMatricula(c);
            k.getContrato().setMatricula(entrada);
            k = Banco.getBanco().consKnMatricula(k);
            p.getContrato().setMatricula(entrada);
            p = Banco.getBanco().consPsMatricula(p);
            if(a != null){
                cxValorP.setText("R$ "+String.format("%.2f", a.calcParcelar((int)spParcelas.getValue())));
                cxMsgFinal.setText("O valor sera R$ "+String.format("%.2f", (a.calcParcelar((int)spParcelas.getValue()))/(int)spParcelas.getValue())+" em "+(int)spParcelas.getValue()+" parcelas.");
            }
            if(c != null){
                cxValorP.setText("R$ "+String.format("%.2f", c.calcParcelar((int)spParcelas.getValue())));
                cxMsgFinal.setText("O valor sera R$ "+String.format("%.2f", (c.calcParcelar((int)spParcelas.getValue()))/(int)spParcelas.getValue())+" em "+(int)spParcelas.getValue()+" parcelas.");
            }
            if(k != null){
                cxValorP.setText("R$ "+String.format("%.2f", k.calcParcelar((int)spParcelas.getValue())));
                cxMsgFinal.setText("O valor sera R$ "+String.format("%.2f", (k.calcParcelar((int)spParcelas.getValue()))/(int)spParcelas.getValue())+" em "+(int)spParcelas.getValue()+" parcelas.");
            }
            if(p != null){
                cxValorP.setText("R$ "+String.format("%.2f", p.calcParcelar((int)spParcelas.getValue())));
                cxMsgFinal.setText("O valor sera R$ "+String.format("%.2f", (p.calcParcelar((int)spParcelas.getValue()))/(int)spParcelas.getValue())+" em "+(int)spParcelas.getValue()+" parcelas.");
            }
        }
    }
    public void carrDados(){
        a = new Apartamento();
        c = new Casa();
        k = new Kitnet();
        p = new Pousada();
        a.getContrato().setMatricula(entrada);
        a = Banco.getBanco().consApMatricula(a);
        c.getContrato().setMatricula(entrada);
        c = Banco.getBanco().consCsMatricula(c);
        k.getContrato().setMatricula(entrada);
        k = Banco.getBanco().consKnMatricula(k);
        p.getContrato().setMatricula(entrada);
        p = Banco.getBanco().consPsMatricula(p);
        if(a != null){
            cxValorV.setText("R$ "+String.format("%.2f", a.getContrato().getCompra().getValor()));
        }
        if(c != null){
            cxValorV.setText("R$ "+String.format("%.2f", c.getContrato().getCompra().getValor()));
        }
        if(k != null){
            cxValorV.setText("R$ "+String.format("%.2f", k.getContrato().getCompra().getValor()));
        }
        if(p != null){
            cxValorV.setText("R$ "+String.format("%.2f", p.getContrato().getCompra().getValor()));
        }
    }
    public void limpar(){
        cxValorP.setText("");
        cxMsgFinal.setText("");
        spParcelas.setValue(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSimular;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxMsgFinal;
    private javax.swing.JTextField cxValorP;
    private javax.swing.JTextField cxValorV;
    private javax.swing.JLabel lbParcelas;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSpinner spParcelas;
    // End of variables declaration//GEN-END:variables
}
