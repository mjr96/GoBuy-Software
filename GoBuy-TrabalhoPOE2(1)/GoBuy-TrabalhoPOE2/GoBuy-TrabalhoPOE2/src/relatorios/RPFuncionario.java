/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DAO.FabricaConexao;

/**
 *
 * @author Junior
 */
public class RPFuncionario {
    private String relatorio;
    private final FabricaConexao fCobexao = FabricaConexao.getInstancia();
    
    public void gerarRelatorioTotal (String caminhoRelatorio)
    {
        this.relatorio = caminhoRelatorio;
        //classe responsável por ler fluxos de dados, bytes
        //entradas de dados
        InputStream dadosEntrada;
        try {
            //recebendo o caminho onde encontra o .jasper para compilar os dados e relatório 
            dadosEntrada = new FileInputStream(new File(caminhoRelatorio));
            Map parametros = new HashMap();
            //nesse momento o Map irá vazio, pois não há parâmetros para enviar ao relatório
            FabricaRelatorios.abreRelatorio("Relatório Geral", dadosEntrada, 
                parametros, fCobexao.conexao());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RPFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
