/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ratih Mardianingsih
 */
public class tabelmodelbarang extends AbstractTableModel{
    List <Barang> listBrg;
    
    public tabelmodelbarang (List <Barang> listBrg) {
        this.listBrg = listBrg;
    }
    

    @Override
    public int getRowCount() {
       return listBrg.size();
    }

    @Override
    public int getColumnCount() {
        return 5; 
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Kode Barang";
            case 1 -> "Nama Barang";
            case 2 -> "Jumlah";
            case 3 -> "Harga";
            case 4 -> "Merek";
            default -> null;
            
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     return switch (column){
         case 0 -> listBrg.set(row).getKode(); 
         case 1 -> listBrg.set(row).getNama(); 
         case 2 -> listBrg.set(row).getJumlah(); 
         case 3 -> listBrg.set(row).getHarga(); 
         case 4 -> listBrg.set(row).getMerek();
         default -> null;
     };
    }
    
    
}
