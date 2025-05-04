package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `consentPolicyUpdate` mutation.
 */
public class ConsentPolicyUpdatePayload {
  /**
   * All updated and created consent policies. The consent policies that haven't
   * been modified as part of the mutation aren't returned.
   */
  private List<ConsentPolicy> updatedPolicies;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ConsentPolicyError> userErrors;

  public ConsentPolicyUpdatePayload() {
  }

  /**
   * All updated and created consent policies. The consent policies that haven't
   * been modified as part of the mutation aren't returned.
   */
  public List<ConsentPolicy> getUpdatedPolicies() {
    return updatedPolicies;
  }

  public void setUpdatedPolicies(List<ConsentPolicy> updatedPolicies) {
    this.updatedPolicies = updatedPolicies;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ConsentPolicyError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ConsentPolicyError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ConsentPolicyUpdatePayload{updatedPolicies='" + updatedPolicies + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsentPolicyUpdatePayload that = (ConsentPolicyUpdatePayload) o;
    return Objects.equals(updatedPolicies, that.updatedPolicies) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedPolicies, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * All updated and created consent policies. The consent policies that haven't
     * been modified as part of the mutation aren't returned.
     */
    private List<ConsentPolicy> updatedPolicies;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ConsentPolicyError> userErrors;

    public ConsentPolicyUpdatePayload build() {
      ConsentPolicyUpdatePayload result = new ConsentPolicyUpdatePayload();
      result.updatedPolicies = this.updatedPolicies;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * All updated and created consent policies. The consent policies that haven't
     * been modified as part of the mutation aren't returned.
     */
    public Builder updatedPolicies(List<ConsentPolicy> updatedPolicies) {
      this.updatedPolicies = updatedPolicies;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ConsentPolicyError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
