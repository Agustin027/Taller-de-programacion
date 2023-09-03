
Program uno;

Type 

  vector = array[1..10] Of char;
  ListaC = ^nodoC;
  nodo = Record
    elem: char;
    sig: ListaC;
  End;


Procedure recursion(Var v:vector;Var diml:integer);

Var 
  c: char;
Begin
  readln(c);
  If diml<10 And(c<>'.') Then
    Begin
      v[diml] := c;
      diml := diml+1;
      recursion(v,diml);
    End;
End;

Procedure incisoB(v:vector; diml:integer);

Var 
  i: integer;
Begin
  For i:=1 To diml Do
    writeln(v[i]);



End;

Procedure incisoC(v:vector; diml:integer);

Var 
Begin
  If diml>0 Then
    Begin
      writeln(v[diml]);
      incisoC(v,diml-1);
    End;
End;

Function incisoD( Var cantC: integer): integer;

Var 
  C: char;
  i: integer;
Begin
  readln(C);
  If (C <> '.') Then
    Begin
      incisoD := cantC+incisoD(cantC+1);
      incisoD(C);

    End;
End;

Procedure agregaradelante (Var L:ListaC; C: char);

Var 
  nuevo: ListaC;
Begin
  new(nuevo);
  nuevo^.elem := C;
  nuevo^.sig := L;
  L := nuevo;
End;


Procedure incisoE (Var L: ListaC);

Var 
  C: char;
Begin
  readln(C);
  If (C <> '.') Then
    Begin
      agregaradelante(V, C);
      incisoE(L);
    End;

End;


Procedure incisoF(L: ListaC);
Begin
  If L <> Nil Then
    Begin
      writeln(L^.elem);
      incisoF(L^.sig);
    End;
End;


Procedure incisoG(L: ListaC);
Begin
  If L <> Nil Then
    Begin
      incisoG(L^.sig);
      writeln(L^.elem);
    End;

End;



Var 
  L: ListaC;
  v: vector;
  diml, cantC: integer;
Begin
  diml := 1;
  recursion(v,diml);
  incisoB(v,diml);
  incisoC(v,diml);
  writeln(incisoD(cantC));
  incisoE(L);
  incisoF(L)
End.


Procedure recursion(Var v:vector;Var diml:integer);

Var 
  c: char;
Begin
  readln(c);
  If diml<10 And(c<>'.') Then
    Begin
      v[diml] := c;
      diml := diml+1;
      recursion(v,diml);
    End;
End;


Var 
  v: vector;
  diml: integer;
Begin
  diml := 1;
  recursion(v,diml);
End.
