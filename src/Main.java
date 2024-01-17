//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Sitio oficial de Java https://www.oracle.com/java/

        // Esto es un comentario de una liena.

        /*
            Y este es un comentario
            de varias
            lienas
         */

        // Variables y constantes.
        var variableEjemplo1 = 1;
        final String javaName = "Java";

        // Tipos de datos primitivos.
        // Numericos.

        // Enteros.
        byte enteroDe8Bits = 127; // rango de -128 a 127.
        short enteroDe16Bits = 32767; // rango de -32,768 a 32,767.
        int enteroDe32Bits = 34546782; // rango de -2^31 a 2^31-1.
        long enteroDe64Bits = 123456789L; // rango de -2^63 a 2^63-1.

        // Punto flotante
        float numeroFlotanteDe32Bits = 3.14f; // precisión de 6-7 dígitos decimales.
        double numeroFlotanteDe64Bits = 10.1; // precisión de 15 dígitos decimales.

        // Caracter
        char caracter = 'A'; // representa un unico caracter aA-zZ,0-9;

        // Booleano
        boolean booleanos = true; // representa un valor de verdad, true o false.

        System.out.println("¡Hola " + javaName + "!");
    }
}