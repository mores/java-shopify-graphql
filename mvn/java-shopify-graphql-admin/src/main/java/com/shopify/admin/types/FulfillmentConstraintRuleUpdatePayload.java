package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentConstraintRuleUpdate` mutation.
 */
public class FulfillmentConstraintRuleUpdatePayload {
  /**
   * The updated fulfillment constraint rule.
   */
  private FulfillmentConstraintRule fulfillmentConstraintRule;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentConstraintRuleUpdateUserError> userErrors;

  public FulfillmentConstraintRuleUpdatePayload() {
  }

  /**
   * The updated fulfillment constraint rule.
   */
  public FulfillmentConstraintRule getFulfillmentConstraintRule() {
    return fulfillmentConstraintRule;
  }

  public void setFulfillmentConstraintRule(FulfillmentConstraintRule fulfillmentConstraintRule) {
    this.fulfillmentConstraintRule = fulfillmentConstraintRule;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentConstraintRuleUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentConstraintRuleUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentConstraintRuleUpdatePayload{fulfillmentConstraintRule='" + fulfillmentConstraintRule + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentConstraintRuleUpdatePayload that = (FulfillmentConstraintRuleUpdatePayload) o;
    return Objects.equals(fulfillmentConstraintRule, that.fulfillmentConstraintRule) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentConstraintRule, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated fulfillment constraint rule.
     */
    private FulfillmentConstraintRule fulfillmentConstraintRule;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentConstraintRuleUpdateUserError> userErrors;

    public FulfillmentConstraintRuleUpdatePayload build() {
      FulfillmentConstraintRuleUpdatePayload result = new FulfillmentConstraintRuleUpdatePayload();
      result.fulfillmentConstraintRule = this.fulfillmentConstraintRule;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated fulfillment constraint rule.
     */
    public Builder fulfillmentConstraintRule(FulfillmentConstraintRule fulfillmentConstraintRule) {
      this.fulfillmentConstraintRule = fulfillmentConstraintRule;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentConstraintRuleUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
