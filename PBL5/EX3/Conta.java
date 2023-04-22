class Conta {
    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n",saldo);
    }

    public float getSaldo() {
        return saldo;
    }
}
