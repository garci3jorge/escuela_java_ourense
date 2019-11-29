import { Injectable } from '@angular/core';
import { Observable, from } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { CuentaBanc } from './modelo/CuentaBanc';
//objeto que angular se encarga de instanciar como un singleton

@Injectable({
  providedIn: 'root'
})
export class CuentasRestService {

  //infiere o deduce a partir del valor ("" es String) 
  urlApiRest = "http://localhost:8080/cuentas";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private httpCli: HttpClient) { }

  //con esto creamos una cuenta nueva
  //creamos con el .post

  public add(nuevaCuenta: CuentaBanc): Observable<CuentaBanc> {
     return this.httpCli.post<CuentaBanc>(this.urlApiRest, nuevaCuenta, this.httpOptions);

  }
}
