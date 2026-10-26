package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Return Rules that apply to returns under a return policy profile.
 */
public class ReturnPoliciesReturnRules {
  /**
   * Whether the policy accepts returns. When false, the customer can't request returns for items under this policy.
   */
  private boolean canAcceptReturns;

  /**
   * The return window is extended to the next business day when it falls on a weekend or holiday.
   */
  private Boolean extendWindowToBusinessDay;

  /**
   * The return window by number of days. Set to -1 to indicate an infinite return
   * window. When `canAcceptReturns` is false, this value is ignored as returns
   * aren't accepted.
   */
  private Integer returnWindowDays;

  /**
   * The starting point for calculating the return window.
   */
  private ReturnPoliciesReturnWindowStartingFrom returnWindowStartingFrom;

  public ReturnPoliciesReturnRules() {
  }

  /**
   * Whether the policy accepts returns. When false, the customer can't request returns for items under this policy.
   */
  public boolean getCanAcceptReturns() {
    return canAcceptReturns;
  }

  public void setCanAcceptReturns(boolean canAcceptReturns) {
    this.canAcceptReturns = canAcceptReturns;
  }

  /**
   * The return window is extended to the next business day when it falls on a weekend or holiday.
   */
  public Boolean getExtendWindowToBusinessDay() {
    return extendWindowToBusinessDay;
  }

  public void setExtendWindowToBusinessDay(Boolean extendWindowToBusinessDay) {
    this.extendWindowToBusinessDay = extendWindowToBusinessDay;
  }

  /**
   * The return window by number of days. Set to -1 to indicate an infinite return
   * window. When `canAcceptReturns` is false, this value is ignored as returns
   * aren't accepted.
   */
  public Integer getReturnWindowDays() {
    return returnWindowDays;
  }

  public void setReturnWindowDays(Integer returnWindowDays) {
    this.returnWindowDays = returnWindowDays;
  }

  /**
   * The starting point for calculating the return window.
   */
  public ReturnPoliciesReturnWindowStartingFrom getReturnWindowStartingFrom() {
    return returnWindowStartingFrom;
  }

  public void setReturnWindowStartingFrom(
      ReturnPoliciesReturnWindowStartingFrom returnWindowStartingFrom) {
    this.returnWindowStartingFrom = returnWindowStartingFrom;
  }

  @Override
  public String toString() {
    return "ReturnPoliciesReturnRules{canAcceptReturns='" + canAcceptReturns + "', extendWindowToBusinessDay='" + extendWindowToBusinessDay + "', returnWindowDays='" + returnWindowDays + "', returnWindowStartingFrom='" + returnWindowStartingFrom + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnPoliciesReturnRules that = (ReturnPoliciesReturnRules) o;
    return canAcceptReturns == that.canAcceptReturns &&
        Objects.equals(extendWindowToBusinessDay, that.extendWindowToBusinessDay) &&
        Objects.equals(returnWindowDays, that.returnWindowDays) &&
        Objects.equals(returnWindowStartingFrom, that.returnWindowStartingFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAcceptReturns, extendWindowToBusinessDay, returnWindowDays, returnWindowStartingFrom);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the policy accepts returns. When false, the customer can't request returns for items under this policy.
     */
    private boolean canAcceptReturns;

    /**
     * The return window is extended to the next business day when it falls on a weekend or holiday.
     */
    private Boolean extendWindowToBusinessDay;

    /**
     * The return window by number of days. Set to -1 to indicate an infinite return
     * window. When `canAcceptReturns` is false, this value is ignored as returns
     * aren't accepted.
     */
    private Integer returnWindowDays;

    /**
     * The starting point for calculating the return window.
     */
    private ReturnPoliciesReturnWindowStartingFrom returnWindowStartingFrom;

    public ReturnPoliciesReturnRules build() {
      ReturnPoliciesReturnRules result = new ReturnPoliciesReturnRules();
      result.canAcceptReturns = this.canAcceptReturns;
      result.extendWindowToBusinessDay = this.extendWindowToBusinessDay;
      result.returnWindowDays = this.returnWindowDays;
      result.returnWindowStartingFrom = this.returnWindowStartingFrom;
      return result;
    }

    /**
     * Whether the policy accepts returns. When false, the customer can't request returns for items under this policy.
     */
    public Builder canAcceptReturns(boolean canAcceptReturns) {
      this.canAcceptReturns = canAcceptReturns;
      return this;
    }

    /**
     * The return window is extended to the next business day when it falls on a weekend or holiday.
     */
    public Builder extendWindowToBusinessDay(Boolean extendWindowToBusinessDay) {
      this.extendWindowToBusinessDay = extendWindowToBusinessDay;
      return this;
    }

    /**
     * The return window by number of days. Set to -1 to indicate an infinite return
     * window. When `canAcceptReturns` is false, this value is ignored as returns
     * aren't accepted.
     */
    public Builder returnWindowDays(Integer returnWindowDays) {
      this.returnWindowDays = returnWindowDays;
      return this;
    }

    /**
     * The starting point for calculating the return window.
     */
    public Builder returnWindowStartingFrom(
        ReturnPoliciesReturnWindowStartingFrom returnWindowStartingFrom) {
      this.returnWindowStartingFrom = returnWindowStartingFrom;
      return this;
    }
  }
}
