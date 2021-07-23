package tests;

import classes.Autoridade;
import classes.Tratamento;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAutoridade {

    static Autoridade aut;

    @BeforeAll
    static void setupInicial ()
    {
        aut = new Autoridade("Carlos", "Sales");
    }

    @Test
    void testInformal ()
    {
        String resposta = aut.getTratamento(Tratamento.INFORMAL);
        assertEquals("Carlos", resposta);
    }

    @Test
    void testRespeitoso ()
    {
        String resposta = aut.getTratamento(Tratamento.RESPEITOSO);
        assertEquals("Carlos Sales", resposta);
    }

    @Test
    void testComTitulo ()
    {
        String resposta = aut.getTratamento(Tratamento.COMTITULO);
        assertEquals("Sr.Carlos Sales", resposta);
    }
}
