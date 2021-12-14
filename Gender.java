package roya.taskstwo;
 public enum Gender {
     MALE ('M'), FEMALE('F');
     private char shortened;

     Gender(char shortened) {
         this.shortened = shortened;
     }


     public char getShortened() {
         return this.shortened;
     }
 }


