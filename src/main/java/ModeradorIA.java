public class ModeradorIA extends Moderadores {

    public ModeradorIA(Moderadores superior) {
        listaFormasInterasoes.add(InteracaoSuspensao.getInteracaoSuspensao());
        listaFormasInterasoes.add(InteracaoRevisao.getInteracaoRevisao());
        setModeradoresSuperior(superior);
    }

    public String getFormasInterasoes() {
        return "IA";
    }
}
