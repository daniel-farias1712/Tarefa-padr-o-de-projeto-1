
public interface FabricaCarros {
    Carros criarCarro();
}


class AudiFactory implements FabricaCarros {
    @Override
    public Carros criarCarro() {
        return new Carros.Audi();
    }
}


class BMWFactory implements FabricaCarros {
    @Override
    public Carros criarCarro() {
        return new Carros.BMW();
    }
}


class BugatiFactory implements FabricaCarros {
    @Override
    public Carros criarCarro() {
        return new Carros.bugati();
    }
}
