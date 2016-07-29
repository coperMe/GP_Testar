package operators;


import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPInitializer;
import ec.gp.GPNode;
import ec.gp.GPNodeConstraints;
import ec.gp.GPType;
import ec.util.Parameter;
import types.and_type;
import types.eq_type;
import types.lt_type;
import types.not_type;
import types.or_type;
import types.xor_type;

public class TESTAR_OR extends GPNode {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( " + children[0].toString() + " OR "+ children[1].toString() + " )";
	}
	
	public int expectedChildren() { return 2; }

	public void checkConstraints(final EvolutionState state,
		    final int tree,
		    final GPIndividual typicalIndividual,
		    final Parameter individualBase)
		    {
			    super.checkConstraints(state,tree,typicalIndividual,individualBase);
			    
			    if (children.length!=2)
			    	state.output.error("Incorrect number of children for node " + 
			    						toStringForError() + " at " +
			    						individualBase);
			    else{
			    	GPNodeConstraints cons = this.constraints((GPInitializer) state.initializer);
			    	if( (cons.childtypes[0] != eq_type.typeFor(eq_type.P_NAME, state)  && cons.childtypes[0] != lt_type.typeFor(eq_type.P_NAME, state) && 
			     		 cons.childtypes[0] != and_type.typeFor(eq_type.P_NAME, state) && cons.childtypes[0] != or_type.typeFor(eq_type.P_NAME, state) && 
			     		 cons.childtypes[0] != xor_type.typeFor(eq_type.P_NAME, state) && cons.childtypes[0] != not_type.typeFor(eq_type.P_NAME, state) ) ||
			    		(cons.childtypes[1] != eq_type.typeFor(eq_type.P_NAME, state)  && cons.childtypes[1] != lt_type.typeFor(eq_type.P_NAME, state) && 
				     	 cons.childtypes[1] != and_type.typeFor(eq_type.P_NAME, state) && cons.childtypes[1] != or_type.typeFor(eq_type.P_NAME, state) && 
				     	 cons.childtypes[1] != xor_type.typeFor(eq_type.P_NAME, state) && cons.childtypes[1] != not_type.typeFor(eq_type.P_NAME, state) ) )
			    		state.output.error("Incorrect type of children at " +
			    		individualBase);
			    }
		    }
	
	@Override
	public void eval(EvolutionState state, int thread, GPData input, ADFStack stack, GPIndividual individual,
			Problem problem) {
		// TODO Auto-generated method stub

	}

}
