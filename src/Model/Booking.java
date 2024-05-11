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
public class Booking {
    private int jumlahPesanan;
    private int nomorMeja;
    private int idBooking;

    public Booking(int jumlahPesanan, int nomorMeja, int idBooking) {
        this.jumlahPesanan = jumlahPesanan;
        this.nomorMeja = nomorMeja;
        this.idBooking = idBooking;
    }

    public int getJumlahPesanan() {
        return jumlahPesanan;
    }

    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
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
