package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    // Diferente das classes abstratas, com as Interfaces nós podemos implementar mais de 1 classe (DataLoader e DataRemover)
    // Diferente das classes abstratas que usamos o "extends", nas interfaces utilizamos "implementes"
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissão no banco de dados.");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader.");
    }
}
