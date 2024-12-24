package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PrivateMetafieldValueInput {
  
  private String value;

  
  private PrivateMetafieldValueType valueType;

  public PrivateMetafieldValueInput() {
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  
  public PrivateMetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(PrivateMetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldValueInput{value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldValueInput that = (PrivateMetafieldValueInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String value;

    
    private PrivateMetafieldValueType valueType;

    public PrivateMetafieldValueInput build() {
      PrivateMetafieldValueInput result = new PrivateMetafieldValueInput();
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    
    public Builder valueType(PrivateMetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
