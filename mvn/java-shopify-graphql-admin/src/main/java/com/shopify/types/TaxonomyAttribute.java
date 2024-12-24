package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyAttribute implements TaxonomyCategoryAttribute, com.shopify.types.Node {
  
  private String id;

  public TaxonomyAttribute() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "TaxonomyAttribute{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyAttribute that = (TaxonomyAttribute) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    public TaxonomyAttribute build() {
      TaxonomyAttribute result = new TaxonomyAttribute();
      result.id = this.id;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
