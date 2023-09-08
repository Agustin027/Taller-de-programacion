
Program tres;

Type 
  Tnota = 0..10;

  finales = Record
    cod: integer;
    nota: Tnota;
  End;
  lista = ^nodo;
  nodo = Record
    dato: finales;
    sig: lista;
  End;


  alumno = Record
    legajo: integer;
    dni: integer;
    anioI: integer;
    final3s: lista;
  End;


  arbol = ^nodoA;
  nodoA = Record
    dato : alumno;
    HI: arbol;
    HD: arbol;
  End;

  DincisoB = Record
    dni: integer;
    anio: integer;
  End;

  listaIB = ^nodoB;
  nodoB = Record
    dato: DincisoB;
    sig: listaIB;
  End;

  DincisoF = Record
    legajo: integer;
    prom: real;
  End;

  listaIF = ^nodoF;
  nodoF = Record
    dato: Dincisof;
    sig: listaIF;
  End;

Procedure leer(Var al:alumno);

Var 
  f: finales;
Begin
  writeln('ingresar legajo');
  readln(al.legajo);
  If al.legajo<>0Then
    Begin
      writeln('ingresar dni');
      readln(al.dni);
      writeln('ingresar anio de ingreso');
      readln(al.anioI);
      Repeat
        writeln('ingresar codigo de materia');
        readln(f.cod);
        If f.cod <> -1 Then
          Begin
            writeln('ingresar nota');
            readln(f.nota);
          End;
      Until (f.cod=-1);
    End;

End;

Procedure agregar(Var a:arbol;al:alumno);
Begin
  If a=Nil Then
    Begin
      new(a);
      a^.dato := al;
      a^.hi := Nil;
      a^.hd := Nil;
    End
  Else
    If al.legajo<a^.dato.legajo Then
      agregar(a^.hi,al)
  Else
    agregar(a^.hd,al);
End;




Procedure creararbol(Var a: arbol);

Var 
  al: alumno;
Begin
  leer(al);
  While al.legajo<>0 Do
    Begin
      agregar(a,al);
      leer(al);
    End;

End;
//--------------------------------------------------------
Procedure agregaradelante(Var l:listaIB ;D:DincisoB);

Var 
  nue: listaIB;
Begin
  new(nue);
  nue^.dato := D;
  nue^.sig := l;
  l := nue;
End;

Procedure incisoB(a:arbol;leg:integer;Var l:listaIB);

Var 
  D: DincisoB;
Begin
  If a<>Nil Then
    Begin
      If leg>a^.dato.legajo Then
        Begin
          D.dni := a^.dato.dni;
          D.anio := a^.dato.anioI;
          writeln('imprimo lo que se va a agregar ',d.dni);
          writeln('imprimo lo que se va a agregar ',d.anio);
          agregaradelante(l,d);
          incisoB(a^.Hd,leg,l);
        End
      Else
        incisoB(a^.Hi,leg,l);
    End;


End;
//--------------------------------------------------------
Function incisoC(a:arbol): Integer;
Begin
  If a<>Nil Then
    Begin
      If a^.HD<>Nil Then
        incisoC := incisoC(A^.hD)
      Else
        incisoC := a^.dato.legajo;
    End
  Else
    incisoC := 0;
End;
//--------------------------------------------------------

Function max(num1,num2:integer): integer;
Begin
  If num1>num2 Then
    max := num1
  Else
    max := num2;
End;


Function incisoD(a:arbol): integer;
Begin
  If a<>Nil Then
    Begin
      incisoD := max(A^.dato.dni,Max(incisoD(a^.HI),incisoD(a^.HD)));
    End
  Else
    incisoD := -1;
End;
//--------------------------------------------------------

Function IncisoE1(a:arbol): integer;
Begin
  If a<>Nil Then
    Begin
      If a^.dato.legajo Mod 2 <>0 Then
        IncisoE1 := IncisoE1(a^.Hi)+IncisoE1(a^.HD)+1
      Else
        IncisoE1 := IncisoE1(a^.Hi)+IncisoE1(a^.HD);
    End
  Else
    IncisoE1 := 0;
End;
//--------------------------------------------------------

Procedure calcularmaxprom(l:lista;legAct:integer; Var leg:integer; prom:real);

Var 
  totalnot: real;
  cantnot: integer;
  promact: real;
Begin
  cantnot := 0;
  totalnot := 0;
  While l<>Nil Do
    Begin
      totalnot := totalnot+l^.dato.nota;
      cantnot := cantnot+1;
    End;
  promact := totalnot/cantnot;
  If prom<promact Then
    Begin
      prom := promact;
      leg := legAct;
    End;
End;

Procedure incisoE2(a:arbol;Var leg:integer;Var prom:real);
Begin
  If a<>Nil Then
    Begin
      incisoE2(a^.HI,leg,prom);
      calcularmaxprom(A^.dato.final3s,A^.dato.legajo,leg,prom);
      incisoE2(a^.HD,leg,prom);
    End;

End;
//--------------------------------------------------------

Function calcularprom(l:lista): real;

Var 
  ntot: real;
  ctot: integer;
Begin
  ntot := 0;
  ctot := 0;
  While l<>Nil Do
    Begin
      ntot := l^.dato.nota+ntot;
      ctot := ctot+1;
    End;
  calcularprom := ntot/ctot;
End;

Procedure agregaradelante(Var l:listaIF;d:DincisoF);

Var 
  nue: listaIF;
Begin
  new(nue);
  nue^.dato := d;
  nue^.sig := L;
  l := nue;
End;


Procedure incisoF(a:arbol;int:integer;Var l:listaIF);

Var 
  prom: real;
  DF: DincisoF;
Begin
  If a<>Nil Then
    Begin
      incisoF(a^.hi,int,l);
      prom := calcularprom(a^.dato.final3s);
      If int>prom Then
        Begin
          df.prom := prom;
          df.legajo := a^.dato.legajo;
          agregaradelante(l,df);
        End;
      incisoF(a^.hD,int,l);
    End;
End;
//--------------------------------------------------------

Var 
  a: arbol;
  leg: integer;
  Lib: listaIB;
  prom: real;
  F: integeR;
  LF: listaIF;
Begin
  lib := Nil;
  creararbol(a);
  writeln('ingresar legajo sup');
  readln(leg);
  incisoB(a,leg,lib);


{prueba para ver si la lista que retorne esta bien
 * while lib <>nil do
  begin
  writeln(lib^.dato.anio);
    writeln(lib^.dato.dni);
    lib:=lib^.sig;
  end;}
  writeln('legajo mas grande: ',incisoC(a));
  writeln('dni mas grande: ',incisoD(a));
  writeln('la cant de alumnos con legajo impar es: ',incisoE1(a));
  IncisoE2(a,leg,prom);
  writeln ('el legajo y el promedio del alumno con mayor promedio son:');
  Writeln('legajo ',leg);
  Writeln('promedio ',prom:2:2);
  readln(F);
  LF := Nil;
  incisoF(a,f,LF)

End.
