package POJO;


import ec.gp.GPData;

public class TESTAR_BoolData extends GPData {

	private boolean data;

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	public void copyTo(final GPData gpd){
		((TESTAR_BoolData)gpd).setData(this.data);
	}
}
