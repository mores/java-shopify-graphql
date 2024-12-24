package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SelectedOption {
  
  private String name;

  
  private ProductOptionValue optionValue;

  
  private String value;

  public SelectedOption() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public ProductOptionValue getOptionValue() {
    return optionValue;
  }

  public void setOptionValue(ProductOptionValue optionValue) {
    this.optionValue = optionValue;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SelectedOption{name='" + name + "', optionValue='" + optionValue + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SelectedOption that = (SelectedOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(optionValue, that.optionValue) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optionValue, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private ProductOptionValue optionValue;

    
    private String value;

    public SelectedOption build() {
      SelectedOption result = new SelectedOption();
      result.name = this.name;
      result.optionValue = this.optionValue;
      result.value = this.value;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder optionValue(ProductOptionValue optionValue) {
      this.optionValue = optionValue;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
