package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OptionValueCreateInput {
  
  private String name;

  
  private String linkedMetafieldValue;

  public OptionValueCreateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
  }

  @Override
  public String toString() {
    return "OptionValueCreateInput{name='" + name + "', linkedMetafieldValue='" + linkedMetafieldValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionValueCreateInput that = (OptionValueCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, linkedMetafieldValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String linkedMetafieldValue;

    public OptionValueCreateInput build() {
      OptionValueCreateInput result = new OptionValueCreateInput();
      result.name = this.name;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
      return this;
    }
  }
}
