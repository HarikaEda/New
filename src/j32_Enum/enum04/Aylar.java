package j32_Enum.enum04;

public enum Aylar {
 // OCAK(31,"kış","Abdi Bey"),
  ŞUBAT(28),
  MART(31),
  NİSAN(30),
  MAYIS(31),
  HAZİRAN(30),
  TEMMUZ(31),
  AĞUSTOS(31),
  EYLÜL(30),
  EKİM(31),
    KASIM(30),
  ARALIK(31);
int gunSayısı;

    //Aylar(int gunSayısı,String mevsim,String birthday) {//enum fiels a paarmetre cons. tanımlandı}

    Aylar(int gunSayısı) {
       this.gunSayısı=gunSayısı;
    }

    void gunSayısı() {
        System.out.println(gunSayısı);
    }
}
