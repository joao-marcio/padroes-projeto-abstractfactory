package padroescriacao.abstractfactory;

public class FabricaPermuta implements FabricaAbstrata {

    @Override
    public Registro createRegistro() {
        return new Permuta();
    }

    @Override
    public Certidao createCertidao() {
        return new CertidaoInteiroTeor();
    }
}
