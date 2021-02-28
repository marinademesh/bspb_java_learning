package ru.bspb.clients_lesson4;

public class Function {

  public static void DublleDel(Person[] persons) {


      Person[] output = new Person[persons.length];
      int couter = 0;
      for (Person person : persons) {
          if (person.getGender() == Gender.MALE) {
              boolean distinctive = true;
              for (int j = 0; j <= couter; j++) {
                  if (person.equals(output[j])) {
                      distinctive = false;
                      break;
                  }
              }
              if (distinctive) {
                  couter = couter + 1;
                  output[couter] = person;
                  System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getGender());


              }
          }
      }
  }
}

