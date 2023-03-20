package padroescriacao.abstractfactory;

public class Cartorio {

    private Registro registro;
    private Certidao certidao;

    public Cartorio(FabricaAbstrata fabrica) {
        this.registro = fabrica.createRegistro();
        this.certidao = fabrica.createCertidao();
    }

    public String emitirRegistro() {
        return this.registro.emitir();
    }

    public String emitirCertidao() {
        return this.certidao.emitir();
    }
}
