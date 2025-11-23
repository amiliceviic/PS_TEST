package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Knjiga;
import model.Autor;
import model.Zanr;

public class Controller {
    
    private DBBroker dbb;
    
    private List<Knjiga> listaKnjiga = new ArrayList<>();
    private List<Autor> listaAutora = new ArrayList<>();;
    
    private static Controller instance;
    
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller() {
        dbb = new DBBroker();
        
        
//        Autor autor1 = new Autor("Ivo", "Andric", 1892, "Biografija autora Ive Andrica...");
//        Autor autor2 = new Autor("Danilo", "Kis", 1935, "Biografija autora Danila Kisa...");
//        Autor autor3 = new Autor("Mesa", "Selimovic", 1910, "Biografija autora Mese Selimovica...");
//        
//        Knjiga knjiga1 = new Knjiga("Na Drini cuprija", autor1, "1234567890", 1945, Zanr.ROMAN);
//        Knjiga knjiga2 = new Knjiga("Basta, pepeo", autor2, "0987654321", 1982, Zanr.ISTORIJSKI);
//        Knjiga knjiga3 = new Knjiga("Tvrdjava", autor3, "1122334455", 1970, Zanr.NAUCNA_FANTASTIKA);
//        
//        listaKnjiga.add(knjiga1);
//        listaKnjiga.add(knjiga2);
//        listaKnjiga.add(knjiga3);
//        
//        listaAutora.add(autor1);
//        listaAutora.add(autor2);
//        listaAutora.add(autor3);
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }
    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }
    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int id) {
        dbb.obrisiKnjigu(id);
//        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga knjiga) {
        dbb.dodajKnjigu(knjiga);
//        listaKnjiga.add(knjiga);
//        System.out.println("Knjiga je dodata");
//        System.out.println(listaKnjiga);
    }

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        return dbb.ucitajListuKnjigaIzBaze();
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        return dbb.ucitajListuAutoraIzBaze();
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        dbb.azurirajKnjigu(knjigaZaIzmenu);
    }
    
}
