package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionAddProducts` mutation.
 */
public class CollectionAddProductsPayload {
  /**
   * The updated collection. Returns `null` if an error is raised.
   */
  private Collection collection;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CollectionAddProductsPayload() {
  }

  /**
   * The updated collection. Returns `null` if an error is raised.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionAddProductsPayload{collection='" + collection + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionAddProductsPayload that = (CollectionAddProductsPayload) o;
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
    /**
     * The updated collection. Returns `null` if an error is raised.
     */
    private Collection collection;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CollectionAddProductsPayload build() {
      CollectionAddProductsPayload result = new CollectionAddProductsPayload();
      result.collection = this.collection;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated collection. Returns `null` if an error is raised.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
