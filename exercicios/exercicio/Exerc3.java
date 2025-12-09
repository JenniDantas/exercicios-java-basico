public class Conta {
    private double saldo;
    private boolean chequeEspecial;

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    private boolean isChequeEspecial() {
        return this.saldo < 0.0;
    }

    public void sacar(double saldo) {
        if (saldo > this.saldo) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.saldo -= saldo;
        }
    }

    public void pagarBoleto(double valorBoleto) {
        if (valorBoleto > this.saldo) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.saldo -= valorBoleto;
        }
    }


}

