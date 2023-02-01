package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age;
  private boolean isFemale;

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
    return "Das geht dich garnix an!!";
  }
  else{
    return String.valueOf(age);
  }

}
    
}
