package roya.taskstwo;

public class Health {
    private  int health;
    public Health(int  health){
        if (!(health > 0 && health <= 10)){
            throw  new RuntimeException(health + "exceeds range");

        }
        this.health=health;
    }
    public  void  decreaseHealth(){}
}
