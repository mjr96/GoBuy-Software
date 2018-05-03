package controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.DAO.DAOProduto;
import modelo.dominio.Produto;

public class CProduto
{
    public boolean cadastrarProduto(Produto produto)
    {
        DAOProduto insereDados = new DAOProduto();
        if(insereDados.insereProduto(produto))
        {
            return true;
        }
        return false;

    }
    
    public ArrayList<Produto> visualizarProdutos ()
    {
        DAOProduto dadosProduto = new DAOProduto();
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos = dadosProduto.selecionarTodosRegistros();
        
        return listaProdutos;

    }
    
    public boolean atualizarProduto(Produto produto)
    {
        DAOProduto dadosProduto = new DAOProduto();
        if(dadosProduto.alteraProduto(produto))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean deletarProduto(Integer id)
    {
        DAOProduto dadosProduto = new DAOProduto();
        if(dadosProduto.removeProduto(id))
        {
            return true;
        }
        
        return false;
    }
    
    public static Date converteStringDate(String data) 
    {
        DateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        Date novaData = null;
        try {
            novaData = formatado.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(CProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return novaData;
    }
    
    public static java.sql.Date converteDateSQL (Date data)
    {
        return new java.sql.Date(data.getTime());
    }
    
    public static String converteDataString (Date data)
    {
        DateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String auxData = formatado.format(data);
        return auxData;
    }
    
    public static boolean validacaoDescricao(String descricao) {  
    if(descricao.equals(""))return false;
    else return true;
    }

    /*public static boolean validacaoNumero(int num){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher match = pattern.matcher(num+"");
        if(match.find())return true;
        else return false;
    }*/
    
}
