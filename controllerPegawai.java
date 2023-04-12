/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.daoPegawai;
import Model.tabelmodelpegawai;
import View.FormPegawai;
import java.util.List;

/**
 *
 * @author User
 */
public class controllerPegawai {
    FormPegawai frame;
    List<Pegawai> listBrg;
    daoPegawai daoPegawai = new daoPegawai();
    Pegawai pegawai= new Pegawai();
    
    public controllerPegawai(FormPegawai frame) {
        this.frame = frame;
    }
    
    public void tampil_label() {
        tabelmodelpegawai tabelPegawai = new tabelmodelpegawai(daoPegawai.getData());
//            frame.getTblPegawai().setModel(tabelPegawai);
    }
    
    
}
