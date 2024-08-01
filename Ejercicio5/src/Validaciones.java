public class Validaciones {
    public static void validaArray(String[] arr) {

        if (arr.length > 10) {
            throw new IllegalArgumentException("La longitud de la matriz no supera los 10.");
        }

        for (String elemento : arr) {
            if (!esElementoValido(elemento)) {
                throw new IllegalArgumentException("Cada elemento del array debe contener solo letras en inglés y espacios.");
            }
        }

    }

    private static boolean esElementoValido(String elemento) {
        return elemento.matches("[a-zA-Z ]+");
    }
}



