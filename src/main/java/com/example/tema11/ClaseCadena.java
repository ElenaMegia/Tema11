package com.example.tema11;

public class ClaseCadena {
    public static String DevuelveIniciales(String cadena) {
        String iniciales = "";
        if (cadena != null && !cadena.isEmpty()) {
            String[] palabras = cadena.split(" ");
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    iniciales += palabra.charAt(0) + ".";
                }
            }
            iniciales = iniciales.toUpperCase();
        }
        return iniciales;
    }

    public static void lanzador() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        System.out.println(iniciales); // debería imprimir "A.D."

        iniciales = ClaseCadena.DevuelveIniciales("  ");
        System.out.println(iniciales); // debería imprimir ""

        iniciales = ClaseCadena.DevuelveIniciales(null);
        System.out.println(iniciales); // debería imprimir ""
    }
}
