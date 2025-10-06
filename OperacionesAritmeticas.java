/*
===========================================
Integrantes del grupo:
- Burgoa Peredo Cristian → Operacion: Resta
- Checo Agudo Rodrigo → Operacion: Multiplicación
- Escalera Mamani Jorge David → Operacion: División
- Fernández Jamachi Alex → Operacion: Potencia
- Flores Mamani Rodrigo → Operacion: Raiz cuadrada
- Garcia Escobar Gaston → Operacion: Factorial
- Mena Capuma Christofer → Operación: Suma
- Morato Laura Katruyn Yoseth → Operación: Modulo
- Salvatierra Humaza Juan Jose → Operación: Promedio
- Tarque Caceres Angela Vanesa → Operación: Porcentaje
===========================================
*/

public class OperacionesAritmeticas {

    // --------------------------------------------
    // Autor: Mena Capuma Christofer
    // Operación: Suma
    // --------------------------------------------
    public static int sumarChristofer(int a, int b) {
        return a + b;
    }

    // --------------------------------------------
    // Autor: Burgoa Peredo Cristian
    // Operación: Resta
    // --------------------------------------------
    public static int restarCristian(int a, int b) {
        return a - b;
    }

    // --------------------------------------------
    // Autor: Checo Agudo Rodrigo
    // Operación: Multiplicación
    // --------------------------------------------
    public static int multiplicarRodrigo(int a, int b) {
        return a * b;
    }

    // --------------------------------------------
    // Autor: Escalera Mamani Jorge David
    // Operación: División
    // --------------------------------------------
    public static double dividirJorge(int a, int b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return (double) a / b;
    }

    // --------------------------------------------
    // Autor: Fernández Jamachi Alex
    // Operación: Potencia
    // --------------------------------------------
    public static double potenciaAlex(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // --------------------------------------------
    // Autor: Flores Mamani Rodrigo
    // Operación: Raíz cuadrada
    // --------------------------------------------
    public static double raizCuadradaRodrigo(double numero) {
        if (numero < 0) {
            System.out.println("Error: no se puede obtener la raíz de un número negativo.");
            return 0;
        }
        return Math.sqrt(numero);
    }

    // --------------------------------------------
    // Autor: Garcia Escobar Gastón
    // Operación: Factorial
    // --------------------------------------------
    public static long factorialGaston(int n) {
        if (n < 0) {
            System.out.println("Error: factorial no definido para números negativos.");
            return 0;
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // --------------------------------------------
    // Autor: Morató Laura Katruyn Yoseth
    // Operación: Módulo
    // --------------------------------------------
    public static int moduloKatruyn(int a, int b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero para obtener módulo.");
            return 0;
        }
        return a % b;
    }

    // --------------------------------------------
    // Autor: Salvatierra Humaza Juan José
    // Operación: Promedio
    // --------------------------------------------
    public static double promedioJuan(double[] numeros) {
        if (numeros.length == 0) return 0;
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    // --------------------------------------------
    // Autor: Tarque Caceres Angela Vanesa
    // Operación: Porcentaje
    // --------------------------------------------
    public static double porcentajeAngela(double total, double porcentaje) {
        return (total * porcentaje) / 100;
    }

    // --------------------------------------------
    // Método principal para probar todas las operaciones
    // --------------------------------------------
    public static void main(String[] args) {

        System.out.println("===== Pruebas de Operaciones Aritmeticas =====");

        System.out.println("Suma (Christofer): " + sumarChristofer(5, 3));
        System.out.println("Resta (Cristian): " + restarCristian(10, 4));
        System.out.println("Multiplicacion (Rodrigo): " + multiplicarRodrigo(6, 7));
        System.out.println("Division (Jorge): " + dividirJorge(10, 2));
        System.out.println("Potencia (Alex): " + potenciaAlex(2, 3));
        System.out.println("Raiz cuadrada (Rodrigo F.): " + raizCuadradaRodrigo(25));
        System.out.println("Factorial (Gaston): " + factorialGaston(5));
        System.out.println("Modulo (Katruyn): " + moduloKatruyn(10, 3));
        System.out.println("Promedio (Juan): " + promedioJuan(new double[]{5, 10, 15}));
        System.out.println("Porcentaje (Angela): " + porcentajeAngela(200, 15));

        System.out.println("==============================================");
    }
}
