package dio.desafio.patterns.singleton;

public class SingletonLazyHolder {

    private static class Holder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }

}
