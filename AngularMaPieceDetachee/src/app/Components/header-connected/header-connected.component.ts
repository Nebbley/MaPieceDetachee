
import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-header-connected',
  templateUrl: './header-connected.component.html',
  styleUrls: ['./header-connected.component.css']
})
export class HeaderConnectedComponent implements OnInit {

  @Output() Connection = new EventEmitter<boolean>();
  Deconnected :boolean;
  constructor(private router: Router) {
    this.Deconnected=true;
   }

  ngOnInit(): void {
  }
  Deconnect() {
this.Deconnected=false;
this.router.navigate(['/Acceuil'])
this.Connection.emit(this.Deconnected);

  }
  gotopanier(){
    this.router.navigate(['/panier'])
  }

}
