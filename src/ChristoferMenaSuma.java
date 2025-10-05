public class AritmeticaSumar {
  public static int sumar(int a, int b) {
    return a + b;
  }

  public static int potencia(int base, int exponente) {
    int resultado = 1;
    for (int i = 0; i < exponente; i++) {
      resultado *= base;
    }
    return resultado;
  }
}
