package statics;

public class Card {

	static int serialNum = 100;
	int cardNum;

	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	int getCardNum() {
		return this.cardNum;
	}

}

