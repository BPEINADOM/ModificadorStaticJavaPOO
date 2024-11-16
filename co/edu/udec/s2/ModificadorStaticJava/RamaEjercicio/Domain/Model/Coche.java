package Domain.Model;

public class Coche {
    private String marca;
    private String modelo;

    // Atributo contador
    private static int contadorCoches = 0;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Metodo static
    public static int getContadorCoches() {
        return contadorCoches;
    }

    // Metodo
    public void mostrarCoches() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}
