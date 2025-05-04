package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopLocaleUpdate` mutation.
 */
public class ShopLocaleUpdatePayload {
  /**
   * The locale that was updated.
   */
  private ShopLocale shopLocale;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ShopLocaleUpdatePayload() {
  }

  /**
   * The locale that was updated.
   */
  public ShopLocale getShopLocale() {
    return shopLocale;
  }

  public void setShopLocale(ShopLocale shopLocale) {
    this.shopLocale = shopLocale;
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
    return "ShopLocaleUpdatePayload{shopLocale='" + shopLocale + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleUpdatePayload that = (ShopLocaleUpdatePayload) o;
    return Objects.equals(shopLocale, that.shopLocale) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopLocale, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The locale that was updated.
     */
    private ShopLocale shopLocale;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ShopLocaleUpdatePayload build() {
      ShopLocaleUpdatePayload result = new ShopLocaleUpdatePayload();
      result.shopLocale = this.shopLocale;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The locale that was updated.
     */
    public Builder shopLocale(ShopLocale shopLocale) {
      this.shopLocale = shopLocale;
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
