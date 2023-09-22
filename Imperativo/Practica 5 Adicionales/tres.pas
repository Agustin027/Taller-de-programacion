
Program tres ;

Type 
  Trubro = 1..10;

  producto = Record
    codP: integer;
    rubro: Trubro;
    stock: integer;
    precioU: real;
  End;

  arbol = ^nodo;
  nodo = Record
    Hi: arbol;
    hd: arbol;
    dato: producto;
  End;

  DincisoC = Record
    codigo: integer;
    stock: integer;
  End;

  vector = array[1..10] Of arbol;
  vectorC = array [1..10] Of DincisoC;
  vcont = array[1..10] Of integer;
  //---------------------------------------------------------------
Procedure leer(Var p:producto);
Begin
  writeln('ingreasr codigo prod');
  readln(p.codp);
  If p.codp<>-1 Then
    Begin
      writeln('ingreasr rubro');
      readln(p.rubro);
      writeln('ingreasr stock');
      readln(p.stock);
      writeln('ingreasr precio U');
      readln(p.precioU);
    End;
End;


Procedure agregar(Var A:arbol; p:producto);
Begin
  If A=Nil Then
    Begin
      new(a);
      A^.dato := p;
      A^.hi := Nil;
      A^.hD := Nil;
    End
  Else If p.codp<A^.dato.codp Then
         agregar(a^.hi,p)
  Else If p.codp>A^.dato.codp Then
         agregar(a^.hD,p);

End;

Procedure incisoA(Var v:vector);

Var 
  p: producto;
Begin
  leer(p);
  While p.codP<>-1 Do
    Begin
      agregar(v[p.rubro],p);
      leer(p);
    End;
End;
//--------------------------------------
Function incisoB (a: arbol; c:integer): boolean;
Begin
  If (a = Nil) Then
    incisoB := false
  Else If (a^.dato.codP = c) Then
         incisoB := true
  Else If (c < a^.dato.codP) Then
         incisoB := incisoB(a^.HI, c)
  Else
    incisoB := incisoB(a^.HD, c);
End;
//---------------------------------------------------------------


Procedure recorrerA(A:arbol;Var d:DincisoC);
Begin
  If a^.hD <> Nil Then
    recorrera(a^.hd,d)
  Else
    Begin
      d.codigo := a^.dato.codp;
      d.stock := a^.dato.stock;
    End;


End;

Procedure IncisoC(v:vector;Var vc: vectorC);

Var 
  i: integer;
Begin
  For i:=1 To 10 Do
    Begin
      recorrerA(v[i],vc[i]);
    End;

End;

Procedure inciarVC(Var v:vcont);

Var 
  i: integer;
Begin
  For i:= 1 To 10 Do
    v[i] := 0;

End;

Function contar(a:arbol;inf,sup:integer): integer;
Begin
  If a<> Nil Then
    Begin
      If inf < A^.dato.codp Then
        Begin
          If sup > A^.dato.codp Then
            //esto ta mal
            contar := contar(a^.hi,inf,sup)+contar(a^.hD,inf,sup)+1
          Else
            contar(a^.hi,inf,sup);
        End
      Else
        contar(a^.hD,inf,sup);
    End
  Else
    contar := 0;

End;


Procedure incisoD(v:vector; cod1,cod2:integer;Var vc:vcont);

Var 
  i: integer;
Begin
  For i:=1 To 10 Do
    Begin
      vc[i] := contar(v[i],cod1,cod2);
    End;

End;

Var 
  V: vector;
  vC: vectorC;
  rubro: trubro;
  codp: integer;
  contador: vcont;
  cod1,cod2,aux: integer;
Begin
  IncisoA(v);
  //---------------------------------------------------------------
  writeln('ingreasr rubro');
  readln(rubro);
  writeln('ingreasr codp');
  readln(codp);
  writeln(incisoB(v[rubro],codp));
  //---------------------------------------------------------------
  IncisoC(v,vc);
  //---------------------------------------------------------------
  inciarVC(contador);
  writeln('ingresar cod 1');
  readln(cod1);
  writeln('ingresar cod 2');
  readln(cod2);

  If cod1>cod2 Then
    Begin
      aux := cod1;
      cod1 := cod2;
      cod2 := aux;
    End;

  IncisoD(v,cod1,cod2,contador);
End.
