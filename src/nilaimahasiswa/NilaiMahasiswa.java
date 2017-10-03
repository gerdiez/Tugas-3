/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author Gerdi Abdi Salam
 * Nim   : 10116474
 * Kelas : PBO-11
 */
class Nilai {
    private char index;
    private String nama, nim, ket;
    private double kuis, uts, uas, akhir;
    
    public void setKuis(double kuis) {
        this.kuis = kuis;
    }

    public double getKuis() {
        return kuis;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUts() {
        return uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUas() {
        return uas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    double getSkor(double kuis, double uts, double uas) {
        akhir = (0.2 * kuis) + (0.3 * uts) + (0.5 * uas);
        return akhir;
    }

    public void getIndexNilai(double akhir) {

        if (akhir >= 80) {
            index = 'A';
            ket = "Sangat Baik";
        } else if (akhir >= 68) {
            index = 'B';
            ket = "Baik";
        } else if (akhir >= 56) {
            index = 'C';
            ket = "Cukup";
        } else if (akhir >= 45) {
            index = 'D';
            ket = "Kurang";
        } else if (akhir <= 45) {
            index = 'E';
            ket = "Sangat Kurang";
        }

        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + ket);

    }
}

public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai oMhs = new Nilai();
        oMhs.setNama("Gerdi Abdi Salam");
        oMhs.setNim("10116474");
        oMhs.setKuis(80);
        oMhs.setUts(75);
        oMhs.setUas(90);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + "\t= " + oMhs.getNama());
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("Nim ke " + j + "\t= " + oMhs.getNim());
        }
        System.out.println("\n");
        double akhir = oMhs.getSkor(oMhs.getKuis(), oMhs.getUts(), oMhs.getUas());

        System.out.println("Kuis : " + oMhs.getKuis());
        System.out.println("UTS : " + oMhs.getUts());
        System.out.println("UAS : " + oMhs.getUas());
        System.out.println("Nilai Akhir = " + akhir);
        oMhs.getIndexNilai(akhir);
    }

}
