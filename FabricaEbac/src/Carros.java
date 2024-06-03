public interface Carros {

    String getSymbol();

    class Audi implements Carros {

        @Override
        public String getSymbol() {
            return "Audi";
        }
    }
     class BMW implements Carros {

        @Override
        public String getSymbol() {
            return "Bmw";
        }
    }
     class bugati implements Carros{
        @Override
        public String getSymbol() {
            return "bugati";
        }
    }
}
