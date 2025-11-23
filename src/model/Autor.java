package model;

import java.util.Objects;

public class Autor {
    
    private int id;
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private String biografija;

    public Autor() {
    }

    public Autor(String ime, String prezime, int godinaRodjenja, String biografija) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.biografija = biografija;
    }
    
    public Autor(int id, String ime, String prezime, int godinaRodjenja, String biografija) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.biografija = biografija;
    }

    public int getId() {
        return id;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public String getBiografija() {
        return biografija;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.godinaRodjenja != other.godinaRodjenja) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        return Objects.equals(this.prezime, other.prezime);
    }
    
}
