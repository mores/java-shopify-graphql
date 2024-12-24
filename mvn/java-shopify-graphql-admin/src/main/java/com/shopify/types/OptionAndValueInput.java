package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OptionAndValueInput {
  
  private String name;

  
  private List<String> values;

  
  private String optionId;

  
  private LinkedMetafieldInput linkedMetafield;

  public OptionAndValueInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  
  public LinkedMetafieldInput getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafieldInput linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  @Override
  public String toString() {
    return "OptionAndValueInput{name='" + name + "', values='" + values + "', optionId='" + optionId + "', linkedMetafield='" + linkedMetafield + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionAndValueInput that = (OptionAndValueInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(values, that.values) &&
        Objects.equals(optionId, that.optionId) &&
        Objects.equals(linkedMetafield, that.linkedMetafield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, optionId, linkedMetafield);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private List<String> values;

    
    private String optionId;

    
    private LinkedMetafieldInput linkedMetafield;

    public OptionAndValueInput build() {
      OptionAndValueInput result = new OptionAndValueInput();
      result.name = this.name;
      result.values = this.values;
      result.optionId = this.optionId;
      result.linkedMetafield = this.linkedMetafield;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }

    
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }

    
    public Builder linkedMetafield(LinkedMetafieldInput linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }
  }
}
