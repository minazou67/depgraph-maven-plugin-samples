package org.minazou67.samples.depgraph.controller;

import org.minazou67.samples.depgraph.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") final int id) {
		return new Employee(id, "Foo");
	}
}
