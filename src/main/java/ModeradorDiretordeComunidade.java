public class ModeradorDiretordeComunidade {

    public ModeradorDiretordeComunidade(Moderadores superior) {
        superior.add(InteracaoDesbanimento.getInteracaoDesbanimento());
        setModeradoresSuperior(superior);
    }

    public String getFormasInterasoes() {
        return "Diretor de comundade";
    }
}
