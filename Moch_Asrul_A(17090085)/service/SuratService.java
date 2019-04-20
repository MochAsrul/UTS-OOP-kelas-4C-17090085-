package service;

import java.util.*;
import entity.*;

public class SuratService {

    private static List<Surat> data = new LinkedList<Surat>();

    public void addData(Surat srt) {
        data.add(srt);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Surat srt) {
        int index = data.indexOf(srt);
        if(index >= 0) {
            data.set(index, srt);
            System.out.println("data telah berubah");
        }
    }

    public void deleteData(String nama_pengirim) {
        int idx = data.indexOf(new Surat(nama_pengirim, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Surat srt : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  NAMA PENGIRIM : " + srt.getNamaPengirim());
            System.out.println("  TANGGAL : " + srt.getTanggal());
            System.out.println("  TUJUAN : " + srt.getTujuan());
        }
    }

}