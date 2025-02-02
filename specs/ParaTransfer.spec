CathyLabs Uygulama
=====================
Created by MEC on 2.02.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
TC01 - Testinium-1 Para Transferi
----------------
Tags: PT_PT_001_Testinium1_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-1" hesabına "1000" tutarında para transferi yapılır

TC02 - Testinium-2 Para Transferi
----------------
Tags: PT_PT_002_Testinium2_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-2" hesabına "1000" tutarında para transferi yapılır

TC03 - Testinium-3 Para Transferi
----------------
Tags: PT_PT_003_Testinium3_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-3" hesabına "1000" tutarında para transferi yapılır

TC04 - Testinium-4 Para Transferi
----------------
Tags: PT_PT_004_Testinium4_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-4" hesabına "1000" tutarında para transferi yapılır

TC05 - Testinium-5 Para Transferi
----------------
Tags: PT_PT_005_Testinium5_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-5" hesabına "1000" tutarında para transferi yapılır

TC06 - -Amount Para Transferi
----------------
Tags: PT_PT_006_-Amount_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-1" hesabına "-1000" tutarında negatif para transferi yapılır

TC07 - Hesap Bakiyesinden Fazla Para Transferi
----------------
Tags: PT_PT_007_Hesap_Bakiyesinden_Fazla_Para_Transferi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* "Testinium-1" hesabına "100000000" tutarında para transferi yapılır

TC08 - Basarili Para Yukleme
----------------
Tags: PT_AM_001_Basarili_Para_Yukleme
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "1234123412341234" "Ahmet" "1026" "110" "100" girilir

TC09 - Para Yukleme Gecersiz Kart Numarasi
----------------
Tags: PT_AM_002_Para_Yukleme_Gecersiz_Kart_Numarasi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "12341234" "Ahmet" "1026" "110" "100" girilir basarisiz sonuc beklenir

TC10 - Para Yukleme Gecersiz Kart Sahibi Ismı
----------------
Tags: PT_AM_003_Para_Yukleme_Gecersiz_Kart_Sahibi_Ismı
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "1234123412341234" "23456" "1026" "110" "100" girilir basarisiz sonuc beklenir

TC11 - Para Yukleme Expiry Date Eski Tarih
----------------
Tags: PT_AM_004_Para_Yukleme_Expiry_Date_Eski_Tarih
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "1234123412341234" "Ahmet" "1022" "110" "100" girilir basarisiz sonuc beklenir

TC12 - Para Yukleme Hatali CVV Kodu
----------------
Tags: PT_AM_005_Para_Yukleme_Hatali_CVV_Kodu
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "1234123412341234" "Ahmet" "1026" "000" "100" girilir basarisiz sonuc beklenir

TC13 - Para Yukleme Negatif Amount Islem
----------------
Tags: PT_AM_006_Para_Negatif_Amount_Islem
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Kart bilgileri sırasıyla "1234123412341234" "Ahmet" "1026" "110" "-100" girilir basarisiz sonuc beklenir

TC14 - Basarili Account Name Degistirme
----------------
Tags: PT_EA_001_Basarili_Account_Name_Degistirme
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Hesap adi "Checking-hesap" olarak degistirilir

TC15 - Account Name Degistirme Hesap Adi Bos
----------------
Tags: PT_EA_002_Account_Name_Degistirme_Hesap_Adi_Bos
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Hesap adi "" olarak degistirme basarisiz olur hata verir

TC16 - Account Name Degistirme Hesap Adi Sadece Sayi
----------------
Tags: PT_EA_003_Account_Name_Degistirme_Hesap_Adi_Sadece_Sayi
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Hesap adi "123432" olarak degistirme basarisiz olur hata verir

TC17 - Account Name Degistirme Hesap Adi Gecersiz Karakter
----------------
Tags: PT_EA_004_Account_Name_Degistirme_Hesap_Adi_Gecersiz_Karakter
* "mehmetemin.coskun@testinium.com" maili ve "Testiniummec00" sifresi ile Login ol
* Hesap adi "*?-_=}][{½#£$" olarak degistirme basarisiz olur hata verir
