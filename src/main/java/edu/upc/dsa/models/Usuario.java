package edu.upc.dsa.models;

import java.util.List;

public class Usuario {

    String username;
    String password;
    String email;
    int coins;

    List<Objeto> listaObjetos;
    List<Partida> listaPartidas;
    List<Insignias> listaInsignias;


    public Usuario() {
    }


    public Usuario(String username, String password, String email, int coins) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.coins = coins;
    }

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public List<Insignias> getListaInsignias() {
        return listaInsignias;
    }

    public void setListaInsignias(List<Insignias> listaInsignias) {
        this.listaInsignias = listaInsignias;
    }

    public void addInsignia (Insignias insignia){
        listaInsignias.add(insignia);
    }
}
