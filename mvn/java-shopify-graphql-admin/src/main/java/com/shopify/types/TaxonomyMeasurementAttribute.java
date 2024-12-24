package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyMeasurementAttribute implements TaxonomyCategoryAttribute, com.shopify.types.Node {
  
  private String id;

  
  private String name;

  
  private List<Attribute> options;

  public TaxonomyMeasurementAttribute() {
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

  
  public List<Attribute> getOptions() {
    return options;
  }

  public void setOptions(List<Attribute> options) {
    this.options = options;
  }

  @Override
  public String toString() {
    return "TaxonomyMeasurementAttribute{id='" + id + "', name='" + name + "', options='" + options + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyMeasurementAttribute that = (TaxonomyMeasurementAttribute) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, options);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private List<Attribute> options;

    public TaxonomyMeasurementAttribute build() {
      TaxonomyMeasurementAttribute result = new TaxonomyMeasurementAttribute();
      result.id = this.id;
      result.name = this.name;
      result.options = this.options;
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

    
    public Builder options(List<Attribute> options) {
      this.options = options;
      return this;
    }
  }
}
