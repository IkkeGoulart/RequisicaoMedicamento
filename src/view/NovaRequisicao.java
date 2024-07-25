package view;

import Controller.MedicamentoController;
import Controller.PedidoController;
import Controller.PedidoMedicamentoController;
import Controller.TabelaMedicamentosController;
import DTO.UsuarioDTO;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class NovaRequisicao extends javax.swing.JFrame {

    private final UsuarioDTO usuario;
    private final PedidoController pedController;
    private final MedicamentoController medController;
    private final PedidoMedicamentoController pedMedController;
    private final TabelaMedicamentosController tabelaController;

    public NovaRequisicao(UsuarioDTO usuarioObj) {
        this.usuario = usuarioObj;
        this.pedController = new PedidoController();
        this.medController = new MedicamentoController();
        this.pedMedController = new PedidoMedicamentoController();
        initComponents();
        this.tabelaController = new TabelaMedicamentosController(tblEstoque);
        this.pedController.verificarPedidoEdicao(this.usuario.getId()); //Verifica se há um pedido em edição; cria um se não tiver
        tabelaController.atualizarTabela(this.usuario.getId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuQtd = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblCadastrarMed = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblVoltar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        menuQtd.setText("Editar quantidade");
        menuQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQtdActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuQtd);

        menuExcluir.setText("Excluir");
        menuExcluir.setToolTipText("");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(30, 30, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 0));

        lblCadastrarMed.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblCadastrarMed.setText("Inserir Medicamento");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblLote.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLote.setText("Lote:");

        txtLote.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQuantidade.setText("Quantidade Pedida:");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCadastrar.setText("Add à lista");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblVoltar.setBackground(new java.awt.Color(204, 0, 51));
        lblVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(0, 153, 0));
        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/setaEsquerda.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLote, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtLote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome)))
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnCadastrar)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCadastrarMed)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addGap(30, 30, 30)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 380));

        tblEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Lote", "Qtd", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.getTableHeader().setReorderingAllowed(false);
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
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Requisição");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
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
        if (!(txtNome.getText().isEmpty()
                || txtLote.getText().isEmpty()
                || txtQuantidade.getText().isEmpty())) {
            String nome = txtNome.getText();
            String lote = txtLote.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());

            int idPedido = this.pedController.getIdPedidoEdicao(this.usuario.getId());

            int idMedicamento = this.medController.buscarIdPorNomeELote(nome, lote);

            this.pedMedController.adicionar(idPedido, idMedicamento, quantidade);

            tabelaController.atualizarTabela(this.usuario.getId());

            txtNome.setText("");
            txtLote.setText("");
            txtQuantidade.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
//        voltar();
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void tblEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && tblEstoque.getSelectedRowCount() != 0) {
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tblEstoqueMouseReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        String buscaDigitada = jTextField1.getText();
        tabelaController.buscar(buscaDigitada, this.tblEstoque);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tblEstoque.getRowCount() == 0) {
            int idPedido = this.pedController.getIdPedidoEdicao(this.usuario.getId());
            pedController.enviar(idPedido);
            this.pedController.verificarPedidoEdicao(this.usuario.getId());
            tabelaController.atualizarTabela(this.usuario.getId());
        } else {
            JOptionPane.showMessageDialog(null, "Adicione medicamentos à lista antes de enviar!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        int linha = tblEstoque.getSelectedRow();

        if (linha != -1) {
            String nome = tblEstoque.getValueAt(linha, 0).toString();
            String lote = tblEstoque.getValueAt(linha, 1).toString();

            int idMedicamento = this.medController.buscarIdPorNomeELote(nome, lote);
            int idPedido = this.pedController.getIdPedidoEdicao(this.usuario.getId());

            this.pedMedController.excluir(idMedicamento, idPedido);
            tabelaController.atualizarTabela(this.usuario.getId());
        }
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQtdActionPerformed
        int linha = tblEstoque.getSelectedRow();

        if (linha != -1) {
            String nome = tblEstoque.getValueAt(linha, 0).toString();
            String lote = tblEstoque.getValueAt(linha, 1).toString();

            int idMedicamento = this.medController.buscarIdPorNomeELote(nome, lote);
            int idPedido = this.pedController.getIdPedidoEdicao(this.usuario.getId());

            this.pedMedController.editarQuantidade(idMedicamento, idPedido);
            tabelaController.atualizarTabela(this.usuario.getId());
        }
    }//GEN-LAST:event_menuQtdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuQtd;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
