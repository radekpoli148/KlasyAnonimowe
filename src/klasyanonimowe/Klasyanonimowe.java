/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klasyanonimowe;

public class Klasyanonimowe {

    public static void main(String[] args) 
    {
        zachowaniePoWcisnieciu z = () -> {
            System.out.println("jestem z klasy anonimowej");
        };
        
        ZachowaniePoWcisnieciu2 z2 = (int a, int b) -> {
            System.out.println(a + b);
        };
        
        Przycisk p = new Przycisk();
        
        p.dodajAkcje(new zachowaniePoWcisnieciu() {
            @Override
            public void akcja() 
            {
                System.out.println("jestem z klasy anonimowej");
            }
        });
        
        p.dodajAkcje2(3, 2, z2);
    }
    
}

interface zachowaniePoWcisnieciu
{
    void akcja();
}

interface ZachowaniePoWcisnieciu2
{
    void akcja2(int a, int b);
}
class Przycisk
{
    void dodajAkcje(zachowaniePoWcisnieciu z)
    {
        z.akcja();
    }
    void dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z)
    {
        z.akcja2(a, b);
    }
}


