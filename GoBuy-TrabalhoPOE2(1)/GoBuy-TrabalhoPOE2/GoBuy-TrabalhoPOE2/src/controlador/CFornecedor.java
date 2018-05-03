package controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.DAO.DAOFornecedor;
import modelo.dominio.Fornecedor;

public class CFornecedor
{
    public boolean cadastrarFornecedor(Fornecedor fornecedor)
    {
        DAOFornecedor insereDados = new DAOFornecedor();
        if(insereDados.insereFornecedor(fornecedor))
        {
            return true;
        }
        return false;

    }
    
    public ArrayList<Fornecedor> visualizarFornecedores ()
    {
        DAOFornecedor dadosFornecedor = new DAOFornecedor();
        ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        listaFornecedores = dadosFornecedor.selecionarTodosRegistros();
        
        return listaFornecedores;

    }
    
    public boolean atualizarFornecedor(Fornecedor fornecedor)
    {
        DAOFornecedor dadosFornecedor = new DAOFornecedor();
        if(dadosFornecedor.alteraFornecedor(fornecedor))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean deletarFornecedor(Integer id)
    {
        DAOFornecedor dadosFornecedor = new DAOFornecedor();
        if(dadosFornecedor.removeFornecedor(id))
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
            Logger.getLogger(CFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
    

}
