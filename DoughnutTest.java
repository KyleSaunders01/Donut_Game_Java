public class DoughnutTest {
    static Character red = new Character('r');
    static Character green = new Character('g');
    static Character blue = new Character('b');
    
    

public static void main(String[] args) {

    
    StackAsMyArrayList<Character> Tower1 = new StackAsMyArrayList<>();



    StackAsMyArrayList<Character>[] Towers = new StackAsMyArrayList[5];
    Towers[0] = Tower1;
    

    Towers[0].push(new Character(red));
    Towers[0].push(new Character(blue));
    Towers[0].push(new Character(green));
    
    System.out.println("The Tower: "+Towers[0]);
    System.out.println("Size: "+ Towers[0].getStackSize() );
    if(Towers[0].getStackSize() == 5)
    {
        System.out.println("Correct, "+ Towers[0].checkStackUniform());
    }
    else
    {
        System.out.println("The Tower is not full");
    }
    
    StackAsMyArrayList<Character> Tower2 = new StackAsMyArrayList<>();

    Towers[1] = Tower2;
    

    Towers[1].push(new Character(red));
    Towers[1].push(new Character(blue));
    Towers[1].push(new Character(green));
    Towers[1].push(new Character(green));
    Towers[1].push(new Character(green));

    
    System.out.println("The Tower: "+Towers[1]);
    System.out.println("Size: "+ Towers[1].getStackSize() );
    if(Towers[1].getStackSize() == 5)
    {
        System.out.println("Correct, "+ Towers[1].checkStackUniform());
    }
    else
    {
        System.out.println("The Tower is not full");
    }

    StackAsMyArrayList<Character> Tower3 = new StackAsMyArrayList<>();

    Towers[2] = Tower3;
    

    Towers[2].push(new Character(red));
    Towers[2].push(new Character(red));
    Towers[2].push(new Character(red));
  

    
    System.out.println("The Tower: "+Towers[2]);
    System.out.println("Size: "+ Towers[2].getStackSize() );
    if(Towers[2].getStackSize() == 5)
    {
        System.out.println("Correct, "+ Towers[2].checkStackUniform());
    }
    else
    {
        System.out.println("The Tower is not full");
    }

    StackAsMyArrayList<Character> Tower4 = new StackAsMyArrayList<>();

    Towers[3] = Tower4;
    

    Towers[3].push(new Character(red));
    Towers[3].push(new Character(red));
    Towers[3].push(new Character(red));
    Towers[3].push(new Character(red));
    Towers[3].push(new Character(red));
  

    
    System.out.println("The Tower: "+Towers[3]);
    System.out.println("Size: "+ Towers[3].getStackSize() );
    if(Towers[3].getStackSize() == 5)
    {
        System.out.println("Correct, "+ Towers[3].checkStackUniform());
    }
    else
    {
        System.out.println("The Tower is not full");
    }


}
}
