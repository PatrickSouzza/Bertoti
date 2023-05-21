package Facade;

class CarteiraFacade {
    public void realizarCompra(String conta, double valor) {
        verificarSaldo(conta);
        transferir(conta, "buteco_do_seu_augustinho", valor);
        System.out.println("Compra realizada com sucesso!");
    }

    private void verificarSaldo(String conta) {
        System.out.println("Verificando saldo da conta " + conta);
    }

    private void transferir(String origem, String destino, double valor) {
        System.out.println("Transferindo " + valor + " da conta " + origem + " para a conta " + destino);
    }
}
