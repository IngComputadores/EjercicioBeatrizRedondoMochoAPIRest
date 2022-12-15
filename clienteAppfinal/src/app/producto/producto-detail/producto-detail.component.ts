import { Component, OnInit } from '@angular/core';
import { Producto } from '../interfaces/producto.interfaces';
import { ActivatedRoute, Router } from '@angular/router';
import { UsuarioService } from 'src/app/usuario/usuario.service';
import swal from 'sweetalert2';
import { ProductoService } from '../producto.service';


@Component({
  selector: 'app-producto-detail',
  templateUrl: './producto-detail.component.html',
  styles: [
  ]
})
export class ProductoDetailComponent implements OnInit {

  producto!:Producto;

  constructor(private servicioProducto:ProductoService,
    private activateRoute:ActivatedRoute,
    private usuarioService:UsuarioService,
    private router:Router) { }

  ngOnInit(): void {
    if(this.usuarioService.token == ""){
      swal("No esta autenticado","usuario no autenticado","info");
      this.router.navigate(['/login'])
    }else{

      this.activateRoute.paramMap.subscribe(
        params =>{

          let id:number = parseInt( params.get('id')! );
          if (id){
            this.servicioProducto.getProducto(id).subscribe(
              resp => {this.producto = resp; console.log("detalle producto:",this.producto)}
            );
          }
        }

      );

  }
  }

}
