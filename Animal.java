
public class Animal {
    
    String name;
    
    void Eat(){
        System.out.println("Animal is Eating");
    }

    
static class Dog extends Animal{
    
    String breed;
    
    void bark(){
        System.out.println("Dog is Barking");
    }
    
static class main{
    
    public static void main(String[] args){
        
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.breed = "PitBull";
        d1.bark();
        d1.Eat();
    }
}
    
    
}
    
    
    
}
