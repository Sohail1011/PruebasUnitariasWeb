package pruebasunitariasweb.implementaciones;

import pruebasunitariasweb.classes.Sueldo;
import pruebasunitariasweb.interfaces.ISueldo;

public class ImpSueldo implements ISueldo {

    @Override
    public double CalcularBasico(Sueldo s) {
        try {
            return s.getNumerohoras() * s.getCostoporhora();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
    }

    @Override
    public double CalcularBonificacion1(Sueldo s) {
        try {
            return s.getSueldobasico() * 0.09;
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
    }

    @Override
    public double CalcularBonificacion2(Sueldo s) {
        try {
            return s.getNumerohijos() * 30;
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
    }

    @Override
    public double CalcularDescuento(Sueldo s) {
        try {
            return s.getSueldobasico() * 0.03;
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
    }

    @Override
    public double CalcularFinal(Sueldo s) {
        try {
            return s.getSueldobasico() + s.getBonificacion1() + s.getBonificacion2() - s.getDescuento();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
    }

    @Override
    public void MostrarResultados(Sueldo s) {
        System.out.println("Los resultados son:");
        System.out.println("El sueldo basico es: " + s.getSueldobasico());
        System.out.println("La bonificacion 1: " + s.getBonificacion1());
        System.out.println("La bonificacion 2 es: " + s.getBonificacion2());
        System.out.println("El descuento es: " + s.getDescuento());
        System.out.println("El sueldo final es: " + s.getSueldofinal());
    }

}
