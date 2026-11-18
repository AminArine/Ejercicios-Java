public class NumerosAleatorios {

   
    public static void mostrarAleatorios(int cantidad, int min, int max) {
        System.out.println("Generando " + cantidad + " números aleatorios entre " + min + " y " + max + ":");
        
        for (int i = 0; i < cantidad; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.print(aleatorio + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        mostrarAleatorios(10, 1, 50);
    }
}
