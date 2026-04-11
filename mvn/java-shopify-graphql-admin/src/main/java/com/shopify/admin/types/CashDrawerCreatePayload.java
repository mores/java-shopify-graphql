package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cashDrawerCreate` mutation.
 */
public class CashDrawerCreatePayload {
  /**
   * The created cash drawer.
   */
  private CashDrawer cashDrawer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CashDrawerCreateUserError> userErrors;

  public CashDrawerCreatePayload() {
  }

  /**
   * The created cash drawer.
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
  public List<CashDrawerCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CashDrawerCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CashDrawerCreatePayload{cashDrawer='" + cashDrawer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawerCreatePayload that = (CashDrawerCreatePayload) o;
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
     * The created cash drawer.
     */
    private CashDrawer cashDrawer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CashDrawerCreateUserError> userErrors;

    public CashDrawerCreatePayload build() {
      CashDrawerCreatePayload result = new CashDrawerCreatePayload();
      result.cashDrawer = this.cashDrawer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created cash drawer.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CashDrawerCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
