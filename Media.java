public class Media
{

//atributos (privados)
private int val1;
private int val2;
//metodos (publicos)
public void atribuiValor1(int x)
{
val1 = x;
}
public void atribuiValor2(int x)
{
val2 = x;
}
public float calcMedia()
{
return (val1+val2) /2f;
}

}

public class TestaMedia
{
public static void main(String[] args)
{
//o objeto
Media exemplo = new Media();

exemplo.atribuiValor1(10);
exemplo.atribuiValor2(3);
System.out.print("Media: "+exemplo.calcMedia());
}
}
