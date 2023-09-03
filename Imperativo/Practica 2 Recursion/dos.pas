
Program dos;






Procedure imprimir(Var num:integer);

Var 
  aux: integer;
Begin
  If num<>0 Then
    Begin
      aux := num Mod 10;
      num := num Div 10;
      imprimir(num);
      Write(aux,' ');
    End;


End;

Var 
  num: integer;
Begin
  num := 1;
  While num<>0  Do
    Begin
      ReadLn(num);
      imprimir(num);
    End;
End.
