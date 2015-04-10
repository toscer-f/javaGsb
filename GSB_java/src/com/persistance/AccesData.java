package com.persistance;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.metier.FicheFrais;
import com.metier.FraisForfait;
import com.metier.LigneFraisForfait;
import com.metier.LigneFraisHorsForfait;
import com.metier.Region;
import com.metier.Utilisateur;
import com.util.HibernateSession;

/**
 * Classe persistance AccesData
 * 
 * Permet l'instanciation d'un objet de type AccesData qui delivre des methodes
 * appelant le framework Hibernate
 * 
 * @author b0dian
 * @version 1.0
 */
public class AccesData {
    // proprietees
    private static Session session = HibernateSession.getSession();

    // accesseurs sur les proprietes du dessus
    /**
     * Accesseur getUtilisateur qui prend en parram�tre un id utilisateur et nous
     * renvoie l'utilisateur correspondant en utilisant la methode find
     * 
     * @param id
     *            de type String
     * @return s de type Utilisateur
     */
    public static Utilisateur getUtilisateur(String id) {
        Utilisateur utilisateur = (Utilisateur) session.get(Utilisateur.class, id);
        return utilisateur;
    }

    /**
     * Accesseur getListUtilisateur qui renvoie tout les utilisateurs en utilisant la
     * methode retrieve
     * 
     * @return listeStation de type collections de stations
     */
    public static List<Utilisateur> getListUtilisateur() {
        List<Utilisateur> listUtilisateurs = session.createQuery("from Utilisateur").list();
        return listUtilisateurs;
    }

    /**
     * Accesseur getRegion qui prend en parram�tre un id de region et nous renvoie
     * la region correspondante en utilisant la methode find
     * 
     * @param id
     *            de type int
     * @return b de type region
     */
    public static Region getRegion(int id) {
        Region region = (Region) session.get(Region.class, id);
        return region;
    }

    /**
     * Accesseur getListRegion qui renvoie toutes les Regions en utilisant la methode
     * retrieve
     * 
     * @return listeRegion de type collections de Region
     */
    public static List<Region> getListRegion() {
        List<Region> listRegion = session.createQuery("from Region").list();
        return listRegion;
    }

    /**
     * Accesseur getUtilisateurByRegion qui renvoie tout les Utilisateurs existant
     * dans la region correspondante grace a l'id de region passe en parram�tre en utilisant
     * la methode retrieve par id
     * 
     * @return listeUtilisateurs de type collections d'utilisateurs
     */
    public static List<Utilisateur> getUtilisateurByRegion(int id) {
        List<Utilisateur> listUtilisateur = session.createQuery("from Utilisateur where idRegion="+id).list();
        return listUtilisateur;
    }

    /**
     * Accesseur getFicheFrais qui renvoie la fiche de frais correspondante a l'id
     * passe en parrametre grace a la methode find
     * 
     * @return FicheFrais de type FicheFrais
     */
    public static FicheFrais getFicheFrais(int id) {
        FicheFrais ficheFrais = (FicheFrais) session.get(FicheFrais.class, id);
        return ficheFrais;
    }

    /**
     * Accesseur getListFicheFrais qui renvoie toutes les fiches de frais existantes
     * dans la base de donne grace a la methode retrieve
     * 
     * @return listFicheFrais de type collection de fiche frais
     */
    public static List<FicheFrais> getListFicheFrais() {
        List<FicheFrais> listFicheFrais= session.createQuery("from FicheFrais").list();
        return listFicheFrais;
    }
    /**
     * Accesseur getLigneFraisHorsForfait qui renvoie la ligne de frais hors forfait correspondante a l'id
     * passe en parrametre grace a la methode find
     * 
     * @return ligneFraisHorsForfait de type LigneFraisHorsForfait
     */
    public static LigneFraisHorsForfait getLigneFraisHorsForfait(int id) {
        LigneFraisHorsForfait ligneFraisHorsForfait = (LigneFraisHorsForfait) session.get(LigneFraisHorsForfait.class, id);
        return ligneFraisHorsForfait;
    }

    /**
     * Accesseur getListLigneFraisHorsForfait qui renvoie toutes les lignes de frais hors forfait existantes
     * dans la base de donne grace a la methode retrieve
     * 
     * @return listLigneFraisHorsForfait de type collection de LigneFraisHorsForfait
     */
    public static List<LigneFraisHorsForfait> getListLigneFraisHorsForfait() {
        List<LigneFraisHorsForfait> listLigneFraisHorsForfait= session.createQuery("from LigneFraisHorsForfait").list();
        return listLigneFraisHorsForfait;
    }
    /**
     * Accesseur getLigneFraisForfait qui renvoie la ligne de frais forfait correspondante a l'id
     * passe en parrametre grace a la methode find
     * 
     * @return ligneFraisForfait de type LigneFraisForfait
     */
    public static LigneFraisForfait getLigneFraisForfait(int id) {
        LigneFraisForfait ligneFraisForfait = (LigneFraisForfait) session.get(LigneFraisForfait.class, id);
        return ligneFraisForfait;
    }

    /**
     * Accesseur getListLigneFraisForfait qui renvoie toutes les lignes de frais hors forfait existantes
     * dans la base de donne grace a la methode retrieve
     * 
     * @return listLigneFraisHorsForfait de type collection de LigneFraisHorsForfait
     */
    public static List<LigneFraisForfait> getListLigneFraisForfait() {
        List<LigneFraisForfait> listLigneFraisForfait= session.createQuery("from LigneFraisForfait").list();
        return listLigneFraisForfait;
    }
    /**
     * Accesseur getFraisForfait qui renvoie le frais forfait correspondant a l'id
     * passe en parrametre grace a la methode find
     * 
     * @return fraisForfait de type FraisForfait
     */
    public static FraisForfait getFraisForfait(int id) {
        FraisForfait fraisForfait = (FraisForfait) session.get(FraisForfait.class, id);
        return fraisForfait;
    }

    /**
     * Accesseur getlistFraisForfait qui renvoie toutes les lignes de frais forfait existantes
     * dans la base de donne grace a la methode retrieve
     * 
     * @return listLigneFraisHorsForfait de type collection de LigneFraisHorsForfait
     */
    public static List<FraisForfait> getlistFraisForfait() {
        List<FraisForfait> listFraisForfait= session.createQuery("from FraisForfait").list();
        return listFraisForfait;
    }

    // modificateur sur les prorietes plus haut
    /**
     * Modificateur createRegion qui prend une region en parram�tre et qui creera
     * l'objet dans la base de donnees
     * 
     * @param r
     *            de type Region
     * @return success de type boolean
     */
    public static boolean createRegion(Region r) {
        boolean success = false;   
        try {
            Transaction trans = session.beginTransaction();
            session.save(r);
            trans.commit();
            success = true;

        } catch (HibernateException e) {
          
        } 
        return success ;
    }

    /**
     * Modificateur updateRegion qui prend un objet Region en parram�tre et qui
     * ira modifier l'objet correspondant dans la base de donnees
     * 
     * @param r
     *            de type Region
     * @return success de type boolean
     */
    public static boolean updateRegion(Region r) {
        boolean success = false;   
        try {
            Transaction trans = session.beginTransaction();
            session.saveOrUpdate(r);
            trans.commit();
            success = true;

        } catch (HibernateException e) {
          
        } 
        return success ;
    }

    

    /**
     * Modificateur createUtilisateur qui prend un parram�tre Utilisateur et qui ira
     * creer l'entre correspondante dans la base de donnees
     * 
     * @param u
     *            de type Utilisateur
     * @return success de type boolean
     */
    public static boolean createUtilisateur(Utilisateur u) {
        boolean success = false;   
        try {
            Transaction trans = session.beginTransaction();
            session.save(u);
            trans.commit();
            success = true;

        } catch (HibernateException e) {
          System.out.println(e);
        } 
        return success ;
    }

    /**
     * Modificateur updateUtilisateur qui prend un parram�tre Utilisateur et qui ira
     * modifier l'entre correspondante dans la base de donnees
     * 
     * @param u
     *            de type Utilisateur
     * @return success de type boolean
     */
    public static boolean updateUtilisateur(Utilisateur u) {
        Boolean ok = false;
        try {            
        	Transaction  trans = session.beginTransaction();
            session.update(u);
            trans.commit();
            ok = true;
        }
        catch(HibernateException e) {
            e.printStackTrace();
        }
        return ok;
    }

    /**
     * Modificateur deleteUtilisateur qui prend un parram�tre Utilisateur et qui ira
     * supprimer l'entre correspondante dans la base de donnees
     * 
     * @param u
     *            de type Utilisateur
     * @return success de type boolean
     */
    public static boolean deleteUtilisateur(Utilisateur u) {
        boolean success = false;   
        try {
            Transaction trans = session.beginTransaction();
            /*
            ArrayList<FicheFrais> verif = new ArrayList<FicheFrais>();
            for(FicheFrais f : u.getListeFicheFrais()){
            	verif.add(f);
            }
            
            boolean rembourser= true;
            
            //verification que toutes les fiches soit rembourser
            for(FicheFrais ff2 : u.getListeFicheFrais()){
            	if(!ff2.getIdEtat().equals("RB")){
            		rembourser=true;
            	}
            
            }
            if(rembourser){
            	for(FicheFrais ff : verif){
            		
            		for(LigneFraisForfait lff : ff.getListeLigneFraisForfait()){
            			session.delete(lff);
            			trans.commit();
            			
            			
            			
            		}
            		for(LigneFraisHorsForfait lfhft : ff.getListeLigneFraisHorsForfait()){
            			session.delete(lfhft);
            			trans.commit();
            			
            			
            		}
            		session.delete(ff);
            		trans.commit();
            		
            	}
            	System.out.println(u.getListeFicheFrais().size());
            	session.delete(u);
            	trans.commit();*/
        	
        		u.setActiviter("N");
        		session.update(u);
        		trans.commit();
        	
            	success = true;
            //}
            
            
            
            
          //  session.delete(u);
           // trans.commit();
           

        } catch (HibernateException e) {
          
        } 
        return success ;
    }
    
    /**
     * Methode permettant de cr�e un objet r�gion valide pour la 
     * cr�ation d'utilisateur
     * 
     * @param String libelleRegion
     *            
     * @return L'objet r�gion corespondant
     */
    
    public static Region findRegion(String libelleRegion){
    	
    	 List<Region> lr= new ArrayList<Region>();
         lr=AccesData.getListRegion();
         boolean trouver = false ;
         int i=0;
         while(trouver = false){
         	if(lr.get(i).getLibelleRegion().equals(libelleRegion)){
         		
         		trouver = true;
         		
         		
         	}
         	else{
         		i=i+1;
         	}
         }
         
         return lr.get(i);
    	
    	
    	
    }
    
    
    /**
     * Méthode de connection
     * 
     * @param login de type String
     * @param mdp de type char[]
     * 
     * @return success de type boolean
     */
    public static Utilisateur connection(String login,char[] mdp)
    {
        Utilisateur util = null;
        try
        {
            util =(Utilisateur) session.createQuery("from Utilisateur where login='"+login+"' and mdp='"+String.valueOf(mdp)+"'").list().get(0);
        }
        catch (HibernateException e)
        {
            
        }
        
        return util;
    }
}

