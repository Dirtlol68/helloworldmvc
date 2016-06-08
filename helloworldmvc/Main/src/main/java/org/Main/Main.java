package org.Main;

import org.controller.*;
import org.model.*;
import org.view.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		View view = new View();
		Model model = new Model();
		Controller control = new Controller(view, model);
		control.run();
	}

}
