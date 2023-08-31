
Program uno;

Const 
  fin = 11111;
  dimf = 36;

Type 
  Tnota = 4..10;
  vecMat = array[1..dimf] Of Tnota;

  alumno = Record
    apellido: string;
    nro: integer;
    anio: integer;
    notas: VecMat;
    diml: integer;
  End;

  lista = ^nodo;
  nodo = Record
    dato: alumno;
    sig: lista;
  End;

//procedures----------------------------------------------------------------------//

Procedure leerVec(Var vec:VecMat; diml:integer);

Var 
  i: integer;
  nota: Tnota;
Begin
  For i:=1 To diml Do
    Begin;
      WriteLn('Ingrese la nota');
      readln(nota);
      If nota > 3 Then
        vec[i] := nota;
    End;
End;

Procedure leer (Var a:alumno);
Begin
  WriteLn('Ingrese el apellido del alumno');
  readln(a.apellido);
  WriteLn('Ingrese el numero del alumno');
  readln(a.nro);
  WriteLn('Ingrese el anio de ingreso del alumno');
  readln(a.anio);
  WriteLn('ingrese cant de materias aprobadas');
  readln(a.diml);
  leerVec (a.notas,a.diml);
End;


Procedure agregaradelante(Var l:lista; a:alumno);

Var 
  nue: lista;
Begin
  new(nue);
  nue^.dato := a;
  nue^.sig := l;
  l := nue;
End;


Procedure crearlista (Var l:lista);

Var 
  a: alumno;
Begin
  Repeat
    leer(a);
    agregaradelante(l,a);

  Until (a.nro=fin);
End;


Function promedio (vnotas:vecMat; diml:integer): real;

Var 
  total: real;
  i: integer;
Begin
  total := 0;
  For i:=1 To diml Do
    total := total+vnotas[i];
  promedio := total/diml;
End;

Procedure procesarlista(l:lista);
Begin
  While (l<>Nil) Do
    Begin
      WriteLn(l^.dato.nro);
      WriteLn(promedio(l^.dato.notas,l^.dato.diml): 2: 2);
      l := l^.sig;
    End;
End;


//programa principal//----------------------------------------

Var 
  l: lista;
  notas: vecMAt;
  a: alumno;


Begin
  l := Nil;
  //poner dentro de cada alumno
  crearLista(l);
  procesarlista(l);

End.
