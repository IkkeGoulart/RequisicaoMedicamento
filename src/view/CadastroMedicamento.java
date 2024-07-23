/*
package view;

import DAO.MedicamentoDAO;
import DTO.UsuarioDTO;
import Controller.Lista;
import model.Medicamento;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroMedicamento extends javax.swing.JFrame {

    private UsuarioDTO usuario;
    private DefaultTableModel model;

    public CadastroMedicamento(UsuarioDTO usuarioObj) {
        this.usuario = usuarioObj;
        initComponents();
        model = (DefaultTableModel) tblEstoque.getModel();
        atualizarTabelaMedicamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        editar = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblCadastrarMed = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblUnidades = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        lblTermolabil = new javax.swing.JLabel();
        cbTermolabilSim = new javax.swing.JCheckBox();
        cbTermolabilNao = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        lblVoltar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(editar);

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setSize(new java.awt.Dimension(500, 300));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(30, 30, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 0));

        lblCadastrarMed.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblCadastrarMed.setText("Cadastrar Medicamento");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNome.setNextFocusableComponent(txtLote);

        lblLote.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLote.setText("Lote:");

        txtLote.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtLote.setNextFocusableComponent(txtQuantidade);

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQuantidade.setText("Quantidade na caixa:");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtQuantidade.setNextFocusableComponent(btnCadastrar);

        lblUnidades.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblUnidades.setText("Unidades:");

        txtUnidades.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblTermolabil.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTermolabil.setText("termolábil:");

        cbTermolabilSim.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbTermolabilSim.setText("Sim");

        cbTermolabilNao.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbTermolabilNao.setText("Não");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblVoltar.setBackground(new java.awt.Color(204, 0, 51));
        lblVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(0, 153, 0));
        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLote, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtLote))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUnidades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnidades))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome)))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTermolabil)
                        .addGap(71, 71, 71)
                        .addComponent(cbTermolabilSim)
                        .addGap(51, 51, 51)
                        .addComponent(cbTermolabilNao)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrarMed)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar)
                .addGap(46, 46, 46)
                .addComponent(lblCadastrarMed)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidades)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermolabil)
                    .addComponent(cbTermolabilSim)
                    .addComponent(cbTermolabilNao))
                .addGap(35, 35, 35)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 380));

        tblEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Lote", "QtdCaixa", "Unidades", "Termolabil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblEstoque);
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblEstoque.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Estoque");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pesquisar:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Separar Lote", "Termolábil" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!(txtLote.getText().isEmpty()
                || txtNome.getText().isEmpty()
                || txtQuantidade.getText().isEmpty()
                || txtUnidades.getText().isEmpty()
                || (!cbTermolabilSim.isSelected() && !cbTermolabilNao.isSelected()))) {
            String nome = txtNome.getText();
            String lote = txtLote.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            int unidades = Integer.parseInt(txtUnidades.getText());
            boolean termolabil = cbTermolabilSim.isSelected();
            Medicamento med = new Medicamento(nome, quantidade, lote, termolabil, unidades);

            try {
                //adicionando o medicamento cadastro ao banco de dados
                new MedicamentoDAO().adicionar(med);
                //resetando os campos
                txtNome.setText("");
                txtQuantidade.setText("");
                txtLote.setText("");
                txtUnidades.setText("");
                cbTermolabilSim.setSelected(false);
                cbTermolabilNao.setSelected(false);
                JOptionPane.showMessageDialog(null, "Medicamento adicionado ao estoque");

                //atualizando a tabela de estoque
                atualizarTabelaMedicamentos();

            } catch (SQLException ex) {
                Logger.getLogger(CadastroMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todosos campos antes de apertar o botão de adicionar");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        voltar();
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void tblEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && tblEstoque.getSelectedRowCount() != 0) {
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tblEstoqueMouseReleased

    //EXCLUIR MEDICAMENTO DO ESTOQUE//
    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        int linha = tblEstoque.getSelectedRow();
        if (linha != -1) { //Quando nenhuma linha é selecionada, o método retorna -1
            String lote = tblEstoque.getValueAt(linha, 1).toString();
            try {
                new MedicamentoDAO().excluir(lote);
                JOptionPane.showMessageDialog(null, "Medicamento excluído do estoque");
                atualizarTabelaMedicamentos();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

    }//GEN-LAST:event_editarActionPerformed

    //TODO: resolver isso quando recriar telas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            voltar();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        atualizarTabelaMedicamentos();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        String buscaDigitada = jTextField1.getText();
        buscar(buscaDigitada);
    }//GEN-LAST:event_jTextField1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox cbTermolabilNao;
    private javax.swing.JCheckBox cbTermolabilSim;
    private javax.swing.JMenuItem editar;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCadastrarMed;
    private javax.swing.JLabel lblLote;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTermolabil;
    private javax.swing.JLabel lblUnidades;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabelaMedicamentos() {
        try {
            String filtro = jComboBox1.getSelectedItem().toString();
            model = (DefaultTableModel) tblEstoque.getModel();
            model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

            // Obtém a lista de medicamentos do banco de dados
            Lista listaMedicamentos = new MedicamentoDAO().listarEstoque();

            switch (filtro) {
                case "Padrão" -> {
                    for (Medicamento med : listaMedicamentos.getRequisicao()) {
                        Object[] rowData = {med.getNome(), med.getLote(), med.getQuantidadeCaixa(), med.getQuantidadeEstoque(), med.isTermolabil()};
                        model.addRow(rowData);
                    }
                }
                case "Termolábil" -> {
                    for (Medicamento med : listaMedicamentos.getRequisicao()) {
                        if (med.isTermolabil()) {
                            Object[] row = {med.getNome(), med.getLote(), med.getQuantidadeCaixa(), med.getQuantidadeEstoque(), med.isTermolabil()};
                            model.addRow(row);
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
    private void buscar(String busca){
        TableRowSorter<DefaultTableModel> buscador = new TableRowSorter<>(model);
        tblEstoque.setRowSorter(buscador);
        //(?i) ignora a diferença entre letras maiúsculas e minúsculas
        buscador.setRowFilter(RowFilter.regexFilter(("(?i)") + busca));
        if(busca.length() == 0){
            buscador.setRowFilter(null);
        }
    }

    private void voltar() {
        dispose();
        Farmacia telaF = new Farmacia(usuario);
        telaF.show();
    }
}
*/