public class InteracaoRevisao implements Interacoes {

    private static InteracaoRevisao interacaorevisao = new InteracaoRevisao();

    private InteracaoRevisao() {};

    public static InteracaoRevisao InteracaoRevisao() {
        return interacaorevisao;
    }
}