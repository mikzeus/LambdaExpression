package day21_datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
    public static void main(String[] args) {
        // Anlık Zaman nasıl alınır?

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        // Anlık zamanda bileşenler nasıl alınır?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        // Gelecek ve geçmiş zamana nasıl gidilir?

        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        // Zaman formatı nasıl değiştirlir?
        // Buyuk "HH" 24'lük saat sistemini, "hh" ise 12'lik saat sistemini kullanır.
        // "hh:mm a" ifadesindeki 'a' 12 lik saat sisteminde "AM" veya "PM" yazılmasını sağlar.
        //
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh.mm a");
        String formattedCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedCurrentTime);

        // Date formatı nasıl değiştirlir?
        LocalDate myCurrentDate= LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        // Tarihi ay gün yıl şekline çeviriniz
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MM/dd/yyyy");
       String formattedMyCurrentDate= dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);

        // Tarihi  gün/ay ismini ilk üç harf/yıl şekline çeviriniz
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedMyCurrentDate2 =dtf3.format(myCurrentDate).toUpperCase();
        System.out.println(formattedMyCurrentDate2);

        // Başka bir zaman dilimindeki tarih ve zaman nasıl ayarlanır?

        // Tokyo'da ayın kaçı? saat kaç
        LocalDate dateTokyo= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateTokyo);

        // Tashkent'te ayin kaci?
        LocalDate  dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);// 2023-03-16

        // Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);// 03:50:06.866277

        // Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:52:19.433288



    }
}
