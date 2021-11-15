import java.util.ArrayList;

public abstract class Moderadores {

    protected ArrayList listaFormasInterasoes = new ArrayList();
    private Moderadores moderadoresSuperior;

    public Moderadores getModeradoresSuperior() {
        return moderadoresSuperior;
    }

    public void setModeradoresSuperior(Moderadores moderadoresSuperior) {
        this.moderadoresSuperior = moderadoresSuperior;
    }

    public abstract String getFormasInterasoes();

    public String interagirFormasInterasoes(FormasInterasoes formasinterasoes) {
        if (listaFormasInterasoes.contains(formasinterasoes.getFormasInterasoes())) {
            return getDescricaoCargo();
        }
        else {
            if (moderadoresSuperior != null) {
                return moderadoresSuperior.interagirFormasInterasoes(formasinterasoes);
            }
            else
            {
                return "Não pode moderar";
            }
        }
    }
}
