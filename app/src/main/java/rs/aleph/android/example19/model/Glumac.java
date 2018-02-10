package rs.aleph.android.example19.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import rs.aleph.android.example19.adapters.DrawerAdapter;

/**
 * Created by androiddevelopment on 10.2.18..
 */

public class Glumac {


    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private float ocena;
    private Category category;
    private Date datumRodjenja;
    private String datumSmrti;
    private String filmovi;
    private String image;





    public Glumac() {

    }

    public Glumac(int id, String ime, String prezime, String biografija, float ocena, Category category, String datumRodjenja, String datumSmrti, String filmovi, String image) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date d = null;
        try {
            d = sdf.parse(String.valueOf(datumRodjenja));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.ocena = ocena;
        this.category = category;
        this.datumRodjenja = d;
        this.datumSmrti = datumSmrti;
        this.filmovi = filmovi;
        this.image = image;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(String datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public String getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(String filmovi) {
        this.filmovi = filmovi;
    }



}
