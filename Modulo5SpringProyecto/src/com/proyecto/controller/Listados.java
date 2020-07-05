package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class Listados {
 
	
	@RequestMapping("/listarEmpleados")
	public	ModelAndView mostrarEmpleados() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Empleado</th>"
				+ "<th>Nombre </th>"
				+ "<th>Especialidad </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>Pedro </td>"
				+ "<td>Gerente de Capacitaciones </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>2 </td>"
				+ "<td>Diego </td>"
				+ "<td>Visitador </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>3 </td>"
				+ "<td>Lester </td>"
				+ "<td>Asesor Telefónico </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>4 </td>"
				+ "<td>Sofia </td>"
				+ "<td>Asesor de RRHH </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listarEmpleados", "message", message);
		
	}
	
	@RequestMapping("/listarClientes")
	public	ModelAndView mostrarClientes() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Cliente</th>"
				+ "<th>Nombre </th>"
				+ "<th>Telefono </th>"
				+ "<th>Rubro </th>"
				+ "<th>Dirección </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>Javier </td>"
				+ "<td>92345613 </td>"
				+ "<td>javier@123.cl </td>"
				+ "<td>construcción </td>"
				+ "<td>tu casa, 123, tupobla </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>2 </td>"
				+ "<td>Marcela </td>"
				+ "<td>92345122 </td>"
				+ "<td>marcela@123.cl </td>"
				+ "<td>mineria </td>"
				+ "<td>tu casa, 220, tupobla </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>3 </td>"
				+ "<td>Sebastián </td>"
				+ "<td>92432313 </td>"
				+ "<td>Sebastian@123.cl </td>"
				+ "<td>Transporte </td>"
				+ "<td>tu casa, 423, tupobla </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>4 </td>"
				+ "<td>Daniel </td>"
				+ "<td>95523613 </td>"
				+ "<td>Daniel@123.cl </td>"
				+ "<td>Logistica </td>"
				+ "<td>tu casa, 633, tupobla </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listarClientes", "message", message);
		
	}
	
	@RequestMapping("/listarCapacitaciones")
	public	ModelAndView mostrarCapacitaciones() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Capacitación</th>"
				+ "<th>Fecha </th>"
				+ "<th>Hora </th>"
				+ "<th>Numero Asistentes </th>"
				+ "<th>Visitas ID </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>100 </td>"
				+ "<td>01-06-2020 </td>"
				+ "<td>13:30 </td>"
				+ "<td>150 </td>"
				+ "<td>1 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>102 </td>"
				+ "<td>04-03-2020 </td>"
				+ "<td>17:30 </td>"
				+ "<td>100 </td>"
				+ "<td>2 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>231 </td>"
				+ "<td>12-11-2020 </td>"
				+ "<td>12:00 </td>"
				+ "<td>10 </td>"
				+ "<td>3 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>143 </td>"
				+ "<td>01-06-2020 </td>"
				+ "<td>18:30 </td>"
				+ "<td>164 </td>"
				+ "<td>3 </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listarCapacitaciones", "message", message);
		
	}
	
	@RequestMapping("/listarMejoras")
	public	ModelAndView mostrarMejoras() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Mejoras</th>"
				+ "<th>Fecha </th>"
				+ "<th>Motivo </th>"
				+ "<th>Actividad </th>"
				+ "<th>Estado </th>"
				+ "<th>Cliente ID </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>12-05-2020 </td>"
				+ "<td>Accidente ruta camiones </td>"
				+ "<td>Reforzar señalización</td>"
				+ "<td>yes </td>"
				+ "<td>124 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>2 </td>"
				+ "<td>02-12-2020 </td>"
				+ "<td>caida de andamio </td>"
				+ "<td>reforzar anclajes</td>"
				+ "<td>no </td>"
				+ "<td>123 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>3 </td>"
				+ "<td>22-05-2018 </td>"
				+ "<td>plagas </td>"
				+ "<td>controlar plagas</td>"
				+ "<td>no </td>"
				+ "<td>120 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>4 </td>"
				+ "<td>23-06-2015 </td>"
				+ "<td>riesgos </td>"
				+ "<td>reforzar prevencion </td>"
				+ "<td>yes </td>"
				+ "<td>121 </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listarMejoras", "message", message);
		
	}
	
	@RequestMapping("/listarPago")
	public	ModelAndView mostrarPago() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Pago</th>"
				+ "<th>Mes/Año </th>"
				+ "<th>Monto Regular </th>"
				+ "<th>Montos Adicionales </th>"
				+ "<th>ID Cliente </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>10-2020 </td>"
				+ "<td>50000 </td>"
				+ "<td>0 </td>"
				+ "<td>120 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>2 </td>"
				+ "<td>05-2020 </td>"
				+ "<td>55000 </td>"
				+ "<td>0 </td>"
				+ "<td>121 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>3 </td>"
				+ "<td>01-2019 </td>"
				+ "<td>44000 </td>"
				+ "<td>0 </td>"
				+ "<td>122 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>4 </td>"
				+ "<td>02-2020 </td>"
				+ "<td>35000 </td>"
				+ "<td>10000 </td>"
				+ "<td>123 </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listarPago", "message", message);
		
	}
	
	@RequestMapping("/listadoAccidentes")
	public	ModelAndView mostrarAccidentes() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Accidente</th>"
				+ "<th>Fecha </th>"
				+ "<th>Hora </th>"
				+ "<th>Suceso </th>"
				+ "<th>Lugar </th>"
				+ "<th>ID Cliente </th>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>03-03-2002 </td>"
				+ "<td>23:00 </td>"
				+ "<td>Caida Techo  </td>"
				+ "<td>Faena  </td>"
				+ "<td>123 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>251 </td>"
				+ "<td>07-09-2017 </td>"
				+ "<td>9:00 </td>"
				+ "<td>Choque Automovilistico  </td>"
				+ "<td>Estacionamiento </td>"
				+ "<td>124 </td>"
				+ "</tr>"

				+ "<tr>"
				+ "<td>231 </td>"
				+ "<td>03-04-2020 </td>"
				+ "<td>20:00 </td>"
				+ "<td>Caida Internet </td>"
				+ "<td>Viña del mar  </td>"
				+ "<td>125 </td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>101 </td>"
				+ "<td>03-04-2020 </td>"
				+ "<td>5:00 </td>"
				+ "<td>Choque </td>"
				+ "<td>Los Andes </td>"
				+ "<td>126 </td>"
				+ "</tr>"
				
				+ "</table><br>";
		return new ModelAndView("listadoAccidentes", "message", message);
		
	}
	
	@RequestMapping("/listadoAsesorias")
	public	ModelAndView mostrarAsesorias() {
		
		String message = "<br><table style='text-align:center;font-family: verdana;'>"
				+ "<tr>"
				+ "<th>ID Asesoria</th>"
				+ "<th>Detalle </th>"
				+ "<th>Gestión </th>"
				+ "<th>Propuestas </th>"
				+ "<th>Fecha </th>"	
				+ "<th>Especial </th>"
				+ "<th>Visita ID </th>"				
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>1 </td>"
				+ "<td>Documentación legal accidente   </td>"
				+ "<td>Gestion de Accidente </td>"
				+ "<td>Realizar Archivos de Documentacion en caso de Emergencia  </td>"
				+ "<td>08-03-2007 </td>"
				+ "<td>no </td>"
				+ "<td>1 </td>"				
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>2 </td>"
				+ "<td>Prevencion de Riesgos Laborales    </td>"
				+ "<td>Gestion de Riesgos en Faena  </td>"
				+ "<td>Realizar capacitacion a los empleado sobre utilización de elementos de seguridad  </td>"
				+ "<td>09-09-2010 </td>"
				+ "<td>si </td>"
				+ "<td>2 </td>"				
				+ "</tr>"
				
				
				
				+ "</table><br>";
		return new ModelAndView("listadoAsesorias", "message", message);
		
	}
}