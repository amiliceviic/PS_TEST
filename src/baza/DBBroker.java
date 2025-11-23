package baza;

import java.util.ArrayList;
import java.util.List;
import model.Knjiga;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;
import model.Zanr;

public class DBBroker {

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        List<Knjiga> lista = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM knjiga k JOIN autor a ON k.autorId = a.id";
            Statement statement = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) {
                int idKnjiga = rs.getInt("k.id");
                String naslov = rs.getString("k.naslov");
                int godinaIzdanja = rs.getInt("k.godinaIzdanja");
                String ISBN = rs.getString("k.ISBN");
                String z = rs.getString("k.zanr");
                Zanr zanr = Zanr.valueOf(z);
                
                int idAutor = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                String biografija = rs.getString("a.biografija");
                Autor a = new Autor(idAutor, ime, prezime, godinaRodjenja, biografija);
                
                Knjiga k = new Knjiga(idKnjiga, naslov, a, ISBN, godinaIzdanja, zanr);
                lista.add(k);
            }
       } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        return lista;
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        List<Autor> lista = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM autor";
            Statement statement = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                int godinaRodjenja = rs.getInt("godinaRodjenja");
                String biografija = rs.getString("biografija");
                Autor a = new Autor(id, ime, prezime, godinaRodjenja, biografija);
                
                lista.add(a);
            }
       } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        return lista;
    }

    public void obrisiKnjigu(int id) {
        try {
            String query = "DELETE FROM knjiga WHERE id=?";
            PreparedStatement statement = Konekcija.getInstance().getConnection().prepareStatement(query);
            statement.setInt(1, id);
            int result = statement.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void dodajKnjigu(Knjiga knjiga) {
        try {
            String query = "INSERT INTO knjiga (id, naslov, autorId, godinaIzdanja, ISBN, zanr) VALUES(?,?,?,?,?,?)";
            PreparedStatement statement = Konekcija.getInstance().getConnection().prepareStatement(query);
            statement.setInt(1, knjiga.getId());
            statement.setString(2, knjiga.getNaslov());
            statement.setInt(3, knjiga.getAutor().getId());
            statement.setInt(4, knjiga.getGodinaIzdanja());
            statement.setString(5, knjiga.getISBN());
            statement.setString(6, String.valueOf(knjiga.getZanr()));
            
            statement.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("Uspesno dodata knjiga");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
                try {
            String query = "UPDATE knjiga SET naslov=?, autorId=?, godinaIzdanja=?, zanr=? WHERE id=?";
            PreparedStatement statement = Konekcija.getInstance().getConnection().prepareStatement(query);
            
            statement.setString(1, knjigaZaIzmenu.getNaslov());
            statement.setInt(2, knjigaZaIzmenu.getAutor().getId());
            statement.setInt(3, knjigaZaIzmenu.getGodinaIzdanja());
            statement.setString(4, String.valueOf(knjigaZaIzmenu.getZanr()));
            statement.setInt(5, knjigaZaIzmenu.getId());
            
            statement.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("Uspesno azurirana knjiga");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
