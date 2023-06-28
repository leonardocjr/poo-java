// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class ExibePs extends javax.swing.JFrame {

    public static ExibePs ep_unico;
    public String entrada;
    Pousada p = new Pousada();
    
    private ExibePs() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static ExibePs getExibePs(){
        if(ep_unico == null)
            ep_unico = new ExibePs();
        return ep_unico;
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
        sBotoes = new javax.swing.JSeparator();
        btVoltar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btConcluir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbLazer = new javax.swing.JLabel();
        cbLazer = new javax.swing.JComboBox<>();
        cbCafeM = new javax.swing.JCheckBox();
        lbRef = new javax.swing.JLabel();
        cbAlmoco = new javax.swing.JCheckBox();
        cxQtdRef = new javax.swing.JTextField();
        lbQtdRef = new javax.swing.JLabel();
        cbCeia = new javax.swing.JCheckBox();
        cbJanta = new javax.swing.JCheckBox();
        cbCafeT = new javax.swing.JCheckBox();
        mbExibe = new javax.swing.JMenuBar();
        mFerramentas = new javax.swing.JMenu();
        mItParcelamento = new javax.swing.JMenuItem();
        mItComissao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibindo Pousada");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Exibindo Pousada");
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

        lbLazer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbLazer.setText("Lazer:");

        cbLazer.setBackground(new java.awt.Color(214, 217, 223));
        cbLazer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbLazer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "PRAIA", "RESORT", "FESTAS" }));
        cbLazer.setEnabled(false);
        cbLazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLazerActionPerformed(evt);
            }
        });

        cbCafeM.setText("Cafe da manha");
        cbCafeM.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbCafeM.setEnabled(false);
        cbCafeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCafeMActionPerformed(evt);
            }
        });

        lbRef.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbRef.setText("Refeições");

        cbAlmoco.setText("Almoço");
        cbAlmoco.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbAlmoco.setEnabled(false);
        cbAlmoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlmocoActionPerformed(evt);
            }
        });

        cxQtdRef.setEnabled(false);

        lbQtdRef.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbQtdRef.setText("Quantidade de refeições:");

        cbCeia.setText("Ceia");
        cbCeia.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbCeia.setEnabled(false);
        cbCeia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCeiaActionPerformed(evt);
            }
        });

        cbJanta.setText("Janta");
        cbJanta.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbJanta.setEnabled(false);
        cbJanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJantaActionPerformed(evt);
            }
        });

        cbCafeT.setText("Cafe da tarde");
        cbCafeT.setToolTipText("Marque se o apartamento possui Salao de Festa.");
        cbCafeT.setEnabled(false);
        cbCafeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCafeTActionPerformed(evt);
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

        mItComissao.setText("Ver comissão");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btConcluir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLazer)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbLocal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sLocal))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cbUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cxBairro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbImovel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbContrato)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbLazer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cxArea))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbQuarto))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbBanheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(spBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbPossui, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbMobilia)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbCafeM)
                                                        .addComponent(cbCafeT))
                                                    .addGap(5, 5, 5)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbJanta)
                                                        .addComponent(cbAlmoco)))
                                                .addComponent(lbQtdRef, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addComponent(cbCeia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cxQtdRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(lbRef))
                                    .addGap(38, 38, 38))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(sBotoes, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMobilia))
                    .addComponent(lbQuarto)
                    .addComponent(lbBanheiro)
                    .addComponent(lbPossui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLazer)
                        .addGap(0, 0, 0)
                        .addComponent(cbLazer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbRef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCafeM)
                            .addComponent(cbAlmoco)
                            .addComponent(cbCeia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCafeT)
                            .addComponent(cbJanta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQtdRef, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQtdRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(sBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btConcluir)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addContainerGap())
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
        altPs();
    }//GEN-LAST:event_btConcluirActionPerformed

    private void cbAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAluguelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        editar(false);
        carrDados();
    }//GEN-LAST:event_formWindowActivated

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void cbLazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLazerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLazerActionPerformed

    private void cbCafeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCafeMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCafeMActionPerformed

    private void cbAlmocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlmocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlmocoActionPerformed

    private void cbCeiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCeiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCeiaActionPerformed

    private void cbJantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJantaActionPerformed

    private void cbCafeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCafeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCafeTActionPerformed

    private void mItComissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItComissaoActionPerformed
        comissao();
    }//GEN-LAST:event_mItComissaoActionPerformed

    private void mItParcelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItParcelamentoActionPerformed
        if(p.getContrato().getCompra().getHabilitado() && !(p.getContrato().getOcupado())){
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
            "Tem certeza que deseja excluir esta Pousada?",
            "Exclusao de Imoveis",
            JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            p = new Pousada();
            p.getContrato().setMatricula(entrada);
            p = Banco.getBanco().consPsMatricula(p);
            dispose();
            p = Banco.getBanco().delPs(p);
            if(p == null){
                JOptionPane.showMessageDialog(
                        null,
                        "Pousada excluida com sucesso!",
                        "Exclusao de Imoveis",
                        1
                );
            }else{
                JOptionPane.showMessageDialog(
                    null,
                    "Nao foi possivel excluir esta Pousada!",
                    "Exclusao de Imoveis",
                    0
                );
            }
        }
    }
    public void comissao(){
        p = new Pousada();
        p.getContrato().setMatricula(entrada);
        p = Banco.getBanco().consPsMatricula(p);
        p.calcComissao();
    }
    public void carrDados(){
        p = new Pousada();
        p.getContrato().setMatricula(entrada);
        p = Banco.getBanco().consPsMatricula(p);
        cxMatricula.setText(p.getContrato().getMatricula());
        cxIPTU.setText(String.valueOf(p.getContrato().getImposto()));
        cxNome.setText(p.getContrato().getCorretor().getNome());
        cxTelefone.setText(p.getContrato().getCorretor().getTelefone());
        cbOcupado.setSelected(p.getContrato().getOcupado());
        cbCompra.setSelected(p.getContrato().getCompra().getHabilitado());
        cbAluguel.setSelected(p.getContrato().getAluguel().getHabilitado());
        cbUF.setSelectedIndex(Banco.getBanco().consulIndexUf(p.getLocal().getReg().getUf()));
        cxCEP.setText(p.getLocal().getReg().getCep());
        cxCidade.setText(p.getLocal().getReg().getCidade());
        cxBairro.setText(p.getLocal().getReg().getBairro());
        cxRua.setText(p.getLocal().getRua());
        cxNumero.setText(String.valueOf(p.getLocal().getNumero()));
        cxArea.setText(String.valueOf(p.getArea()));
        spQuarto.setValue(p.getQuarto());
        spBanheiro.setValue(p.getBanheiro());
        cbMobilia.setSelected(p.getMobilia());
        cbLazer.setSelectedIndex(Banco.getBanco().consulIndexLazer(p.getLazer()));
        cbCafeM.setSelected(p.getRef().getCafeM());
        cbAlmoco.setSelected(p.getRef().getAlmoco());
        cbCafeT.setSelected(p.getRef().getCafeT());
        cbJanta.setSelected(p.getRef().getJanta());
        cbCeia.setSelected(p.getRef().getCeia());
        cxQtdRef.setText(String.valueOf(p.getRef().getQtdRef()));
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
        cbLazer.setEnabled(cond);
        cbCafeM.setEnabled(cond);
        cbAlmoco.setEnabled(cond);
        cbCafeT.setEnabled(cond);
        cbJanta.setEnabled(cond);
        cbCeia.setEnabled(cond);
        btConcluir.setEnabled(cond);
    }
    public void altPs(){
        p = new Pousada();
        p.getContrato().setMatricula(entrada);
        p = Banco.getBanco().consPsMatricula(p);
        int somaValida = 0;
        try{
            p.getContrato().setImposto(Double.parseDouble(cxIPTU.getText()));
            somaValida+=1;
        }catch(ZeroNegException zne){
            zne.msgNegativoException("IPTU");
        }catch(NumberFormatException nfe){
            msgNumberFormatException("IPTU");
        }
        p.getContrato().getCorretor().setNome(cxNome.getText());
        if(cxNome.getText().equals(""))
            msgCaixaVazia("Nome do Corretor");
        else
            somaValida+=1;
        p.getContrato().getCorretor().setTelefone(cxTelefone.getText());
        if(cxTelefone.getText().equals(""))
            msgCaixaVazia("Telefone do Corretor");
        else
            somaValida+=1;
        p.getContrato().setOcupado(cbOcupado.isSelected());
        p.getContrato().getCompra().setHabilitado(cbCompra.isSelected());
        p.getContrato().getAluguel().setHabilitado(cbAluguel.isSelected());
        try{
            p.getLocal().getReg().setCep(cxCEP.getText());
            somaValida+=1;
        }catch(CepException cpe){
            cpe.msgCepException("CEP");
        }
        p.getLocal().getReg().setCidade(cxCidade.getText());
        if(cxCidade.getText().equals(""))
            msgCaixaVazia("Cidade");
        else
            somaValida+=1;
        p.getLocal().getReg().setBairro(cxBairro.getText());
        if(cxBairro.getText().equals(""))
            msgCaixaVazia("Bairro");
        else
            somaValida+=1;
        if(cbUF.getSelectedItem().toString().equals("Estado"))
            msgSelectException("UF");
        else{
            p.getLocal().getReg().setUf(cbUF.getSelectedItem().toString());
            somaValida+=1;
        }
        p.getLocal().setRua(cxRua.getText());
        if(cxRua.getText().equals(""))
            msgCaixaVazia("Rua");
        else
            somaValida+=1;
        try{
            p.getLocal().setNumero(Integer.parseInt(cxNumero.getText()));
            somaValida+=1;
        }catch(ZeroNegException zne){
            zne.msgZeroException("Numero");
        }catch(NumberFormatException nfe){
            msgNumberFormatException("Numero");
        }
        try{
            p.setArea(Integer.parseInt(cxArea.getText()));
            somaValida+=1;
        }catch(ZeroNegException zne){
            zne.msgZeroException("Area");
        }catch(NumberFormatException nfe){
            msgNumberFormatException("Area");
        }
        try{
            p.setQuarto((int)spQuarto.getValue());
            somaValida+=1;
        }catch(ZeroNegException zne){
            zne.msgZeroException("Quarto(s)");
        }
        try{
            p.setBanheiro((int)spBanheiro.getValue());
            somaValida+=1;
        }catch(ZeroNegException zne){
            zne.msgZeroException("Banheiro(s)");
        }
        p.setMobilia(cbMobilia.isSelected());
        if(cbLazer.getSelectedItem().toString().equals("Escolha..."))
            msgSelectException("Lazer");
        else{
            p.setLazer(cbLazer.getSelectedItem().toString());
            somaValida+=1;
        }
        p.getRef().setCafeM(cbCafeM.isSelected());
        p.getRef().setAlmoco(cbAlmoco.isSelected());
        p.getRef().setCafeT(cbCafeT.isSelected());
        p.getRef().setJanta(cbJanta.isSelected());
        p.getRef().setCeia(cbCeia.isSelected());
        p.getRef().setQtdRef(p.getRef().calcRef());
        cxQtdRef.setText(String.valueOf(p.getRef().getQtdRef()));
        if(somaValida == 13){
            int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Tem certeza que deseja alterar esta Pousada?",
                    "Alteracao de Imoveis",
                    JOptionPane.YES_NO_OPTION
                );
            if(resp == 0){
                if(p.getContrato().getCompra().getHabilitado())
                    p.getContrato().getCompra().setValor(p.contCompra());
                if(p.getContrato().getAluguel().getHabilitado())
                    p.getContrato().getAluguel().setValor(p.contAluguel());
                p = Banco.getBanco().altPs(p);
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
    private javax.swing.JCheckBox cbAlmoco;
    private javax.swing.JCheckBox cbAluguel;
    private javax.swing.JCheckBox cbCafeM;
    private javax.swing.JCheckBox cbCafeT;
    private javax.swing.JCheckBox cbCeia;
    private javax.swing.JCheckBox cbCompra;
    private javax.swing.JCheckBox cbJanta;
    private javax.swing.JComboBox<String> cbLazer;
    private javax.swing.JCheckBox cbMobilia;
    private javax.swing.JCheckBox cbOcupado;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JTextField cxArea;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCEP;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxIPTU;
    private javax.swing.JTextField cxMatricula;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxQtdRef;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel lbBanheiro;
    private javax.swing.JLabel lbContrato;
    private javax.swing.JLabel lbImovel;
    private javax.swing.JLabel lbLazer;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbPossui;
    private javax.swing.JLabel lbQtdRef;
    private javax.swing.JLabel lbQuarto;
    private javax.swing.JLabel lbRef;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenuItem mItComissao;
    private javax.swing.JMenuItem mItParcelamento;
    private javax.swing.JMenuBar mbExibe;
    private javax.swing.JSeparator sBotoes;
    private javax.swing.JSeparator sContrato;
    private javax.swing.JSeparator sImovel;
    private javax.swing.JSeparator sLocal;
    private javax.swing.JSpinner spBanheiro;
    private javax.swing.JSpinner spQuarto;
    // End of variables declaration//GEN-END:variables
}
