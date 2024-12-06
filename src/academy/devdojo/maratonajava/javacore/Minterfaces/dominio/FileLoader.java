package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    // Diferente das classes abstratar, com as Interfaces nós podemos implementar mais de 1 classe (DataLoader e DataRemover)
    // Diferente das classes abstratas que usamos o "extends", nas interfaces utilizamos "implementes"
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissão no arquivo.");
    }

}
