package legotest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.tree.VariableHeightLayoutCache;

import org.junit.Test;

import lego.Boite;

public class TestBoite {

	@Test
	void testConstructor() {
		//given
		var number = 21318; 
		var name = "La cabane dans l'arbre";
		var pieces = 3036;
		//when
		var boite =  new Boite(number, name);
		//then
		assertAll(
		() -> assertEquals(number,boite.getNumber(), "number"),
		() -> assertEquals(name,boite.getName(), "name"),
		() -> assertEquals(pieces,boite.getpieces(),"pieces")
		);
	}

}
