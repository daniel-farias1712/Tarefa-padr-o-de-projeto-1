
public class Main {
    public static void main(String[] args) {
      FabricaCarros Audi = new AudiFactory();
      Carros audi = Audi.criarCarro();
        System.out.println(audi.getSymbol());


        FabricaCarros bugati = new BugatiFactory();
        Carros BUGATI = bugati.criarCarro();
        System.out.println(BUGATI.getSymbol());

        FabricaCarros BMW = new BMWFactory();
        Carros bmw = BMW.criarCarro();
        System.out.println(bmw.getSymbol());
    }
}