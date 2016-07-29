package leaves;

public enum TESTAR_Terminals {
	nLeftClicks,
	nTypeInto,
	nActions,
	RND,
	one;
	
	@Override
	public String toString() {	
		String output = "";
		switch(this){
		case nLeftClicks:
			output = " nLeftClicks ";
		case nTypeInto:
			output = " nTypeInto ";
		case nActions:
			output = " nActions ";
		case RND:
			output = " RND ";
		default:
			output = " 1 ";
		}
		return output;
	}
}
