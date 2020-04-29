
public class Virus {
    public String VirusAd;
    public double bulasOran;

public Virus(String VirusAd,double bulasOran){
    this.VirusAd=VirusAd;
    this.bulasOran=bulasOran;
    }
public Virus(){
    
}
public Virus(Virus v){
    this.bulasOran=bulasOran;
}
public String toString(){
    String str = Double.toString(bulasOran);
    return VirusAd+" "+str;
}

    public String getVirusAd() {
        return VirusAd;
    }


    public void setVirusAd(String VirusAd) {
        this.VirusAd = VirusAd;
    }


    public double getBulasOran() {
        return bulasOran;
    }


    public void setBulasOran(double bulasOran) {
        this.bulasOran = bulasOran;
    }
    
    
}
