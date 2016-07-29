package POJO;

import ec.gp.GPData;
import leaves.TESTAR_Roles;

public class TESTAR_RoleData extends GPData {

	private TESTAR_Roles data;

	public TESTAR_Roles getData() {
		return data;
	}

	public void setData(TESTAR_Roles data) {
		this.data = data;
	}
	
	public void copyTo(final GPData gpd){
		((TESTAR_RoleData)gpd).setData(this.data);
	}
}
