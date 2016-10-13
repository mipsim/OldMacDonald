class NamedCow extends Cow 
{     
     private String myType;
     private String myName;     
     private String mySound; 

     public NamedCow(String type, String name, String sound)    
     {         
        myType = type;
        myName = name;         
        mySound = sound;     
     }     

     public NamedCow()     
     {         
        myType = "unknown";
        myName = "unkown";         
        mySound = "unknown";     
     }      

     public String getName(){return myName;}
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}