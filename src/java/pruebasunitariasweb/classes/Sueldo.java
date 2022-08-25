package pruebasunitariasweb.classes;

public class Sueldo {

    private double numerohoras;
    private double costoporhora;
    private double sueldobasico;
    private int numerohijos;
    private double bonificacion1;
    private double bonificacion2;
    private double descuento;
    private double sueldofinal;

    public Sueldo() {
    }

    public Sueldo(double numerohoras, double costoporhora, double sueldobasico, int numerohijos, int bonificacion1, int bonificacion2, double descuento, double sueldofinal) {
        this.numerohoras = numerohoras;
        this.costoporhora = costoporhora;
        this.sueldobasico = sueldobasico;
        this.numerohijos = numerohijos;
        this.bonificacion1 = bonificacion1;
        this.bonificacion2 = bonificacion2;
        this.descuento = descuento;
        this.sueldofinal = sueldofinal;
    }

    public double getNumerohoras() {
        return numerohoras;
    }

    public void setNumerohoras(double numerohoras) {
        this.numerohoras = numerohoras;
    }

    public double getCostoporhora() {
        return costoporhora;
    }

    public void setCostoporhora(double costoporhora) {
        this.costoporhora = costoporhora;
    }

    public double getSueldobasico() {
        return sueldobasico;
    }

    public void setSueldobasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public int getNumerohijos() {
        return numerohijos;
    }

    public void setNumerohijos(int numerohijos) {
        this.numerohijos = numerohijos;
    }

    public int getBonificacion1() {
        return (int) bonificacion1;
    }

    public void setBonificacion1(int bonificacion1) {
        this.bonificacion1 = bonificacion1;
    }

    public int getBonificacion2() {
        return (int) bonificacion2;
    }

    public void setBonificacion2(int bonificacion2) {
        this.bonificacion2 = bonificacion2;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldofinal() {
        return sueldofinal;
    }

    public void setSueldofinal(double sueldofinal) {
        this.sueldofinal = sueldofinal;
    }
}
