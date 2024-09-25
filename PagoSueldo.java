package com.example.sueldo.model;

public class PagoSueldo {
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    private String puesto;
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    private String Nombre;

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int horas) {
        Horas = horas;
    }

    private int Horas;

    public int getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(int precioHora) {
        PrecioHora = precioHora;
    }

    private int PrecioHora;

    public String nuevoSalario(){
        double salarioFinal = 0;
        int resta =0;
        switch(puesto) {

            case "Tipo 1":
                if(Horas < 40){
                    salarioFinal=Horas*PrecioHora;
                }
                else{ if(Horas > 40){
                    resta=Horas-40;
                    salarioFinal=(Horas*PrecioHora)+(PrecioHora*1.5*resta);
                }

                }
                break;
            case "Tipo 2":
                if(Horas < 40){
                    salarioFinal=Horas*PrecioHora;
                }
                else{ if(Horas > 40){
                    resta=Horas-40;
                    salarioFinal=(Horas*PrecioHora)+(resta*2*PrecioHora);
                }

                }
                break;
            case "Tipo 3":
                if(Horas < 40){
                    salarioFinal=Horas*PrecioHora;
                }
                else{ if(Horas > 40){
                    resta=Horas-40;
                    salarioFinal=(Horas*PrecioHora)+(resta*2.5*PrecioHora);
                }

                }
                break;
            case "Tipo 4":
                if(Horas < 40){
                    salarioFinal=Horas*PrecioHora;
                }
                else{ if(Horas > 40){
                    resta=Horas-40;
                    salarioFinal=(Horas*PrecioHora)+(resta*3*PrecioHora);
                }

                }
        }
        return "Nombre:" + Nombre +
                "\nHoras Trabajadas:" + Horas +
                "\nPrecio por Hora:" + PrecioHora +
                "\nSalario Final:" + salarioFinal;
    }
}
