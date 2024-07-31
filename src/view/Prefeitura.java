package view;

import DTO.UsuarioDTO;
import java.awt.Color;
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
        jPanel70 = new javax.swing.JPanel();
        Logo35 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        textNome35 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jPanel71 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();

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
        textForm.setText("Nova Requisição");

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
        textVerificar.setText("Histórico");

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

        jPanel70.setBackground(new java.awt.Color(0, 102, 0));

        Logo35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_coordenadoria_saude_rs.png"))); // NOI18N

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuarioIcon.png"))); // NOI18N
        jLabel176.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel177.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(0, 0, 0));
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText(usuario.getTipo().getTipo());
        jLabel177.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textNome35.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        textNome35.setForeground(new java.awt.Color(0, 0, 0));
        textNome35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNome35.setText(usuario.getUsuario());

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/settings.png"))); // NOI18N
        jLabel178.setIconTextGap(0);

        jSeparator37.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator37.setForeground(new java.awt.Color(0, 0, 0));

        jPanel71.setBackground(new java.awt.Color(0, 102, 0));
        jPanel71.setForeground(new java.awt.Color(0, 102, 0));
        jPanel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel71.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel71MouseMoved(evt);
            }
        });
        jPanel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel71MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel71MouseExited(evt);
            }
        });

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupaMenu.png"))); // NOI18N

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(0, 0, 0));
        jLabel180.setText("Histórico");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel179)
                .addGap(26, 26, 26)
                .addComponent(jLabel180)
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel179, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel72.setBackground(new java.awt.Color(0, 102, 0));
        jPanel72.setForeground(new java.awt.Color(0, 102, 0));
        jPanel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel72.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel72MouseMoved(evt);
            }
        });
        jPanel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel72MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel72MouseExited(evt);
            }
        });

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/formularioMenu.png"))); // NOI18N

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(0, 0, 0));
        jLabel182.setText("Nova Requisição");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel181)
                .addGap(26, 26, 26)
                .addComponent(jLabel182)
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel181, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator37)
            .addComponent(Logo35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNome35, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel178)
                .addGap(22, 22, 22))
            .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addComponent(Logo35)
                .addGap(18, 18, 18)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(textNome35)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel177))
                    .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel178)
                        .addComponent(jLabel176)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(PanelReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(PanelVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
            .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jPanel71MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseMoved
        jPanel71.setBackground(new Color(102, 255, 2));
    }//GEN-LAST:event_jPanel71MouseMoved

    private void jPanel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseClicked
        dispose();
        NovaRequisicao novaReq = new NovaRequisicao(usuario);
        novaReq.setVisible(true);
    }//GEN-LAST:event_jPanel71MouseClicked

    private void jPanel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseExited
        jPanel71.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_jPanel71MouseExited

    private void jPanel72MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel72MouseMoved
       jPanel72.setBackground(new Color(102, 255, 2));
    }//GEN-LAST:event_jPanel72MouseMoved

    private void jPanel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel72MouseClicked
        dispose();
        Prefeitura telaPref = new Prefeitura(usuario);
        telaPref.setVisible(true);
    }//GEN-LAST:event_jPanel72MouseClicked

    private void jPanel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel72MouseExited
       jPanel72.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_jPanel72MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo35;
    private javax.swing.JPanel PanelReq;
    private javax.swing.JPanel PanelVerificar;
    private javax.swing.JLabel imgForm;
    private javax.swing.JLabel imgVerificar;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JLabel textForm;
    private javax.swing.JLabel textNome35;
    private javax.swing.JLabel textVerificar;
    // End of variables declaration//GEN-END:variables
}
