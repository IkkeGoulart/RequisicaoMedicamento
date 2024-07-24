package view;

import DTO.UsuarioDTO;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;

public class Prefeitura extends javax.swing.JFrame {

    private UsuarioDTO usuario;

    public Prefeitura(UsuarioDTO usuarioObj) {
        this.usuario = usuarioObj;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelReq = new javax.swing.JPanel();
        textForm = new javax.swing.JLabel();
        imgForm = new javax.swing.JLabel();
        PanelVerificar = new javax.swing.JPanel();
        textVerificar = new javax.swing.JLabel();
        imgVerificar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        PanelReq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelReq.setPreferredSize(new java.awt.Dimension(176, 179));
        PanelReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelReqMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PanelReqMouseReleased(evt);
            }
        });

        textForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textForm.setText("Criar Requisição");

        imgForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/formulario.png"))); // NOI18N

        javax.swing.GroupLayout PanelReqLayout = new javax.swing.GroupLayout(PanelReq);
        PanelReq.setLayout(PanelReqLayout);
        PanelReqLayout.setHorizontalGroup(
            PanelReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReqLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(imgForm)
                .addGap(31, 31, 31))
        );
        PanelReqLayout.setVerticalGroup(
            PanelReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReqLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imgForm)
                .addGap(30, 30, 30)
                .addComponent(textForm)
                .addContainerGap())
        );

        PanelVerificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelVerificar.setPreferredSize(new java.awt.Dimension(176, 179));
        PanelVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelVerificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PanelVerificarMouseReleased(evt);
            }
        });

        textVerificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textVerificar.setText("Visualizar Requisição");

        imgVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N

        javax.swing.GroupLayout PanelVerificarLayout = new javax.swing.GroupLayout(PanelVerificar);
        PanelVerificar.setLayout(PanelVerificarLayout);
        PanelVerificarLayout.setHorizontalGroup(
            PanelVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerificarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(imgVerificar)
                .addGap(36, 36, 36))
        );
        PanelVerificarLayout.setVerticalGroup(
            PanelVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerificarLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(imgVerificar)
                .addGap(30, 30, 30)
                .addComponent(textVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(186, 100));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_coordenadoria_saude_rs.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(0, 344, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(166, 66));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user (1).png"))); // NOI18N

        textNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textNome.setForeground(new java.awt.Color(102, 255, 0));
        textNome.setText(usuario.getUsuario());
        textNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuarioIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addComponent(PanelReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(PanelVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelReqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelReqMousePressed
        PanelReq.setBorder(BorderFactory.createLoweredBevelBorder());
        dispose();
        NovaRequisicao novaReq = new NovaRequisicao(usuario);
        novaReq.setVisible(true);
    }//GEN-LAST:event_PanelReqMousePressed

    private void PanelVerificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVerificarMousePressed
        PanelVerificar.setBorder(BorderFactory.createLoweredBevelBorder());
        dispose();
        HistoricoRequisicao histReq = new HistoricoRequisicao(this.usuario);
        histReq.setVisible(true);
    }//GEN-LAST:event_PanelVerificarMousePressed

    private void PanelReqMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelReqMouseReleased
        PanelReq.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_PanelReqMouseReleased

    private void PanelVerificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVerificarMouseReleased
        PanelVerificar.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_PanelVerificarMouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelReq;
    private javax.swing.JPanel PanelVerificar;
    private javax.swing.JLabel imgForm;
    private javax.swing.JLabel imgVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textForm;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textVerificar;
    // End of variables declaration//GEN-END:variables
}
