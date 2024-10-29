public class Main {
    public static void main (String[]args){

        Cliente kelvin = new Cliente();
        kelvin.setNome("Kelvin");

        Cliente jose = new Cliente();
        jose.setNome("Jose");

        Conta cc = new ContaCorrente(kelvin);
        cc.depositar(100);

        Conta cc2 = new ContaCorrente(jose);
        cc2.depositar(500);

        Conta poupanca = new ContaPoupanca(kelvin);
        cc.transferir(50, cc2);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}
