package POJO;

import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.gp.GPTree;

public class TESTAR_Individual extends GPIndividual {

	

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		int trees = this.trees.length;
		GPNode root = this.trees[1].child;
		
		
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String individual = "";
		int numtrees = this.trees.length;
		
		individual += "[";
		for(int i = 0; i < numtrees; i++){
			individual += "{" + this.trees[i].child.toString() + "}";
			if(i < numtrees - 1)
				individual += ", ";
		}
		individual += "]";
		
		return individual;
	}
	
	
	
}
