package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.metier.Region;
import com.metier.Utilisateur;
import com.persistance.AccesData;

public class AccesDataTest {

	AccesData d = new AccesData();
	Utilisateur u;
	Region r;
	
	@Before
	public void setUp() throws Exception {

		
		r=new Region ("Alsace");
		u=new Utilisateur("id","nom","prenom","adresse","cp","ville","v",r);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUtilisateur() {
		assertEquals(d.getUtilisateur("a131").getIdUtilisateur(),"a131");
		
	}

	@Test
	public void testGetListUtilisateur() {
		assertEquals(d.getListUtilisateur().size(),d.getListUtilisateur().size());
	}

	@Test
	public void testGetRegion() {
		assertEquals(d.getRegion(1).getIdRegion(),1);
	}

	@Test
	public void testGetListRegion() {
		assertEquals(d.getListRegion().size(),22);
	}

	@Test
	public void testGetUtilisateurByRegion() {
		assertEquals(d.getUtilisateurByRegion(6).size(),1);
	}

	@Test
	public void testGetFicheFrais() {
		assertEquals(d.getFicheFrais(3).getIdUtilisateur(),"a131");
		
	}

	@Test
	public void testGetListFicheFrais() {
		assertEquals(d.getListFicheFrais().size(),248);
	}

	@Test
	public void testGetLigneFraisHorsForfait() {
		assertEquals(d.getLigneFraisHorsForfait(1).getIdLigne(),1);
	}

	@Test
	public void testGetListLigneFraisHorsForfait() {
		assertEquals(d.getListLigneFraisHorsForfait().size(),d.getListLigneFraisHorsForfait().size());
	}

	@Test
	public void testGetLigneFraisForfait() {
		
		assertEquals(d.getLigneFraisForfait(1).getIdVisiteur(),"a131");

	}

	@Test
	public void testGetListLigneFraisForfait() {
		assertEquals(d.getListLigneFraisForfait().size(),992);
	}

	@Test
	public void testGetFraisForfait() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetlistFraisForfait() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateRegion() {
		
	}

	@Test
	public void testUpdateRegion() {

	}

	@Test
	public void testCreateUtilisateur() {
		d.createUtilisateur(u);
	}

	@Test
	public void testUpdateUtilisateur() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUtilisateur() {
		
		fail("Not yet implemented");
	}

	@Test
	public void testConnection() {
		fail("Not yet implemented");
	}

}
