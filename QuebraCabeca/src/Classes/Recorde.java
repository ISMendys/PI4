/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author isael
 */
public class Recorde {
    public static Recorde recorde = new Recorde();
    private int recordeNivel1 = 30;
    public static String nomeRecorde1 = "----";
    private int recordeNivel2 = 90;
    public static String nomeRecorde2 = "----";
    private int recordeNivel3 = 240;
    public static String nomeRecorde3 = "----";

    public int getRecordeNivel1() {
        return recordeNivel1;
    }

    private void setRecordeNivel1(int recordeNivel1, String nome) {
        this.recordeNivel1 = recordeNivel1;
        Recorde.nomeRecorde1 = nome;
    }

    public int getRecordeNivel2() {
        return recordeNivel2;
    }

    public void setRecordeNivel2(int recordeNivel2, String nome) {
        this.recordeNivel2 = recordeNivel2;
        Recorde.nomeRecorde2 = nome;
    }

    public int getRecordeNivel3() {
        return recordeNivel3;
    }

    public void setRecordeNivel3(int recordeNivel3,String nome) {
        this.recordeNivel3 = recordeNivel3;
        Recorde.nomeRecorde3 = nome;
    }
    
    public void novoRecord1(int recorde1,String nome){
        if(recorde1<this.getRecordeNivel1()){
            Recorde.recorde.setRecordeNivel1(recorde1,nome);
            JOptionPane.showMessageDialog(null,"Parabens Você fez um novo Recorde");
        }
    }
    
    public void novoRecord2(int recorde2,String nome){
        if(recorde2<this.getRecordeNivel2()){
            Recorde.recorde.setRecordeNivel2(recorde2,nome);
            JOptionPane.showMessageDialog(null,"Parabens Você fez um novo Recorde");
        }
    }
    
    public void novoRecord3(int recorde3,String nome){
        if(recorde3<this.getRecordeNivel3()){
            Recorde.recorde.setRecordeNivel3(recorde3,nome);
            JOptionPane.showMessageDialog(null,"Parabens Você fez um novo Recorde");
        }
    }
    
    public Recorde() {
        
    }
    
    
    
}
