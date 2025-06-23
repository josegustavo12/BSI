
package com.mycompany.aula_7;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiadorDeArquivos {

    // Método que realiza a cópia de arquivos
    public void copiar(String arquivoOrigem, String arquivoDestino) {
        try (
            FileInputStream fis = new FileInputStream(arquivoOrigem);
            FileOutputStream fos = new FileOutputStream(arquivoDestino)
        ) {
            byte[] buffer = new byte[8192]; // 8 KB de buffer
            int bytesLidos;

            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }

    // Método main para exemplo de uso
    public static void main(String[] args) {
        CopiadorDeArquivos copiador = new CopiadorDeArquivos();
        String origem = "entrada.txt";
        String destino = "saida.txt";
        copiador.copiar(origem, destino);
    }
}
