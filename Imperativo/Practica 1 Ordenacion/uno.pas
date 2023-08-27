
Program uno;

Const 
  dimF = 50;

Type 

  arr = array[1..dimF] Of ventas;


  codigopr = 1..15;
  maxVentas = 0..99;

  ventas = Record
    dia: integer;
    codigop: codigopr;
    cantV: maxVentas;
  End;



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
Begin

  For i:= 1 To diml Do
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
  i, correr, aux: integer;
Begin
  If num1>num2 Then
    Begin
      correr := num1-num2;
      aux := num1;
    End
  Else
    Begin
      correr := num2-num1+1;
      aux := num2;
    End;



End;


Var 
  v: arr;
  diml, num1, num2: integer;
Begin

  cargarV(v,diml);
  imprimir(v,diml);
  ordenarInsertado(v,diml);
  imprimir(v,diml);

  readln(num1);
  readln(num2);
  Eliminar(v, diml, num1, num2);
  imprimir(v,diml);

End.
