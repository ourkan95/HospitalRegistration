import java.util.Random;


public class Insan {
 public String Ad;
 public Virus kVirus;
 public boolean hastalikDurum;
 public double iyilesmeOrani;
 public int iyilesen = 0;

 public Insan(String Ad, Virus kVirus, boolean hastalikDurum, double iyilesmeOrani) {

  this.Ad = Ad;
  this.hastalikDurum = hastalikDurum;
  this.iyilesmeOrani = iyilesmeOrani;
  this.kVirus = kVirus;

 }

 public Insan(String Ad) {
  this.Ad = Ad;
 }




 public String getAd() {
  return Ad;
 }


 public void setAd(String Ad) {
  this.Ad = Ad;
 }


 public Virus getkVirus() {
  return kVirus;
 }


 public void setkVirus(Virus kVirus) {
  this.kVirus = kVirus;
 }


 public boolean isHastalikDurum() {
  return hastalikDurum;
 }


 public void setHastalikDurum(boolean hastalikDurum) {
  this.hastalikDurum = hastalikDurum;
 }


 public double getIyilesmeOrani() {
  return iyilesmeOrani;
 }


 public void setIyilesmeOrani(double iyilesmeOrani) {
  this.iyilesmeOrani = iyilesmeOrani;
 }

 public Virus hastalikKap(Virus[] dizi) {

  double w = 0;
  for (int i = 0; i < dizi.length; i++) {
   w += dizi[i].getBulasOran();
  }
  Random random = new Random();
  int dice = random.nextInt((int) w + 1);
  double durum = 0;
  Virus result = new Virus();
  for (int i = 0; i < dizi.length; i++) {

   durum += dizi[i].getBulasOran();
   if (dice <= durum) {
    System.out.println(dizi[i]);

    result = dizi[i];
    kVirus = result;
    hastalikDurum = true;

    break;
   }

  }
  return result;
 }
 public boolean hastalikBulastir(Virus obj) {
  if (hastalikDurum == true) {
   return false;
  }

  return true;

 }
 public boolean iyiles() {
  int dice = (int)(Math.random() * 100) + 1;
  if (hastalikDurum == true) {
   if (dice >= iyilesmeOrani) {
    iyilesen = iyilesen + 1;
    return true;
   } else {
    return false;
   }
  } else {
   return true;
  }

 }


 public String toString() {

  String hd = Boolean.toString(hastalikDurum);
  String io = Double.toString(iyilesmeOrani);

  if (hastalikDurum == false && kVirus == null) {

   hd = "Sağlıklı";
   io = " 0 ";
   String kv = "yok";
   return "Hasta Adı: " + Ad + " Kaptığı virüs: " + kv + " Hastalık Durumu: " + hd + " İyileşme oranı:% " + io;
  } else {
   String hd2 = "Hasta";

   return "Hasta Adı: " + Ad + " Kaptığı virüs: " + kVirus.VirusAd + " Hastalık Durumu: " + hd2 + " İyileşme oranı:% " + io;
  }
 }


}