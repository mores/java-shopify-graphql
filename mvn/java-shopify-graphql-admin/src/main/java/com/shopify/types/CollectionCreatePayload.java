package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionCreatePayload {
  
  private Collection collection;

  
  private List<UserError> userErrors;

  public CollectionCreatePayload() {
  }

  
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionCreatePayload{collection='" + collection + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreatePayload that = (CollectionCreatePayload) o;
    return Objects.equals(collection, that.collection) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Collection collection;

    
    private List<UserError> userErrors;

    public CollectionCreatePayload build() {
      CollectionCreatePayload result = new CollectionCreatePayload();
      result.collection = this.collection;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
