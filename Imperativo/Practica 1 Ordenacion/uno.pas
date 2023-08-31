
Program uno;

Const 
  dimF = 50;

Type 

  codigopr = 1..15;
  maxVentas = 0..99;

  ventas = Record
    dia: integer;
    codigop: codigopr;
    cantV: maxVentas;
  End;
  arr = array[1..dimF] Of ventas;



  incisoG = Record
    codigo: integer;
    cant: integer;
  End;
  arrG = array[1..50] Of incisoG;

Procedure leer(Var v:ventas);
Begin
  readln(v.dia);
  If v.dia<>0 Then
    Begin
      v.codigop := random(15)+1;;
      readln(v.cantV);
    End;
End;


Procedure cargarV (Var v:arr; Var diml:integer);

Var 
  venta: ventas;
  i : integer;
Begin
  diml := 0;
  leer(venta);
  While (i<dimF) And (venta.dia<>0) Do
    Begin
      diml := diml+1;
      v[i] := venta;
      leer(venta);
      i := i+1;
    End;

End;

Procedure imprimir (v: arr; diml: integer);

Var 
  i: integer;
Begin

  For i:=1 To diml Do
    Begin
      writeln(V.dia);
      writeln(V.codigop);
      writeln(V.cantV);
    End;

End;


Procedure ordernarInsertado(Var v: arr; diml:integer);

Var 
  i,j: integer;
  actual: codigopr;
Begin
  For i:= 2 To diml Do
    Begin
      actual := v[i].codigop;
      j := i-1;
      While (j > 0) And (v[j].codigop > actual) Do
        Begin
          v[j+1] := v[j];
          j := j-1;
        End;
      v[j+1].codigop := actual;
    End;
End;

Procedure Eliminar (Var v:arr; Var diml: integer; num1, num2:integer);

Var 
  i,max,min,borrar: integer;
Begin
  If num1>num2 Then
    Begin
      max := num1;
      min := num2;
    End
  Else
    Begin
      max := num2;
      min := num1;
    End;


  For i:=1 To diml-1 Do
    Begin
      If (v[i]>=min) And (v[i]<=max)Then
        borrar := borrar+1
      Else
        v[i-borrar] = v[i];
    End;
  diml := diml-borrar;
End;


Procedure incisoG (Var vg:arrG;Var dimlG:integer; v:arr; diml:integer);
//aca no ordeno nada por que ya lo ordene en el inciso C

Var 
  i: integer;
  j: integeR;
Begin
  j := 1;
  For i:= 1 To diml Do
    Begin
      If (v[i].codigop Mod 2=0) Then
        Begin
          vg[j].codigo := v[i].codigop;
          vg[j].cant := v[i].cantV;
          j := j+1;
        End;
    End;
  dimlG := j;
End;

Procedure incisoH(vg:arrG;diml:integer);

Var 
  i: integer;
Begin
  For i:=1 To diml Do
    Begin
      WriteLn(vg.codigo);
      WriteLn(vg.cant);
    End;

End;

Var 
  v: arr;
  diml, num1, num2: integer;
  vg: arrG;
  dimlg: integer;
Begin

  cargarV(v,diml);
  imprimir(v,diml);
  ordenarInsertado(v,diml);
  imprimir(v,diml);

  readln(num1);
  readln(num2);
  Eliminar(v, diml, num1, num2);
  imprimir(v,diml);
  incisoG(vg, dimlg, v, diml);
  incisoH(vg,dimlg);
End.
