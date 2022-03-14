package Tema1.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Operatie {

    public Operatie(){};

    public Polinom sum(Polinom f, Polinom g){
        Polinom result = new Polinom();

        for(Monom singleMonomial1 : f.getPolinom()) {
            boolean matchingExponent = false;
            for(Monom singleMonomial2 : g.getPolinom()){

                if(singleMonomial1.getExponent() == singleMonomial2.getExponent()) {
                    Monom i = new Monom(singleMonomial1.getCoeficient() + singleMonomial2.getCoeficient(), singleMonomial1.getExponent());
                    result.getPolinom().add(i);
                    matchingExponent = true;
                }
            }
            if(!matchingExponent)
                result.getPolinom().add(singleMonomial1);
        }

        for(Monom singleMonomial1 : g.getPolinom()) {
            boolean matchingExponent = false;
            for(Monom singleMonomial2 : f.getPolinom()){
                if(singleMonomial1.getExponent() == singleMonomial2.getExponent()) {
                    matchingExponent = true;
                }
            }
            if(!matchingExponent)
                result.getPolinom().add(singleMonomial1);
        }

        return result;
    }

    public Polinom sub(Polinom f, Polinom g){
        Polinom result = new Polinom();

        for(Monom singleMonomial2 : g.getPolinom()){
            singleMonomial2.setCoeficient(singleMonomial2.getCoeficient() * (-1));
        }

        for(Monom singleMonomial1 : f.getPolinom()) {
            boolean matchingExponent = false;
            for(Monom singleMonomial2 : g.getPolinom()){

                if(singleMonomial1.getExponent() == singleMonomial2.getExponent()) {
                    Monom i = new Monom(singleMonomial1.getCoeficient() + singleMonomial2.getCoeficient(), singleMonomial1.getExponent());
                    result.getPolinom().add(i);
                    matchingExponent = true;
                }
            }
            if(!matchingExponent)
                result.getPolinom().add(singleMonomial1);
        }

        for(Monom singleMonomial1 : g.getPolinom()) {
            boolean matchingExponent = false;
            for(Monom singleMonomial2 : f.getPolinom()){
                if(singleMonomial1.getExponent() == singleMonomial2.getExponent()) {
                    matchingExponent = true;
                }
            }
            if(!matchingExponent)
                result.getPolinom().add(singleMonomial1);
        }

        return result;
    }

    public Polinom mul(Polinom f, Polinom g) {
        Polinom result1 = new Polinom();

        double maxExponent = 0;
        for(Monom singleMonomial1: f.getPolinom()){
            for(Monom singleMonomial2 : g.getPolinom()){
                if(maxExponent < singleMonomial2.getExponent() + singleMonomial1.getExponent())
                    maxExponent = singleMonomial1.getExponent() +  singleMonomial2.getExponent();
                Monom i = new Monom(singleMonomial1.getCoeficient() * singleMonomial2.getCoeficient(), singleMonomial1.getExponent() + singleMonomial2.getExponent());
                result1.getPolinom().add(i);
            }
        }

        Polinom result = new Polinom();

        while(maxExponent >= 0){
            Monom sum = new Monom();
            for(Monom singleMonomial : result1.getPolinom()){
                if(singleMonomial.getExponent() == maxExponent)
                    sum.setCoeficient(sum.getCoeficient() + singleMonomial.getCoeficient());
            }
            sum.setExponent(maxExponent);
            result.getPolinom().add(sum);
            maxExponent--;
        }

        return result;
    }

    public Polinom drv(Polinom f){
        Polinom result = new Polinom();
        for(Monom singleMonomial : f.getPolinom()){
            singleMonomial.setCoeficient(singleMonomial.getCoeficient() * singleMonomial.getExponent());
            if(singleMonomial.getExponent() != 0)
                singleMonomial.setExponent(singleMonomial.getExponent() - 1);
            else
                singleMonomial.setExponent(singleMonomial.getExponent());
            result.getPolinom().add(singleMonomial);
        }

        return result;
    }

    public Polinom intgr(Polinom f){
        Polinom result = new Polinom();
        for(Monom singleMonomial : f.getPolinom()){
            singleMonomial.setCoeficient(singleMonomial.getCoeficient() / (singleMonomial.getExponent() + 1));
            singleMonomial.setExponent(singleMonomial.getExponent() + 1);
            result.getPolinom().add(singleMonomial);
        }

        return result;
    }

    public  Polinom rez(String input){
        String mFormat = "([-+]?\\d+)x\\^(\\d+)";

        Pattern p = Pattern.compile(mFormat);
        Matcher m = p.matcher(input);

        Polinom poli = new Polinom();

        while(m.find()){
            Monom mono = new Monom();
            mono.coeficient = Double.parseDouble(m.group(1));
            mono.exponent = Double.parseDouble(m.group(2));
            poli.getPolinom().add(mono);

        }
        return poli;
    }
}
