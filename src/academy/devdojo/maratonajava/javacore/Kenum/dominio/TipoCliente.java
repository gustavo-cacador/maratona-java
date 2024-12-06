package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    // Enum eh mais utilizado quando tiver um campo com algumas alternativas
    // Por exemplo: Pessoa Jurídica ou Pessoa Física, Dias da semana(Segunda até Domingo)
    // Meses do ano (Janeiro a Dezembro), Tipo de pagamento: Débito ou Crédito, entre outros.

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;
    
    private TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }


    // Método para retornar o atributo que desejar.
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) { 
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

}
