public class MultiplicacionRecursiva {
    public static int multiplicar(int multiplicando, int multiplicador) {
        // Caso base 1: Si el multiplicador es 0, el resultado es 0.
        if (multiplicador == 0) {
            return 0;
        }
        // Caso base 2: Si el multiplicador es 1, el resultado es el multiplicando.
        if (multiplicador == 1) {
            return multiplicando;
        }
        // Caso recursivo: Restamos 1 al multiplicador y sumamos el multiplicando.
        // Por ejemplo, 5 * 4 se convierte en 5 + (5 * 3).
        return multiplicando + multiplicar(multiplicando, multiplicador - 1);
    }
}