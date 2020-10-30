/*
 * This class is providing Employee's insurance services based on Employee's salary and designation
 * @author: Suparna Arya
 */
package com.cg.eis.pl;

import com.cg.eis.service.*;
import com.cg.eis.bean.*;

public class EmployeeInsuranceSystem {
	public static void main(String[] args) {
		Services serve = new Services();
		Employee e = serve.getEmployeeDetails();
		serve.findInsuranceScheme(e);
		serve.display(e);
	}

}
