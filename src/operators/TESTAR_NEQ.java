package operators;

import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.util.Parameter;

public class TESTAR_NEQ extends GPNode {

	@Override
	public void eval(EvolutionState arg0, int arg1, GPData arg2, ADFStack arg3, GPIndividual arg4, Problem arg5) {
		// TODO Auto-generated method stub

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
			    /*	if( (childtypes[0] != TESTAR_EQ  && childtypes[0] != TESTAR_LT && 
			     * 		 childtypes[0] != TESTAR_AND && childtypes[0] != TESTAR_OR && 
			     * 		 childtypes[0] != TESTAR_XOR && childtypes[0] != TESTAR_NOT && 
			     * 		 childtypes[0] != TESTAR_LE  && childtypes[0] != TESTAR_NEQ ) ||
			    	  	(childtypes[1] != TESTAR_EQ  && childtypes[1] != TESTAR_LT && 
			     * 		 childtypes[1] != TESTAR_AND && childtypes[1] != TESTAR_OR && 
			     * 		 childtypes[1] != TESTAR_XOR && childtypes[1] != TESTAR_NOT && 
			     * 		 childtypes[1] != TESTAR_LE  && childtypes[1] != TESTAR_NEQ ) )
			    		state.output.error("Incorrect type of children at " +
			    		individualBase);
			    */		
			    }
		    }

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( " + children[0].toString() + " NEQ " + children[1].toString() + " )";
	}

}
