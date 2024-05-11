/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pradi
 */
public class Transaksi {
    private String id_transaksi;
    private String namaMenu;
    private int jumlahMenu;
    private String idRestaurant;
    private String idUser;
    private int hargaMenu;

    public Transaksi(String id_transaksi, String namaMenu, int jumlahMenu, String idRestaurant, String idUser, int hargaMenu) {
        this.id_transaksi = id_transaksi;
        this.namaMenu = namaMenu;
        this.jumlahMenu = jumlahMenu;
        this.idRestaurant = idRestaurant;
        this.idUser = idUser;
        this.hargaMenu = hargaMenu;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getJumlahMenu() {
        return jumlahMenu;
    }

    public void setJumlahMenu(int jumlahMenu) {
        this.jumlahMenu = jumlahMenu;
    }

    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }
}
