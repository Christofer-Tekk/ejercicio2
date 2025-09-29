public class MultiplicacionRecursiva {

    public static int multiplicar(int multiplicando, int multiplicador) {
        // Caso base: si el multiplicador es 0, el resultado es 0
        if (multiplicador == 0) {
            return 0;
        }
        // Caso recursivo: sumar el multiplicando al resultado de la llamada recursiva
        // con el multiplicador decrementado en 1.
        return multiplicando + multiplicar(multiplicando, multiplicador - 1);
    }
}