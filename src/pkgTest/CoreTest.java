package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Deck;
import pkgEnum.eRank;
import pkgEnum.eSuit;

class CoreTest {

	@Test
	void getRemaining_test1() {
		//New Deck, draw 2 hearts and a spade. Should be 11 Hearts, 12 Spades, and 13 Clubs remaining. 
		Deck d1 = new Deck();
		d1.Draw(eSuit.HEARTS);
		d1.Draw(eSuit.HEARTS);
		d1.Draw(eSuit.SPADES);
		assertTrue(d1.getRemaining(eSuit.HEARTS) == 11);
		assertTrue(d1.getRemaining(eSuit.SPADES) == 12);
		assertTrue(d1.getRemaining(eSuit.CLUBS) == 13);
		//New Deck, draw 2 hearts and a spade. Should be 2 Aces, 3 Eights, and 4 Sevens remaining.
		Deck d2 = new Deck();
		d2.Draw(eRank.ACE);
		d2.Draw(eRank.ACE);
		d2.Draw(eRank.EIGHT);
		assertTrue(d2.getRemaining(eRank.ACE) == 2);
		assertTrue(d2.getRemaining(eRank.EIGHT) == 3);
		assertTrue(d2.getRemaining(eRank.SEVEN) == 4);
	}

}
