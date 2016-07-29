package POJO;

import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;

public class TESTAR_IntData extends GPData {

	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void copyTo(final GPData gpd){
		((TESTAR_IntData)gpd).setData(this.data);
	}
}
