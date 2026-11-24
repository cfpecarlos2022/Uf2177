package encapsulacion;

public class Principal {

    public static void main(String[] args) {

        // Crear objeto
        CuentaBancaria cuenta = new CuentaBancaria(500);

        // Consultar saldo mediante Getter
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Modificar saldo mediante Setter
        cuenta.setSaldo(800);

        // Consultar nuevo saldo
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());

    }
}
