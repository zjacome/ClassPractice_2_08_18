
public class Card_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1type1= new Card(9, "Hearts");
		Card card1type2= new Card(1, "Hearts");
		Card card1type3= new Card(5, "Clover");
		
		Card card2type2= new Card(1, "Diamonds");
		Card card2type1= new Card(2, "Clubs");
		Card card2type3= new Card(1, "Hearts");
		
		Card card3type1= new Card(5, "Hearts");
		Card card3type2= new Card(1, "Clover");
		Card lucky= new Card(1, "Diamonds");
		
		System.out.println(card3type1.number+" "+ card3type1.suit);
		System.out.println(card1type1.number+" "+ card1type1.suit);
		System.out.println(lucky.number+" "+ lucky.suit);
		
	}

}
