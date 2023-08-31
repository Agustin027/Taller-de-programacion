
Program tres;

Type 
  codg = 1..8;
  peliculas = Record
    cod: codg;
    Pprom: real;
  End;

  lista = ^nodo;
  nodo = Record
    dato: pelicula;
    sig: lista;
  End;

  vec = array[codg] Of lista;
  vecCod = array[codg] Of integer;


Procedure agregaradelante(Var l:lista;p:peliculas);

Var 
  nue: lista;
Begin
  new(nue);
  nue^.dato := p;
  nue^.sig := l;
  l := nue;
End;

Procedure leer(Var p:peliculas);
Begin
  readln(p.cod);
  If p.cod<>-1 Then
    Begin
      ReadLn(p.Pprom);
    End;
End;
Procedure crearlista(Var v:vec);

Var 
  i: integer;
  p: peliculas;
Begin
  For i:=1 To 8 Do
    v[i] := Nil;
  leer(p);
  While p.codg<>-1 Do
    Begin
      agregaradelante(v[p.cod],p);
      leer(p);
    End;
End;

Procedure incisoB(Var vc:vecCod;v:vec);

Var 
  i: integer;
  min: integer;
Begin

  For i:=1 To 8 Do
    Begin
      max := -999;
      While v[i]<>Nil Do
        Begin
          If V[i]^.dato.Pprom >max Then
            Begin
              max := V[i]^.dato.Pprom;
              vc[i] := V[i]^.dato.cod;
            End;
          v[i] := v[i]^.sig;
        End;
    End;
End;

Procedure ordenar(Var vc:vecCod);

Var 
  i, j: integer;
  act: integer;

Begin
  For i:=2 To diml Do
    Begin
      j := i-1;
      act[i] := vc[i];
      While j>0 And vc[j]>act Do
        Begin
          vc[j+1] := vc[j];
          j := j-1;
        End;
      vc[j+1] := act;

    End;
End;




Procedure mostrar(vc:vecCod);

Var 
  i,max,min: integer;
Begin
  max := -999;
  min := 999;
  For i:=1 To 8 Do
    Begin
      If v[i]>max Then
        max := v[i];
      If v[i]<min Then
        min := v[i];
    End;
  WriteLn('max: ',max,' min: ',min);
End;

Var 
  v: vec;
  vC: vecCod;
Begin
  crearlista(v);
  incisoB(vc,v);
  ordenar(vc);
  mostrar(vc);
End.
