class DoisNum
{
//propriedades da classe DoisNum
private int A;
private int B;
//métodos da classe DoisNum
public void entraA (int X)
{A=X;}
public void entraB (int X)
{B=X;}
public int retA()
{return A;}
public int retB()
{return B;}
public int soma()
{return A+B;}
public int subtrai()
{return A-B;}
public int multiplica()
{return A*B;}
public int divide()
{return A/B;}
}
class Exemplo
{
public static void main(String[] args)
{
DoisNum X = new DoisNum();
X.entraA(5);
X.entraB(8);
System.out.println("A = " + X.retA());
System.out.println("B = " + X.retB());
System.out.println("A+B = "+X.soma());
}
}
