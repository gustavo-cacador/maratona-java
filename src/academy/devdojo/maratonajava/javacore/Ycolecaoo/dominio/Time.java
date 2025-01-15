package academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio;

import java.util.Objects;

public class Time implements Comparable<Time>{

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Time(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "ID n pode ser nulo");
        Objects.requireNonNull(nome, "Nome n pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Time(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    // O equals compara dois objetos fazendo que não se dupliquem
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Objects.equals(id, time.id) && Objects.equals(nome, time.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Time outroTime) {
        // negativo se o this < outroTime
        // se this == outroTime, return 0
        // positivo se this > outroTime

        /* if(this.id < outroTime.getId()) {
            return -1;
        } else if(this.id.equals(outroTime.getId())) {
            return 0;
        } else {
            return 1;
        } */

        return this.nome.compareTo(outroTime.getNome());
        //return this.id.compareTo(outroTime.getId());
        //return Double.compare(preco, outroTime.getPreco());
        //return Double.valueOf(preco).compareTo(outroTime.getPreco());
        //return this.id.compareTo(outroTime.getId());
    }
}
