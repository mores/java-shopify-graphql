package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateLineItemPropertyInput {
  
  private String name;

  
  private String value;

  public OrderCreateLineItemPropertyInput() {
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

  @Override
  public String toString() {
    return "OrderCreateLineItemPropertyInput{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateLineItemPropertyInput that = (OrderCreateLineItemPropertyInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String value;

    public OrderCreateLineItemPropertyInput build() {
      OrderCreateLineItemPropertyInput result = new OrderCreateLineItemPropertyInput();
      result.name = this.name;
      result.value = this.value;
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
  }
}
