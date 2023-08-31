
Program dos;

Const 
  dimf = 300;
  fin = -1;

Type 

  oficinas = Record
    codigo: integer;
    dni: integer;
    valor: real;
  End;

  Vof = array[1..dimf] Of oficinas;


Procedure leer(Var o:oficinas);
Begin
  ReadLn(o.codigo);
  If o.codigo<>fin Then
    Begin
      ReadLn(o.dni);
      ReadLn(o.valor);
    End;
End;

Procedure generarv(Var v:vof;Var diml:integer);

Var 
  o: oficinas;
Begin
  leer(o);
  diml := 0;
  While diml<=dimf And o.codigo<>fin Do
    Begin
      diml := diml+1;
      v[diml] := o;
      leer(o);
    End;
End;


Procedure insercion(Var v:vof; Var diml);

Var 
  i, j: integer;
  act: vof;
Begin
  For i:=2 To diml Do
    Begin
      j := i-1;
      act[i] := v[i];
      While j>0 And v[j]>act Do
        Begin
          v[j+1] := v[j];
          j := j-1;
        End;
      v[j+1] := act;
    End;
End;

Procedure seleccion(Var v:vof; Var diml);

Var 
  i,j,pos: integer;
  aux: vof;
Begin
  For i:=1 To diml-1 Do
    Begin
      pos := 1;
      For j:=i+1 To diml Do
        If v[j]<v[pos] Then
          pos := j;
      aux := v[pos];
      v[pos] := v[i];
      v[i] := aux;
    End;
End;






Var 
  v: Vof;
  diml;
  integer;
Begin
  generarv(v,diml);
  insercion(v,diml);
  seleccion(v,diml)

End.
