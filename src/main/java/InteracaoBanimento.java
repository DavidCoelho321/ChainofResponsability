public class InteracaoBanimento implements Interacoes {

    private static InteracaoBanimento interacaobanimento = new InteracaoBanimento();

    private InteracaoBanimento() {};

    public static InteracaoBanimento InteracaoBanimento() {
        return interacaobanimento;
    }
}