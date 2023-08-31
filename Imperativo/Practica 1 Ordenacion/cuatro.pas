
Program cuatro;

Type 
  codR = 1..8;

  productos = Record
    codP: integer;
    codR: codR;
    precio: real;
  End;
  lista = ^nodo;
  nodo = Record
    dato: productos;
    sig: lista;
  End;


  vec = array[codr] Of lista;
  vec30 = array[1..30] Of productos;

Procedure leer(Var p:productos);
Begin
  ReadLn(p.precio);
  If (p.precio)<>0Then
    Begin
      ReadLn(p.codR);
      ReadLn(p.codR);

    End;


End;

Procedure insertarordenado(Var l:lista; p:productos);

Var 
  nue: lista;
  act, ant: lista; {punteros auxiliares para recorrido}
Begin
  new (nue);
  nue^.dato := p;
  act := L; {ubico act y ant al inicio de la lista}
  ant := L;
  While ( act <> Nil)And(p.codP > act^.dato.codP) Do
    Begin
      ant := act;
      act := act^.sig;
    End;
  If (act = ant) Then {al inicio o lista vacía}
    L := nue
  Else {al medio o al final}
    ant^.sig := nue;
  nue^.sig := act;
End;



Procedure crearvlista(Var v:vec);

Var 
  i: integer;
  p: productos;
Begin
  For i:=1 To 8 Do
    v[i] := Nil;
  leer(p);
  While p.precio<>0 Do
    Begin
      insertarordenado(v[i],p);
      leer(p);
    End;

End;

Procedure mostrar(v:vec);

Var 
  i: integer;
Begin
  For i:=1 To 8 Do
    While v[i]<>Nil Do
      Begin
        WriteLn(v[i].dato.codP);
        v[i] := v[i]^.sig;
      End;
End;

Procedure crearvec(Var v30:vec30;Var diml:integer; v:vec);
Begin

  While v[3]<>Nil And diml<=30  Do
    Begin
      diml := diml+1;
      v30[diml] := v[3]^.dato;
      v[3] := v[3]^.sig;
    End;
End;

Procedure ordenar(Var v:vec30; diml:integer);

Var 
  i,j: integer;
  act: real;
Begin
  For i:=2 To diml Do
    Begin
      j := i-1;
      act := v[i].precio;
      While j>0 And v[j].precio>act Do
        Begin
          v[j+1].precio := v[j].precio;
          j := j-1;
        End;
      v[j+1].precio := act;
    End;

End;

Procedure mostrarV30(v30:vec30;diml:integer);

Var 
  i: integer;
  total: real;
Begin
  total := 0;
  For i:=1 To diml Do
    Begin
      WriteLn(v30[i].precio);
      total := total+v30[i].precio;
    End;
  writeln(total/dimf);
End;


Var 
  v: vec;
  v30: vec30;
  diml: integer;
Begin
  crearvlista(v);
  mostrar(v);
  crearvec(v30,diml,v);
  ordenar(v30,diml);


  //aca tambien calculo promedio
  mostrarV30(v30,diml);
End.
