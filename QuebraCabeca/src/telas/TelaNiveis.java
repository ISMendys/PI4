/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Classes.Jogador;
import Classes.Nivel;
import Niveis.JogoNivel1;
import Niveis.JogoNivel2;
import Niveis.JogoNivel3;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Isaelsantos
 */
public class TelaNiveis extends javax.swing.JPanel {
JPanel jogoNivel1;
JPanel jogoNivel2;
JPanel jogoNivel3;
Nivel nivel;
/**
     * Creates new form TelaNiveis
     */
    public TelaNiveis() {
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

        panelNiveis = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        lblNivel1 = new javax.swing.JLabel();
        lblNivel2 = new javax.swing.JLabel();
        lblNivel3 = new javax.swing.JLabel();
        lblFundoNiveis = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelNiveis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensNiveis/btnSairTN.png"))); // NOI18N
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });
        panelNiveis.add(lblSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblNivel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNivel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNivel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNivel1MouseExited(evt);
            }
        });
        panelNiveis.add(lblNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 205, 180, 160));

        lblNivel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNivel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNivel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNivel2MouseExited(evt);
            }
        });
        panelNiveis.add(lblNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 400, 170, 150));

        lblNivel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNivel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNivel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNivel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNivel3MouseExited(evt);
            }
        });
        panelNiveis.add(lblNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 530, 170, 150));

        lblFundoNiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensNiveis/telaNiveis.png"))); // NOI18N
        panelNiveis.add(lblFundoNiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        add(panelNiveis, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void lblNivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel1MouseClicked
        iniciarN1();
    }//GEN-LAST:event_lblNivel1MouseClicked

    private void lblNivel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel1MouseEntered
        lblNivel1.setIcon(new ImageIcon("src/imagensNiveis/iconNivel1.png"));
    }//GEN-LAST:event_lblNivel1MouseEntered

    private void lblNivel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel1MouseExited
        lblNivel1.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_lblNivel1MouseExited

    private void lblNivel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel2MouseClicked
         iniciarN2();
    }//GEN-LAST:event_lblNivel2MouseClicked

    private void lblNivel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel2MouseEntered
        if(Jogador.jogadorAtual.getNivel()>=2){
            lblNivel2.setIcon(new ImageIcon("src/imagensNiveis/iconNivel2.png"));
        }else{
            lblNivel2.setIcon(new ImageIcon("src/imagensNiveis/iconNivel2Block.png"));
        }
    }//GEN-LAST:event_lblNivel2MouseEntered

    private void lblNivel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel2MouseExited
        lblNivel2.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_lblNivel2MouseExited

    private void lblNivel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel3MouseClicked
        iniciarN3();
    }//GEN-LAST:event_lblNivel3MouseClicked

    private void lblNivel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel3MouseEntered
        if(Jogador.jogadorAtual.getNivel()>=3){
            lblNivel3.setIcon(new ImageIcon("src/imagensNiveis/iconNivel3.png"));
        }else{
            lblNivel3.setIcon(new ImageIcon("src/imagensNiveis/iconNivel3Block.png"));
        }
    }//GEN-LAST:event_lblNivel3MouseEntered

    private void lblNivel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivel3MouseExited
        lblNivel3.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_lblNivel3MouseExited

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
       super.setVisible(false);
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        lblSair.setIcon(new ImageIcon("src/imagensNiveis/btnSairTN2.png"));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        lblSair.setIcon(new ImageIcon("src/imagensNiveis/btnSairTN.png"));
    }//GEN-LAST:event_lblSairMouseExited
    private void iniciarN2(){
        if(Jogador.jogadorAtual.getNivel()>=2){
                jogoNivel2 = new JogoNivel2();
                this.add(jogoNivel2);
                jogoNivel2.setBounds(0, 0, 1400, 700);
                jogoNivel2.setVisible(true);
                panelNiveis.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Voce não tem nivel suficiente \n Continue jogando","Pontos Insuficiente",0);
            }
    }
    private void iniciarN3(){
        if(Jogador.jogadorAtual.getNivel()>=1){
                jogoNivel3= new JogoNivel3();
                this.add(jogoNivel3);
                jogoNivel3.setBounds(0, 0, 1010, 453);
                jogoNivel3.setVisible(true);
                panelNiveis.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Voce não tem nivel suficiente \n Continue jogando","Pontos Insuficiente",0);
            }
    }
    private void iniciarN1(){
        if(Jogador.jogadorAtual.getNivel()>=1){
                jogoNivel1 = new JogoNivel1();
                this.add(jogoNivel1);
                jogoNivel1.setBounds(0, 0, 400, 300);
                jogoNivel1.setVisible(true);
                panelNiveis.setVisible(false);

            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFundoNiveis;
    private javax.swing.JLabel lblNivel1;
    private javax.swing.JLabel lblNivel2;
    private javax.swing.JLabel lblNivel3;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel panelNiveis;
    // End of variables declaration//GEN-END:variables
}