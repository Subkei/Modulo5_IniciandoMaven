package com.ejemplos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class Ejemplohola {
 
	@RequestMapping("/welcome")
	public ModelAndView holamundo() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/listaempleados")
	public	ModelAndView mostrarEmpleados() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Empleado</th>"
				+ "<th>Nombre </th>"
				+ "<th>Apellido </th>"
				+ "<th>Telefono </th>"
				+ "<th>Correo </th>"
				+ "<th>Ciudad </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>Armando </td>"
				+ "<td>Casas </td>"
				+ "<td>987654321 </td>"
				+ "<td>armandoc@casas.com </td>"
				+ "<td>Antartica </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listaempleados", "message", message);
		
	}
}