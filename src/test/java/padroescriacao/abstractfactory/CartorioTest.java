package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartorioTest {

    @Test
    void deveEmitirPermuta() {
        FabricaAbstrata fabrica = new FabricaPermuta();
        Cartorio cartorio = new Cartorio(fabrica);
        assertEquals("Registro Permuta de Imóvel", cartorio.emitirRegistro());
    }

    @Test
    void deveEmitirCompraVenda() {
        FabricaAbstrata fabrica = new FabricaCompraVenda();
        Cartorio cartorio = new Cartorio(fabrica);
        assertEquals("Registro Compra e Venda de Imovel", cartorio.emitirRegistro());
    }

    @Test
    void deveEmitirCertidaoInteiroTeor() {
        FabricaAbstrata fabrica = new FabricaCompraVenda();
        Cartorio cartorio = new Cartorio(fabrica);
        assertEquals("Certidao de Onus", cartorio.emitirCertidao());
    }

    @Test
    void deveEmitirCertidaoOnus() {
        FabricaAbstrata fabrica = new FabricaPermuta();
        Cartorio cartorio = new Cartorio(fabrica);
        assertEquals("Certidao de Inteiro Teor", cartorio.emitirCertidao());
    }

}