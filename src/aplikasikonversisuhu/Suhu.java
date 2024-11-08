/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikonversisuhu;

/**
 *
 * @author user
 */
public class Suhu {
    private double suhu;
    
    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }
    //konversi celcius ke semua
    public double celsiusToFahrenheit() {
        return (suhu * 9.0/5) + 32;
    }
    
    public double celsiusToKelvin() {
        return suhu + 273.15;
    }

    public double celsiusToReamur() {
        return suhu * 4.0/5;
    }
    
    //konversi fahrenhait ke semua
    public double fahrenheitToCelsius() {
        return (suhu - 32) * 5.0/9;
    }

    public double fahrenheitToKelvin() {
        return (suhu - 32) * 5.0/9 + 273.15;
    }

    public double fahrenheitToReamur() {
        return (suhu - 32) * 4.0/9;
    }
    
    //konversi kelvin ke semua
    public double kelvinToCelsius() {
        return suhu - 273;
    }

    public double kelvinToFahrenheit() {
        return (suhu - 273) * 9.0/5 + 32;
    }

    public double kelvinToReamur() {
        return (suhu - 273) * 4.0/5;
    }
    
    //konversi reamur ke semua
    public double reamurToCelsius() {
        return suhu * 5.0/4;
    }

    public double reamurToFahrenheit() {
        return (suhu * 9.0/4) + 32;
    }

    public double reamurToKelvin() {
        return (suhu * 5.0/4) + 273;
    }
}
