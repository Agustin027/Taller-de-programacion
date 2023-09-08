
Program dos;

Type 

  venta = Record
    codigo: integer;
    fecha: integer;
    cantU: integer;
  End;


  producto = Record
    codigo: integer;
    cantTotal: integer;
  End;


  arbol = ^nodo;
  nodo = Record
    HI: arbol;
    HD: arbol;
    dato: venta;
  End;

  arbol2 = ^nodo2;
  nodo2 = Record
    HI: arbol2;
    HD: arbol2;
    dato: producto;
  End;

Procedure leer(Var v:venta);
Begin
  writeln('ingresar codigo de producto');
  readln(v.codigo);
  If v.codigo<>0 Then
    Begin

      v.fecha := random(30);
      writeln('ingresar cant de unidades');
      readln(v.cantU);
    End;
End;


Procedure agregar(Var a:arbol;v:venta);
Begin
  If (a=Nil) Then
    Begin
      new(a);
      a^.dato := v;
      a^.hi := Nil;
      a^.hd := Nil;
    End
  Else If v.codigo<=a^.dato.codigo Then
         agregar(a^.hi,v)
  Else
    agregar(a^.hd,v);
End;

Procedure agregar2(Var a2: arbol2; codigo, cantidad: Integer);
Begin
  If a2 = Nil Then
    Begin
      new(a2);
      a2^.dato.codigo := codigo;
      a2^.dato.cantTotal := cantidad;
      a2^.HI := Nil;
      a2^.HD := Nil;
    End
  Else If codigo < a2^.dato.codigo Then
         Begin
           agregar2(a2^.HI, codigo, cantidad);
         End
  Else If codigo > a2^.dato.codigo Then
         Begin
           agregar2(a2^.HD, codigo, cantidad);
         End
  Else
    Begin
      a2^.dato.cantTotal := a2^.dato.cantTotal + cantidad;
    End;
End;



Procedure creararboles(Var a:arbol;Var a2:arbol2);

Var 
  v: venta;
  p: producto;
Begin
  leer(v);
  While v.codigo<>0 Do
    Begin
      agregar(a,v);
      p.codigo := v.codigo;
      p.canttotal := v.cantu;
      agregar2(a2,p.codigo,p.cantTotal);
      leer(v);
    End;
End;




Function incisoB(a: arbol; cod: integer): integer;
Begin
  If a <> Nil Then
    Begin
      If a^.dato.codigo = cod Then
        incisoB := a^.dato.cantU + incisoB(a^.HI, cod) + incisoB(a^.HD, cod)

      Else If cod < a^.dato.codigo Then
             incisoB := incisoB(a^.HI, cod)

      Else
        incisoB := incisoB(a^.HD, cod);

    End
  Else
    incisoB := 0;
End;



Function incisoC(a: arbol2; cod: integer): integer;
Begin
  If a <> Nil Then
    Begin
      If a^.dato.codigo = cod Then
        incisoC := a^.dato.cantTotal + incisoC(a^.HI, cod) + incisoC(a^.HD, cod)
      Else If cod < a^.dato.codigo Then
             incisoC := incisoC(a^.HI, cod)
      Else
        incisoC := incisoC(a^.HD, cod);
    End
  Else
    incisoC := 0;
End;




{ esto lo hice para saber si arme el arbol 2 bien
procedure imprimirArbol2(a2: arbol2);
begin
  if a2 <> nil then
  begin
    imprimirArbol2(a2^.HI); // Recorre el subárbol izquierdo
    writeln('Código de Producto:', a2^.dato.codigo);
    writeln('Cantidad Total Vendida:', a2^.dato.cantTotal);
    imprimirArbol2(a2^.HD); // Recorre el subárbol derecho
  end;
end;
}

Var 
  a: arbol;
  a2: arbol2;
  cod: integer;
Begin
  randomize;
  creararboles(a,a2);
  //imprimirArbol2(a2);
  writeln('ingresar codigo a buscar');
  readln(cod);
  writeln('la cantidad total de unidades vendidas del prod ',cod,' 	es: ',
          incisoB(a,cod));
  writeln('ingresar codigo a buscar');
  readln(cod);
  writeln('la cantidad total de unidades vendidas del prod ',cod,' 	es: ',
          incisoC(a2,cod));

End.
