
Program tres;

Type 
  Naprob = 4..10;
  nota = -1..10;
  Mataprob = array[1..30] Of Naprob;
  //-----------------Estructura 1------------------------------

  Alumno = Record
    cod: integer;
    Notas: Mataprob;
  End;

  final = Record
    codalu: integer;
    codmate: integer;
    nota: nota;
  End;

  arbol = ^nodo;
  nodo = Record
    dato: Alumno;
    hi: arbol;
    hd: arbol;
  End;
  //-----------------------------------------------
  //-----------------Estructura 2------------------------------

  datoL = Record
    codA: integer;
    nota: real;
  End;


  lista = ^nodol;
  nodol = Record
    dato: Datol;
    sig: lista;
  End;

  Estruc2 = array[1..30] Of lista;
  //-----------------------------------------------

  datoB = Record
    codA: integer;
    prom: real;
  End;

  listaB = ^nodoB;
  nodoB = Record
    dato: datoB;
    sig: listaB;
  End;


  //-----------------------------------------------

Procedure leer(Var f:final);
Begin
  writeln('ingresar nota');
  readln(f.nota);
  If f.nota<>-1 Then
    Begin
      writeln('ingresar codigo de alumno');
      readln(f.codalu);
      writeln('ingresar codigo de materia');
      readln(f.codmate);
    End;
End;
Procedure agregarA(Var a:arbol;f:final);
Begin
  If a=Nil Then
    Begin
      New(a);
      a^.dato.cod := f.codalu;
      If f.nota>=4 Then
        a^.dato.Notas[f.codmate] := f.nota;
      a^.hi := Nil;
      a^.hd := Nil;
    End
  Else If f.codalu < a^.dato.cod Then
         agregarA(a^.hi,f)

  Else If f.codalu > a^.dato.cod Then
         agregarA(a^.hD,f)
  Else If f.nota>=4 Then
         a^.dato.Notas[f.codmate] := f.nota;

End;

Procedure agregarlista(Var l:lista;codA,nota:integer);

Var 
  nue: lista;
  dato: datoL;
Begin
  dato.codA := codA;
  dato.nota := nota;
  New(nue);
  nue^.dato := dato;
  nue^.sig := l;
  l := nue;
End;

Procedure agregarV(Var v:Estruc2;f:final);
Begin
  agregarLista(V[f.codmate],f.codalu,f.nota);
End;


Procedure incializarV(Var v:Estruc2);

Var 
  i: integer;
Begin
  For i:=1 To 30 Do
    v[i] := Nil;
End;
Procedure crearEstructuras(Var a:arbol;Var v:Estruc2);

Var 
  f: final;
Begin
  leer(f);
  incializarV(v);
  While f.nota<>-1 Do
    Begin
      agregarA(a,f);
      agregarV(v,f);
      leer(f);
    End;
End;

Procedure agregarlb(Var l:listaB;cod:integer;prom:real);

Var 
  nue: listaB;
Begin
  new(nue);
  nue^.dato.codA := cod;
  nue^.dato.prom := prom;
  nue^.sig := l;
  l := nue;
End;

Function prom(v:Mataprob): real;

Var 
  i,cant,total: integer;
Begin
  total := 0;
  cant := 0;
  For i:=1 To 30 Do
    Begin
      If v[i] > 0 Then
        Begin
          cant := cant+1;
          total := v[i];
        End;
    End;
  prom := total/cant;
End;

Procedure incisoB(a:arbol;cod:integer;Var l:listaB);
Begin
  If a<>Nil Then
    Begin
      If a^.dato.cod>cod Then
        Begin
          incisoB(a^.hi,cod,l);
          agregarLB(l,a^.dato.cod,prom(A^.dato.Notas));
          incisoB(a^.hd,cod,l);
        End
      Else
        incisoB(a^.hd,cod,l);
    End;
End;

Function aprobados(V:Mataprob): Integer;

Var 
  cant,  i: integer;
Begin
  cant := 0;
  For i:=1 To 30 Do
    If v[i]>4 Then
      cant := cant+1;
  aprobados := cant;
End;

Procedure incisoc(a:arbol;inf,sup,valor:integer;CantR:integer);
Begin
  If a^.dato.cod >=  inf Then
    Begin
      If a^.dato.cod <=  sup Then
        Begin
          incisoc(a^.hi,inf,sup,valor,cantr);
          If aprobados(a^.dato.Notas)=valor Then
            CantR := CantR+1;
          incisoc(a^.hd,inf,sup,valor,cantr);
        End
      Else
        incisoc(a^.hi,inf,sup,valor,cantr);
    End
  Else
    incisoc(a^.hD,inf,sup,valor,cantr);
End;

Var 
  a: arbol;
  v: Estruc2;
  l: listaB;
  cod1,cod2,valor,cantR: integeR;
Begin
  l := Nil;
  CantR := 0;
  crearEstructuras(a,v);
  Writeln('ingresar cod');
  readln(cod1);
  incisoB(a,cod1,l);
  WriteLn('-------------------------------');
  Writeln('ingresar cod');
  readln(cod1);
  Writeln('ingresar cod');
  readln(cod2);
  Writeln('ingresar valor');
  readln(valor);
  incisoC(a,cod1,cod2,valor,cantR);
  WriteLn(cantR);
End.
