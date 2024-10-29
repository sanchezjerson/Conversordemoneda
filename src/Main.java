import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EXTERNA:
        while(true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1- Dólares\n" +
                    "2- Euros\n" +
                    "3- libra\n" +
                    "4- Yuan\n" +
                    "5- Real\n" +
                    "6- Salir del programa");
            System.out.println(" indique una opción: ");
            Scanner sc = new Scanner(System.in);
            char item = sc.next().charAt(0);

            switch (item){
                case '1':
                    ConvertirValor(943.40,"Dolares Estadounidense");
                    break;
                case '2':
                    ConvertirValor(1022.39,"Euro");
                    break;
                case '3':
                    ConvertirValor(12227.81,"Libra Esterlina");
                    break;
                case '4':
                    ConvertirValor(132.51,"Yuan Moneda China");
                    break;
                case '5':
                    ConvertirValor(132.51,"Real Brasileño");
                    break;
                case '6':
                    System.out.println("Usted esta saliendo del programa");
                    break EXTERNA;
                default:
                    System.out.println("Opcion no valida");
                    break;



            }
        }

    }

    static void ConvertirValor(double valorMoneda,String pais){
        Scanner leer = new Scanner(System.in);
        /// el pinrtf es para que formatee la informacion///
        System.out.printf(" Ingrese el valor para convertir %s : ", pais);
        ///ingresaremos el valor de la moneda del pais///
        double valor = leer.nextDouble();

        ///lo convertiremos a dolar///
        double dolar = valor / valorMoneda;

        /// para poder ver por cuantos decimales sacar el valor///
        dolar = (double)Math.round( dolar * 100d)/100;
        System.out.println("....................................");
        System.out.println("Tienes $" + dolar +  "  dolares ");
        System.out.println(".....................................");
    }






}