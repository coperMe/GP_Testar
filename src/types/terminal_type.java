package types;

import ec.gp.GPInitializer;
import ec.gp.GPType;

public class terminal_type extends GPType {

	@Override
	public boolean compatibleWith(GPInitializer arg0, GPType arg1) {
		// TODO Auto-generated method stub
		if(arg1.type != this.type)
			return false;
		else
			return true;
	}

}
