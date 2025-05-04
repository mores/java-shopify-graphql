package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productFullSync` mutation.
 */
public class ProductFullSyncPayload {
  /**
   * The ID for the full sync operation.
   */
  private String id;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductFullSyncUserError> userErrors;

  public ProductFullSyncPayload() {
  }

  /**
   * The ID for the full sync operation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductFullSyncUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductFullSyncUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductFullSyncPayload{id='" + id + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFullSyncPayload that = (ProductFullSyncPayload) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID for the full sync operation.
     */
    private String id;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductFullSyncUserError> userErrors;

    public ProductFullSyncPayload build() {
      ProductFullSyncPayload result = new ProductFullSyncPayload();
      result.id = this.id;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID for the full sync operation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductFullSyncUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
