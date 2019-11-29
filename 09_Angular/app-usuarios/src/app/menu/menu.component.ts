import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',//los selectores deben tener al menos un guion(-) para diferenciarlos del html
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
