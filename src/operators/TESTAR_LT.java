package operators;


import POJO.TESTAR_BoolData;
import POJO.TESTAR_IntData;
import ec.EvolutionState;
import ec.Problem;
import ec.app.tutorial4.DoubleData;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.util.Parameter;

public class TESTAR_LT extends GPNode {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
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
	    /*	if( (childtypes[0] != TESTAR_Terminal) || 
	      		(childtypes[1] != TESTAR_Terminal) )
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
