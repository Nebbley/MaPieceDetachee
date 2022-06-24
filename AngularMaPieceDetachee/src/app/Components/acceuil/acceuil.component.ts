import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-acceuil',
  templateUrl: './acceuil.component.html',
  styleUrls: ['./acceuil.component.css']
})
export class AcceuilComponent implements OnInit {

  Marques: string[];
  Modeles: string[];
  listpiece : string[];
  choosed : boolean;
  modelechoosed:boolean;
  @ViewChild('marquechoisie') marquechoisie!: ElementRef;

  constructor() {
    this.modelechoosed =false;
    this.Marques =[
    "Mazda",
    "Mercedes",
    "Peugeot"
  ]
  this.Modeles=[]
  this.choosed=false;
  this.listpiece=[
    "Roues",
    "Filtres",
    "Plaquettes"
  ]
  }

  ngOnInit(): void {
  }

  modelchoosed(){
    if (this.Marques.includes(this.marquechoisie.nativeElement.value))  {
    this.choosed=true;
      if (this.marquechoisie.nativeElement.value ==="Mazda"){
        this.Modeles = [
          "MX5",
          "CX5",
          "Mazda 2"
        ]}
       else if (this.marquechoisie.nativeElement.value ==="Peugeot"){
        this.Modeles = [
          "208",
          "206",
          "306 "
          ]
      }
    }
    else {
      this.choosed=false;
    }


  }
  marquechoosed(){

    this.modelechoosed =true;
  }

}
