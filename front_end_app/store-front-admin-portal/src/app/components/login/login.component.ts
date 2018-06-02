import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  
  private credentials = {
    'username':'',
    'password':''
  }; 
  private loggedIn:boolean = false;


  constructor() { }

  ngOnInit() {
  }

}
