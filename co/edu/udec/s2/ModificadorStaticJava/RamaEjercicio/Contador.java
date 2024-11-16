import Domain.Model.Coche;

public class Contador {

    public static void main(String[] args) {
        
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Coche c1 = new Coche("Mazda", "S8");
        Coche c2 = new Coche("Toyota", "C40");
        Coche c3 = new Coche("Chevrolet", "A30");

        c1.mostrarCoches();
        System.out.println("*********************************************");
        c2.mostrarCoches();
        System.out.println("*********************************************");
        c3.mostrarCoches();
        System.out.println("*********************************************");

        System.out.println("Numero de coches creados: " + Coche.getContadorCoches());

        System.out.println("*********************************************");


    }
}
