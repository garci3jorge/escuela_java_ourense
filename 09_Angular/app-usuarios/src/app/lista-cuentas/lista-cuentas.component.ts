import { Component, OnInit } from '@angular/core';
import { CuentaBanc } from '../modelo/CuentaBanc';
import { CuentasRestService } from '../cuentas-rest.service';

@Component({
  selector: 'app-lista-cuentas',
  templateUrl: './lista-cuentas.component.html',
  styleUrls: ['./lista-cuentas.component.css']
})
export class ListaCuentasComponent implements OnInit {

  arrayCuentas: CuentaBanc[];


  constructor(private srvCuentas: CuentasRestService) {
    this.srvCuentas.alCambiar = () => {
      this.ngOnInit;
    }
  }

  ngOnInit() {
    this.srvCuentas.traerTodos().subscribe(
      (cuentasTraidas: CuentaBanc[]) => {
        this.arrayCuentas = cuentasTraidas;
        console.log(cuentasTraidas.toString());
      });
    console.log(">>>> lamanda asincrona AJAX realizada")

  }

  eliminar(id: Number) {
    this.srvCuentas.eliminar;
    console.log(">>>>>Eliminar:  "+id);
   }



}
