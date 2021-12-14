package roya.taskstwo;

public abstract  class Animal {
    private  int age;
    private String[] eats;
    private Health health;
    private int lifeExpectancy;
    private Gender gender;

   public enum  Gender {
        MALE ('M'), FEMALE('F');
        private char shortened;

        Gender(char shortened) {
            this.shortened = shortened;
        }

        public char getShortened() {
            return this.shortened;
        }}




    public Animal(int age, String[] eats, Health health, int lifeExpectancy, Gender gender) {
        this.age = age;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
        this.gender = gender;
    }


    public int getAge() {
        return age; }

    public Gender getGender(){
        return gender;
    }
    public int getLifeExpectancy(){
        return lifeExpectancy;
    }

    public boolean canEat(String food){
        for (String eatenFood : this.eats){
            if (eatenFood.equalsIgnoreCase(food)){
                return true;
            }
        }

        return false;
    }
    public abstract void  eat();
     public void treat(){}
    public abstract boolean aMonthPasses();
}


