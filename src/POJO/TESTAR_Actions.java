package POJO;


public enum TESTAR_Actions {
	pick,
	pickAny,
	pickAnyUnexecuted;
	
	@Override
	public String toString() {		
		switch(this){
		case pick:
			return "pick";
		case pickAny:
			return "pickAny";
		default:
			return "pickAnyUnexecuted";
		}
	}

}
