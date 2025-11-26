import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Pedir al usuario una nota (de 0 a 10) e imprimir si es sobresaliente (mayor o igual que 9), notable (mayor o igual que 7), bien (mayor que 5), suficiente (igual que 5) o insuficiente (menor que 5).
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce su nota entre 1-10:");
            double nota = input.nextDouble();
            if (nota >= 9) {
                System.out.println("El alumno ha sacado un sobresaliente");
            } else if (nota >= 7) {
                System.out.println("El alumno ha sacado un notable");
            } else if (nota > 5) {
                System.out.println("El alumno ha sacado un bien");
            } else if (nota == 5) {
                System.out.println("El alumno ha sacado un suficiente");
            } else {
                System.out.println("El alumno ha sacado un insuficiente");
            }
            //Pedir al usuario dos números y un símbolo de operación (+, -, *, /) e imprimir el resultado de la operación usando los dos números
            System.out.println("Introduce el primer numero:");
            double numero = input.nextInt();
            System.out.println("Introduce el segundo numero:");
            double segundoNumero = input.nextInt();
            System.out.println("Introduce el simbolo de la operacion (+, -, *, /):");
            String operacion = input.next();
            if (operacion.equals("+")) {
                System.out.println("El resultado de la operacion es:" + (numero + segundoNumero));
            } else if (operacion.equals("-")) {
                System.out.println("El resultado de la operacion es:" + (numero - segundoNumero));
            } else if (operacion.equals("*")) {
                System.out.println("El resultado de la operacion es:" + (numero * segundoNumero));
            } else if (operacion.equals("/")) {
                System.out.println("El resultado de la operacion es:" + (numero / segundoNumero));
            }
            //Pedir al usuario tres números e imprimir cuál es mayor.
            System.out.println("Introduce el primer numero:");
            double numero1 = input.nextDouble();
            System.out.println("Introduce el segundo numero:");
            double segundoNumero1 = input.nextDouble();
            System.out.println("Introduce el tercer numero:");
            double tercerNumero1 = input.nextDouble();
            if (numero1 >= segundoNumero1 && numero1 >= tercerNumero1) {
                System.out.println("El numero mayor es" + numero1);
            } else if (segundoNumero >= numero1 && segundoNumero1 >= tercerNumero1) {
                System.out.println("El segundo numero es el mayor" + segundoNumero1);
            } else {
                System.out.println("El tercer numero es el mayor" + tercerNumero1);
            }
            //Pedir al usuario los tres lados de un triángulo (tres números) e imprimir si es equilátero (tres lados iguales), isósceles (dos lados iguales) o escaleno (ningún lado igual).
            System.out.println("Dame el primer lado:");
            double primerlado = input.nextDouble();
            System.out.println("Dame el segundo lado:");
            double segundolado = input.nextDouble();
            System.out.println("Dame el tercer lado:");
            double tercerlado = input.nextDouble();
            if (primerlado == segundolado && primerlado == tercerlado) {
                System.out.println("Equilatero");
            } else if (primerlado == segundolado || segundolado == tercerlado || primerlado == tercerlado) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escalene");
            }
            //Pedir al usuario un número e imprimir si está entre 100 y 200.
            System.out.println("Dame un numero4 :");
            int numero4 = input.nextInt();
            if (numero4 >= 100 && numero4 <= 200) {
                System.out.println("El numero esta entre 100 y 200");
            } else {
                System.out.println("El numero no esta entre 100 y 200");
            }
            //Pedir al usuario un valor en metros y una unidad diferente (km, cm, mm) e imprimir la conversión correspondiente.
            System.out.print("Introduce el valor en metros: ");
            double metros = input.nextDouble();
            System.out.print("Introduce la unidad a convertir (km, cm, mm): ");
            String unidad = input.next();
            if (unidad.equals("km")) {
                System.out.println(metros + " metros = " + (metros / 1000) + " kilómetros");
            } else if (unidad.equals("cm")) {
                System.out.println(metros + " metros = " + (metros * 100) + " centímetros");
            } else if (unidad.equals("mm")) {
                System.out.println(metros + " metros = " + (metros * 1000) + " milímetros");
            } else {
                System.out.println("Unidad no válida");
            }
            //Pedir al usuario la edad y un booleano que represente si es fin de semana o no, e imprima el coste de una entrada de cine según las siguientes indicaciones:
            //Menores de 12 años: 5 €
            //De 12 a 17: 7 €
            //Adultos: 10 €
            //Si es fin de semana: sumar 2 €
            System.out.println("Introduce tu edad:");
            int edad = input.nextInt();
            boolean findesemana = input.nextBoolean();
            System.out.println(findesemana ? "True" : "False");
            System.out.println("El coste de la entrada de cine es:");
            double coste = input.nextDouble();
            if (edad < 12) {
                coste = 5;
            } else if (edad >= 12 && edad <= 17) {
                coste = 7;
            } else if (edad >= 18) {
                coste = 10;
            }
            if (findesemana) {
                coste += 2;
            }
            System.out.println(coste);
            //Pedir un número de mes e imprimir por consola el nombre del mes correspondiente.
            System.out.println("Dime un numero del mes");
            int numeromes = input.nextInt();
            if (numeromes == 1) {
                System.out.println("Corresponde a enero");
            } else if (numeromes == 2) {
                System.out.println("Corresponde a febrero");
            } else if (numeromes == 3) {
                System.out.println("Corresponde a marzo");
            } else if (numeromes == 4) {
                System.out.println("Corresponde a abril");
            } else if (numeromes == 5) {
                System.out.println("Corresponde a mayo");
            } else if (numeromes == 6) {
                System.out.println("Corresponde a junio");
            } else if (numeromes == 7) {
                System.out.println("Corresponde a julio");
            } else if (numeromes == 8) {
                System.out.println("Corresponde a agosto");
            } else if (numeromes == 9) {
                System.out.println("Corresponde a septiembre");
            } else if (numeromes == 10) {
                System.out.println("Corresponde a octubre");
            } else if (numeromes == 11) {
                System.out.println("Corresponde a noviembre");
            } else if (numeromes == 12) {
                System.out.println("Corresponde a diciembre");
            }
            //Pedir un número entero e imprimir por consola si es múltiplo de 3, múltiplo de 5 y/o múltiplo de 7.
            System.out.println("Introduce un numero entero:");
            int numeroentero = input.nextInt();
            if (numeroentero % 3 == 0) {
                System.out.println(numeroentero + "es multiplo de 3");
            } if (numeroentero % 5 == 0) {
                System.out.println(numeroentero + "es multiplo de 5");
            }  if (numeroentero % 7 == 0) {
                System.out.println(numeroentero + "es multiplo de 7");
            }
            //Pedir una temperatura en ºC e imprimir si hace frío (< 10), si es templada (>= 10, < 30) o si hace calor (>= 30)
            System.out.println("Introduce una temperatura en ºC:");
            double temperatura = input.nextDouble();
            if (temperatura < 10){
                System.out.println(temperatura + "hace frio");
            }
            else if (temperatura >= 10 && temperatura <= 30){
                System.out.println(temperatura + " es templada");
            }
            else if (temperatura >=30){
                System.out.println(temperatura + " hace calor ");
            }


    }

}
