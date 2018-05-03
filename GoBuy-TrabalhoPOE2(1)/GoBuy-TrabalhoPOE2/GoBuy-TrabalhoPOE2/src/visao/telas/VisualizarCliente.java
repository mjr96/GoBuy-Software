/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.telas;

import controlador.CCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Cliente;
import relatorios.RPCliente;
import relatorios.RPFornecedor;
import relatorios.RPFuncionario;
import relatorios.RPProduto;

/**
 *
 * @author Junior
 */
public class VisualizarCliente extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarCliente
     */
    public VisualizarCliente() {
        initComponents();
         CCliente cCliente = new CCliente();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        if((listaClientes = cCliente.visualizarClientes()) != null)
        {
                //criando um modelo para a JTable
            DefaultTableModel modelo = (DefaultTableModel) tabelaDados.getModel();
            for(Cliente cliente : listaClientes)
            {
                Object[] dados = {cliente.getId(),cliente.getNomeCliente(), cliente.getCpf(), cliente.getEndereco(), cliente.getTelefone(), cliente.getTipoPessoa(), cliente.getFormaPagamento(),
                     cliente.getObservacao()};
                modelo.addRow(dados);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        botaoFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Endereço", "telefone", "TipoPessoa", "FormaPagamento", "Observacoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDados);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Clientes cadastrados");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botaoFechar)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarCliente;
    private javax.swing.JMenuItem alterarFornecedor;
    private javax.swing.JMenuItem alterarFuncionario;
    private javax.swing.JMenuItem alterarrProduto;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarFornecedor;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarProduto;
    private javax.swing.JMenuItem deletarCliente;
    private javax.swing.JMenuItem deletarFornecedor;
    private javax.swing.JMenuItem deletarFuncionario;
    private javax.swing.JMenuItem deletarrProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuFornecedor;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu relatorio;
    private javax.swing.JMenuItem relatorioCliente;
    private javax.swing.JMenuItem relatorioFornecedor;
    private javax.swing.JMenuItem relatorioFuncionario;
    private javax.swing.JMenuItem relatorioProduto;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JMenu transacoes;
    private javax.swing.JMenuItem visualizarCliente;
    private javax.swing.JMenuItem visualizarFornecedor;
    private javax.swing.JMenuItem visualizarFuncionarios;
    private javax.swing.JMenuItem vizualizarrProduto;
    // End of variables declaration//GEN-END:variables
}
