
Program dos;

Type 
  meses = 1..12;
  dias = 1..31;


  prestamoE1 = Record
    isbn: integer;
    nroS: integer;
    dia: dias;
    mes: meses;
    cantDias: integer;
  End;

  lista = ^nodoL;
  nodoL = Record
    dato: prestamoE1;
    sig: lista;
  End;

  prestamoE2 = Record
    isbn: integer;
    Prestamos: lista;
  End;

  arbol2 = ^nodo2;
  nodo2 = Record
    dato: prestamoE2;
    HI: arbol2;
    HD: arbol2;
  End;

  arbol1 = ^nodo1;
  nodo1 = Record
    dato: prestamoE1;
    HI: arbol1;
    HD: arbol1;
  End;


  datoF = Record
    isbn: integer;
    total: integer;
  End;
  arbolF = ^nodoF;
  nodoF = Record
    dato: datoF;
    hi: arbolF;
    hd: Arbolf;
  End;
Procedure leer(Var p:prestamoE1);
Begin










{ writeln('ingresar isbn');
  readln(p.isbn);
  If p.isbn<>-1 Then
    Begin
      writeln('ingresar nro socio');
      readln(p.nroS);
      writeln('ingresar dia');
      readln(p.dia);
      writeln('ingresar mes');
      readln(p.mes);
      writeln('ingresar cant dias prestados');
      readln(p.cantDias);
    End;}

  //p.isbn := random(10)-1;









{ mb
  p.mes := random(12)+1;
  p.dia := random(31)+1;
  p.cantDias := random(31)+1;}
  writeln('ingresar isbn');
  readln(p.isbn);
End;

Procedure agregarA1(Var a:arbol1; p:prestamoE1);
Begin
  If a=Nil Then
    Begin
      new(a);
      a^.dato := p;
      a^.hi := Nil;
      a^.hd := Nil;
    End
  Else If p.isbn < a^.dato.isbn Then
         agregarA1(a^.hi,p)
  Else
    agregarA1(a^.hd,p);

End;


Procedure agregarlista(Var l:lista;p:prestamoE1);

Var 
  nue: lista;
Begin
  new(nue);
  nue^.dato := p;
  nue^.sig := l;
  l := nue;
End;
Procedure agregarA2(Var a:arbol2;p:prestamoE1);
Begin
  If a=Nil Then
    Begin
      new(a);
      a^.dato.isbn := p.isbn;
      a^.dato.Prestamos := Nil;
      a^.hi := Nil;
      a^.hd := Nil;
      agregarlista(a^.dato.prestamos,p)
    End
  Else If p.isbn<a^.dato.isbn Then
         agregarA2(a^.hi,p)
  Else If p.isbn>a^.dato.isbn Then
         agregarA2(a^.HD,p)
  Else
    agregarlista(a^.dato.prestamos,p);
End;

Procedure IncisoA(Var a1:arbol1;Var a2:arbol2);

Var 
  p: prestamoE1;
  i: integer;
Begin
  leer(p);
  While p.isbn<>-1 Do
    // For i:=1 To 50 Do
    Begin
      agregarA1(A1,p);
      agregarA2(A2,p);
      leer(p);
    End;

End;


Function incisoB(a:arbol1): integer;
Begin
  If a= Nil Then
    incisoB := 0
  Else
    Begin
      If a^.hd <> Nil Then
        incisoB := incisoB(a^.hd)
      Else
        incisoB := a^.dato.isbn

    End;
End;

Function incisoC(a:arbol2): integer;
Begin
  If a<> Nil Then
    Begin
      If a^.hi <> Nil Then
        incisoC := incisoC(a^.HI)
      Else
        incisoC := A^.dato.isbn;

    End
  Else
    incisoC := 0;

End;




Function incisoD(a:arbol1;n:integer): integer;
Begin
  If a<>Nil Then
    Begin
      If a^.dato.nroS=n Then
        incisoD := incisoD(a^.hi,n)+incisoD(a^.hd,n)+1
      Else
        incisoD := incisoD(a^.hi,n)+incisoD(a^.hd,n);
    End
  Else
    incisoD := 0;

End;

Function recorrerlista(l:lista;n:integer): integer;

Var 
  cant: integer;
Begin
  cant := 0;
  //WriteLn('aaaaaaaaaaaaaaaaaaa',cant);
  While l<>Nil Do
    Begin
      If l^.dato.nroS=n Then
        cant := cant+1;
      // WriteLn('aaaaaaaaaaaaaaaaaaa',cant);
      l := l^.sig;
    End;
  recorrerlista := cant;
End;



Function incisoE(a: arbol2;n: integer): integer;
Begin
  If a <> Nil Then
    Begin
      //WriteLn('aaaaaaaaaaaaaaaaaaa',n);
      incisoE := incisoE(a^.hi, n) + incisoE(a^.hd, n) + recorrerlista(a^.
                 dato.
                 Prestamos, n);
    End
  Else
    incisoE := 0;
End;

Procedure agregarAF(isbn:integer;Var af:arbolF);
Begin
  If af=Nil Then
    Begin
      new(af);
      af^.dato.isbn := isbn;
      af^.dato.total := 1;
      af^.hi := Nil;
      af^.hd := Nil;
    End
  Else If isbn < af^.dato.isbn Then
         agregarAF(isbn,af^.hi)
  Else If isbn > af^.dato.isbn Then
         agregarAF(isbn,af^.hD)
  Else
    af^.dato.total := af^.dato.total+1;
End;


Procedure incisoF(a:arbol1; Var af:arbolF);
Begin
  If a<>Nil Then
    Begin
      incisoF(A^.hi,af);
      agregarAF(a^.dato.isbn,af);
      incisoF(A^.hd,af);
    End;
End;
Function contarP(l:lista): integer;

Var 
  cont: integer;
  aux: lista;
Begin
  cont := 0;
  While l<>Nil Do
    Begin
      cont := cont+1;
      l := l^.sig;
    End;
  contarP := cont;
End;

Procedure agregarAG(cant:integer;isbn:integer;Var ag:arbolF);
Begin
  If ag=Nil Then
    Begin
      New(ag);
      ag^.dato.isbn := isbn;
      ag^.dato.total := cant;
      ag^.hi := Nil;
      ag^.hD := Nil;
    End
  Else If isbn < ag^.dato.isbn Then
         agregarAG(cant,isbn,ag^.hi)
  Else
    agregarAG(cant,isbn,ag^.hD);
End;

Procedure incisoG (a:arbol2;Var ag:arbolF);
Begin
  If a<>Nil Then
    Begin
      incisog(A^.hi,ag);
      agregarAG(contarP(a^.dato.Prestamos),a^.dato.isbn,ag);
      incisoG(A^.hd,ag);

    End;
End;

Procedure imprimirarbol(a:arbolF);
Begin
  If a<>Nil Then
    Begin
      imprimirarbol(a^.hi);
      WriteLn(a^.dato.isbn);
      WriteLn(a^.dato.total);
      imprimirarbol(a^.hD);
    End;
End;

Procedure imprimirIH(af,ag:arbolF);
Begin
  imprimirarbol(af);
  imprimirarbol(ag);
End;


Function incisoI(a:arbol1;inf,sup:integer): Integer;
Begin
  If a<>Nil Then
    Begin
      If a^.dato.isbn >= inf Then
        Begin
          If a^.dato.isbn <= sup Then
            incisoI := incisoI(a^.HI,inf,sup)+incisoI(a^.HD,inf,sup)+1
          Else
            incisoI := incisoI(a^.HI,inf,sup)
        End
      Else
        incisoI := incisoI(a^.HD,inf,sup)
    End
  Else
    incisoI := 0;
End;


Function incisoj(a:arbol2;inf,sup:integer): integer;
Begin
  If a<>Nil Then
    Begin
      If a^.dato.isbn >= inf Then
        Begin
          If a^.dato.isbn<=sup Then
            incisoj := incisoj(a^.HI,inf,sup)+incisoj(a^.HI,inf,sup)+contarP(a^.
                       dato.Prestamos)
          Else
            incisoj(a^.HI,inf,sup);
        End
      Else
        incisoj := incisoj(a^.Hi,inf,sup);
    End
  Else
    incisoJ := 0;
End;

Var 
  a1: arbol1;
  a2: arbol2;
  num: integer;
  e: integer;
  af,ag: arbolF;
  isbn1,isbn2,aux: integer;
Begin
  randomize;
  incisoA(a1,a2);
  //imprimir(a1);
  WriteLn('--------------------------------------------');
  //imprimir2(a2);

{ WriteLn('--------------------------------------------');
  WriteLn(IncisoB(a1));
  WriteLn( incisoC(a2));
  WriteLn('--------------------------------------------');
  WriteLn('ingresar nro socio a buscar');
  readln(num);
  writeln(incisoD(a1,num));

  WriteLn('ingresar nro socio a buscar');
  readln(num);
  e := incisoE(a2,num);
  writeln(e);
  writeln('--------------------------------------------');
  incisoF(a1,af);
  incisoG(a2,ag);
  imprimirH(af,ag);
  writeln('--------------------------------------------');}
  WriteLn('ingresar isbn 1');
  ReadLn(isbn1);
  WriteLn('ingresar isbn 2');
  ReadLn(isbn2);
  If isbn2<isbn1 Then
    Begin
      aux := isbn1;
      isbn1 := isbn2;
      isbn2 := aux;
    End;
  WriteLn(incisoI(a1,isbn1,isbn2));
  writeln('--------------------------------------------');
  WriteLn('ingresar isbn 1');
  ReadLn(isbn1);
  WriteLn('ingresar isbn 2');
  ReadLn(isbn2);
  If isbn2<isbn1 Then
    Begin
      aux := isbn1;
      isbn1 := isbn2;
      isbn2 := aux;
    End;
  WriteLn(incisoj(a2,isbn1,isbn2));
End.
