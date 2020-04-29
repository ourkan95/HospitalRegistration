import java.util.ArrayList;
import java.util.Random;


public class Test {
 public static ArrayList < Virus > virusler = new ArrayList < > ();
 public static ArrayList < Virus > hastaListesi = new ArrayList < > ();
 public static void main(String[] args) {
  Virus corona = new Virus("corona", 40.0);
  Virus hiv = new Virus("hiv", 10.0);
  Virus grip = new Virus("grip", 80.0);
  Virus h1n1 = new Virus("h1n1", 30.0);
  Virus h5n1 = new Virus("h5n1", 25.0);
  Virus v = new Virus("v", 50);
  Insan ali = new Insan("ali veli", corona, true, 30);
  Insan ahmet = new Insan("ahmet mehmet", hiv, true, 10);
  Insan ayşe = new Insan("ayşe fatma", h5n1, true, 90);
  Insan mustafa = new Insan("mustafa mahmut", grip, true, 70);
  Insan yavuz = new Insan("yavuz selim", h1n1, true, 50);
  Insan hatice = new Insan("hatice su", v, true, 40);
  Insan[] dizi1 = new Insan[6];
  dizi1[0] = ali;
  dizi1[1] = ahmet;
  dizi1[2] = ayşe;
  dizi1[3] = mustafa;
  dizi1[4] = yavuz;
  dizi1[5] = hatice;
  Virus dizi[] = new Virus[6];
  dizi[0] = corona;
  dizi[1] = hiv;
  dizi[2] = grip;
  dizi[3] = h1n1;
  dizi[4] = h5n1;
  dizi[5] = v;

   
   hastaListesi(dizi1);
  System.out.println(virusler);
  //System.out.println(virusBulasmaOrani(dizi1, v));


 }
 public static ArrayList < Virus > hastaListesi(Insan[] dizi) {
     virusler.add(dizi[0].kVirus);
  for (int i = 0; i < dizi.length; i++) {
   System.out.println("Hasta adı : " + dizi[i].getAd() + " Kaptığı virüs: " + dizi[i].kVirus.VirusAd + " iyileşme oranı: " + dizi[i].iyilesmeOrani);
   boolean flag = true;
   for (int j = 0; j < virusler.size(); j++) {
    if (dizi[i].getkVirus().bulasOran == virusler.get(j).bulasOran) {

     flag = true;
    } else {
     flag = false;
    }

   }
   if (flag == false) {
    virusler.add(dizi[i].kVirus);

   }
  }

  return virusler;

 }
 public static double virusOrtalamaIyilesmeOrani(Insan[] dizi, Virus v) {
  int iyiles = 0;
  int toplam = 0;
  for (int i = 0; i < dizi.length; i++) {
   if (dizi[i].kVirus.VirusAd == "v") {
    if (dizi[i].iyiles() == true) {
     iyiles++;
     toplam++;

    } else {
     toplam++;

    }
   }
  }
  double oran = ((double) iyiles / (double) toplam) * 100;
  return oran;
 }
 public static double virusBulasmaOrani(Insan[] dizi, Virus v) {
  int toplam = 0;
  int enfekte = 0;

  for (int i = 0; i < dizi.length; i++) {
   Random rnd = new Random();
   int dice = rnd.nextInt(101);

   if (v.getBulasOran() > dice) {

    toplam++;
    enfekte++;

   } else {
    toplam++;

   }
  }


  return ((double) enfekte / (double) toplam) * 100;

 }
}