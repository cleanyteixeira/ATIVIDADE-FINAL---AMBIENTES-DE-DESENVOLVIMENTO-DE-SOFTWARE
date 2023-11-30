public class CalculadoraSubtracao {
    public int subtrair(int a, int b) {
        return a - b;
    }

    public int subtrair(int a, int b, int c) {
        return a - b - c;
    }
    
    public static void main(String[] args) {
        CalculadoraSubtracao calculadora = new CalculadoraSubtracao();
        int resultadoSubtracao2 = calculadora.subtrair(5, 3);
        int resultadoSubtracao3 = calculadora.subtrair(10, 4, 2);
        System.out.println("Resultado da subtração 2: " + resultadoSubtracao2);
        System.out.println("Resultado da subtração 3: " + resultadoSubtracao3);
    }
} 