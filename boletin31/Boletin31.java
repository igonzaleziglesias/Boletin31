package boletin31;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin31 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> selec = new ArrayList<>();
        SeleccionFutbol futbolista = new Futbolista(3, "delantero", 1, 20, "carlos", "Blanco");
        SeleccionFutbol entrenador = new Entrenador(1, 2, 38, "antonio", "Cojera Maxima");
        SeleccionFutbol masajista = new Masajista("fisioterapeuta", 6, 3, 32, "Sara", "Rodriguez Martinez");
        SeleccionFutbol seleccionador = new Seleccionador(4, 40, "Diego", "Perez LLorente");
        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();
        seleccionador.concentrarse();
        selec.add(futbolista);
        selec.add(entrenador);
        selec.add(masajista);
        selec.add(seleccionador);

        for (SeleccionFutbol f : selec) {
            JOptionPane.showMessageDialog(null, f);
        }
                futbolista.ruedaPrensa();
    }

}
