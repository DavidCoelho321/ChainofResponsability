public class InteracaoDesbanimento implements Interacoes {

    private static InteracaoDesbanimento interacaodesbanimento = new InteracaoDesbanimento();

    private InteracaoDesbanimento() {};

    public static InteracaoDesbanimento InteracaoDesbanimento() {
        return interacaodesbanimento;
    }
}