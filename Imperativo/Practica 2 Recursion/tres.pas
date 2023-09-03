
Program tres;

Type 



  lista = ^nodo;
  nodo = Record
    sig: lista;
    dato: integer;
  End;

Procedure agregaradelante(Var l:lista;n:integer);

Var 
  nue: lista;

Begin
  new(nue);
  nue^.dato := n;
  nue^.sig := l;
  l := nue;
End;

Procedure incisoA(Var l:lista;Var cant:integer);

Var 
  n: integer;
Begin
  n := random(101);
  If (n<>0) And (cant<50) Then
    Begin
      cant := cant+1;
      agregaradelante(l,n);
      incisoA(l,cant);
    End;
End;


Function  incisoB (L: Lista): integer;
Begin
  If (L <> Nil) Then
    Begin
      incisoB :=   incisoB(L^.sig);
      If (  incisoB > L^.dato) Then
        incisoB := L^.dato;
    End
  Else
    incisoB := 101;
End;


Function incisoC (L: Lista): integer;
Begin
  If (L <> Nil) Then
    Begin
      incisoC := incisoC(L^.sig);
      If (incisoC < L^.dato) Then
        incisoC := L^.dato;
    End
  Else
    incisoC := -1;
End;




Function incisoD(l:lista;n:integer): Boolean;
Begin
  If l<>Nil Then
    Begin
      incisoD := incisoD(l^.sig,n);
      If (l^.dato=n) Then
        incisoD := true;
    End
  Else
    incisoD := false;
End;




Var 
  l: lista;
  c,valor: integer;
  imprimir: integer;
Begin
  randomize;
  L := Nil;
  c := 0;
  incisoA(L,c);
  //-----------------------------------------
  imprimir := incisoB(l);
  WriteLn(imprimir);
  //-----------------------------------------

  imprimir := incisoC(l);
  WriteLn(imprimir);
  //-----------------------------------------

  readln(valor);
  writeln(incisoD(L,valor));
End.
