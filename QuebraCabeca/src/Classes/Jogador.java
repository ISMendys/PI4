/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author isael
 */

public class Jogador {
        public static Jogador jogadorAtual;
        private String usuario;
        private String senha;
        private String senha2;
        private int nivel;
        private int recorde1;
        private int recorde2;
        private int recorde3;


    public void settempo1(int tempo) {
        this.recorde1 = tempo;
    }
        
      public void settempo2(int tempo) {
        this.recorde2 = tempo;
    }
      
      public void settempo3(int tempo) {
        this.recorde3 = tempo;
    }
        
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
        

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
    


public void mostrarJogadores(){
}

    public Jogador(String usuario, String senha, String senha2) {
        
        this.usuario = usuario;
        this.senha = senha;
        this.senha2 = senha2;
        
    }

}
