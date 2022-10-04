package br.com.feltex.excel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LerArquivoExcelTest {

    @Test
    void lerArquivo() {
        var lerArquivoExcel = new LerArquivoExcel();
        var clientes = lerArquivoExcel.lerArquivo("clientes.xlsx");

        assertEquals(3, clientes.size());
    }

}
