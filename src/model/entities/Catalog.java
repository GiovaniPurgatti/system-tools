package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Catalog extends Tools {
	
	private List<Tools> listTools = new ArrayList<>();
	
	
	public List<Tools> getTools() {
		return listTools;
	}
	

	public void listTools(){
	    for (Tools aux: listTools) {
	        aux.getInfo();
	    }
	}
	
	
	
}
