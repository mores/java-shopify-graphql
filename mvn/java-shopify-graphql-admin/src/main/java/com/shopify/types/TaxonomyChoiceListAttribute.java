package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyChoiceListAttribute implements TaxonomyCategoryAttribute, com.shopify.types.Node {
  
  private String id;

  
  private String name;

  
  private TaxonomyValueConnection values;

  public TaxonomyChoiceListAttribute() {
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

  
  public TaxonomyValueConnection getValues() {
    return values;
  }

  public void setValues(TaxonomyValueConnection values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "TaxonomyChoiceListAttribute{id='" + id + "', name='" + name + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyChoiceListAttribute that = (TaxonomyChoiceListAttribute) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private TaxonomyValueConnection values;

    public TaxonomyChoiceListAttribute build() {
      TaxonomyChoiceListAttribute result = new TaxonomyChoiceListAttribute();
      result.id = this.id;
      result.name = this.name;
      result.values = this.values;
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

    
    public Builder values(TaxonomyValueConnection values) {
      this.values = values;
      return this;
    }
  }
}
