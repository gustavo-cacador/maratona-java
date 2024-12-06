package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    int MAX_DATA_SIZE = 10;
    void load();

    // Com o default nós n precisamos subscrever esse método nas classes DatabaseLoader e FileLoader
    // O default faz com que o método n seja obrigatório subscrever nas classes DatabaseLoader e FileLoader
    default void checkPermission() {

    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface.");
    }
}
