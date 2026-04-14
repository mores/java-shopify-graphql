package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cashDrawerFindOrCreate` mutation.
 */
public class CashDrawerFindOrCreatePayload {
  /**
   * The cash drawer.
   */
  private CashDrawer cashDrawer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CashDrawerFindOrCreateUserError> userErrors;

  public CashDrawerFindOrCreatePayload() {
  }

  /**
   * The cash drawer.
   */
  public CashDrawer getCashDrawer() {
    return cashDrawer;
  }

  public void setCashDrawer(CashDrawer cashDrawer) {
    this.cashDrawer = cashDrawer;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CashDrawerFindOrCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CashDrawerFindOrCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CashDrawerFindOrCreatePayload{cashDrawer='" + cashDrawer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawerFindOrCreatePayload that = (CashDrawerFindOrCreatePayload) o;
    return Objects.equals(cashDrawer, that.cashDrawer) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashDrawer, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cash drawer.
     */
    private CashDrawer cashDrawer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CashDrawerFindOrCreateUserError> userErrors;

    public CashDrawerFindOrCreatePayload build() {
      CashDrawerFindOrCreatePayload result = new CashDrawerFindOrCreatePayload();
      result.cashDrawer = this.cashDrawer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The cash drawer.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CashDrawerFindOrCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
