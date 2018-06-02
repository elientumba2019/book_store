import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes , RouterModule} from '@angular/router'
import { LoginComponent } from './components/login/login.component';


//routes array
const routes:Routes = [
  {path : '' , redirectTo : '/login' , pathMatch : 'full'},
  {path : 'login' , component : LoginComponent}
]


@NgModule({

  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],

  declarations: []
})
export class RoutingModule { }
