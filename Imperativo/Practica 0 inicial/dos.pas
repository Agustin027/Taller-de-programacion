
Program dos;

Const 
  fin = -1;

Type 
  Tzona = 1..5;

  propiedad = Record
    codigo: integer;
    tipo: string;
    precioT: real;
  End;


  lista = ^nodo;
  nodo = Record
    dato: propiedad;
    sig: lista;
  End;

  arrProp = array[Tzona] Of lista;

  //inciso B----------------
  incisoB = Record
    codigos: integer;
    tipo: string;
  End;
  listaN = ^nodoN;
  nodoN = Record
    dato: incisoB;
    sig: listaN;
  End;


  //procedures------------------------------------
Procedure leer(Var zona:Tzona;Var p:propiedad;Var Pm2:real);

Var 
  CM2: real;
Begin
  WriteLn('ingrese el precio de metro cuadrado');
  ReadLn(Pm2);
  If Pm2<>fin Then
    Begin
      WriteLn('ingrese la zona');
      ReadLn(zona);
      WriteLn('ingrese el codigo de la propiedad');
      ReadLn(p.codigo);
      WriteLn('ingrese el tipo de propiedad');
      ReadLn(p.tipo);
      WriteLn('ingrese cantidad de M2');
      ReadLn(Cm2);
      p.precioT := Cm2*Pm2;
    End;

End;

Procedure insertarordenado(Var l:lista; p:propiedad);

Var 
  nue: lista;
  act, ant: lista;

Begin
  new (nue);
  nue^.dato := p;
  act := L;
  ant := L;
  While ( act <> Nil)And(p.tipo<act^.dato.tipo) Do
    Begin
      ant := act;
      act := act^.sig;
    End;
  If (act = ant) Then
    L := nue
  Else
    ant^.sig := nue;
  nue^.sig := act;

End;


Procedure creararrProp(Var v:arrProp);

Var 
  zona: Tzona;
  Pm2: real;
  p: propiedad;
Begin
  leer(zona,p,Pm2);
  While Pm2 <> fin Do
    Begin
      insertarordenado(v[i],p);
      leer(zona,p,PM2);

    End;
End;

Procedure Arrnill(Var v:arrProp);
Begin
  For i:=1 To 5 Do
    v[i] := Nil;
End;



Procedure incisoB(l:lista;tipoP:String;Var listaN:listaN);

Var 
  B: incisoB;
Begin
  While l<>Nil Do
    Begin
      B.codigos := l^.dato.codigo;
      b.tipo := l^.dato.tipo;
      agregaradelante(listaN,B);
      l := l^.sig;
    End;
End;

//Programa principal--------------------------------

Var 
  vec: arrProp;
  nroZ: Tzona;
  tipoP: string;
  listaN: listaN;
Begin



//array de listas de 1 a 5 para almacenar las propiedades, la lista tiene que estar ordenada por tipo
  Arrnil(vec);
  //esto no se si va
  creararrProp(vec);
  //incisoB---------
  ReadLn(nroZ);
  ReadLn(tipoP);
  listaN := Nil;
  incisoB(vec[nroZ],tipoP,listaN);
End.
