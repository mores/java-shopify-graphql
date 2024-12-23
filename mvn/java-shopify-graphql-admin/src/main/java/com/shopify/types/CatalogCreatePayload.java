package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `catalogCreate` mutation.
 */
public class CatalogCreatePayload {
  /**
   * The newly created catalog.
   */
  private Catalog catalog;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CatalogUserError> userErrors;

  public CatalogCreatePayload() {
  }

  /**
   * The newly created catalog.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CatalogUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CatalogUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CatalogCreatePayload{catalog='" + catalog + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogCreatePayload that = (CatalogCreatePayload) o;
    return Objects.equals(catalog, that.catalog) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created catalog.
     */
    private Catalog catalog;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CatalogUserError> userErrors;

    public CatalogCreatePayload build() {
      CatalogCreatePayload result = new CatalogCreatePayload();
      result.catalog = this.catalog;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created catalog.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CatalogUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
