public class Ejercicio5 {
    public static void main(String[] args) {
        String[] my_array = {"FirstWord", "SecondWord", "THIRDWORD"};
        Validaciones.validaArray(my_array);
        String resultado = String.join(" ", my_array).toLowerCase();
        System.out.println("Resultado: " + resultado);
    }
}
