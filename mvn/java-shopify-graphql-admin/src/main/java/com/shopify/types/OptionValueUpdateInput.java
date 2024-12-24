package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OptionValueUpdateInput {
  
  private String id;

  
  private String name;

  
  private String linkedMetafieldValue;

  public OptionValueUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "OptionValueUpdateInput{id='" + id + "', name='" + name + "', linkedMetafieldValue='" + linkedMetafieldValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionValueUpdateInput that = (OptionValueUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, linkedMetafieldValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private String linkedMetafieldValue;

    public OptionValueUpdateInput build() {
      OptionValueUpdateInput result = new OptionValueUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
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
