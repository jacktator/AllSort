package com.jacktator.base;

public class Sort {

  public int[] array;

  public Sort(int[] array) {
    this.array = array;
  }

  public void printArray() {
    System.out.println("                                        Array " + buildArrayString());
  }

  public String buildArrayString() {

    StringBuilder arrayString = new StringBuilder("{ ");
    for (int value : this.array) {
      arrayString.append(value);
      arrayString.append(", ");
    }
    arrayString.append("}");
    return arrayString.toString();
  }

}
