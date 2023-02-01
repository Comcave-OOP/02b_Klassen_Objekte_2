package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age;
  private boolean isFemale;
  private int counter;

public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "Error, Irgendwas ging schief!";
  }
}

public String getAge() {

  if (isFemale){
    return checkEscalationLevel();
  }
  else{
    return String.valueOf(age);
  }

}
   
private String checkEscalationLevel(){
    counter ++;
  switch (counter) {
    case 1:
      return "Das geht dich garnix an!!";
    case 2:
      return "Hast du mich nicht gehört? Das geht dich nix an!!";
    case 3:
      return "Jetz werd ich aber dann echt sauer!! Lass mich in ruhe!!";      
    default:
      return "Leck mich doch am Arsch!!";
  }
}

}
