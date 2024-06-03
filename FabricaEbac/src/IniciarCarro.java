public class IniciarCarro {

    public static Carros criarcarro(Marcas marca) {


        switch (marca) {
            case Audi:
                return new Carros.Audi();
            case bugati:
                return new Carros.bugati();
            case BMW:
                return new Carros.BMW();

            default:
                throw new IllegalArgumentException("País não suportado: " + marca);
        }
    }

}

