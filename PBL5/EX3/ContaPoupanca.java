class ContaPoupanca extends Conta {
    public ContaPoupanca(float saldo) {
        super(saldo);
    }

    @Override
    public void mostrarSaldo() {
        //float rendimento = getSaldo() * 0.005;
        System.out.printf("Saldo Poupança: R$ %.2f\n", (getSaldo() * 1.005));
    }
}
