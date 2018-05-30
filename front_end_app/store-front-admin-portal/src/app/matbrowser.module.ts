import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbar, MatToolbarModule, MatButtonModule, MatCheckbox, MatCheckboxModule } from '@angular/material';

@NgModule({
  imports: [
    MatToolbarModule,
    MatButtonModule,
    MatCheckboxModule
  ],

  exports: [
    MatToolbarModule,
    MatButtonModule,
    MatCheckboxModule
  ],
  declarations: []
})
export class MatbrowserModule { }
