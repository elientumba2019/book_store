import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private token = "xAuthToken";
  private credentials = {
    'username':'',
    'password':''
  }; 
  private loggedIn:boolean = false;


  
  constructor(private loginService : LoginService) { }

  ngOnInit() {
  }



  /**
   * called when the user submits the form
   */
  onSubmit(){
    this.loginService.sendCredentials(this.credentials.username , this.credentials.password)
      .subscribe(res =>{
        console.log(res);
        localStorage.setItem(this.token , res.json().token);
        this.loggedIn = true;
        location.reload();
      } , err =>{
        console.log(err)
      })
  }

}
