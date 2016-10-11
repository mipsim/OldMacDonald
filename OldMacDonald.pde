public void setup()
{    
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound()); 

    Chick k = new Chick("chick", "cheep");   
    System.out.println(k.getType() + " goes " + k.getSound());

    Pig p = new Pig("pig", "oink");   
    System.out.println(p.getType() + " goes " + p.getSound());

    Farm f = new Farm();
    f.animalSounds();
}
