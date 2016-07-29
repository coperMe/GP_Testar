package types;

import ec.EvolutionState;
import ec.gp.GPInitializer;
import ec.gp.GPType;
import ec.util.Parameter;

public class and_type extends GPType {
	

	@Override
	public void setup(EvolutionState state, Parameter base) {
		// TODO Auto-generated method stub
		super.setup(state, base);
		this.name = "AND";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean compatibleWith(GPInitializer arg0, GPType arg1) {
		// TODO Auto-generated method stub
		if( arg1.equals(eq_type.P_NAME)  ||
			arg1.equals(le_type.P_NAME)  ||
			arg1.equals(lt_type.P_NAME)  ||
			arg1.equals(or_type.P_NAME)  ||
			arg1.equals(not_type.P_NAME) ||
			arg1.equals(xor_type.P_NAME) ||
			arg1.equals(neq_type.P_NAME) )
			return true;
		
		return false;
	}

}
