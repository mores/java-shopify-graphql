package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Rules that apply to buyer-initiated edit and cancellation requests under a return policy profile.
 */
public class ReturnPoliciesEditRules {
  /**
   * Whether the policy accepts buyer-initiated edit requests. When false, the
   * customer can't request edits or cancellations for items under this policy.
   */
  private boolean canAcceptEdits;

  /**
   * The cancellation window in minutes. Set to -1 to indicate a window until
   * fulfillment. When `canAcceptEdits` is false, this value is ignored as edit
   * requests aren't accepted.
   */
  private Integer editWindowMinutes;

  public ReturnPoliciesEditRules() {
  }

  /**
   * Whether the policy accepts buyer-initiated edit requests. When false, the
   * customer can't request edits or cancellations for items under this policy.
   */
  public boolean getCanAcceptEdits() {
    return canAcceptEdits;
  }

  public void setCanAcceptEdits(boolean canAcceptEdits) {
    this.canAcceptEdits = canAcceptEdits;
  }

  /**
   * The cancellation window in minutes. Set to -1 to indicate a window until
   * fulfillment. When `canAcceptEdits` is false, this value is ignored as edit
   * requests aren't accepted.
   */
  public Integer getEditWindowMinutes() {
    return editWindowMinutes;
  }

  public void setEditWindowMinutes(Integer editWindowMinutes) {
    this.editWindowMinutes = editWindowMinutes;
  }

  @Override
  public String toString() {
    return "ReturnPoliciesEditRules{canAcceptEdits='" + canAcceptEdits + "', editWindowMinutes='" + editWindowMinutes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnPoliciesEditRules that = (ReturnPoliciesEditRules) o;
    return canAcceptEdits == that.canAcceptEdits &&
        Objects.equals(editWindowMinutes, that.editWindowMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAcceptEdits, editWindowMinutes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the policy accepts buyer-initiated edit requests. When false, the
     * customer can't request edits or cancellations for items under this policy.
     */
    private boolean canAcceptEdits;

    /**
     * The cancellation window in minutes. Set to -1 to indicate a window until
     * fulfillment. When `canAcceptEdits` is false, this value is ignored as edit
     * requests aren't accepted.
     */
    private Integer editWindowMinutes;

    public ReturnPoliciesEditRules build() {
      ReturnPoliciesEditRules result = new ReturnPoliciesEditRules();
      result.canAcceptEdits = this.canAcceptEdits;
      result.editWindowMinutes = this.editWindowMinutes;
      return result;
    }

    /**
     * Whether the policy accepts buyer-initiated edit requests. When false, the
     * customer can't request edits or cancellations for items under this policy.
     */
    public Builder canAcceptEdits(boolean canAcceptEdits) {
      this.canAcceptEdits = canAcceptEdits;
      return this;
    }

    /**
     * The cancellation window in minutes. Set to -1 to indicate a window until
     * fulfillment. When `canAcceptEdits` is false, this value is ignored as edit
     * requests aren't accepted.
     */
    public Builder editWindowMinutes(Integer editWindowMinutes) {
      this.editWindowMinutes = editWindowMinutes;
      return this;
    }
  }
}
