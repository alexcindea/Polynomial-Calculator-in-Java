package Tema1.Model;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom  {
    public List<Monom> polinom = new ArrayList();

    public List<Monom> getPolinom() {
        return polinom;
    }

    public void setPolinom(List<Monom> polinom) {
        this.polinom = polinom;
    }

    public Polinom(){}



    public String toString() {
        String poli = "";
        for(Monom mono:polinom){
            poli = poli + (mono.toString());
        }
        return poli;
    }



}
