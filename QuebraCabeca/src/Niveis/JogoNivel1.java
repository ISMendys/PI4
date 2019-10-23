/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveis;

import static Classes.Jogador.jogadorAtual;
import Classes.Peca;
import Classes.Recorde;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Isaelsantos
 * 
 */

public class JogoNivel1 extends javax.swing.JPanel {
 
    private Timer timer;  
    private int currentSegundo = 30;
    private int currentMinuto = 0;
    private int velocidade = 1000;
    
public JogoNivel1() {
        initComponents();
        iniciarCintagem();//Aqui inicia a contagem  
        jPanelPausa.setVisible(false);
        panel.setVisible(false);
        lblTempo.setText(Integer.toString(Recorde.recorde.getRecordeNivel1()));
        lblUser.setText(Recorde.nomeRecorde1);
    }

JPanel jogoNivel2;
String encaixeAtual;
int contador=0;
String pecaAtual;
String iconeAtual;
Peca peca = new Peca();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        panelCronometro = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblMelhorTempo = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lblDicaStart = new javax.swing.JLabel();
        lblReiniciar = new javax.swing.JLabel();
        lblNiveis = new javax.swing.JLabel();
        lblPausar = new javax.swing.JLabel();
        lblFundoCronometro = new javax.swing.JLabel();
        JPanelJogo = new javax.swing.JPanel();
        peca1 = new javax.swing.JLabel();
        peca2 = new javax.swing.JLabel();
        peca3 = new javax.swing.JLabel();
        peca4 = new javax.swing.JLabel();
        encaixe1 = new javax.swing.JLabel();
        encaixe2 = new javax.swing.JLabel();
        encaixe3 = new javax.swing.JLabel();
        encaixe4 = new javax.swing.JLabel();
        lblFundoN1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lblDica = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelPausa = new javax.swing.JPanel();
        lblRetomar = new javax.swing.JLabel();
        lblFundoPausa = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanelPrincipal.setRequestFocusEnabled(false);
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCronometro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCronometro.setPreferredSize(new java.awt.Dimension(195, 117));
        panelCronometro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("------");
        lblUser.setName("----------"); // NOI18N
        panelCronometro.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 52, 70, 20));

        lblTempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTempo.setText("--:--");
        panelCronometro.add(lblTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 85, 50, 20));

        lblMelhorTempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbtn/melhorTempo.png"))); // NOI18N
        panelCronometro.add(lblMelhorTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 170, 110));

        label.setFont(new java.awt.Font("Arial", 1, 45)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("00:00");
        label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCronometro.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 60));

        lblDicaStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbtn/btnDica2.png"))); // NOI18N
        lblDicaStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDicaStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDicaStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDicaStartMouseExited(evt);
            }
        });
        panelCronometro.add(lblDicaStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 90, 90));

        lblReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbtn/btnReiniciar.png"))); // NOI18N
        lblReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseExited(evt);
            }
        });
        panelCronometro.add(lblReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 120, 50));

        lblNiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbtn/btnNiveis.png"))); // NOI18N
        lblNiveis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNiveisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNiveisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNiveisMouseExited(evt);
            }
        });
        panelCronometro.add(lblNiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 120, 50));

        lblPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbtn/btnPausar.png"))); // NOI18N
        lblPausar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPausarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPausarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPausarMouseExited(evt);
            }
        });
        panelCronometro.add(lblPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 50));

        lblFundoCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/fundoCronometroN1.png"))); // NOI18N
        panelCronometro.add(lblFundoCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 170));

        jPanelPrincipal.add(panelCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1030, 170));

        JPanelJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/peca1.jpg"))); // NOI18N
        peca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peca1MouseClicked(evt);
            }
        });
        JPanelJogo.add(peca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 200, 130));

        peca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/peca2.jpg"))); // NOI18N
        peca2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peca2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        peca2.setOpaque(true);
        peca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peca2MouseClicked(evt);
            }
        });
        JPanelJogo.add(peca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 200, 130));

        peca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/peca3.jpg"))); // NOI18N
        peca3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peca3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peca3MouseClicked(evt);
            }
        });
        JPanelJogo.add(peca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, 130));

        peca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/peca4.jpg"))); // NOI18N
        peca4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peca4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peca4MouseClicked(evt);
            }
        });
        JPanelJogo.add(peca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, 130));

        encaixe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/encaixe1.jpg"))); // NOI18N
        encaixe1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        encaixe1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encaixe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encaixe1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encaixe1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encaixe1MouseExited(evt);
            }
        });
        JPanelJogo.add(encaixe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 200, 130));

        encaixe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/encaixe2.jpg"))); // NOI18N
        encaixe2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        encaixe2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encaixe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encaixe2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encaixe2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encaixe2MouseExited(evt);
            }
        });
        JPanelJogo.add(encaixe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 200, 130));

        encaixe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/encaixe3.jpg"))); // NOI18N
        encaixe3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        encaixe3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encaixe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encaixe3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encaixe3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encaixe3MouseExited(evt);
            }
        });
        JPanelJogo.add(encaixe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 200, 130));

        encaixe4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/encaixe4.jpg"))); // NOI18N
        encaixe4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        encaixe4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encaixe4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encaixe4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encaixe4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encaixe4MouseExited(evt);
            }
        });
        JPanelJogo.add(encaixe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 200, 130));

        lblFundoN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/lblFundoN1.png"))); // NOI18N
        JPanelJogo.add(lblFundoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 330));

        jPanelPrincipal.add(JPanelJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 330));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/imagenCompleta.jpg"))); // NOI18N
        panel.add(lblDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 500, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/lblFundoN1.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 330));

        jPanelPrincipal.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 330));

        jPanelPausa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRetomar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRetomar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetomarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRetomarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRetomarMouseExited(evt);
            }
        });
        jPanelPausa.add(lblRetomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 295, 320, 60));

        lblFundoPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensN1/telaPausaN1.PNG"))); // NOI18N
        jPanelPausa.add(lblFundoPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));

        jPanelPrincipal.add(jPanelPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanelPrincipal, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void encaixe4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe4MouseClicked
        encaixeAtual = peca.testando(encaixe4);
        verificacao(this.encaixe4);
        tiraricone();
        vereficarIconesNV1();
    }//GEN-LAST:event_encaixe4MouseClicked

    private void encaixe3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe3MouseClicked
        encaixeAtual = peca.testando(encaixe3);
        verificacao(this.encaixe3);
        tiraricone();
        vereficarIconesNV1();
    }//GEN-LAST:event_encaixe3MouseClicked

    private void encaixe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe2MouseClicked
        encaixeAtual =peca.testando(encaixe2);
        verificacao(this.encaixe2);
        tiraricone();
        vereficarIconesNV1();
    }//GEN-LAST:event_encaixe2MouseClicked

    private void encaixe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe1MouseClicked
        encaixeAtual =peca.testando(encaixe1);
        verificacao(this.encaixe1);
        tiraricone();
        vereficarIconesNV1();
    }//GEN-LAST:event_encaixe1MouseClicked

    private void peca4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peca4MouseClicked
 
        pecaAtual="src/imagensN1/peca4.jpg";
        iconeAtual = peca.testando(peca4);
    
    }//GEN-LAST:event_peca4MouseClicked

    private void peca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peca3MouseClicked

            pecaAtual="src/imagensN1/peca3.jpg";
            iconeAtual = peca.testando(peca3);
        
    }//GEN-LAST:event_peca3MouseClicked

    private void peca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peca2MouseClicked

            pecaAtual="src/imagensN1/peca2.jpg";
            iconeAtual =peca.testando(peca2);
        
    }//GEN-LAST:event_peca2MouseClicked

    private void peca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peca1MouseClicked

            pecaAtual="src/imagensN1/peca1.jpg";
            iconeAtual =peca.testando(peca1);
        
    }//GEN-LAST:event_peca1MouseClicked

    private void lblDicaStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDicaStartMouseEntered
        lblDicaStart.setIcon(new ImageIcon("src/imagensbtn/btnDica.png"));
        if(currentSegundo>5){
            currentSegundo +=-5;
        }
        JPanelJogo.setVisible(false);
        panel.setVisible(true);
    }//GEN-LAST:event_lblDicaStartMouseEntered

    private void encaixe1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe1MouseEntered
        peca.getBorda(encaixe1);
    }//GEN-LAST:event_encaixe1MouseEntered

    private void encaixe1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe1MouseExited
peca.setBorda(encaixe1);
    }//GEN-LAST:event_encaixe1MouseExited

    private void encaixe2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe2MouseEntered
peca.getBorda(encaixe2);
    }//GEN-LAST:event_encaixe2MouseEntered

    private void encaixe2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe2MouseExited
peca.setBorda(encaixe2);
    }//GEN-LAST:event_encaixe2MouseExited

    private void encaixe3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe3MouseEntered
peca.getBorda(encaixe3);
    }//GEN-LAST:event_encaixe3MouseEntered

    private void encaixe3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe3MouseExited
peca.setBorda(encaixe3);    }//GEN-LAST:event_encaixe3MouseExited

    private void encaixe4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe4MouseEntered
peca.getBorda(encaixe4);
    }//GEN-LAST:event_encaixe4MouseEntered

    private void encaixe4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encaixe4MouseExited
 peca.setBorda(encaixe4);
    }//GEN-LAST:event_encaixe4MouseExited

    private void lblReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseEntered
        lblReiniciar.setIcon(new ImageIcon("src/imagensbtn/btnReiniciar2.png"));
    }//GEN-LAST:event_lblReiniciarMouseEntered

    private void lblReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseExited
        lblReiniciar.setIcon(new ImageIcon("src/imagensbtn/btnReiniciar.png"));
    }//GEN-LAST:event_lblReiniciarMouseExited

    private void lblReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseClicked
        reinicia();
        stopTime();
        timer.restart();
    }//GEN-LAST:event_lblReiniciarMouseClicked

    private void lblNiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNiveisMouseClicked
        stopTime();
        JogoNivel1.super.setVisible(false);
    }//GEN-LAST:event_lblNiveisMouseClicked

    private void lblNiveisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNiveisMouseEntered
        lblNiveis.setIcon(new ImageIcon("src/imagensbtn/btnNiveis2.png"));
    }//GEN-LAST:event_lblNiveisMouseEntered

    private void lblNiveisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNiveisMouseExited
        lblNiveis.setIcon(new ImageIcon("src/imagensbtn/btnNiveis.png"));
    }//GEN-LAST:event_lblNiveisMouseExited

    private void lblPausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPausarMouseClicked
        timer.stop();
        panelCronometro.setVisible(false);
        JPanelJogo.setVisible(false);
        jPanelPausa.setVisible(true);
    }//GEN-LAST:event_lblPausarMouseClicked

    private void lblPausarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPausarMouseEntered
        lblPausar.setIcon(new ImageIcon("src/imagensbtn/btnPausar2.png"));
    }//GEN-LAST:event_lblPausarMouseEntered

    private void lblPausarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPausarMouseExited
        lblPausar.setIcon(new ImageIcon("src/imagensbtn/btnPausar.png"));
    }//GEN-LAST:event_lblPausarMouseExited

    private void lblDicaStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDicaStartMouseExited
        lblDicaStart.setIcon(new ImageIcon("src/imagensbtn/btnDica2.png"));
        panel.setVisible(false);
        JPanelJogo.setVisible(true);
    }//GEN-LAST:event_lblDicaStartMouseExited

    private void lblRetomarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetomarMouseEntered
       lblRetomar.setIcon(new ImageIcon("src/imagensN1/btnRetomarN1.png"));
    }//GEN-LAST:event_lblRetomarMouseEntered

    private void lblRetomarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetomarMouseExited
        lblRetomar.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_lblRetomarMouseExited

    private void lblRetomarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetomarMouseClicked
        jPanelPausa.setVisible(false);
        JPanelJogo.setVisible(true);
        panelCronometro.setVisible(true);
        timer.restart();
    }//GEN-LAST:event_lblRetomarMouseClicked
 

    /*
  *Esta funçao e reponsavel por retirar o icone que foi encaixado no jogo
  */
    private void tiraricone(){
        if(iconeAtual!=null){
        peca.tiraIcone(iconeAtual,peca1);
        peca.tiraIcone(iconeAtual,peca2);
        peca.tiraIcone(iconeAtual,peca3);
        peca.tiraIcone(iconeAtual,peca4);
    }
}
  

/*
 *Essa função verefica se os encaixes Já possue icone e quando e selecionado
 *ele retorna esse icone para possição antiga..
 */
    private void retorneIcone(){
       
         if(encaixeAtual.equals(peca.testando(peca1))){
            peca1.setVisible(true);}
        else if(encaixeAtual.equals(peca.testando(peca2))){
            peca2.setVisible(true);}
        else if(encaixeAtual.equals(peca.testando(peca3))){
            peca3.setVisible(true);}
        else if(encaixeAtual.equals(peca.testando(peca4))){
            peca4.setVisible(true);}
 }
    private void verificacao(JLabel encaixe){
            if(pecaAtual==null){JOptionPane.showMessageDialog(null, "Selecione um novo Icone");}
                else{encaixe.setIcon(new ImageIcon(pecaAtual));retorneIcone();}
            pecaAtual=null;
                
    }
         /*
  *Nessa parte ele verefica se o usuario colocou todas as pecas corretamente
  */
    public void vereficarIconesNV1() {  
    lblTempo.setText(Integer.toString(Recorde.recorde.getRecordeNivel1()));
    lblUser.setText(Recorde.nomeRecorde1);
    if(peca.vereficarVencedor(peca1,encaixe1)&&peca.vereficarVencedor(peca2,encaixe2)&&
       peca.vereficarVencedor(peca3,encaixe3)&&peca.vereficarVencedor(peca4,encaixe4)){
       jogadorAtual.setNivel(2);
       vereficaRecorde();
       stopTime();
       reinicia();
       int returnValue = 0;
       returnValue = JOptionPane.showConfirmDialog(null, "Parabens Voce Passou\nGostaria de Jogar Novamente?", "Proximo Nivel", JOptionPane.YES_NO_OPTION);
       if (returnValue == JOptionPane.YES_OPTION){
           stopTime();
           timer.restart();
           
            }else{
                super.setVisible(false);
            }
        }

     }
    public void reinicia(){
        peca.reiniciar(encaixe1,peca1,1,1);      
        peca.reiniciar(encaixe2,peca2,1,2);      
        peca.reiniciar(encaixe3,peca3,1,3);      
        peca.reiniciar(encaixe4,peca4,1,4); 
        iconeAtual=null;
    }
    //INICIA O CRONOMETRO APARTIR DAQUI //
        private void iniciarCintagem() {
        ActionListener action = new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                currentSegundo--;
                
                if(currentSegundo==0){
                    reinicia();
                    //currentMinuto--;
                    currentSegundo = 30;
                }
                if(currentSegundo<=10){
                    label.setBackground(Color.red);
                    label.setForeground(Color.red);
                }else{
                    label.setBackground(Color.white);
                    label.setForeground(Color.white);
                }

                String min = currentMinuto <= 9? "0"+currentMinuto:currentMinuto+"";
                String seg = currentSegundo <= 9? "0"+currentSegundo:currentSegundo+"";
                
                label.setText(min+":"+seg);  
            }  
        };  
        this.timer = new Timer(velocidade, action);  
        this.timer.start();
    }

    private void stopTime() {
        timer.stop();
        currentMinuto = 0;
        currentSegundo = 30;
        label.setText("00:30");
    }
    
    
   private void vereficaRecorde(){
       int minuto = currentMinuto * 60;
       int segundos = currentSegundo;
       int rec = 30-(minuto + segundos);
       jogadorAtual.settempo1(30-rec);
       Recorde.recorde.novoRecord1(rec, jogadorAtual.getUsuario());
       if(Recorde.recorde.getRecordeNivel1()>0){
           lblTempo.setText(Integer.toString(Recorde.recorde.getRecordeNivel1()));
           lblUser.setText(Recorde.nomeRecorde1);
        }
   }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelJogo;
    private javax.swing.JLabel encaixe1;
    private javax.swing.JLabel encaixe2;
    private javax.swing.JLabel encaixe3;
    private javax.swing.JLabel encaixe4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelPausa;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblDicaStart;
    private javax.swing.JLabel lblFundoCronometro;
    private javax.swing.JLabel lblFundoN1;
    private javax.swing.JLabel lblFundoPausa;
    private javax.swing.JLabel lblMelhorTempo;
    private javax.swing.JLabel lblNiveis;
    private javax.swing.JLabel lblPausar;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JLabel lblRetomar;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCronometro;
    private javax.swing.JLabel peca1;
    private javax.swing.JLabel peca2;
    private javax.swing.JLabel peca3;
    private javax.swing.JLabel peca4;
    // End of variables declaration//GEN-END:variables
}
