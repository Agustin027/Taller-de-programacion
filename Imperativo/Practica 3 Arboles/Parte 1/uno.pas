
Program uno;

Type 
  socio = Record
    nro: integer;
    nombre: string;
    edad: integer;
  End;

  arbol = ^nodo;
  nodo = Record
    dato: socio;
    HI: arbol;
    HD: arbol;
  End;

Procedure agregar(Var a:arbol;s:socio);
Begin
  If (a=Nil) Then
    Begin
      new(a);
      a^.dato := s;
      a^.HI := Nil;
      a^.HD := Nil;
    End
  Else
    If (s.nro<=a^.dato.nro) Then
      agregar(a^.HI,s)
  Else
    agregar(a^.HD,s);


End;

Procedure leer(Var s:socio);
Begin
  WriteLn('ingresar numero');
  ReadLn(s.nro);
  {If s.nro<>0 Then
    Begin
      WriteLn('ingresar nombre');
      ReadLn(s.nombre);
      WriteLn('ingresar edad');
      ReadLn(s.edad);
    End;}

End;



Procedure CrearArbol(Var a:arbol);

Var 
  s: socio;
Begin
  leer(s);
  While s.nro<>0 Do
    Begin
      agregar(a,s);
      leer(s);
    End;
End;



Function inciso1(a:arbol): integer;
Begin
  If a^.HD<>Nil Then
    inciso1 := inciso1(a^.HD)
  Else
    inciso1 := a^.dato.nro;
End;

Procedure inciso2(a:arbol; Var s:socio);
Begin
  If a^.Hi<>Nil Then
    inciso2(a^.HI,s)
  Else
    s := a^.dato;
End;

Procedure imprimir(s:socio);
Begin
  WriteLn(s.nro);
  WriteLn(s.nombre);
  WriteLn(s.edad);
End;

Procedure mayor(Var aux:socio;s:socio);
Begin
  If aux.edad<s.edad Then
    aux := s;
End;

Procedure inciso3(a:arbol;Var aux:socio);
Begin
  If a<>Nil Then
    Begin
      inciso3(a^.HI,aux);
      mayor(aux,a^.dato);
      inciso3(a^.HD,aux);
    End;
End;


Procedure inciso4 (a:arbol);
Begin
  If a<>Nil Then
    Begin
      inciso4(a^.HI);
      a^.dato.edad := a^.dato.edad +1;
      inciso4(a^.HD);
    End;
End;

Function inciso5(a:arbol;num:integer): Boolean;
Begin
  If (a<>Nil) Then
    Begin
      If (num = a^.dato.nro) Then
        inciso5 := true
      Else
        Begin
          inciso5 := inciso5(a^.HI,num);
          inciso5 := inciso5(a^.HD,num);
        End;
    End
  Else
    inciso5 := false;
End;

Function inciso6(a:arbol;name:String): boolean;
Begin
  If (a=Nil) Then
    inciso6 := False
  Else
    Begin
      If a^.dato.nombre=name Then
        inciso6 := true
      Else
        Begin
          inciso6 := inciso6(a^.HI,name);
          inciso6 := inciso6(a^.HD,name);
        End;
    End;
End;

Function inciso7(a:arbol): integer;
Begin
  If a=Nil Then
    inciso7 := 0
  Else
    Begin
      inciso7 := inciso7(a^.HI) + inciso7(a^.HD) +1;
    End;
End;


Function inciso8(a:arbol): integer;
Begin
  If a= Nil Then
    inciso8 := 0
  Else
    Begin
      inciso8 := inciso8(a^.HI) + inciso8(a^.HD)  +a^.dato.edad;
    End;

End;

Procedure ordencreciente(a:arbol);
Begin
  If a<>Nil Then
    Begin
      ordencreciente(a^.HI);
      WriteLn(a^.dato.nro);
      ordencreciente(a^.HD);
    End;
End;


Procedure ordendecreciente(a:arbol);
Begin
  If a<>Nil Then
    Begin
      ordendecreciente(a^.HD);
    if ((a^.dato.nro mod 2) = 0) then
     WriteLn(a^.dato.nro);
      ordendecreciente(a^.HI);
    End;
End;

Var 
  a: arbol;
  s,aux: socio;
  num: integer;
  name: string;
Begin
  //----------------------------------------------------

  CrearArbol(a);
  //----------------------------------------------------
  WriteLn('maximo: ',inciso1(a));
  //----------------------------------------------------
  inciso2(a,s);
  imprimir(s);
  //----------------------------------------------------
  inciso3(a,aux);
  WriteLn(aux.nro);
  //----------------------------------------------------
  inciso4(a);
  //----------------------------------------------------
  readln(num);
  Writeln('Existe socio con ese valor: ',inciso5(a,num));
  //----------------------------------------------------
  readln(name);
  Writeln('Existe socio con ese nombre: ',inciso6(a,name));
  //----------------------------------------------------
  writeln(inciso7(a));
  //----------------------------------------------------
  WriteLn('promedio de edad: ',(inciso8(a)/inciso7(a)): 2: 2);
  //----------------------------------------------------
    ordencreciente(a);
     WriteLn('-------------------------------');
  //----------------------------------------------------
  ordendecreciente(a);
    WriteLn('-------------------------------');

End.
