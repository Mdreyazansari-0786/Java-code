import javax.sound.sampled.SourceDataLine;

class Animal{
    public void run(){
        System.out.println("i am running:");
    }
    public void eat(){
        System.out.println(" i am eating:");
    }
    public static void main(String args []){

        System.out.println('1');
        Animal buzo=new Animal();
        buzo.run();
        buzo.eat();
        Animal cat=new Animal();
        cat.run();
        cat.eat();

 
    }
    
    }

 


