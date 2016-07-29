package POJO;

import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPInitializer;
import ec.gp.GPNode;
import ec.gp.GPNodeConstraints;
import ec.util.Parameter;
import types.role_type;

public class TESTAR_ActionNode extends GPNode {
	
	private TESTAR_Actions action;

	@Override
	public void eval(EvolutionState arg0, int arg1, GPData arg2, ADFStack arg3, GPIndividual arg4, Problem arg5) {
		// TODO Auto-generated method stub

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
	    	GPNodeConstraints cons = this.constraints((GPInitializer) state.initializer);
	    	if( cons.childtypes[0] != role_type.typeFor(role_type.P_NAME, state) )
	    		state.output.error("Incorrect type of child at " +
	    		individualBase);
	    		
	    }
    }
  
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.action.toString() + children[0].toString();
	}

}
