package pruebasunitariasweb.interfaces;

import pruebasunitariasweb.classes.Operacion;

public interface IOperacion {

    public double CalculaSuma(Operacion o);

    public double CalculaResta(Operacion o);

    public double CalculaMultiplicacion(Operacion o);

    public double CalculaDivision(Operacion o);

    public void MostrarDatos(Operacion o);
}
