import { Component, OnInit } from '@angular/core';
import { CuentaBanc } from '../modelo/CuentaBanc';
import { CuentasRestService } from "../cuentas-rest.service";
import { Observable } from 'rxjs';


@Component({
  selector: 'app-nueva-cuenta',
  templateUrl: './nueva-cuenta.component.html',
  styleUrls: ['./nueva-cuenta.component.css']
})
export class NuevaCuentaComponent implements OnInit {

  cuenta: CuentaBanc;
  recibdo:boolean;

  //angular detecta que el componente necesita el servicio,
  //asi que le inyecta el unico que ha creado
  //como el @Autowire de srping, es la inyccion de dependencias
  constructor(private srvCuentasRest: CuentasRestService) { }

  ngOnInit() {
    this.cuenta = new CuentaBanc(0, "", "");
  }
  crearCuenta(): void {
    let observador: Observable<CuentaBanc>;
 
    observador = this.srvCuentasRest.add(this.cuenta);
    observador.subscribe( (objNoSexual) =>{
      console.log("Datos: "+ objNoSexual["iban"]);
      this.recibdo=true;
    })
    console.log(this.cuenta.toString());
  }

}
