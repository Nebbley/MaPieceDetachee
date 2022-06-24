import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Output() Connection = new EventEmitter<boolean>();
  Connected:boolean;
  constructor(private router: Router) {
    this.Connected =false;
   }

  ngOnInit(): void {
  }
  changePage(){
  }

  Connect(){
    this.Connected =true;
    this.router.navigate(['/Acceuil'])
    this.Connection.emit(this.Connected);
  }
  Inscription(){
    this.router.navigate(['/Inscription'])
  }
}
