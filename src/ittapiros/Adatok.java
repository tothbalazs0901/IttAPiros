
package ittapiros;

public class Adatok {
    private int golyoHelye;
    private String jatekMod;
    private String allapot;
    private String keveres;

    public Adatok(String sor) {
        String [] s = sor.split(";");
        this.golyoHelye = Integer.parseInt(s[0]);
        this.jatekMod = s[1];
        this.allapot = s[2];
        this.keveres = s[3];
    }

    public int getGolyoHelye() {
        return golyoHelye;
    }

    public String getJatekMod() {
        return jatekMod;
    }

    public String getAllapot() {
        return allapot;
    }

    public String getKeveres() {
        return keveres;
    }
    
    

    
}
