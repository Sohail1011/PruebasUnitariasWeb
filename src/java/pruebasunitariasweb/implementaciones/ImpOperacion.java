package pruebasunitariasweb.implementaciones;

import pruebasunitariasweb.classes.Operacion;
import pruebasunitariasweb.interfaces.IOperacion;

public class ImpOperacion implements IOperacion {

    @Override
    public double CalculaSuma(Operacion o) {
        try {
            double s = o.getNumero1() + o.getNumero2();
            return s;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaResta(Operacion o) {
        try {
            double r = o.getNumero1() - o.getNumero2();
            return r;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaMultiplicacion(Operacion o) {
        try {
            double m = o.getNumero1() * o.getNumero2();
            return m;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaDivision(Operacion o) {
        try {
            double d = o.getNumero1() / o.getNumero2();
            return d;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public void MostrarDatos(Operacion o) {
        System.out.println("Los resultados son: ");
        System.out.println("La suma es: " + o.getSuma());
        System.out.println("La resta es: " + o.getResta());
        System.out.println("La multiplicación es: " + o.getMultiplicacion());
        System.out.println("La división es: " + o.getDivision());
    }
}
