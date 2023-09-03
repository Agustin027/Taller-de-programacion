
Program cuatro;

Const 
  dimf = 20;

Type 
  rango = 1..100;
  vec = array[1..dimf] Of rango;


Procedure incisoA(Var v:vec;diml:integer);

Var 
  n: rango;
Begin
  n := random(101);
  If diml<=20 Then
    Begin
      v[diml] := n;
      incisoA(v,diml+1);
    End;

End;

Function incisoB(v:vec;diml:integer): integer;
Begin
  If diml<20 Then
    Begin
      incisoB(v,diml+1);
      If v[diml]>incisoB Then
        incisoB := v[diml];
    End
  Else
    incisoB := 101;


End;




Function incisoC(v:vec;diml:integer): integer;

Var 
  tot: integer;
Begin
  If diml<20 Then
    tot := incisoC(v,diml+1)+v[diml];
  incisoC := tot;
End;


Var 
  v: vec;
  diml: integeR;
  imprimir: integer;
Begin
  randomize;

  incisoA(v,diml);
  diml := 1;
  imprimir := incisoB(v,diml);
  WriteLn(imprimir);
  writeln(incisoC(v,diml));
End.
