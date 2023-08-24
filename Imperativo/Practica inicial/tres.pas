
Program tres;

Type 

  Dproductos = Record
    precio: real;
    stock: integer;
  End;

  Vdproductos = array[1..1000] Of Dproductos;

  detalle = Record
    codprod: integer;
    cant: integer;
    precioU: real;
  End;

  listaD = nodoD;
  nodoD = Record
    dato: detalle;
    sig: listaD;
  End;

  ticket = Record
    codventa: integer;
    detalleT: ListaD;
    montoT: real;
  End;

  listaT = nodoT;
  nodoT = Record
    dato: ticket;
    sig: listaT;
  End;

Procedure quequilombo(Var l:listaT);

Var 
  CodVenta: integer;
  CodProd: integer;
  CantProd: integer;
  d: detalle;
  total: real;
  T: ticket;
Begin
  ReadLn(CodVenta);
  While CodVenta<>-1  Do
    Begin
      t.codventa := CodVenta;
      readln(CantProd);
      total := 0;
      While CantProd=0 Do
        Begin
          readln(CodProd);
          d.codprod := codprod;
          d.cant := Cantprod;
          d.precioU := Vdproductos[codprod].precioU;
          Vdproductos[CodProd].stock := Vdproductos[CodProd].stock-CantProd;
          total := total+Vdproductos[codprod].precioU * CantProd;
          agregaradelante(l^.dato.detalleT,d);
          readln(CantProd);
        End;
      t.montoT := total;
      agregaradelanteT(l,T);
      ReadLn(CodVenta);
    End;
End;

Function incisoC(l:listaT;cod:integer): integer;

Var 
  aux: listaD;
  cant: integer;
Begin
  cant := 0;
  While l<>Nil Do
    Begin
      aux := l^.dato.detalleT;
      While aux<>Nil Do
        Begin
          If aux^.dato.codprod=cod Then
            cant := cant+aux^.dato.cant;
          aux := aux^.sig;
        End;
      l := l^.sig;
    End;
  incisoC := cant;
End;

Var 
  l: listaT;
  codprod: integer;
Begin
  l := Nil;
  l^.dato.detalleT := Nil;
  quequilombo(l);
  readln(codprod);
  writeln(incisoC(l,codprod));
End.
