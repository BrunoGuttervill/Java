
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000f);
        ContaPoupanca cp = new ContaPoupanca(2500.5f);

        Pessoa pessoa1 = new Pessoa("Bruno",cc);
        Pessoa pessoa2 = new Pessoa("Renan",cp);

        System.out.print("Saldo de p1: ");
        pessoa1.getConta().mostrarSaldo();

        System.out.print("Saldo de p2: ");
        pessoa2.getConta().mostrarSaldo();

        pessoa1.depositar(50000.99f);
        pessoa2.depositar(1000.22f);

        System.out.print("Saldo de p1 após depósito: ");
        pessoa1.getConta().mostrarSaldo();

        System.out.print("Saldo de p2 após depósito: ");
        pessoa2.getConta().mostrarSaldo();
    }
}
