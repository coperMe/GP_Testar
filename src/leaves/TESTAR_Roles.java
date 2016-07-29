package leaves;


public enum TESTAR_Roles {
	LeftClick,
	RightClick,
	TypeInto,
	PreviousAction,
	Any;
	
	@Override
	public String toString() {	
		String output = "";
		switch(this){
		case LeftClick:
			output = "(LeftClick)";
		case RightClick:
			output = "(RightClick)";
		case TypeInto:
			output = "(TypeInto)";
		case Any:
			output = "(Any)";
		default:
			output = "(PreviousAction)";
		}
		return output;
	}
}
