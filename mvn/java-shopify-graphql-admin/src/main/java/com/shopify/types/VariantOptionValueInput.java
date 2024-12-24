package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class VariantOptionValueInput {
  
  private String id;

  
  private String name;

  
  private String linkedMetafieldValue;

  
  private String optionId;

  
  private String optionName;

  public VariantOptionValueInput() {
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

  
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  @Override
  public String toString() {
    return "VariantOptionValueInput{id='" + id + "', name='" + name + "', linkedMetafieldValue='" + linkedMetafieldValue + "', optionId='" + optionId + "', optionName='" + optionName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VariantOptionValueInput that = (VariantOptionValueInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue) &&
        Objects.equals(optionId, that.optionId) &&
        Objects.equals(optionName, that.optionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, linkedMetafieldValue, optionId, optionName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private String linkedMetafieldValue;

    
    private String optionId;

    
    private String optionName;

    public VariantOptionValueInput build() {
      VariantOptionValueInput result = new VariantOptionValueInput();
      result.id = this.id;
      result.name = this.name;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      result.optionId = this.optionId;
      result.optionName = this.optionName;
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

    
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }

    
    public Builder optionName(String optionName) {
      this.optionName = optionName;
      return this;
    }
  }
}
