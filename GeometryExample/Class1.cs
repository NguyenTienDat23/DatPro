using System;
class Program
{
    public string name;
    public double weight;
    public void Show()
    {
        Console.WriteLine("Name: " + name + ", Weight: " + weight);
    }
    public void Setme(string name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }
}
class lion : Animal
{
    public lion(string name, double weight)
    {
        Setme(name, weight);
        Show();
    }
}
class tiger : Animal
{
    public tiger(string name, double weight)
    {
        Setme(name, weight);
        Show();
    }
}
class Program
{
    public static void Main(string[] args)
    {
        Lion lion = new lion("lion", 100);
        Tiger tiger = new tiger("tiger", 200);
    }
}
