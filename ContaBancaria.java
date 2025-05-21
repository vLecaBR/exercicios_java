
public class ContaBancaria {
    private int NumeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int NumeroConta, double saldo, String titular) {
        this.NumeroConta = NumeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Getter do número da conta
    public int getNumeroConta() {
        return NumeroConta;
    }

    // Setter do número da conta
    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter do saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

