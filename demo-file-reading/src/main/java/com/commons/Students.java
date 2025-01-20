package com.commons;

public class Students {
    private String id;

    public Students(String id) {
      this.id = id;
    }
    
    @Override
    public boolean equals(Object obj) {
      // ... code here ... 
      if (obj == this) {
        return true;
      }

      if (!(obj instanceof Students)) {
        return false;
      }

      Students students = (Students) obj;
      return this.id.compareTo(students.getId()) == 0;
    }
  
    @Override
    public int hashCode() {
      // ... code here ... 
      return 42;
    }

    public String getId() {
        return id;
    }

}
