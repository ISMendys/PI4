/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author isael
 */
public class Peca {
 
 /*Aqui ele nao verefica o vencedor eu que fiquei com preguiça de renomear
  *ele simplismente verefica se as LBL tem o mesmo nome se tiver retorna True.
  */
    public boolean vereficarVencedor(JLabel lbl11,JLabel lbl12){
            String icone11 = lbl11.getIcon().toString();
            String[] lb11=icone11.split("/");
            String opcao11 = lb11[lb11.length-1];
            
            String icone12 = lbl12.getIcon().toString();
            String[] lb12=icone12.split("/");
            String opcao12 = lb12[lb12.length-1];
    return opcao11.equals(opcao12);
 }
 
 /*
  *Nessa parte o programa separa o nome final do icone para comparar depois
  */ 
    public String testando(JLabel icone){
                String iconeNome = icone.getIcon().toString();
        String[] lb11=iconeNome.split("/");
        String opcao11 = lb11[lb11.length-1];
        return opcao11;
 }
    


public void getBorda(JLabel encaixe){
               encaixe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
}

   public void setBorda(JLabel encaixe){
       encaixe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
   }
public void tiraIcone(String iconeAtual,JLabel pecas){  
        if(iconeAtual.equals(testando(pecas))){pecas.setVisible(false);}
    }

public void reiniciar(JLabel encaixe,JLabel peca,int nv,int num){
        encaixe.setIcon(new ImageIcon("src/imagensN"+nv+"/encaixe"+num+".jpg"));
        peca.setVisible(true);
}

    public void  retornarIcone(String encaixeAtual,JLabel icone){
       if(encaixeAtual.equals(testando(icone))){
           icone.setVisible(true);
       }
}
}

