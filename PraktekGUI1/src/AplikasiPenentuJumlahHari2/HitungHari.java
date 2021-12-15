/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenentuJumlahHari2;

import javax.swing.JOptionPane;

/**
 * @author Ammar
 */
public class HitungHari {

    public String hitung(String txtTahun, String comboBulan) {
        int jumlahHari = 0;

        if (txtTahun.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tahun belum di Input", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int tahun = Integer.parseInt(txtTahun);
            if (comboBulan.equals("Februari")) {
                if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
            } else if (comboBulan.equals("Januari") || comboBulan.equals("Maret") || comboBulan.equals("Mei") || comboBulan.equals("Juli") || comboBulan.equals("Agustus") || comboBulan.equals("Oktober") || comboBulan.equals("Desember")) {
                jumlahHari = 31;
            } else {
                jumlahHari = 30;
            }
        }

        return "Jumlah Hari Pada Bulan " + comboBulan + " Tahun " + txtTahun + " adalah " + jumlahHari;
    }
}
