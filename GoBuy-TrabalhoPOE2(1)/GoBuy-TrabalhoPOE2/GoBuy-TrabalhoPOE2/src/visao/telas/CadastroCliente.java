/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.telas;

import controlador.CCliente;
import javax.swing.JOptionPane;
import modelo.dominio.Cliente;
import relatorios.RPCliente;
import relatorios.RPFornecedor;
import relatorios.RPFuncionario;
import relatorios.RPProduto;

/**
 *
 * @author IFTM
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoCliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pagamentoVista = new javax.swing.JCheckBox();
        pagamentoCartao = new javax.swing.JCheckBox();
        pagamentoBoleto = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        radioFisica = new javax.swing.JRadioButton();
        radioJuridica = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        transacoes = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        visualizarCliente = new javax.swing.JMenuItem();
        alterarCliente = new javax.swing.JMenuItem();
        deletarCliente = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenu();
        cadastrarFornecedor = new javax.swing.JMenuItem();
        visualizarFornecedor = new javax.swing.JMenuItem();
        alterarFornecedor = new javax.swing.JMenuItem();
        deletarFornecedor = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenu();
        cadastrarFuncionario = new javax.swing.JMenuItem();
        visualizarFuncionarios = new javax.swing.JMenuItem();
        alterarFuncionario = new javax.swing.JMenuItem();
        deletarFuncionario = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        cadastrarProduto = new javax.swing.JMenuItem();
        vizualizarrProduto = new javax.swing.JMenuItem();
        alterarrProduto = new javax.swing.JMenuItem();
        deletarrProduto = new javax.swing.JMenuItem();
        relatorio = new javax.swing.JMenu();
        relatorioCliente = new javax.swing.JMenuItem();
        relatorioFornecedor = new javax.swing.JMenuItem();
        relatorioFuncionario = new javax.swing.JMenuItem();
        relatorioProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Telefone:");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Formas de pagamento");

        pagamentoVista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagamentoVista.setText("Vista");

        pagamentoCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagamentoCartao.setText("Cartão Credito");

        pagamentoBoleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagamentoBoleto.setText("Boleto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagamentoCartao)
                    .addComponent(pagamentoVista)
                    .addComponent(pagamentoBoleto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(pagamentoVista)
                .addGap(8, 8, 8)
                .addComponent(pagamentoCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagamentoBoleto)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Tipo:");

        tipoCliente.add(radioFisica);
        radioFisica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioFisica.setText("Fisica");

        tipoCliente.add(radioJuridica);
        radioJuridica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioJuridica.setText("Juridica");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(radioFisica)
                .addGap(18, 18, 18)
                .addComponent(radioJuridica)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioFisica)
                    .addComponent(radioJuridica)))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Observações complementares:");

        campoObservacao.setColumns(20);
        campoObservacao.setRows(5);
        jScrollPane1.setViewportView(campoObservacao);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(50, 50, 50)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campoEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(campoCpf))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(campoEndereco))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCancelar))
                .addGap(42, 42, 42))
        );

        transacoes.setText("Transações");

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });

        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(cadastrarCliente);

        visualizarCliente.setText("Visualizar");
        visualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(visualizarCliente);

        alterarCliente.setText("Alterar");
        alterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(alterarCliente);

        deletarCliente.setText("Deletar");
        deletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(deletarCliente);

        transacoes.add(menuCliente);

        menuFornecedor.setText("Fornecedor");

        cadastrarFornecedor.setText("Cadastrar");
        cadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFornecedorActionPerformed(evt);
            }
        });
        menuFornecedor.add(cadastrarFornecedor);

        visualizarFornecedor.setText("Visualizar");
        visualizarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarFornecedorActionPerformed(evt);
            }
        });
        menuFornecedor.add(visualizarFornecedor);

        alterarFornecedor.setText("Alterar");
        alterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFornecedorActionPerformed(evt);
            }
        });
        menuFornecedor.add(alterarFornecedor);

        deletarFornecedor.setText("Deletar");
        deletarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarFornecedorActionPerformed(evt);
            }
        });
        menuFornecedor.add(deletarFornecedor);

        transacoes.add(menuFornecedor);

        menuFuncionario.setText("Funcionario");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });

        cadastrarFuncionario.setText("Cadastrar");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(cadastrarFuncionario);

        visualizarFuncionarios.setText("Visualizar");
        visualizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionario.add(visualizarFuncionarios);

        alterarFuncionario.setText("Alterar");
        alterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(alterarFuncionario);

        deletarFuncionario.setText("Deletar");
        deletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(deletarFuncionario);

        transacoes.add(menuFuncionario);

        menuProduto.setText("Produtos");

        cadastrarProduto.setText("Cadastrar");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(cadastrarProduto);

        vizualizarrProduto.setText("Visualizar");
        vizualizarrProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vizualizarrProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(vizualizarrProduto);

        alterarrProduto.setText("Alterar");
        alterarrProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarrProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(alterarrProduto);

        deletarrProduto.setText("Deletar");
        deletarrProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarrProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(deletarrProduto);

        transacoes.add(menuProduto);

        jMenuBar1.add(transacoes);

        relatorio.setText("Relatorios");

        relatorioCliente.setText("Relatorio de clientes");
        relatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioClienteActionPerformed(evt);
            }
        });
        relatorio.add(relatorioCliente);

        relatorioFornecedor.setText("Relatorio de fornecedores");
        relatorioFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioFornecedorActionPerformed(evt);
            }
        });
        relatorio.add(relatorioFornecedor);

        relatorioFuncionario.setText("Relatorio de funcionarios");
        relatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioFuncionarioActionPerformed(evt);
            }
        });
        relatorio.add(relatorioFuncionario);

        relatorioProduto.setText("Realatorio de produtos");
        relatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioProdutoActionPerformed(evt);
            }
        });
        relatorio.add(relatorioProduto);

        jMenuBar1.add(relatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        //CCliente condicao = new CCliente();
      
               
        
        String auxPerecivel;

        if (radioFisica.isSelected()) {
            auxPerecivel = "Pessoa Fisica";

        } else {
            auxPerecivel = "Pessoa Juridica";
        }
        
        String pagamento = "";
            if (pagamentoVista.isSelected())
            {
                if (pagamento.length() ==0 )
                {
                    pagamento = pagamento + "Pagamento a vista";
                } else
                {
                    pagamento = pagamento + ",Pagamento a vista";
                }
            }
            if (pagamentoCartao.isSelected())
            {
                if (pagamento.length() ==0 )
                {
                    pagamento = pagamento + "Pagamento por cartao";
                } else
                {
                    pagamento = pagamento + ",Pagamento por cartao";
                }
            }
            if (pagamentoBoleto.isSelected())
            {
                if (pagamento.length() ==0 )
                {
                    pagamento = pagamento + "Pagamento por boleto";
                } else
                {
                    pagamento = pagamento + ",Pagamento por boleto";
                }
            }
            
            pagamento = pagamento + ".";
            
       
        

        Cliente cliente = new Cliente(campoNome.getText(),campoEndereco.getText(), campoCpf.getText(), 
                campoTelefone.getText(), auxPerecivel, pagamento, campoObservacao.getText());
        //condicao.VCampoNulo(campoNome.toString());
        if (new CCliente().cadastrarCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Registro cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar registr! Tente novamente.");
        }
        botaoLimparActionPerformed(evt);

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        campoCpf.setText("");
        campoEndereco.setText("");
        campoTelefone.setText("");
        campoObservacao.setText("");



    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        new Menu().setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        new CadastroCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void visualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarClienteActionPerformed
        new VisualizarCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_visualizarClienteActionPerformed

    private void alterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarClienteActionPerformed
        new AlterarCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_alterarClienteActionPerformed

    private void deletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarClienteActionPerformed
        new DeletarCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_deletarClienteActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed

    }//GEN-LAST:event_menuClienteActionPerformed

    private void cadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFornecedorActionPerformed
        new CadastroFornecedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarFornecedorActionPerformed

    private void visualizarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarFornecedorActionPerformed
        new VisualizarFornecedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_visualizarFornecedorActionPerformed

    private void alterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFornecedorActionPerformed
        new AlterarFornecedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_alterarFornecedorActionPerformed

    private void deletarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarFornecedorActionPerformed
        new DeletarFornecedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_deletarFornecedorActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        new CadastroFuncionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void visualizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarFuncionariosActionPerformed
        new VisualizarFuncionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_visualizarFuncionariosActionPerformed

    private void alterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFuncionarioActionPerformed
        new AlterarFuncionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_alterarFuncionarioActionPerformed

    private void deletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarFuncionarioActionPerformed
        new DeletarFuncionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_deletarFuncionarioActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed

    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        new CadastroProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void vizualizarrProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vizualizarrProdutoActionPerformed
        new VisualizarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_vizualizarrProdutoActionPerformed

    private void alterarrProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarrProdutoActionPerformed
        new AlterarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_alterarrProdutoActionPerformed

    private void deletarrProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarrProdutoActionPerformed
        new DeletarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_deletarrProdutoActionPerformed

    private void relatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioClienteActionPerformed
        RPCliente relatorioGeralCliente = new RPCliente();
        relatorioGeralCliente.gerarRelatorioTotal("E:\\GoBuy-TrabalhoPOE2\\GoBuy-TrabalhoPOE2\\src\\relatorios\\RelatorioCliente.jasper");
    }//GEN-LAST:event_relatorioClienteActionPerformed

    private void relatorioFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioFornecedorActionPerformed
        RPFornecedor relatorioGeralFornecedor = new RPFornecedor();
        relatorioGeralFornecedor.gerarRelatorioTotal("E:\\GoBuy-TrabalhoPOE2\\GoBuy-TrabalhoPOE2\\src\\relatorios\\RelatorioFornecedor.jasper");

    }//GEN-LAST:event_relatorioFornecedorActionPerformed

    private void relatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioFuncionarioActionPerformed
        RPFuncionario relatorioGeralFuncionario = new RPFuncionario();
        relatorioGeralFuncionario.gerarRelatorioTotal("E:\\GoBuy-TrabalhoPOE2\\GoBuy-TrabalhoPOE2\\src\\relatorios\\RelatorioFuncionario.jasper");
    }//GEN-LAST:event_relatorioFuncionarioActionPerformed

    private void relatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioProdutoActionPerformed
        RPProduto relatorioGeralProduto = new RPProduto();
        relatorioGeralProduto.gerarRelatorioTotal("E:\\GoBuy-TrabalhoPOE2\\GoBuy-TrabalhoPOE2\\src\\relatorios\\RelatorioProduto.jasper");
    }//GEN-LAST:event_relatorioProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarCliente;
    private javax.swing.JMenuItem alterarFornecedor;
    private javax.swing.JMenuItem alterarFuncionario;
    private javax.swing.JMenuItem alterarrProduto;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarFornecedor;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarProduto;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JMenuItem deletarCliente;
    private javax.swing.JMenuItem deletarFornecedor;
    private javax.swing.JMenuItem deletarFuncionario;
    private javax.swing.JMenuItem deletarrProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuFornecedor;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JCheckBox pagamentoBoleto;
    private javax.swing.JCheckBox pagamentoCartao;
    private javax.swing.JCheckBox pagamentoVista;
    private javax.swing.JRadioButton radioFisica;
    private javax.swing.JRadioButton radioJuridica;
    private javax.swing.JMenu relatorio;
    private javax.swing.JMenuItem relatorioCliente;
    private javax.swing.JMenuItem relatorioFornecedor;
    private javax.swing.JMenuItem relatorioFuncionario;
    private javax.swing.JMenuItem relatorioProduto;
    private javax.swing.ButtonGroup tipoCliente;
    private javax.swing.JMenu transacoes;
    private javax.swing.JMenuItem visualizarCliente;
    private javax.swing.JMenuItem visualizarFornecedor;
    private javax.swing.JMenuItem visualizarFuncionarios;
    private javax.swing.JMenuItem vizualizarrProduto;
    // End of variables declaration//GEN-END:variables
}
