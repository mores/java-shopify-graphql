package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MoveInput {
  
  private String id;

  
  private String newPosition;

  public MoveInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getNewPosition() {
    return newPosition;
  }

  public void setNewPosition(String newPosition) {
    this.newPosition = newPosition;
  }

  @Override
  public String toString() {
    return "MoveInput{id='" + id + "', newPosition='" + newPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoveInput that = (MoveInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(newPosition, that.newPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String newPosition;

    public MoveInput build() {
      MoveInput result = new MoveInput();
      result.id = this.id;
      result.newPosition = this.newPosition;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder newPosition(String newPosition) {
      this.newPosition = newPosition;
      return this;
    }
  }
}
