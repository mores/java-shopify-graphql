package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountAutomaticBxgyUpdate` mutation.
 */
public class DiscountAutomaticBxgyUpdatePayload {
  /**
   * The automatic discount that was updated.
   */
  private DiscountAutomaticNode automaticDiscountNode;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountAutomaticBxgyUpdatePayload() {
  }

  /**
   * The automatic discount that was updated.
   */
  public DiscountAutomaticNode getAutomaticDiscountNode() {
    return automaticDiscountNode;
  }

  public void setAutomaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
    this.automaticDiscountNode = automaticDiscountNode;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBxgyUpdatePayload{automaticDiscountNode='" + automaticDiscountNode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgyUpdatePayload that = (DiscountAutomaticBxgyUpdatePayload) o;
    return Objects.equals(automaticDiscountNode, that.automaticDiscountNode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticDiscountNode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The automatic discount that was updated.
     */
    private DiscountAutomaticNode automaticDiscountNode;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountAutomaticBxgyUpdatePayload build() {
      DiscountAutomaticBxgyUpdatePayload result = new DiscountAutomaticBxgyUpdatePayload();
      result.automaticDiscountNode = this.automaticDiscountNode;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The automatic discount that was updated.
     */
    public Builder automaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
      this.automaticDiscountNode = automaticDiscountNode;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
