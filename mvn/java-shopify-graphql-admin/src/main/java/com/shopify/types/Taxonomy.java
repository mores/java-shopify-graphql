package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Taxonomy {
  
  private TaxonomyCategoryConnection categories;

  public Taxonomy() {
  }

  
  public TaxonomyCategoryConnection getCategories() {
    return categories;
  }

  public void setCategories(TaxonomyCategoryConnection categories) {
    this.categories = categories;
  }

  @Override
  public String toString() {
    return "Taxonomy{categories='" + categories + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Taxonomy that = (Taxonomy) o;
    return Objects.equals(categories, that.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private TaxonomyCategoryConnection categories;

    public Taxonomy build() {
      Taxonomy result = new Taxonomy();
      result.categories = this.categories;
      return result;
    }

    
    public Builder categories(TaxonomyCategoryConnection categories) {
      this.categories = categories;
      return this;
    }
  }
}
