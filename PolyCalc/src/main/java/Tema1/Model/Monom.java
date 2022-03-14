package Tema1.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Monom  {

    public double coeficient;
    public double exponent;

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(double coeficient) {
        this.coeficient = coeficient;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }

    public Monom(){}

    public Monom(double coeficient, double exponent){
        this.coeficient = coeficient;
        this.exponent = exponent;
    }



    public String toString(){
        if(this.coeficient > 0.0D)
            return "+" + this.coeficient + "x^" + (int)this.exponent;
        else
            if(this.coeficient == 0)
                if(this.exponent == 0)
                    return "0";
                else return "";
            else
                return this.coeficient + "x^" + (int)this.exponent;

    }


}
