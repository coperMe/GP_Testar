package operators;


import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.util.Parameter;

public class TESTAR_NOT extends GPNode {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( " + " NOT " + children[0].toString() + " )";
	}
	
	public int expectedChildren() { return 1; }

	public void checkConstraints(final EvolutionState state,
		    final int tree,
		    final GPIndividual typicalIndividual,
		    final Parameter individualBase)
		    {
			    super.checkConstraints(state,tree,typicalIndividual,individualBase);
			    if (children.length!=1)
			    state.output.error("Incorrect number of children for node " + 
			    toStringForError() + " at " +
			    individualBase);
			    else{
			    /*	if( (childtypes[0] != TESTAR_EQ && childtypes[0] != TESTAR_AND && 
			      		 childtypes[0] != TESTAR_OR && childtypes[0] != TESTAR_XOR  ) )
			    		state.output.error("Incorrect type of children at " +
			    		individualBase);
			    */		
			    }
		    }
	
	@Override
	public void eval(EvolutionState state, int thread, GPData input, ADFStack stack, GPIndividual individual,
			Problem problem) {
		// TODO Auto-generated method stub

	}

}
