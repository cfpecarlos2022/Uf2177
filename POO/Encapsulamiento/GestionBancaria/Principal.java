package encapsulacion;

public class CuentaBancaria {
    
    //Atributo privado
    private double saldo;

    //Constructor
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    //Getter: consultar el saldo
    public double getSaldo(){
        return saldo;
    }
    
    //Setter: modificar el saldo
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    
}
