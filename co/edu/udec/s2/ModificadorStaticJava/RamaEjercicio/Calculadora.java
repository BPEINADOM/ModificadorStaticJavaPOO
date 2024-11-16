import Domain.Model.Matematicas;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        // Suma
        int resultadoSuma = Matematicas.sumar(15, 4);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Resta
        int resultadoResta = Matematicas.restar(6, 4);
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Multiplicacion
        int resultadoMultiplicacion = Matematicas.multiplicacion(6, 6);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

        // Division
        double resultadoDivision = Matematicas.dividir(42, 4);
        System.out.println("Resultado de la division: " + resultadoDivision);

        System.out.println("*********************************************");

    }
}
