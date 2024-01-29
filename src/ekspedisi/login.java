/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekspedisi;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class login {

    public record nota(String id_nota, String id_barang, String id_pengirim, 
        String id_penerima, String Status_Pengiriman, String id_detail_eks, LocalDate estimasi){};
    public static void main(String[] args) {
         ArrayList<nota> listNota = new ArrayList<>();
           
          LocalDate currentDate = LocalDate.now();
        LocalDate oneWeekLater = currentDate.plusWeeks(1);
        
        System.out.println(oneWeekLater);
    }   
    
}

