package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCollections implements DiscountItems {
  
  private CollectionConnection collections;

  public DiscountCollections() {
  }

  
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  @Override
  public String toString() {
    return "DiscountCollections{collections='" + collections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCollections that = (DiscountCollections) o;
    return Objects.equals(collections, that.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CollectionConnection collections;

    public DiscountCollections build() {
      DiscountCollections result = new DiscountCollections();
      result.collections = this.collections;
      return result;
    }

    
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }
  }
}
