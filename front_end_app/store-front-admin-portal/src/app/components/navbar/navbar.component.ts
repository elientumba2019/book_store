import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  private loggedIn:boolean = false;

  constructor() { }

  ngOnInit() {
  }




  /**
   * temporary function to toggle the disply function of 
   * navbar elements
   */
  toggleDisplay():void{
    this.loggedIn = !this.loggedIn
  }
}
