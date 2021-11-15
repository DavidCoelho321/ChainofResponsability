public class ModeradorFuncionario {

    public ModeradorFuncionario(Moderadores superior) {
        superior.add(InteracaoBanimento.getInteracaoBanimento());
        setModeradoresSuperior(superior);
    }

    public String getdeFormasInterasoes() {
        return "Moderador";
    }
}
