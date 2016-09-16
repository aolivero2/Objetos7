/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SERVIDOR
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public String validar (){
        String val;
        if (this.getHoras()<24 && this.getMinutos()<60 && this.getSegundos()<60){
            val="La hora es correcta";
        }else{
            val="La hora no es correcta";
        }
        return val;     
    }
    public String mostrar(){
        String aux;
        aux="La hora es: "+this.getHoras()+"\n"
             +"Los minutos son: "+this.getMinutos()+"\n"
              +"Los segundos son: "+this.getSegundos()+"\n";
             
        return aux;
    }
    public String igual (int h2,int mn2,int sg2){
        String aux2;
       if (this.getHoras()== h2 && this.getMinutos()== mn2 && this.getSegundos()== sg2){
           aux2="Las horas son iguales";
       }else{
           aux2="Las horas no son iguales";
       }
       return aux2;
    }
    public String menor (int h2,int mn2,int sg2){
       String aux3;
       if (this.getHoras()< h2 && this.getMinutos()< mn2 && this.getSegundos()< sg2){
           aux3="La hora es menor que la proporcionada";
       }else{
           aux3="La hora no es menor que la proporcionada";
       }
       return aux3;
    }
    public String mayor (int h2,int mn2, int sg2){
        String aux;
        if (this.getHoras()> h2 && this.getMinutos()> mn2 && this.getSegundos()> sg2){
            aux="La hora es mayor que la proporcionada";
        }else{
            aux="La hora no es mayor que la proporcionada";
        }
        return aux;
    }
}
