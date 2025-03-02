# BerPapirBySzR

Információk a programról:

- Az e-mail-ek elküldéséhez ki kell szedni a JDK mindenkori verziójának a conf/security/java.security fájlából ki kell kommentelni a 3 sort, aminek az első sorában szerepel a "disabled.tls" kifejezés. Enélkül az e-mail küldés nem működik.

- A programból a legtöbb paraméter nem állítható. Helyette a projekt config/ mappájában található fájlokon keresztül adhatóak át a szükséges paraméterek.

A hibák elkerülése miatt az adatok.csv-t, amit a program jelenleg beolvas, notepad-dal vagy notepad++-szal szabad szerkeszteni.

- A .pdf fájlokat a program a projekt files/ mappájából olvassa be.
    
