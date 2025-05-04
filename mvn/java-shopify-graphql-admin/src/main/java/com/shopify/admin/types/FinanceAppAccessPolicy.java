package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Current user's access policy for a finance app.
 */
public class FinanceAppAccessPolicy {
  /**
   * Current shop staff's access within the app.
   */
  private List<BankingFinanceAppAccess> access;

  public FinanceAppAccessPolicy() {
  }

  /**
   * Current shop staff's access within the app.
   */
  public List<BankingFinanceAppAccess> getAccess() {
    return access;
  }

  public void setAccess(List<BankingFinanceAppAccess> access) {
    this.access = access;
  }

  @Override
  public String toString() {
    return "FinanceAppAccessPolicy{access='" + access + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinanceAppAccessPolicy that = (FinanceAppAccessPolicy) o;
    return Objects.equals(access, that.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Current shop staff's access within the app.
     */
    private List<BankingFinanceAppAccess> access;

    public FinanceAppAccessPolicy build() {
      FinanceAppAccessPolicy result = new FinanceAppAccessPolicy();
      result.access = this.access;
      return result;
    }

    /**
     * Current shop staff's access within the app.
     */
    public Builder access(List<BankingFinanceAppAccess> access) {
      this.access = access;
      return this;
    }
  }
}
