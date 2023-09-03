
Program seis;

Procedure modulo(num: integer);
Begin
  If num > 0 Then
    Begin
      modulo(num Div 2);
      Write(num Mod 2);
    End;
End;

Var 
  num: integer;
Begin
  Repeat
    readln(num);
    If num <> 0 Then
      Begin
        modulo(num);
        writeln;
      End;
  Until num = 0;
End.
