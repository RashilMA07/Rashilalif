
package edu.rashilmuhammad.latihanmvc.controller;

import edu.rashilmuhammad.latihanmvc.model.PelangganModel;
import edu.rashilmuhammad.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author NAMA : Rashil Muhammad Alif
 *              KELAS : PBO-2 / IF-2
 *              NIM     : 10117042
 * 
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView  view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("")  && email.equals("") && noTlp.equals("")) {
            
        } else {

          model.resetForm();
       
        }
        
    }
    
    public void simpanForm(PelangganView  view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim() .equals("") ) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
            
        } else if (email.trim() .equals("") ) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
            
        } else if (noTlp.trim() .equals("") ) {
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
            
        } else {
            model.simpanForm();
        }
            
        
        
    }
}
