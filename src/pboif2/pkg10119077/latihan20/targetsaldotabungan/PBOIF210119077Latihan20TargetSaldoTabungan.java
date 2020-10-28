/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan20.targetsaldotabungan;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Target Saldo Tabungan
 */
public class PBOIF210119077Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bunga,total,totalBunga;
        int saldoTarget,i,saldoAwal;
        
        saldoAwal = 3500000;
        bunga = 0.08;
        saldoTarget = 6000000;
        i=1;
        
        
        do{
            totalBunga = saldoAwal * bunga;
            total = totalBunga + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n",+total);
            saldoAwal += totalBunga;
            i++ ;
        } while (total <= saldoTarget);
    }
    
}
