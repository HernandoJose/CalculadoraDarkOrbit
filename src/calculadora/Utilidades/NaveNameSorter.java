package calculadora.Utilidades;

import java.util.Comparator;

import calculadora.Modelo.Nave;

public class NaveNameSorter implements Comparator<Nave> 
{
    @Override
    public int compare(Nave nave1, Nave nave2) {
        return nave1.getNombreNave().compareToIgnoreCase(nave2.getNombreNave());
    }
}