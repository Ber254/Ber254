package ej04_pooherenciaextra.utilidades;

import java.util.Scanner;

/**
 *
 * @author Luve
 */
public final class EntradaDatos {

    private Scanner r;

    public EntradaDatos() {
        r = new Scanner(System.in);
    }

    public Scanner getR() {
        return r;
    }

    public void setR(Scanner r) {
        this.r = r;
    }

    public String pedirYdevolverTexto() throws Exception{
        System.out.println("Ingrese el valor de texto: ");
        return r.next();
    }

    public Integer pedirYdevolverNumero() throws Exception{
        System.out.println("Ingrese el valor de numérico: ");
        return r.nextInt();
    }

}
