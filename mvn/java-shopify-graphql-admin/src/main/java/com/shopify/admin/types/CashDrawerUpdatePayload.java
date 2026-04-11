package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cashDrawerUpdate` mutation.
 */
public class CashDrawerUpdatePayload {
  /**
   * The updated cash drawer.
   */
  private CashDrawer cashDrawer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CashDrawerUpdateUserError> userErrors;

  public CashDrawerUpdatePayload() {
  }

  /**
   * The updated cash drawer.
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
  public List<CashDrawerUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CashDrawerUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CashDrawerUpdatePayload{cashDrawer='" + cashDrawer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawerUpdatePayload that = (CashDrawerUpdatePayload) o;
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
     * The updated cash drawer.
     */
    private CashDrawer cashDrawer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CashDrawerUpdateUserError> userErrors;

    public CashDrawerUpdatePayload build() {
      CashDrawerUpdatePayload result = new CashDrawerUpdatePayload();
      result.cashDrawer = this.cashDrawer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated cash drawer.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CashDrawerUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
