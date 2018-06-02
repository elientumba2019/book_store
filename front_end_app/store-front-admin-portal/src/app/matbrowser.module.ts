import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbar, MatToolbarModule, MatButtonModule, MatCheckbox, MatCheckboxModule, MatGridListModule, MatInput, MatInputModule } from '@angular/material';

@NgModule({
  imports: [
    MatToolbarModule,
    MatButtonModule,
    MatCheckboxModule,
    MatGridListModule,
    MatInputModule
  ],

  exports: [
    MatToolbarModule,
    MatButtonModule,
    MatCheckboxModule,
    MatGridListModule,
    MatInputModule
  ],
  declarations: []
})
export class MatbrowserModule { }
