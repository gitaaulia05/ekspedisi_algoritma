/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekspedisi;

import java.util.*;
public class Ekspedisi {
  
    public record penerima(String id_penerima, String nama, String alamat, String nomor_hp ){};
    public record barang(String id_barang, String nama_barang, String ukuran, int harga_barang){};
    public record pengirim(String id_pengirim, String nama, String alamat, long no_hp){};
    public record ekspedisi(String id_ekspedisi, String nama_ekspedisi, int harga_berat){};
    public record jadwal(String id_jadwal, String Tanggal, String estimasi){};
    public record nota(String id_nota, String[] id_barang, String id_pengirim, 
        String id_penerima,String Status_Pengiriman, String id_detail_eks){};
    public record detail_ekspedisi_jadwal(String id_detail_eks, String id_ekspedisi, String nama_ekspedisi, String estimasi, String id_jadwal){};

    
    
    private static void displayLogin() {
        // DISINI
        System.out.println("+---+-----------------------------+");      
        System.out.println("| No|            Menu             |");
        System.out.println("+---+-----------------------------+");  
        System.out.println("| 1 | login admin                 |");
        System.out.println("+---+-----------------------------+");       
        System.out.println("| 2 | login user                  |");
        System.out.println("+---+-----------------------------+");       
        System.out.println("| 3 | Registrasi User             |");
        System.out.println("+---+-----------------------------+");       
        System.out.println("| 4 | Keluar                      |");
        System.out.println("+---+-----------------------------+");
        System.out.print("Masukkan Jenis Login : ");
    }
    
    private static void displayRegister(Scanner input,  ArrayList<penerima> listPenerima){
             System.out.println("");
             String id_penerimaR = null;
             if(listPenerima.isEmpty()){
                  id_penerimaR = "P" + 1;
             } 
             
             if(!listPenerima.isEmpty()){
                  int lpPanjang = listPenerima.size();
                  int nextLp = lpPanjang + 1;
                  id_penerimaR = "P" + nextLp;
             }
                
                  input.nextLine();
                  System.out.print("Masukkan Nama : ");
                  String namaR = input.nextLine();
                  System.out.print("Masukkan alamat : ");
                  String alamatR = input.nextLine();
                  System.out.print("Masukkan Nomor Hp : ");
                  String no_hpR = input.nextLine();
                  System.out.println("");
                    System.out.println("Id akun anda : " + id_penerimaR);
                    System.out.println("Nama akun anda : " + namaR);
                    System.out.println("Akun berhasil terdaftar silahkan kembali ke menu Login Dengan Id dan Nama akun anda !");
                    penerima pn = new penerima(id_penerimaR, namaR, alamatR, no_hpR);
                    listPenerima.add(pn);
    }

    private static void displaySubMenuAdmin() {
        // DISINI
        System.out.println("+---+-----------------------------+");        
        System.out.println("| No|            Menu             |");
        System.out.println("+---+-----------------------------+");       
        System.out.println("| 1 | Kirim Barang                |");
        System.out.println("+---+-----------------------------+");        
        System.out.println("| 2 | Status Pengiriman           |");
        System.out.println("+---+-----------------------------+");        
        System.out.println("| 3 | Keluar                      |");
        System.out.println("+---+-----------------------------+");
        System.out.print("Pilih Menu : ");
    }
    
    private static void displaySubMenuUser(){
        // DISINI
        System.out.println("+---+-----------------------------+");        
        System.out.println("| No|            Menu             |");
        System.out.println("+---+-----------------------------+");        
        System.out.println("| 1 | Riwayat Transaksi           |");
        System.out.println("+---+-----------------------------+");        
        System.out.println("| 2 | Keluar                      |");
        System.out.println("+---+-----------------------------+");
        System.out.print("Pilih Menu : ");
    }

    public static void main(String[] args) {
     
        pengirim[] listPengirim = new pengirim[1];
       listPengirim[0] = new pengirim("R01", "rFitz", "sukamenak", 85871589916L);
        
      ekspedisi[] listEkspedisi = new ekspedisi[6];
      listEkspedisi[0] = new ekspedisi("JE1", "J&T Ekonomi", 4000);
      listEkspedisi[1] = new ekspedisi("JE2", "J&T Express", 45000);
      listEkspedisi[2] = new ekspedisi("ICD1", "Indah Cargo Darat ", 4000);
      listEkspedisi[3] = new ekspedisi("ICE2", "Indah Cargo Express ", 4000);
      listEkspedisi[4] = new ekspedisi("JNR1", "JNE Reguler", 4000);
      listEkspedisi[5] = new ekspedisi("JN02", "JNE Oke", 4500);
      

        
      barang[] listBarang = new barang [5];
              listBarang[0] = new barang("B01" , "Kemeja" , "S" , 25000);
              listBarang[1] = new barang("B02" , "Kemeja" , "L" ,  30000);
              listBarang[2] = new barang("B03" , "Kemeja" , "M" ,  31000);
              listBarang[3] = new barang("B04" , "Kemeja" , "XL" ,  33000);
              listBarang[4] = new barang("B05" , "Sarung Tangan" , "satu ukuran" , 25000);

           ArrayList<penerima> listPenerima = new ArrayList<>();
           ArrayList<nota> listNota = new ArrayList<>();
           ArrayList<jadwal> listJadwal = new ArrayList<>();
           ArrayList<detail_ekspedisi_jadwal> listdetEksJad = new ArrayList<>();
           
       Scanner input = new Scanner(System.in);
              // DISINI
        System.out.println("+---------------------------------+");       
        System.out.println("|   Program Ekspedisi Konveksi    |");
        System.out.println("+---------------------------------+");
        System.out.println("");
        
     

          int p_menu;

        do {
           displayLogin();
           p_menu = input.nextInt();
           
            switch (p_menu) {
                case 1:
                    // Perform action for option 1
                    System.out.println("Anda masuk sebagai admin ");
                    System.out.println("");
                    input.nextLine();
                    System.out.print("Masukkan id admin : ");
                    String id_pengirim = input.nextLine();
                    System.out.print("Masukkan nama Admin : ");
                    String nama_pengirim = input.nextLine();
                  
                    boolean idValid = false;
                    boolean Nama = false;
                    for(pengirim m : listPengirim){
                    if(id_pengirim.equals(m.id_pengirim)){
                       idValid = true;
                       if( nama_pengirim.equals(m.nama())){
                           Nama = true;
                           System.out.println("Halo admin " + m.nama());
                         handleSubMenuAdmin(input, listNota, listPenerima, listBarang, listEkspedisi,  listJadwal, listdetEksJad);
                       }
                } 
                  }
                    
                    if(!idValid){
                         System.out.println("Id yang anda masukkan salah");
                     } else if(!Nama){
                         System.out.println("Nama yang anda masukkan salah");
                     }     
                    break;
                case 2:
                    // Perform action for option 2
                    System.out.println("Anda masuk sebagai user"); 
                    System.out.println("");  
                    input.nextLine();
                    System.out.print("Masukkan id user : ");
                    String id_penerima = input.nextLine();
                    System.out.print("Masukkan nama user : ");
                    String nama_penerima= input.nextLine();
                      boolean idValidUser = false;
                    boolean NamaUser = false;
                    for(penerima p : listPenerima){
                    if(id_penerima.equals(p.id_penerima)){
                        idValidUser = true;
                         if(nama_penerima.equals(p.nama())) {
                              System.out.println("Halo  " + p.nama);      
                     handleSubMenuUser(input , listPenerima , id_penerima, listNota, listBarang, listdetEksJad);
                         }
            }      
            }
                      if(!idValidUser){
                         System.out.println("Id yang anda masukkan salah");
                     } else if(!NamaUser){
                         System.out.println("Nama yang anda masukkan salah");
                     }  
                     break;
                case 3:
                   System.out.println("");
                   System.out.println("Registrasi Akun");
                   displayRegister(input, listPenerima);
                    break;
                case 4 :
                   System.out.println("program Berakhir Terimakasih !");
                   break;
                default:
                    System.out.println("Pilihan tidak sesuai coba lagi");
            }
        } while (p_menu != 4);

    
        input.close();
    }
    
                    
    private static void handleSubMenuAdmin(Scanner input,  ArrayList<nota> listNota , ArrayList<penerima> listPenerima, barang[] listBarang, ekspedisi[] listEkspedisi, ArrayList<jadwal> listJadwal , ArrayList<detail_ekspedisi_jadwal> listdetEksJad) {
    int subChoice;
        do {
            displaySubMenuAdmin();
            subChoice = input.nextInt();
            
            switch (subChoice) {
                // INI MENU BUAT ADMIN INPUT BARANG
                case 1:
                    
                    System.out.println("+---------------------------------------+");                
                    System.out.println("|              List User                |");
                    System.out.println("+---------------------------------------+");                    
                    System.out.println("");
                    
                for(penerima p : listPenerima){                    
                    System.out.println("+---------------------------------------+");
                    System.out.println("| Id Penerima : " + p.id_penerima());                   
                    System.out.println("+---------------------------------------+");
                    System.out.println("| Nama Penerima : " + p.nama());                    
                    System.out.println("+---------------------------------------+");
                    System.out.println("| Alamat Penerima : " + p.alamat());                    
                    System.out.println("+---------------------------------------+");
                    System.out.println("| Nomor Hp : " + p.nomor_hp());                   
                    System.out.println("+---------------------------------------+");
                    System.out.println("");
                }

                    // DISINI
                System.out.println("+---------------------------------------+");                
                System.out.println("|           Menu Kirim Barang           |");
                System.out.println("+---------------------------------------+");
                System.out.println("");
                
                System.out.print("Berapa penerima yang mendapat kiriman ? ");
                 int numPenerima;
                numPenerima = input.nextInt();
                input.nextLine();   
                   System.out.println("");
                     for (int i =0; i < numPenerima; i++){
                     System.out.println("--------------------------------------------");
                     System.out.println("Masukkan Id Penerima ke-"+(i+1)+ " : ");
                     String id_penerima = input.nextLine();
                     for(penerima p : listPenerima) {
                     if (p.id_penerima().equalsIgnoreCase(id_penerima)) {
                     String nama = p.nama();
                     System.out.println("Nama Penerima ke-" + (i+1) + " : " + nama);
                     String alamat = p.alamat();
                     System.out.println("Alamat Penerima ke-" + (i+1) + " : " + alamat);
                     String no_hp = p.nomor_hp();
                     System.out.println("Nomor Hp Penerima ke-" + (i+1) + " : " + no_hp);
                     System.out.println("Klik enter untuk memasukkan barang");
                           }
                     }
                      
                   input.nextLine();
                     
                    int total_berat=0;
                    int total_harga=0;
                    
                    // DISINI
                         System.out.println("=====================================");
                         System.out.println("          Tabel Barang       ");
                    for(barang br : listBarang){
                        System.out.println("+----------------------------------+");                        
                        System.out.println("| No Barang   : " + br.id_barang());
                        System.out.println("+----------------------------------+");                        
                        System.out.println("| Nama Barang : " + br.nama_barang);
                        System.out.println("+----------------------------------+");                        
                        System.out.println("| Ukuran      : " + br.ukuran());
                        System.out.println("+----------------------------------+");                        
                        System.out.println("| Harga       : " + br.harga_barang()); 
                        System.out.println("+----------------------------------+");
                                 System.out.println("");
                    }
                        System.out.println("=====================================");
                         System.out.print("Masukkan Nama Barang : ");
                      String j_barang1 = input.nextLine();
                      // DISINI
                                 for(barang b : listBarang){
                                 if(b.nama_barang().equalsIgnoreCase(j_barang1)) {
                                 System.out.println("+----------------------------------+");                        
                                 System.out.println("| No Barang   : " + b.id_barang());
                                 System.out.println("+----------------------------------+");                        
                                 System.out.println("| Nama Barang : " + b.nama_barang());
                                 System.out.println("+----------------------------------+");                        
                                 System.out.println("| Ukuran      : " + b.ukuran());
                                 System.out.println("+----------------------------------+");                        
                                 System.out.println("| Harga       : " + b.harga_barang()); 
                                 System.out.println("+----------------------------------+");
                                 System.out.println("");
                                  }
                             }

                System.out.print("Masukkan Nomor Barang (pisahkan dengan koma jika lebih dari satu): ");
                String kode = input.nextLine();
                System.out.println("");
                String[] listKode = kode.split(", ");
                int getKategori =  listKode.length;
                LinkedList<String> listKodeValid = new LinkedList<>();
                
                   for (String currentKode : listKode) {
                    boolean barangDitemukan = false;
                    int jumlahBuku = listBarang.length;
                    while (!barangDitemukan) {
                        for(barang ba : listBarang){
                            
                        if (ba.id_barang.equals(currentKode)) {
                            System.out.println("");
                            // DISINI
                            System.out.println("+----------------------------------+");                            
                            System.out.println("| Barang dengan id : "  + currentKode);
                            System.out.println("+----------------------------------+");                            
                            System.out.println("| Nama Barang      : " + ba.nama_barang());
                            System.out.println("+----------------------------------+");                            
                            System.out.println("| Size             : " + ba.ukuran());
                            System.out.println("+----------------------------------+");                            
                            System.out.println("| Harganya         : " + ba.harga_barang());
                            System.out.println("+----------------------------------+");
                            System.out.println("");
                                 while (true) {
                            System.out.print("Masukkan Kuantitas barang : ");
                            int qty = input.nextInt();
                            if(qty<6){
                                System.out.println("Kuantitas yang anda masukkan kurang dari minimum");
                            } else {
                              total_harga = qty * ba.harga_barang();
                              System.out.println("");
                                System.out.println("Harga Barang Anda : " + total_harga);
                              System.out.println("");
                                    barangDitemukan = true;
                            listKodeValid.add(currentKode);
                            break;  // Keluar dari loop jika buku sudah ditemukan
                            }
                          }
                        } 
                     }   
                  }
                 }
                   
                     System.out.println("=======================================================================");
                  

                     System.out.println("List Jasa Ekspedisi");
                           for(int E=0; E<listEkspedisi.length; E++) {
                               // DISINI
                               System.out.println("+------------------------------------------+");                               
                               System.out.println("| No                  : " + listEkspedisi[E].id_ekspedisi);
                               System.out.println("+------------------------------------------+");                               
                               System.out.println("| Nama Ekspedisi      : " + listEkspedisi[E].nama_ekspedisi());
                               System.out.println("+------------------------------------------+");                              
                               System.out.println("| Harga berat perkilo : " + listEkspedisi[E].harga_berat());
                               System.out.println("+------------------------------------------+");
                               System.out.println("");
                           }
                        input.nextLine();
                      System.out.print("Pilih Ekspedisi untuk penerima ke-" + (i+1)+ " : ");
                      String p_Ekspedisi = input.nextLine();
                      
                    ekspedisi ek = null;
                        for(ekspedisi e : listEkspedisi){
                            if(p_Ekspedisi.equals(e.id_ekspedisi)){
                                String id_ekspedisi = e.id_ekspedisi();
                                System.out.println("Jasa ekspedisi yang anda pilih : " + e.nama_ekspedisi());
                                System.out.print("Masukkan total berat barang yang akan dikirim : " );
                                total_berat = input.nextInt();
                                int  h_barang = total_berat * e.harga_berat();
                                System.out.println("");
                                System.out.println("Harga pengiriman yang harus dibayar penerima ke-" + (i+1) + " adalah : Rp."+ h_barang);
                                int t_keseluruhan = h_barang + total_harga;
                                System.out.println("");
                                System.out.println("Harga Total Untuk seluruh pesanan penerima ke-" + (i+1) + " adalah : Rp." + t_keseluruhan );
                                System.out.println("");
                                ek = e;
                             
                            }
                        }
                        
                        String id_jadwal = null;
                     if(listJadwal.isEmpty()){
                         id_jadwal = "JO" + (i+1);
                     } 
                     if(!listJadwal.isEmpty()) {
                         int panjangJadwal = listJadwal.size();
                         int nextJadwal = panjangJadwal + 1;
                         id_jadwal = "J0" + (nextJadwal);
                      }
                     input.nextLine();
                      System.out.print("Masukkan tanggal akan dikirim : ");
                      String tanggal = input.nextLine();
                      System.out.print("Masukkan tanggal estimasi: ");
                      String estimasi = input.nextLine();
                      System.out.print("Masukkan Status Pengiriman (0 untuk dalam perjalanan, 1 untuk sudah diterima) : ");
                      String status_pengiriman = input.nextLine();
                      
                      String id_nota = null ;
                       if(listNota.isEmpty()) {
                        id_nota = "NTA"+(i+1);
                        } 
                       
                        String[] listKodeDitemukan = listKodeValid.toArray(new String[0]);
                        if(!listNota.isEmpty() && listKodeDitemukan.length > 0) {
                            int panjang = listNota.size();
                            int nextIndex = panjang + 1;
                             id_nota = "NTA" + nextIndex;
                        }
                        
                           String id_dej = null ;
                         if( listdetEksJad.isEmpty()) {
                        id_nota = "DEJ"+(i+1);
                        } 
                       
                        String[]  listdetEksJadDitemukan = listKodeValid.toArray(new String[0]);
                        if(!listdetEksJad.isEmpty() && listdetEksJadDitemukan.length > 0) {
                            int panjang =  listdetEksJad.size();
                            int nextIndex = panjang + 1;
                             id_nota = "DEJ" + nextIndex;
                        }
                        
                        
                      System.out.println("");
                      String id_pengirim = "R01";
                      nota nta = new nota(id_nota, listKodeDitemukan, id_pengirim, id_penerima,status_pengiriman , id_dej);
                      jadwal jad = new jadwal(id_jadwal, tanggal, estimasi);
                      detail_ekspedisi_jadwal  dej = new detail_ekspedisi_jadwal ( id_dej, ek.id_ekspedisi(), ek.nama_ekspedisi(), estimasi , id_jadwal);
                      listNota.add(nta);
                      listJadwal.add(jad);
                      listdetEksJad.add(dej);
                     }
                    break;
                case 2:
                    // Perform action for sub-option 2
                    System.out.println("Status Pengiriman Barang");
                    
                    System.out.println("+-----------------------------------+");                    
                    System.out.println("|            List Nota              |");
                    System.out.println("+-----------------------------------+");   
                    String id_dej = null;
                    for(nota nta : listNota){
                    id_dej = nta.id_detail_eks();
                    System.out.println("| Nota Dengan Id    :" + nta.id_nota );                         
                    System.out.println("+-----------------------------------+");
                    System.out.println("| Penerima nya      : " + nta.id_penerima);                         
                    System.out.println("+-----------------------------------+");
                    System.out.println("| Status Pengiriman : " + nta.Status_Pengiriman());                         
                    System.out.println("+-----------------------------------+");
                    System.out.println("");                 
                    }
                    System.out.println("");  
                   
                    input.nextLine();
                    System.out.print("Masukkan id Nota : ");
                    String id_notas = input.nextLine();  
                     boolean notaFound = false;
                       Iterator<nota> iterator = listNota.iterator();
                          while (iterator.hasNext()) {
                              nota n = iterator.next();
                         if (n.id_nota().equalsIgnoreCase(id_notas)) {
                             // DISINI
                             System.out.println("+-----------------------------------+");                             
                             System.out.println("| Nota Dengan Id    : " + n.id_nota);
                             System.out.println("+-----------------------------------+");                             
                             System.out.println("| Penerima nya      : " + n.id_penerima);
                             System.out.println("+-----------------------------------+");                             
                             System.out.println("| Status Pengiriman : " + n.Status_Pengiriman());
                             System.out.println("+-----------------------------------+");                             
                             System.out.println("| id Barang         : " + Arrays.toString(n.id_barang()));
                             System.out.println("+-----------------------------------+");
                             
                             System.out.println("Detail Barang Yang dikirim");
                             
                        for (int i = 0; i <n.id_barang().length; i++) {
                        String currentKode = n.id_barang()[i];

                        barang barangStat = null;
                        for (barang bStat : listBarang) {
                            if (bStat.id_barang.equals(currentKode)) {
                                barangStat = bStat;
                                break;
                            }
                        }
           
                        if (barangStat != null) {
                            // DISINI
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Id Barang    : " + barangStat.id_barang());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Nama Barang  : " + barangStat.nama_barang());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Ukuran Baran : " + barangStat.ukuran());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Harga Barang : " + barangStat.harga_barang());
                            System.out.println("+-----------------------------------+");
                        }
                    }
                             
                             System.out.println("");
                            
                             String id_pengirim = n.id_pengirim();
                             String id_penerima = n.id_penerima();
                             String[] id_barang = n.id_barang();
                             System.out.println("");
                             System.out.print("Update Status Pengiriman : " );
                             String status_pengiriman = input.nextLine();
                             System.out.println("");
                             System.out.println("Update Status Pengiriman Berhasil !");
                             iterator.remove();
                             nota nta = new nota(n.id_nota, id_barang, id_pengirim, id_penerima,status_pengiriman, id_dej);
                             listNota.add(nta);
                             notaFound = true;
                               break;
                      }
                          }
                       if (!notaFound) {
                        System.out.println("Nota dengan ID " + id_notas + " tidak ditemukan");
                }
                     
                    break;
                case 3:
                    System.out.println("Kembali ke menu Login");
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai coba lagi");
            }
        } while (subChoice != 3);
    }
    
   private static void handleSubMenuUser(Scanner input, ArrayList<penerima> listPenerima, String id_penerima, ArrayList<nota> listNota, barang[] listBarang,  ArrayList<detail_ekspedisi_jadwal> listdetEksJad ){
       int subChoiceUser;
       do {
           displaySubMenuUser();
             subChoiceUser = input.nextInt();
             input.nextLine();
                boolean idPenerimaDitemukan = false;
             switch (subChoiceUser) {
                case 1:
                    // Perform action for sub-option 1
                    System.out.println("Riwayat Transaksi");
                    System.out.println("");
                    // LOOP ID PENERIMA
                      for(penerima p : listPenerima){
                       if(id_penerima.equals(p.id_penerima())) {
                           // GET ID PENERIMA UNTUK DI SAMAKAN DENGAN LOOP
                           System.out.println("Nama Anda " + p.nama());
                           System.out.println("");
                           // LOOP NOTA 
                          for(nota n : listNota){
                              // SAMAKAN ID NOTA DENGAN DATA YANG DIDALAM NOTA 
                              // DISINI
                               if(id_penerima.equals(n.id_penerima())) {
                              System.out.println("+-----------------------------------+");                             
                              System.out.println("| Id Nota Anda : " + n.id_nota);
                              System.out.println("+-----------------------------------+");                             
                              System.out.println("| Detail Barang ");
                         
                        for (int i = 0; i <n.id_barang().length; i++) {
                        String currentKode = n.id_barang()[i];

                        barang barangStat = null;
                        for (barang bStat : listBarang) {
                            if (bStat.id_barang.equals(currentKode)) {
                                barangStat = bStat;
                                break;
                            }
                        }

                        if (barangStat != null) {
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Id Barang    : " + barangStat.id_barang());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Nama Barang  : " + barangStat.nama_barang());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Ukuran Barang : " + barangStat.ukuran());
                            System.out.println("+-----------------------------------+");                            
                            System.out.println("| Harga Barang : " + barangStat.harga_barang());
                            System.out.println("+-----------------------------------+");
                        }
                    }
                                  for(detail_ekspedisi_jadwal j : listdetEksJad){
                                      System.out.println("| Estimasi Barang Diterima : " + j.estimasi);
                                      System.out.println("+-----------------------------------+");
                                       System.out.println("| Nama Ekspedisi : " + j.nama_ekspedisi);
                                      System.out.println("+-----------------------------------+");
                                  } 
                                
                                   System.out.println("| Status Pengiriman : " + n.Status_Pengiriman());
                                   System.out.println("+-----------------------------------+");  
                                   System.out.println("");
                                   idPenerimaDitemukan = true;
                               } 
                          } 
                       } 
                    }
               
                 if (listNota.isEmpty()) {
                System.out.println("Riwayat transaksi Anda masih kosong");
             } 
                       if(idPenerimaDitemukan && listNota.isEmpty()) {
                       System.out.println("Riwayat transaksi Anda masih kosong");
                       }
                    break;
                case 2:
                    System.out.println("Kembali ke menu Login");
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai coba lagi");
            }
       } while(subChoiceUser != 2);
   }

}