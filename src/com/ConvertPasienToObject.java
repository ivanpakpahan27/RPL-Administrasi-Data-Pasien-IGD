package com;
import exec.ExecutePasien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ivan Pakpahan
 */
public class ConvertPasienToObject {
    public String[][] getPasien(){
        List<Pasien> pasien = new ArrayList<Pasien>();
        ExecutePasien ePas = new ExecutePasien();
        pasien = ePas.getAllPasien();
        String[][] dataPasien = new String[pasien.size()][5];
        int i=0;
        for(Pasien pas : pasien){
            dataPasien[i][0] = ""+pas.getId_pas();
            dataPasien[i][1] = pas.getNama();
            dataPasien[i][2]= pas.getNo_hp();
            dataPasien[i][3]= pas.getAlamat();
            dataPasien[i][4]= pas.getStatus();
            i++;
        }
        return dataPasien;
    }
 }
