class Pessoa {
    private Conta conta;
    private String nome;

    public Pessoa(String nome,Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void depositar(float valor) {
        conta.depositar(valor);
    }

    public Conta getConta() {
        return conta;
    }
}
