package padroescriacao.abstractfactory;

public class FabricaCompraVenda implements FabricaAbstrata {

    @Override
    public Registro createRegistro() {
        return new CompraVenda();
    }

    @Override
    public Certidao createCertidao() {
        return new CertidaoOnus();
    }
}
