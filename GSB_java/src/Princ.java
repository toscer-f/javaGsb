import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.metier.FicheFrais;
import com.metier.Region;
import com.metier.Utilisateur;
import com.persistance.AccesData;
public class Princ
{

    public Princ()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    /*	Utilisateur u = AccesData.getUtilisateur("a131");
        u.creerLogin();
        u.creerMail();
        u.setMdp("gsb1234");
        AccesData.updateUtilisateur(u);
       System.out.println(AccesData.deleteUtilisateur(u));
        */
    	
    	//System.out.println(AccesData.getUtilisateur("a131").getListeFicheFrais().get(1).getIdEtat());
    	Utilisateur u = AccesData.getUtilisateur("a131");
    	
    	System.out.println(u.getIdUtilisateur());
    	for(FicheFrais f : u.getListeFicheFrais()){
    		System.out.println(f.getIdEtat());
    	}
    	System.out.println(AccesData.deleteUtilisateur(AccesData.getUtilisateur("a131")));
    	System.out.println(u.getActiviter());
        
		
		
    }

}