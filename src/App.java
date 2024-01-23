public class App {
    public static void main(String[] args) throws Exception {

        String[] arrayTest = new String[5];
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = "Test " + i;
            System.out.println(arrayTest[i]);
        }

        String[] arrayTest2 = new String[10];

        System.arraycopy(arrayTest, 0, arrayTest2, 0, 5);

        if (arrayTest2 != null) {
            System.out.println("Array copiado con éxito");

            System.out.println("Contenido del array copiado: ");
            for (int i = 0; i < arrayTest2.length; i++) {
                System.out.println(arrayTest2[i]);
            }

        } else {
            System.out.println("Error al copiar el array");
        }

        System.out.println("Vamos a imprimir solo las posiciones pares y no nulas de un array: ");
        for (int i = 0; i < arrayTest2.length; i++) {
            if (i % 2 == 0 && arrayTest2[i]!=null) {
                System.out.println(arrayTest2[i]); 
                continue; 
            }
        }
    }
}
