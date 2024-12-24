package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SelectedVariantOptionInput {
  
  private String name;

  
  private String value;

  
  private String linkedMetafieldValue;

  public SelectedVariantOptionInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
  }

  @Override
  public String toString() {
    return "SelectedVariantOptionInput{name='" + name + "', value='" + value + "', linkedMetafieldValue='" + linkedMetafieldValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SelectedVariantOptionInput that = (SelectedVariantOptionInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, linkedMetafieldValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String value;

    
    private String linkedMetafieldValue;

    public SelectedVariantOptionInput build() {
      SelectedVariantOptionInput result = new SelectedVariantOptionInput();
      result.name = this.name;
      result.value = this.value;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
      return this;
    }
  }
}
