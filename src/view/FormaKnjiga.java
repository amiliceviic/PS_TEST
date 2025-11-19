package view;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
import model.Knjiga;
import model.Zanr;

public class FormaKnjiga extends javax.swing.JDialog {
    
    private Controller kontroler;
    private GlavnaForma gf;
    private Knjiga knjigaZaIzmenu;

    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        initComponents();
        kontroler = Controller.getInstance();
        this.gf = (GlavnaForma) parent;
        popuniComboBoxAutorima();
        
        if (knjigaZaIzmenu != null) {
            this.knjigaZaIzmenu = knjigaZaIzmenu;
            txtNazivDialog.setText(knjigaZaIzmenu.getNaslov());
            cmbAutor.setSelectedItem(knjigaZaIzmenu.getAutor());
            cmbZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            txtISBNDialog.setText(knjigaZaIzmenu.getISBN());
            txtISBNDialog.setEnabled(false);
            txtGodinaIzdanjaDialog.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            btnDodajDialog.setVisible(false);
        }
        else {
            btnIzmeni.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblZanr = new javax.swing.JLabel();
        txtNazivDialog = new javax.swing.JTextField();
        lblISBNDialog = new javax.swing.JLabel();
        txtISBNDialog = new javax.swing.JTextField();
        lblAutorDialog = new javax.swing.JLabel();
        cmbAutor = new javax.swing.JComboBox<>();
        lblGodinaIzadnjaDialog = new javax.swing.JLabel();
        txtGodinaIzdanjaDialog = new javax.swing.JTextField();
        btnDodajDialog = new javax.swing.JButton();
        btnOdustaniDialog = new javax.swing.JButton();
        lblNazivDialog1 = new javax.swing.JLabel();
        cmbZanr = new javax.swing.JComboBox<>();
        btnIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblZanr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblZanr.setText("Zanr:");

        txtNazivDialog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblISBNDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblISBNDialog.setText("ISBN:");

        txtISBNDialog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblAutorDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAutorDialog.setText("Autor:");

        cmbAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblGodinaIzadnjaDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGodinaIzadnjaDialog.setText("Godina izdanja:");

        txtGodinaIzdanjaDialog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDodajDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDodajDialog.setText("Dodaj");
        btnDodajDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDialogActionPerformed(evt);
            }
        });

        btnOdustaniDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOdustaniDialog.setText("Odustani");
        btnOdustaniDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniDialogActionPerformed(evt);
            }
        });

        lblNazivDialog1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNazivDialog1.setText("Naziv:");

        cmbZanr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        btnIzmeni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblISBNDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtISBNDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAutorDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNazivDialog)
                                .addComponent(cmbAutor, 0, 165, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblGodinaIzadnjaDialog)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGodinaIzdanjaDialog)
                            .addComponent(cmbZanr, 0, 165, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnDodajDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(btnOdustaniDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(lblNazivDialog1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(466, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtNazivDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorDialog)
                    .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBNDialog)
                    .addComponent(txtISBNDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGodinaIzadnjaDialog)
                    .addComponent(txtGodinaIzdanjaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZanr)
                    .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajDialog)
                    .addComponent(btnOdustaniDialog)
                    .addComponent(btnIzmeni))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(lblNazivDialog1)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDialogActionPerformed
        // TODO add your handling code here:
        try {
            String naziv = txtNazivDialog.getText();
            String isbn = txtISBNDialog.getText();
            int godinaIzdanja = Integer.parseInt(txtGodinaIzdanjaDialog.getText());
            Zanr zanr = Zanr.valueOf(cmbZanr.getSelectedItem().toString());
            Autor autor = (Autor) cmbAutor.getSelectedItem();
            Knjiga knjiga = new Knjiga(naziv, autor, isbn, godinaIzdanja, zanr);
            kontroler.dodajKnjigu(knjiga);
            gf.osveziTabelu();
            JOptionPane.showMessageDialog(this, "Knjiga je uspesno dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btnDodajDialogActionPerformed

    private void btnOdustaniDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniDialogActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnOdustaniDialogActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        // TODO add your handling code here:
        try {
            String naziv = txtNazivDialog.getText();
            int godinaIzdanja = Integer.parseInt(txtGodinaIzdanjaDialog.getText());
            Zanr zanr = Zanr.valueOf(cmbZanr.getSelectedItem().toString());
            Autor autor = (Autor) cmbAutor.getSelectedItem();
            knjigaZaIzmenu.setNaslov(naziv);
            knjigaZaIzmenu.setGodinaIzdanja(godinaIzdanja);
            knjigaZaIzmenu.setZanr(zanr);
            knjigaZaIzmenu.setAutor(autor);
            gf.osveziTabelu();
            JOptionPane.showMessageDialog(this, "Knjiga je uspesno izmenjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormaKnjiga dialog = new FormaKnjiga(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajDialog;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnOdustaniDialog;
    private javax.swing.JComboBox<Autor> cmbAutor;
    private javax.swing.JComboBox<String> cmbZanr;
    private javax.swing.JLabel lblAutorDialog;
    private javax.swing.JLabel lblGodinaIzadnjaDialog;
    private javax.swing.JLabel lblISBNDialog;
    private javax.swing.JLabel lblNazivDialog1;
    private javax.swing.JLabel lblZanr;
    private javax.swing.JTextField txtGodinaIzdanjaDialog;
    private javax.swing.JTextField txtISBNDialog;
    private javax.swing.JTextField txtNazivDialog;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
        cmbAutor.removeAllItems();
        List<Autor> autori = kontroler.getListaAutora();
        for (Autor autor : autori) {
            cmbAutor.addItem(autor);
        }
    }
}
