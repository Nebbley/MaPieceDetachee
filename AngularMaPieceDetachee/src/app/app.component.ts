import { Component } from '@angular/core';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularMaPieceDetachee';
  Connected :boolean=false;

  connect(){
    this.Connected=true;
    console.log('Connection');
  }

  deconnect()
   {
    this.Connected=false;
    console.log("Deconnection");

   }
}
