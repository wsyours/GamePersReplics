/**
 * Created by Администратор on 28.03.2017.
 */
class Speaking {

    public void speakToPlayer(Speakable speakable)
    {
        System.out.println(speakable.speak());
    }

    public static void main(String args[]){

        Speaking speak = new Speaking();
        speak.speakToPlayer(new Archer());
        speak.speakToPlayer(new Warrior());
        speak.speakToPlayer(new Necromancer());
    }
}
