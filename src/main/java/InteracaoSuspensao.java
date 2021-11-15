public class InteracaoSuspensao implements Interacoes {

    private static InteracaoSuspensao interacaosuspensao = new InteracaoSuspensao();

    private InteracaoSuspensao() {};

    public static InteracaoSuspensao InteracaoSuspensao() {
        return interacaosuspensao;
    }
}