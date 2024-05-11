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
public class Restaurant {
    private String namaRestaurant;
    private int idRestaurant;
    private String lokasiRestaurant;
    private String kategoriRestaurant;
    private int nomorMeja;
    private int idBooking;

    public Restaurant(String namaRestaurant, int idRestaurant, String lokasiRestaurant, String kategoriRestaurant, int nomorMeja, int idBooking) {
        this.namaRestaurant = namaRestaurant;
        this.idRestaurant = idRestaurant;
        this.lokasiRestaurant = lokasiRestaurant;
        this.kategoriRestaurant = kategoriRestaurant;
        this.nomorMeja = nomorMeja;
        this.idBooking = idBooking;
    }
    
    public String getNamaRestaurant() {
        return namaRestaurant;
    }

    public void setNamaRestaurant(String namaRestaurant) {
        this.namaRestaurant = namaRestaurant;
    }

    public int getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getLokasiRestaurant() {
        return lokasiRestaurant;
    }

    public void setLokasiRestaurant(String lokasiRestaurant) {
        this.lokasiRestaurant = lokasiRestaurant;
    }

    public String getKategoriRestaurant() {
        return kategoriRestaurant;
    }

    public void setKategoriRestaurant(String kategoriRestaurant) {
        this.kategoriRestaurant = kategoriRestaurant;
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    
    
    
   
    
}
