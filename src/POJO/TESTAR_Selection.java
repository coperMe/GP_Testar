package POJO;

import ec.EvolutionState;
import ec.Individual;
import ec.Population;
import ec.SelectionMethod;
import ec.util.Parameter;

public class TESTAR_Selection extends SelectionMethod {

	@Override
	public Parameter defaultBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepareToProduce(EvolutionState s, int subpopulation, int thread) {
		// TODO Auto-generated method stub
		super.prepareToProduce(s, subpopulation, thread);
	}
	
	@Override
	public int produce(int arg0, EvolutionState arg1, int arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	@Override
	public int produce(int arg0, int arg1, int arg2, int arg3, Individual[] arg4, EvolutionState arg5, int arg6) 
		// min, max, start, subpopulation, inds, state, thread
	{
		int n = 1;
		if (n>arg1) n = arg1;
		if (n<arg0) n = arg0;
			
		for(int q = 0; q < n; q++)
		{
			Individual[] oldinds = arg5.population.subpops[arg3].individuals;
			arg4[arg2+q] = oldinds[arg5.random[arg6].nextInt(
					arg5.population.subpops[arg3].individuals.length )];
		}
		return n;
	}

	@Override
	public boolean produces(EvolutionState state, Population newpop, int subpopulation, int thread) {
		// TODO Auto-generated method stub
		return super.produces(state, newpop, subpopulation, thread);
	}

	
}
