package classes;

public class Autoridade {

    private String nome;
    private String sobrenome;
    private FormatadorNome formatador;

    public Autoridade (String nome, String sobrenome)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getTratamento(Tratamento trat)
    {
        switch (trat)
        {
            case INFORMAL:
                formatador = (nome, sobrenome) -> nome;
                break;
            case RESPEITOSO:
                formatador = (nome, sobrenome) -> nome+" "+sobrenome;
                break;
            case COMTITULO:
                formatador = (nome, sobrenome) -> "Sr."+nome+" "+sobrenome;
        }

        return formatador.formataNome(this.nome, this.sobrenome);
    }

}
