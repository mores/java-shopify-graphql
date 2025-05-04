package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopLocaleDisable` mutation.
 */
public class ShopLocaleDisablePayload {
  /**
   * ISO code of the locale that was deleted.
   */
  private String locale;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ShopLocaleDisablePayload() {
  }

  /**
   * ISO code of the locale that was deleted.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
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
    return "ShopLocaleDisablePayload{locale='" + locale + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleDisablePayload that = (ShopLocaleDisablePayload) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ISO code of the locale that was deleted.
     */
    private String locale;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ShopLocaleDisablePayload build() {
      ShopLocaleDisablePayload result = new ShopLocaleDisablePayload();
      result.locale = this.locale;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * ISO code of the locale that was deleted.
     */
    public Builder locale(String locale) {
      this.locale = locale;
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
