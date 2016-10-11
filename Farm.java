class Farm 
{    
	private String mySound;
    
    private Animal[] aBunchOfAnimals = new Animal[3];  

    public Farm()     
    {       
    	mySound = "cluck";
        aBunchOfAnimals[0] = new Cow("cow","moo");           
        aBunchOfAnimals[1] = new Chick("chick","" + mySound);       
        aBunchOfAnimals[2] = new Pig("pig","oink");    
    }         

    public void animalSounds()    
    {      
        for (int nI=0; nI < aBunchOfAnimals.length; nI++)       
        {          
          System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
        }    
    } 
} 