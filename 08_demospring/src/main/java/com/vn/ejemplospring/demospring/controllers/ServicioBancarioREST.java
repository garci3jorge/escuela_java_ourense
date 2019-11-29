package com.vn.ejemplospring.demospring.controllers;

import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.ejemplospring.demospring.modelo.CuentaBanc;
import com.vn.ejemplospring.demospring.modelo.CuentasDAOpanama;

//esto es una api rest que es un servlet que tendra metodos get post put etc..

@RestController
@CrossOrigin(origins = "*")
//cors
public class ServicioBancarioREST {
	//nosotros no instanciamos, lo hace spring
	// tampoco gestinamos la dependencia,lo hace spring
	//tampoco asignamos el valor, lo hace spring
	//esto es la inyeccion de dependencias
	@Autowired
	private CuentasDAOpanama repo;
	
	// nos permite capturar varios metodos http
	@RequestMapping(path = "/cuentas", method = {RequestMethod.POST})  
	//metodo POST
	//@PostaMapping
	public CuentaBanc crearCuentaAingenuo(@RequestBody CuentaBanc cuenta) {
		
		System.out.println(">>>> CUENTA BANCARIA RECIBIDA "+ cuenta.toString());
		
		return repo.save(cuenta);
	}

	@RequestMapping(path = "/cuentas", method = {RequestMethod.GET} )  
	public  List<CuentaBanc> obtenerTodas(){
		System.out.println(">>>>> get todas las cuentas");
		List<CuentaBanc> lista = repo.findAll();
		return lista;
	}
	
	@DeleteMapping("/cuentas/{id}")
	public void eliminarCuenta(@PathVariable Integer id) {
		repo.deleteById(id);
		System.out.println(">>>>  DELETED <<<<<<  "+id);
	}
	
	//hacer el put para modificar
	
	@PutMapping("/cuentas/{id}")
	public CuentaBanc modificarCuenta(@PathVariable Integer id, @RequestBody CuentaBanc cuentaModif) {
		if (cuentaModif.getId()==id) {
			repo.save(cuentaModif);
			System.out.println(">>>>  PUT Modificar   <<<<<<  "+id);
			return repo.save(cuentaModif);
			
		}else {
			System.out.println(">>>>  PUT Modificar  <<<<<<  "+id+ " e "+ cuentaModif.getId()+" no son iguales");
			return repo.save(cuentaModif);
		}
	}
	
	
	
}
