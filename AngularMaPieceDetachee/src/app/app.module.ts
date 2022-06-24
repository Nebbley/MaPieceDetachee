import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './Components/header/header.component';
import { Routes, RouterModule } from '@angular/router';
import { AcceuilComponent } from './Components/acceuil/acceuil.component';
import { InscrptionPageComponent } from './Components/inscrption-page/inscrption-page.component';
import { AcoountPageComponent } from './Components/acoount-page/acoount-page.component';
import { PanierComponent } from './Components/panier/panier.component';
import { PayerComponent } from './Components/payer/payer.component';
import { HeaderConnectedComponent } from './Components/header-connected/header-connected.component';

const myRoutes: Routes = [
  { path: '', component: AcceuilComponent},
  { path: 'Acceuil', component: AcceuilComponent},
  { path: 'Inscription', component:     InscrptionPageComponent},
  { path: 'Account', component: AcoountPageComponent},
  { path: 'panier', component: PanierComponent},
  { path: 'Payer', component: PayerComponent},
];
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AcceuilComponent,
    InscrptionPageComponent,
    AcoountPageComponent,
    PanierComponent,
    PayerComponent,
    HeaderConnectedComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(myRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
