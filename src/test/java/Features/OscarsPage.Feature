Feature: Oscars sayfasi
  Scenario: The Jazz Singer filminin director, writer, stars bilgileri kayit edilir
    Given IMDb ana sayfasi acilir
    When Menu butonuna tiklanir
    When Award & Events basliginin altinda bulunan Oscars butonuna tiklanir
    When Event History basligi altinda yil secilir.
    When Honory Award basligi altinda The Jazz Singer secilir
    When Director bilgisi kayıt edilir
    When Writer bilgisi kayit edilir
    When Stars bilgisi kayit edilir
    When Ekranin sol üstünde bulunan IMDb butonuna tiklanarak Anasayfaya gidilir
    Then Director, Writer , Stars kayit edilenle ayni olup olmadigi kontrol edilir.