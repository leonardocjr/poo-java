// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class ExibeAp extends javax.swing.JFrame {

    public static ExibeAp eap_unico;
    public String entrada;
    Apartamento a = new Apartamento();
    
    private ExibeAp() {
        initComponents();
        this.setLocationRelativeTo(null);
        entrada = "";
    }
    public static ExibeAp getExibeAp(){
        if(eap_unico == null)
            eap_unico = new ExibeAp();
        return eap_unico;
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
        lbContrato = new javax.swing.JLabel();
        sContrato = new javax.swing.JSeparator();
        cxMatricula = new javax.swing.JTextField();
        cxIPTU = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxTelefone = new javax.swing.JTextField();
        cbOcupado = new javax.swing.JCheckBox();
        cbCompra = new javax.swing.JCheckBox();
        cbAluguel = new javax.swing.JCheckBox();
        lbLocal = new javax.swing.JLabel();
        sLocal = new javax.swing.JSeparator();
        cxCEP = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        cxBairro = new javax.swing.JTextField();
        cbUF = new javax.swing.JComboBox<>();
        cxRua = new javax.swing.JTextField();
        cxNumero = new javax.swing.JTextField();
        lbImovel = new javax.swing.JLabel();
        sImovel = new javax.swing.JSeparator();
        cxArea = new javax.swing.JTextField();
        lbQuarto = new javax.swing.JLabel();
        spQuarto = new javax.swing.JSpinner();
        lbBanheiro = new javax.swing.JLabel();
        spBanheiro = new javax.swing.JSpinner();
        lbPossui = new javax.swing.JLabel();
        cbMobilia = new javax.swing.JCheckBox();
        cbSalaFesta = new javax.swing.JCheckBox();
        cbAcademia = new javax.swing.JCheckBox();
        lbAndar = new javax.swing.JLabel();
        spAndar = new javax.swing.JSpinner();
        sBotoes = new javax.swing.JSeparator();
        btVoltar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btConcluir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        mbExibe = new javax.swing.JMenuBar();
        mFerramentas = new javax.swing.JMenu();
        mItParcelamento = new javax.swing.JMenuItem();
        mItComissao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibindo Apartamento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Exibindo Apartamento");
        lbTitulo.setToolTipText("");

        lbContrato.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        lbContrato.setText("CONTRATO");

        cxMatricula.setBackground(new java.awt.Color(214, 217, 223));
        cxMatricula.setToolTipText("Insira a matrícula do imóvel.");
        cxMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrícula do Imóvel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxMatricula.setEnabled(false);
        cxMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMatriculaActionPerformed(evt);
            }
        });

        cxIPTU.setBackground(new java.awt.Color(214, 217, 223));
        cxIPTU.setToolTipText("Insira o valor do IPTU.");
        cxIPTU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPTU (em R$)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxIPTU.setEnabled(false);
        cxIPTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIPTUActionPerformed(evt);
            }
        });

        cxNome.setBackground(new java.awt.Color(214, 217, 223));
        cxNome.setToolTipText("Insira a nome do corretor.");
        cxNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Corretor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxNome.setEnabled(false);
        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        cxTelefone.setBackground(new java.awt.Color(214, 217, 223));
        cxTelefone.setToolTipText("Insira o telefone do corretor.");
        cxTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone do Corretor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxTelefone.setEnabled(false);
        cxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneActionPerformed(evt);
            }
        });

        cbOcupado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbOcupado.setText("Ocupado");
        cbOcupado.setToolTipText("Marque se o imovel ja estiver ocupado.");
        cbOcupado.setEnabled(false);

        cbCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCompra.setText("Habilita compra");
        cbCompra.setToolTipText("Marque se o imovel habilita a compra.");
        cbCompra.setEnabled(false);
        cbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompraActionPerformed(evt);
            }
        });

        cbAluguel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAluguel.setText("Habilita aluguel");
        cbAluguel.setToolTipText("Marque se o imovel habilita o aluguel.");
        cbAluguel.setEnabled(false);
        cbAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAluguelActionPerformed(evt);
            }
        });

        lbLocal.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        lbLocal.setText("LOCAL");

        cxCEP.setBackground(new java.awt.Color(214, 217, 223));
        cxCEP.setToolTipText("Digite o CEP do imove.");
        cxCEP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxCEP.setEnabled(false);
        cxCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCEPActionPerformed(evt);
            }
        });

        cxCidade.setBackground(new java.awt.Color(214, 217, 223));
        cxCidade.setToolTipText("Digite a cidade do Imove.");
        cxCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxCidade.setEnabled(false);
        cxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeActionPerformed(evt);
            }
        });

        cxBairro.setBackground(new java.awt.Color(214, 217, 223));
        cxBairro.setToolTipText("Digite o bairro do Imovel.");
        cxBairro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxBairro.setEnabled(false);
        cxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBairroActionPerformed(evt);
            }
        });

        cbUF.setBackground(new java.awt.Color(214, 217, 223));
        cbUF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cbUF.setEnabled(false);

        cxRua.setBackground(new java.awt.Color(214, 217, 223));
        cxRua.setToolTipText("Digite a rua do Imovel.");
        cxRua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxRua.setEnabled(false);

        cxNumero.setBackground(new java.awt.Color(214, 217, 223));
        cxNumero.setToolTipText("Digite o numero do Imovel.");
        cxNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxNumero.setEnabled(false);

        lbImovel.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        lbImovel.setText("IMOVEL");

        cxArea.setBackground(new java.awt.Color(214, 217, 223));
        cxArea.setToolTipText("Digire a area em m2.");
        cxArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Área (em m2)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxArea.setEnabled(false);
        cxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAreaActionPerformed(evt);
            }
        });

        lbQuarto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbQuarto.setText("Quarto(s):");

        spQuarto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spQuarto.setToolTipText("Digite a quantidade de quartos do imovel.");
        spQuarto.setEnabled(false);

        lbBanheiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbBanheiro.setText("Banheiro(s):");

        spBanheiro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spBanheiro.setToolTipText("Digite a quantidade de banheiros do imovel.");
        spBanheiro.setEnabled(false);

        lbPossui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPossui.setText("Possui:");

        cbMobilia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMobilia.setText("Mobilia");
        cbMobilia.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbMobilia.setEnabled(false);

        cbSalaFesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSalaFesta.setText("Sala de Festa");
        cbSalaFesta.setToolTipText("Marque se o Imovel é mobiliado.");
        cbSalaFesta.setEnabled(false);
        cbSalaFesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalaFestaActionPerformed(evt);
            }
        });

        cbAcademia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAcademia.setText("Academia");
        cbAcademia.setToolTipText("Marque se o apartamento possui academia.");
        cbAcademia.setEnabled(false);

        lbAndar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAndar.setText("Andar:");

        spAndar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spAndar.setToolTipText("Digite o andar do apartamento.");
        spAndar.setEnabled(false);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Clique para voltar ao menu.");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.setToolTipText("Clique para limpar os valores.");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btConcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btConcluir.setText("Concluir");
        btConcluir.setToolTipText("Clique para concluir o cadastro do imovel.");
        btConcluir.setEnabled(false);
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Clique para limpar os valores.");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        mFerramentas.setText("Ferramentas");

        mItParcelamento.setText("Simular parcelamento...");
        mItParcelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItParcelamentoActionPerformed(evt);
            }
        });
        mFerramentas.add(mItParcelamento);

        mItComissao.setText("Ver comissao");
        mItComissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItComissaoActionPerformed(evt);
            }
        });
        mFerramentas.add(mItComissao);

        mbExibe.add(mFerramentas);

        setJMenuBar(mbExibe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sBotoes)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btConcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxArea)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAndar)
                                    .addComponent(spAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbQuarto)
                                .addGap(18, 18, 18)
                                .addComponent(lbBanheiro)
                                .addGap(18, 18, 18)
                                .addComponent(lbPossui, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAcademia)
                                    .addComponent(cbSalaFesta)
                                    .addComponent(cbMobilia))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbLocal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sLocal))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cxBairro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cxMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxIPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCompra)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbOcupado)
                                    .addComponent(cbAluguel))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbImovel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbContrato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbContrato)
                    .addComponent(sContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxIPTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cbOcupado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAluguel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCompra)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLocal)
                    .addComponent(sLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImovel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(sImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBanheiro)
                            .addComponent(lbQuarto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMobilia))
                        .addComponent(cbSalaFesta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPossui)
                            .addComponent(cxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAndar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAcademia))
                .addGap(15, 15, 15)
                .addComponent(sBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btConcluir)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCidadeActionPerformed

    private void cxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxBairroActionPerformed

    private void cxMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMatriculaActionPerformed

    private void cxIPTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIPTUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIPTUActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void cxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneActionPerformed

    private void cbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCompraActionPerformed

    private void cxCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCEPActionPerformed

    private void cxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAreaActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editar(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        altAp();
    }//GEN-LAST:event_btConcluirActionPerformed

    private void cbAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAluguelActionPerformed

    private void cbSalaFestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalaFestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSalaFestaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        editar(false);
        carrDados();
    }//GEN-LAST:event_formWindowActivated

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void mItComissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItComissaoActionPerformed
        comissao();
    }//GEN-LAST:event_mItComissaoActionPerformed

    private void mItParcelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItParcelamentoActionPerformed
        if(a.getContrato().getCompra().getHabilitado() && !(a.getContrato().getOcupado())){
            Parcelar.getParcelar().setEntrada(entrada);
            Parcelar.getParcelar().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "Este imovel ja esta ocupado ou nao habilita a compra.",
                    "Alerta sobre Imovel",
                    0
            );
        }
    }//GEN-LAST:event_mItParcelamentoActionPerformed
    public void excluir(){
        int resp = JOptionPane.showConfirmDialog(
            null,
            "Tem certeza que deseja excluir este Apartamento?",
            "Exclusao de Imoveis",
            JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            a = new Apartamento();
            a.getContrato().setMatricula(entrada);
            a = Banco.getBanco().consApMatricula(a);
            dispose();
            a = Banco.getBanco().delAp(a);
            if(a == null){
                JOptionPane.showMessageDialog(
                        null,
                        "Apartamento excluido com sucesso!",
                        "Exclusao de Imoveis",
                        1
                );
            }else{
                JOptionPane.showMessageDialog(
                    null,
                    "Nao foi possivel excluir este Apartamento!",
                    "Exclusao de Imoveis",
                    0
                );
            }
        }
    }
    public void comissao(){
        a = new Apartamento();
        a.getContrato().setMatricula(entrada);
        a = Banco.getBanco().consApMatricula(a);
        a.calcComissao();
    }
    public void carrDados(){
        a = new Apartamento();
        a.getContrato().setMatricula(entrada);
        a = Banco.getBanco().consApMatricula(a);
        cxMatricula.setText(a.getContrato().getMatricula());
        cxIPTU.setText(String.valueOf(a.getContrato().getImposto()));
        cxNome.setText(a.getContrato().getCorretor().getNome());
        cxTelefone.setText(a.getContrato().getCorretor().getTelefone());
        cbOcupado.setSelected(a.getContrato().getOcupado());
        cbCompra.setSelected(a.getContrato().getCompra().getHabilitado());
        cbAluguel.setSelected(a.getContrato().getAluguel().getHabilitado());
        cbUF.setSelectedIndex(Banco.getBanco().consulIndexUf(a.getLocal().getReg().getUf()));
        cxCEP.setText(a.getLocal().getReg().getCep());
        cxCidade.setText(a.getLocal().getReg().getCidade());
        cxBairro.setText(a.getLocal().getReg().getBairro());
        cxRua.setText(a.getLocal().getRua());
        cxNumero.setText(String.valueOf(a.getLocal().getNumero()));
        cxArea.setText(String.valueOf(a.getArea()));
        spQuarto.setValue(a.getQuarto());
        spBanheiro.setValue(a.getBanheiro());
        cbMobilia.setSelected(a.getMobilia());
        cbSalaFesta.setSelected(a.getSalaFesta());
        cbAcademia.setSelected(a.getAcademia());
        spAndar.setValue(a.getAndar()); 
    }
    public void editar(boolean cond){
        cxIPTU.setEnabled(cond);
        cxNome.setEnabled(cond);
        cxTelefone.setEnabled(cond);
        cbOcupado.setEnabled(cond);
        cbCompra.setEnabled(cond);
        cbAluguel.setEnabled(cond);
        cbUF.setEnabled(cond);
        cxCEP.setEnabled(cond);
        cxCidade.setEnabled(cond);
        cxBairro.setEnabled(cond);
        cxRua.setEnabled(cond);
        cxNumero.setEnabled(cond);
        cxArea.setEnabled(cond);
        spQuarto.setEnabled(cond);
        spBanheiro.setEnabled(cond);
        cbMobilia.setEnabled(cond);
        cbSalaFesta.setEnabled(cond);
        cbAcademia.setEnabled(cond);
        spAndar.setEnabled(cond);
        btConcluir.setEnabled(cond);
    }
    public void altAp(){
        a = new Apartamento();
        a.getContrato().setMatricula(entrada);
        a = Banco.getBanco().consApMatricula(a);
            int somaValida = 0;
            try{
                a.getContrato().setImposto(Double.parseDouble(cxIPTU.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgNegativoException("IPTU");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("IPTU");
            }
            a.getContrato().getCorretor().setNome(cxNome.getText());
            if(cxNome.getText().equals(""))
                msgCaixaVazia("Nome do Corretor");
            else
                somaValida+=1;
            a.getContrato().getCorretor().setTelefone(cxTelefone.getText());
            if(cxTelefone.getText().equals(""))
                msgCaixaVazia("Telefone do Corretor");
            else
                somaValida+=1;
            a.getContrato().setOcupado(cbOcupado.isSelected());
            a.getContrato().getCompra().setHabilitado(cbCompra.isSelected());
            a.getContrato().getAluguel().setHabilitado(cbAluguel.isSelected());
            try{
                a.getLocal().getReg().setCep(cxCEP.getText());
                somaValida+=1;
            }catch(CepException cpe){
                cpe.msgCepException("CEP");
            }
            a.getLocal().getReg().setCidade(cxCidade.getText());
            if(cxCidade.getText().equals(""))
                msgCaixaVazia("Cidade");
            else
                somaValida+=1;
            a.getLocal().getReg().setBairro(cxBairro.getText());
            if(cxBairro.getText().equals(""))
                msgCaixaVazia("Bairro");
            else
                somaValida+=1;
            if(cbUF.getSelectedItem().toString().equals("Estado"))
                msgSelectException("UF");
            else{
                a.getLocal().getReg().setUf(cbUF.getSelectedItem().toString());
                somaValida+=1;
            }
            a.getLocal().setRua(cxRua.getText());
            if(cxRua.getText().equals(""))
                msgCaixaVazia("Rua");
            else
                somaValida+=1;
            try{
                a.getLocal().setNumero(Integer.parseInt(cxNumero.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Numero");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("Numero");
            }
            try{
                a.setArea(Integer.parseInt(cxArea.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Area");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("Area");
            }
            try{
                a.setQuarto((int)spQuarto.getValue());
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Quarto(s)");
            }
            try{
                a.setBanheiro((int)spBanheiro.getValue());
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Banheiro(s)");
            }
            a.setMobilia(cbMobilia.isSelected());
            a.setSalaFesta(cbSalaFesta.isSelected());
            a.setAcademia(cbAcademia.isSelected());
            try{
                a.setAndar((int)spAndar.getValue());
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgNegativoException("Andar");
            }
            if(somaValida == 13){
                
                int resp = JOptionPane.showConfirmDialog(
                        null,
                        "Tem certeza que deseja alterar este Apartamento?",
                        "Alteracao de Imoveis",
                        JOptionPane.YES_NO_OPTION
                    );
                if(resp == 0){
                    if(a.getContrato().getCompra().getHabilitado())
                        a.getContrato().getCompra().setValor(a.contCompra());
                    if(a.getContrato().getAluguel().getHabilitado())
                        a.getContrato().getAluguel().setValor(a.contAluguel());
                    a = Banco.getBanco().altAp(a);
                    editar(false);
                }
                else{
                    carrDados();
                    editar(false);
                }
            }
    
    }
    public void msgNumberFormatException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"DIGITE UM NUMERO VALIDO.\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
    }
    public void msgSelectException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"ESCOLHA UMA "+caixa+" VALIDA.\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
    }
    public void msgCaixaVazia(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\nA ENTRADA ESTA VAZIA.\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox cbAcademia;
    private javax.swing.JCheckBox cbAluguel;
    private javax.swing.JCheckBox cbCompra;
    private javax.swing.JCheckBox cbMobilia;
    private javax.swing.JCheckBox cbOcupado;
    private javax.swing.JCheckBox cbSalaFesta;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JTextField cxArea;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCEP;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxIPTU;
    private javax.swing.JTextField cxMatricula;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel lbAndar;
    private javax.swing.JLabel lbBanheiro;
    private javax.swing.JLabel lbContrato;
    private javax.swing.JLabel lbImovel;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbPossui;
    private javax.swing.JLabel lbQuarto;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenuItem mItComissao;
    private javax.swing.JMenuItem mItParcelamento;
    private javax.swing.JMenuBar mbExibe;
    private javax.swing.JSeparator sBotoes;
    private javax.swing.JSeparator sContrato;
    private javax.swing.JSeparator sImovel;
    private javax.swing.JSeparator sLocal;
    private javax.swing.JSpinner spAndar;
    private javax.swing.JSpinner spBanheiro;
    private javax.swing.JSpinner spQuarto;
    // End of variables declaration//GEN-END:variables
}
