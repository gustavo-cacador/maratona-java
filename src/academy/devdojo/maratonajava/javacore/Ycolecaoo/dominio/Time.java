package academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio;

import java.util.Objects;

public class Time implements Comparable<Time>{

    private Long id;
    private String nome;
    private double preco;
    
    public Time(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "ID n pode ser nulo");
        Objects.requireNonNull(nome, "Nome n pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Time [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public int compareTo(Time outroTime) {
        // negativo se o this < outroTime
        // se this == outroTime, return 0
        // positivo se this > outroTime
        if(this.id < outroTime.getId()) {
            return -1;
        } else if(this.id.equals(outroTime.getId())) {
            return 0;
        } else {
            return 1;
        }
    }
}
