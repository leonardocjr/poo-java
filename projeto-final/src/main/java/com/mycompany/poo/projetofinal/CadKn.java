// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class CadKn extends javax.swing.JFrame {

    public static CadKn ck_unico;
    Kitnet k = new Kitnet();
    
    private CadKn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static CadKn getCadKn(){
        if(ck_unico == null)
            ck_unico = new CadKn();
        return ck_unico;
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
        cbCompartilhada = new javax.swing.JCheckBox();
        lbMoradores = new javax.swing.JLabel();
        spMoradores = new javax.swing.JSpinner();
        sBotoes = new javax.swing.JSeparator();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Kitnet");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro de Kitnet");
        lbTitulo.setToolTipText("");

        lbContrato.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        lbContrato.setText("CONTRATO");

        cxMatricula.setBackground(new java.awt.Color(214, 217, 223));
        cxMatricula.setToolTipText("Insira a matrícula do imóvel.");
        cxMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrícula do Imóvel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMatriculaActionPerformed(evt);
            }
        });

        cxIPTU.setBackground(new java.awt.Color(214, 217, 223));
        cxIPTU.setToolTipText("Insira o valor do IPTU.");
        cxIPTU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPTU (em R$)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxIPTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIPTUActionPerformed(evt);
            }
        });

        cxNome.setBackground(new java.awt.Color(214, 217, 223));
        cxNome.setToolTipText("Insira a nome do corretor.");
        cxNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Corretor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        cxTelefone.setBackground(new java.awt.Color(214, 217, 223));
        cxTelefone.setToolTipText("Insira o telefone do corretor.");
        cxTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone do Corretor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneActionPerformed(evt);
            }
        });

        cbOcupado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbOcupado.setText("Ocupado");
        cbOcupado.setToolTipText("Marque se o imovel ja estiver ocupado.");

        cbCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCompra.setSelected(true);
        cbCompra.setText("Habilita compra");
        cbCompra.setToolTipText("Marque se o imovel habilita a compra.");
        cbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompraActionPerformed(evt);
            }
        });

        cbAluguel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAluguel.setSelected(true);
        cbAluguel.setText("Habilita aluguel");
        cbAluguel.setToolTipText("Marque se o imovel habilita o aluguel.");
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
        cxCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCEPActionPerformed(evt);
            }
        });

        cxCidade.setBackground(new java.awt.Color(214, 217, 223));
        cxCidade.setToolTipText("Digite a cidade do Imove.");
        cxCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeActionPerformed(evt);
            }
        });

        cxBairro.setBackground(new java.awt.Color(214, 217, 223));
        cxBairro.setToolTipText("Digite o bairro do Imovel.");
        cxBairro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBairroActionPerformed(evt);
            }
        });

        cbUF.setBackground(new java.awt.Color(214, 217, 223));
        cbUF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        cxRua.setBackground(new java.awt.Color(214, 217, 223));
        cxRua.setToolTipText("Digite a rua do Imovel.");
        cxRua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        cxNumero.setBackground(new java.awt.Color(214, 217, 223));
        cxNumero.setToolTipText("Digite o numero do Imovel.");
        cxNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lbImovel.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        lbImovel.setText("IMOVEL");

        cxArea.setBackground(new java.awt.Color(214, 217, 223));
        cxArea.setToolTipText("Digire a area em m2.");
        cxArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Área (em m2)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAreaActionPerformed(evt);
            }
        });

        lbQuarto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbQuarto.setText("Quarto(s):");

        spQuarto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spQuarto.setToolTipText("Digite a quantidade de quartos do imovel.");

        lbBanheiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbBanheiro.setText("Banheiro(s):");

        spBanheiro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spBanheiro.setToolTipText("Digite a quantidade de banheiros do imovel.");

        lbPossui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPossui.setText("Possui:");

        cbMobilia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMobilia.setText("Mobilia");
        cbMobilia.setToolTipText("Marque se o apartamento possui Salao de Festa.");

        cbCompartilhada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCompartilhada.setText("Compartilhada");
        cbCompartilhada.setToolTipText("Marque se o apartamento possui academia.");
        cbCompartilhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompartilhadaActionPerformed(evt);
            }
        });

        lbMoradores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMoradores.setText("Morador(es):");

        spMoradores.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spMoradores.setToolTipText("Digite a quantidade de quartos do imovel.");
        spMoradores.setEnabled(false);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Clique para voltar ao menu.");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("Clique para limpar os valores.");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btConcluir.setText("Concluir");
        btConcluir.setToolTipText("Clique para concluir o cadastro do imovel.");
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btConcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(sContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCompartilhada))
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
                            .addComponent(spMoradores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMoradores))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMobilia))
                            .addComponent(lbQuarto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMoradores)
                            .addComponent(cbCompartilhada))
                        .addGap(2, 2, 2)
                        .addComponent(spMoradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbBanheiro)
                        .addComponent(lbPossui)))
                .addGap(15, 15, 15)
                .addComponent(sBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btConcluir)
                    .addComponent(btLimpar))
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

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        limpar();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        cadKn();
    }//GEN-LAST:event_btConcluirActionPerformed

    private void cbAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAluguelActionPerformed

    private void cbCompartilhadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompartilhadaActionPerformed
        if(cbCompartilhada.isSelected())
            spMoradores.setEnabled(true);
        else
            spMoradores.setEnabled(false);
    }//GEN-LAST:event_cbCompartilhadaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(cbCompartilhada.isSelected())
            spMoradores.setEnabled(true);
        else
            spMoradores.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated
    public void cadKn(){
        Apartamento a = new Apartamento();
        a.getContrato().setMatricula(cxMatricula.getText());
        Casa c = new Casa();
        c.getContrato().setMatricula(cxMatricula.getText());
        Kitnet k = new Kitnet();
        k.getContrato().setMatricula(cxMatricula.getText());
        Pousada p = new Pousada();
        p.getContrato().setMatricula(cxMatricula.getText());
        if(Banco.getBanco().consApMatricula(a)==null && Banco.getBanco().consCsMatricula(c)==null && Banco.getBanco().consKnMatricula(k)==null && Banco.getBanco().consPsMatricula(p)==null){
            int somaValida = 0;
            boolean verifValida = false;
            if(cxMatricula.getText().equals(""))
                msgCaixaVazia("Matricula");
            else
                somaValida+=1;
            try{
                k.getContrato().setImposto(Double.parseDouble(cxIPTU.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgNegativoException("IPTU");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("IPTU");
            }
            k.getContrato().getCorretor().setNome(cxNome.getText());
            if(cxNome.getText().equals(""))
                msgCaixaVazia("Nome do Corretor");
            else
                somaValida+=1;
            k.getContrato().getCorretor().setTelefone(cxTelefone.getText());
            if(cxTelefone.getText().equals(""))
                msgCaixaVazia("Telefone do Corretor");
            else
                somaValida+=1;
            k.getContrato().setOcupado(cbOcupado.isSelected());
            k.getContrato().getCompra().setHabilitado(cbCompra.isSelected());
            k.getContrato().getAluguel().setHabilitado(cbAluguel.isSelected());
            try{
                k.getLocal().getReg().setCep(cxCEP.getText());
                somaValida+=1;
            }catch(CepException cpe){
                cpe.msgCepException("CEP");
            }
            k.getLocal().getReg().setCidade(cxCidade.getText());
            if(cxCidade.getText().equals(""))
                msgCaixaVazia("Cidade");
            else
                somaValida+=1;
            k.getLocal().getReg().setBairro(cxBairro.getText());
            if(cxBairro.getText().equals(""))
                msgCaixaVazia("Bairro");
            else
                somaValida+=1;
            if(cbUF.getSelectedItem().toString().equals("Estado"))
                msgSelectException("UF");
            else{
                k.getLocal().getReg().setUf(cbUF.getSelectedItem().toString());
                somaValida+=1;
            }
            k.getLocal().setRua(cxRua.getText());
            if(cxRua.getText().equals(""))
                msgCaixaVazia("Rua");
            else
                somaValida+=1;
            try{
                k.getLocal().setNumero(Integer.parseInt(cxNumero.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Numero");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("Numero");
            }
            try{
                k.setArea(Integer.parseInt(cxArea.getText()));
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Area");
            }catch(NumberFormatException nfe){
                msgNumberFormatException("Area");
            }
            try{
                k.setQuarto((int)spQuarto.getValue());
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Quarto(s)");
            }
            try{
                k.setBanheiro((int)spBanheiro.getValue());
                somaValida+=1;
            }catch(ZeroNegException zne){
                zne.msgZeroException("Banheiro(s)");
            }
            k.setMobilia(cbMobilia.isSelected());
            k.setCompartilhada(cbCompartilhada.isSelected());
            if(cbCompartilhada.isSelected()){
                verifValida = true;
                try{
                    k.setMoradores((int)spMoradores.getValue());
                    somaValida+=1;
                }catch(MoradoresGrdException mge){
                    mge.msgMoradoresGrdException("Moradores");
                }catch(MoradoresPeqException mpe){
                    mpe.msgMoradoresPeqException("Moradores");
                }catch(NumberFormatException nfe){
                    msgNumberFormatException("Moradores");
                }
            }
            if(somaValida == 14 || (somaValida == 13 && verifValida == false)){
                if(k.getContrato().getCompra().getHabilitado())
                    k.getContrato().getCompra().setValor(k.contCompra());
                if(k.getContrato().getAluguel().getHabilitado())
                    k.getContrato().getAluguel().setValor(k.contAluguel());
                k = Banco.getBanco().cadKn(k);
                int resp = JOptionPane.showConfirmDialog(
                        null,
                        "Kitnet cadastrada com SUCESSO!\n\nDeseja continuar?",
                        "Cadastro de Imoveis",
                        JOptionPane.YES_NO_OPTION
                    );
                limpar();
                if(resp == 1)
                    dispose();
            }
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "Esta Matricula já existe em outro Imovel.",
                    "Cadastro de Imoveis",
                    0
            );
        }
    }
    public void limpar(){
		cxMatricula.setText("");
                cxIPTU.setText("");
                cxNome.setText("");
                cxTelefone.setText("");
                cbOcupado.setSelected(false);
                cbCompra.setSelected(true);
                cbAluguel.setSelected(true);
                cxCEP.setText("");
                cxCidade.setText("");
                cxBairro.setText("");
                cbUF.setSelectedIndex(0);
                cxRua.setText("");
                cxNumero.setText("");
                cxArea.setText("");
                spQuarto.setValue(0);
                spBanheiro.setValue(0);
                cbMobilia.setSelected(false);
                cbCompartilhada.setSelected(false);
                spMoradores.setValue(0);
		cxMatricula.requestFocus();
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
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox cbAluguel;
    private javax.swing.JCheckBox cbCompartilhada;
    private javax.swing.JCheckBox cbCompra;
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
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel lbBanheiro;
    private javax.swing.JLabel lbContrato;
    private javax.swing.JLabel lbImovel;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbMoradores;
    private javax.swing.JLabel lbPossui;
    private javax.swing.JLabel lbQuarto;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator sBotoes;
    private javax.swing.JSeparator sContrato;
    private javax.swing.JSeparator sImovel;
    private javax.swing.JSeparator sLocal;
    private javax.swing.JSpinner spBanheiro;
    private javax.swing.JSpinner spMoradores;
    private javax.swing.JSpinner spQuarto;
    // End of variables declaration//GEN-END:variables
}
