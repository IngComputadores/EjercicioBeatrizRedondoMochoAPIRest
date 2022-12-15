import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductoMainComponent } from './producto-main/producto-main.component';
import { ProductoFormComponent } from './producto-form/producto-form.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { ProductoDetailComponent } from './producto-detail/producto-detail.component';



@NgModule({
  declarations: [
    ProductoMainComponent,
    ProductoFormComponent,
    ProductoDetailComponent
  ],
  exports:[
    ProductoMainComponent,
    ProductoFormComponent,
    ProductoDetailComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule

  ]
})
export class ProductoModule { }
