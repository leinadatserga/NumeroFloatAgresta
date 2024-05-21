import java.util.Scanner;

public class DescomponerFloat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor float
        System.out.print("Por favor, ingrese un valor float: ");

        // Tomar el valor ingresado, asignarlo a la variable input y reemplazar coma por punto
        String input = scanner.nextLine().replace(',', '.');

        // Convertir string a float y asignarlo a la variable valorFloat
        float valorFloat = Float.parseFloat(input);

        // Obtener la parte entera de valorFloat y asignarlo a la variable parteEntera
        int parteEntera = (int) valorFloat;

        // Separar los números posteriores al punto decimal y asignarlos a la variable parteDecimal
        String parteDecimal = input.substring(input.indexOf('.') + 1);


        // Mostrar separadamente la parte entera y decimal del valor ingresado
        System.out.println("La parte entera del valor es: " + parteEntera);
        System.out.println("La parte decimal del valor es: " + parteDecimal);

        scanner.close();
    }
}