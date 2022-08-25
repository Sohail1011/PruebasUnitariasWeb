package pruebasunitariasweb.interfaces;

import pruebasunitariasweb.classes.Sueldo;

public interface ISueldo {

    public double CalcularBasico(Sueldo s);

    public double CalcularBonificacion1(Sueldo s);

    public double CalcularBonificacion2(Sueldo s);

    public double CalcularDescuento(Sueldo s);

    public double CalcularFinal(Sueldo s);

    public void MostrarResultados(Sueldo s);
}
