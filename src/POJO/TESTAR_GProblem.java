package POJO;
/**
 * 
 */


import ec.EvolutionState;
import ec.Individual;
import ec.Problem;
import ec.simple.SimpleProblemForm;
import ec.util.Parameter;

/**
 * @author David García Molino
 *
 */
public class TESTAR_GProblem extends Problem implements SimpleProblemForm {

	/* (non-Javadoc)
	 * @see ec.simple.SimpleProblemForm#evaluate(ec.EvolutionState, ec.Individual, int, int)
	 */
	@Override
	public void evaluate(EvolutionState state, Individual ind, int subpopulation, int threadnum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setup(EvolutionState state, Parameter base) {
		// TODO Auto-generated method stub
		super.setup(state, base);
		
		
	}
	
	

}
