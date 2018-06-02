import { Injectable } from '@angular/core';
import{ Http , Headers} from '@angular/http'
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: Http) { }



  /**
   * sends credentials to the servers and waits for a 
   * response from the server 
   * @param username :: user username
   * @param password :: user password
   */
  sendCredentials(username:string , password:string){
    let url = 'http://localhost:8181/token';
    let encodedCredentials = btoa(username + ":" + password);
    let basicHeader = "Basic " + encodedCredentials;
    let headers = new Headers({
      'Content-Type' : 'application/x-www-urlencoded',
      'Authorization' : 'basicHeader'
    });


    return this.http.get(url , {headers : headers})
  }
}
