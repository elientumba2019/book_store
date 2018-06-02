import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';




@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }



  /**
   * sends credentials to the servers and waits for a 
   * response from the server 
   * @param username :: user username
   * @param password :: user password
   */
  sendCredentials(username:string , password:string){
    let url = 'http://localhost:8081/token';
    let encodedCredentials = btoa(username + ":" + password);
    let basicHeader = "Basic " + encodedCredentials;
    let headers = new HttpHeaders({
      'Content-Type' : 'application/x-www-urlencoded',
      'Authorization' : 'basicHeader'
    });


    return this.http.get(url , {headers : headers})
  }
}
