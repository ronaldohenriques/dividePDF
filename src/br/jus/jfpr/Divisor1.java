/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jus.jfpr;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author RAH
 */
public class Divisor1 {

    /**
     * Divide um arquivo inicialmente em 2, testa se o tamanho que todos
     * arquivos ficaram dentro do limite, se não ficaram apaga tudo e recomeça
     * dividindo por, 3, 4, 5, etc. até que todos arquivo fiquem dentro do
     * limite
     *
     * @param arquivoEntrada O arquivo será dividido
     * @param arquivoSaida O nome do arquivo que será criado
     * @param tamArqSel Tamanho selecionado que deverão ficar os arquivos
     * divididos
     * @return String informativa do resultado
     */
    public static String dividePDF(File arquivoEntrada, String arquivoSaida, int tamArqSel) {

        int daPagina = 1;
        int paraPagina;
        int tamInicial;
        // FileOutputStream arquivoSair = null;
        String MensagemErro = "ok";
        int fatorDivisao = 2; //Incialmente dividirá em 2
        arquivoSaida = arquivoSaida.substring(0, arquivoSaida.indexOf('.')) + "-divido"; //PAra definir o nome do arquivo de saída

        try {
            PdfReader PdfDeEntrada = new PdfReader(arquivoEntrada.toString()); //Para ler o arquivo de entrada
            final int totalPaginas = PdfDeEntrada.getNumberOfPages(); //Verifica o total de páginas
            tamInicial = paraPagina = totalPaginas / fatorDivisao;  //Define o tamanho (em páginas) do 1 arquivo e em quanto deverá incrementar(serão o mesmo)
            PdfImportedPage pagina;

            int i = 1; //Contador simples
            while (i <= fatorDivisao && totalPaginas > fatorDivisao) { //Enquanto não fizer todas as divisões
                Document documento = new Document();
                FileOutputStream arquivoSair = new FileOutputStream(arquivoSaida + "-" + i + ".pdf");  //Cria o arquivo, vazio
                PdfWriter writer = PdfWriter.getInstance(documento, arquivoSair);   //
                documento.open();
                PdfContentByte PContentByte = writer.getDirectContent();
                while (daPagina <= paraPagina) {
                    documento.newPage(); //Aloca uma nova páginA
                    pagina = writer.getImportedPage(PdfDeEntrada, daPagina); //Seleciona uma página específica. indicada pelo contador
                    PContentByte.addTemplate(pagina, 0, 0);   //Adiciona a pagina ao conteúdo
                    daPagina++;  //Contador simples
                }
                arquivoSair.flush();
                documento.close();   //Grava o arquivo de saída
                arquivoSair.close();
                File arquivoDest = new File(arquivoSaida + "-" + i + ".pdf");
                if (arquivoDest.length() > tamArqSel) { // O tamanho do arquivo de destino ficou maior do que deveria
                    delete(arquivoSaida, i);    //Chamar a função para deletar todos arquivos até a chave i
                    daPagina = i = 1; //Para recomeçar tudo de novo
                    fatorDivisao++; //Se um arquivo ficou maior, então deve aumentar a divisão
                    tamInicial = paraPagina = totalPaginas / fatorDivisao; //Para recomeçar tudo de novo
                } else {
                    i++; //Continua a divisao
                    if (i == fatorDivisao) { //Ou seja, chegou a ultima divisao
                        paraPagina = totalPaginas;  //O ultimo arquivo conterá mais páginas
                    } else {
                        paraPagina += tamInicial;   //Cada arquivo terá o mesmo número de páginas//Incrementa sempre o tamanho inicial
                    }
                }
            }
        } catch (IOException | DocumentException e) {
            System.err.println(e.getMessage());
            MensagemErro = e.getMessage();
        }
        return MensagemErro;
    }

    /**
     * PAra apagar todos arquivos com nome até a chave k
     *
     * @param arquivoSaida nome do arquivo a ser apagado
     * @param k até onde será pagado
     */
    private static void delete(String arquivoSaida, int k) {
        int i = 1;
        while (i <= k) {
            File arquivo = new File(arquivoSaida + "-" + i + ".pdf");
            arquivo.delete();
            i++;
        }
    }
}
