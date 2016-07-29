package structure;


import ec.EvolutionState;
import ec.Problem;
import ec.app.tutorial4.DoubleData;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.util.Parameter;

public class TESTAR_IF extends GPNode {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IF " + children[0].toString() + children[1].toString() + children[2].toString();
	}

	public int expectedChildren() { return 3; }
	
    
    public void checkConstraints(final EvolutionState state,
    final int tree,
    final GPIndividual typicalIndividual,
    final Parameter individualBase)
    {
	    super.checkConstraints(state,tree,typicalIndividual,individualBase);
	    if (children.length!=3)
	    state.output.error("Incorrect number of children for node " + 
	    toStringForError() + " at " +
	    individualBase);
	    else{
	    /*	if( childtypes[0] != TESTAR_Condition ||
	    		childtypes[1] != TESTAR_Then ||
	    		childtypes[2] != TESTAR_Else)
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
