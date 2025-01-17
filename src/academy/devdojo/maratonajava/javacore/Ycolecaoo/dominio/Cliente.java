package academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Cliente {

    private Long id;
    private String nome;

    public Cliente(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 10);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    // Utilizamos o equals e hashcode para os clientes n serem iguais, ao menos se o Id for igual
    // Cliente vai ser o mesmo apenas se o Id for o mesmo
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
