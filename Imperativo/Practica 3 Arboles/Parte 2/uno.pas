
Program uno ;

Type 

  producto = Record
    cod: integer;
    cantTOT: integer;
    montoTOT: real;
  End;

  venta = Record
    codV: integer;
    codP: integer;
    cantU: integer;
    precioU: real;
  End;

  arbol = ^nodo;
  nodo = Record
    dato: producto;
    HI: arbol;
    HD: arbol;
  End;


Procedure leer(Var v:venta);
Begin
  writeln('ingresar cod venta');
  readln(v.codV);
  If v.codv<>-1 Then
    Begin
      writeln('ingresar cod prod');
      readln(v.codP);
      writeln('ingresar ingresar cant unidades');
      readln(v.cantU);
      writeln('ingresar ingresar precio unitario');
      readln(v.precioU);
    End;
End;

Procedure agregar(Var a:arbol;p:producto);
Begin
  If a = Nil Then
    Begin
      new(a);
      a^.dato := p;
      a^.hi := Nil;
      a^.hD := Nil;
    End
  Else If p.cod<a^.dato.cod Then
         agregar(a^.HI,p)
  Else If p.cod>a^.dato.cod Then
         agregar(a^.HD,p)
  Else
    Begin
      a^.dato.cantTOT := a^.dato.cantTOT+p.cantTOT;
      a^.dato.montoTOT := a^.dato.montoTOT+p.montoTOT;
    End;


End;


Procedure creararbol(Var a:arbol);

Var 
  v: venta;
  p: producto;
Begin
  leer(v);
  While v.codV<>-1 Do
    Begin
      p.cantTOT := v.cantU;
      p.montoTOT := v.precioU*v.cantU;
      p.cod := v.codp;
      agregar(a,p);
      leer(v);
    End;

End;


Procedure imprimirArbol(a: arbol);
Begin
  If a <> Nil Then
    Begin
      imprimirArbol(a^.HI);
      // Recorre el subárbol izquierdo
      writeln('Codigo de Producto:', (a^.dato.cod));
      writeln('Cantidad Total Vendida:', (a^.dato.cantTot));
      WriteLn('monto total: ',(a^.dato.montoTOT): 2: 2);
      imprimirArbol(a^.HD);
      // Recorre el subárbol derecho
    End;
End;


Procedure incisoC(a:arbol;Var cmax,maxcod:integer);
Begin
  If a<>Nil Then
    Begin
      incisoC(A^.HI,cmax,maxcod);
      If cmax<a^.dato.cantTOT Then
        Begin
          cmax := a^.dato.cantTOT;
          maxcod := a^.dato.cod;
        End;
      incisoC(A^.HD,cmax,maxcod);
    End;
End;






Function incisoD(a: arbol; cod: integer): integer;
Begin
  If a <> Nil Then
    Begin
      If cod > a^.dato.cod  Then
        incisoD := incisoD(a^.HI, cod) + incisoD(a^.HD, cod) + 1
      Else
        incisoD := incisoD(a^.HI, cod) + incisoD(a^.HD, cod);
    End
  Else
    incisoD := 0;
End;



Function incisoE(a: arbol; cod1, cod2: integer): real;
Begin
  If a = Nil Then
    Begin
      incisoE := 0.0;
    End
  Else
    Begin
      incisoE := 0.0;
      If (a^.dato.cod > cod1) And (a^.dato.cod < cod2) Then
        incisoE := a^.dato.montoTOT;
      incisoE := incisoE + incisoE(  a^.HI, cod1, cod2);
      incisoE := incisoE + incisoE( a^.HD, cod1, cod2);
    End;
End;



Var 
  a: arbol;
  maxcod,cmax: integer;
  cod,cod2,aux: integer;

Begin
  //---------------------------------
  creararbol(a);
  //---------------------------------























{ imprimirArbol(a);
  //---------------------------------
  cmax := -1;
  incisoC(a,cmax,maxcod);

  WriteLn('el cod de prod con mayor cantidad de unidades vendidas es: ',maxcod);
  //---------------------------------
  WriteLn('ingresar codigo a buscar');
  readln(cod);
  writeln('la cantidad de codigos menores a ',cod ,
          ' que el que hay en la estructura son:',incisoD(a,cod));
  //---------------------------------}
  WriteLn('ingresar codigo 1');
  Readln(cod);
  WriteLn('ingresar codigo 2');
  Readln(cod2);
  If cod > cod2 Then
    Begin
      aux := cod2;
      cod2 := cod;
      cod := aux;
    End;
  writeln(incisoE(a,cod,cod2): 2: 2);

  //---------------------------------

End.
