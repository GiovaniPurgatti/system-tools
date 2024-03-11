package application;

import model.entities.Catalog;
import model.entities.Tools;

public class Program {

	public static void main(String[] args) {
		Tools tools = new Tools("fenda", "teste", "4444", "5555");
		Catalog cat = new Catalog();
		cat.getTools().add(tools);
		cat.listTools();

	}

}
