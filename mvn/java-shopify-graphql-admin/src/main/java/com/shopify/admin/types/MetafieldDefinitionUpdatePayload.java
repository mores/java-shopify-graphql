package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldDefinitionUpdate` mutation.
 */
public class MetafieldDefinitionUpdatePayload {
  /**
   * The metafield definition that was updated.
   */
  private MetafieldDefinition updatedDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDefinitionUpdateUserError> userErrors;

  /**
   * The asynchronous job updating the metafield definition's validation_status.
   */
  private Job validationJob;

  public MetafieldDefinitionUpdatePayload() {
  }

  /**
   * The metafield definition that was updated.
   */
  public MetafieldDefinition getUpdatedDefinition() {
    return updatedDefinition;
  }

  public void setUpdatedDefinition(MetafieldDefinition updatedDefinition) {
    this.updatedDefinition = updatedDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldDefinitionUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * The asynchronous job updating the metafield definition's validation_status.
   */
  public Job getValidationJob() {
    return validationJob;
  }

  public void setValidationJob(Job validationJob) {
    this.validationJob = validationJob;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionUpdatePayload{updatedDefinition='" + updatedDefinition + "', userErrors='" + userErrors + "', validationJob='" + validationJob + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionUpdatePayload that = (MetafieldDefinitionUpdatePayload) o;
    return Objects.equals(updatedDefinition, that.updatedDefinition) &&
        Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(validationJob, that.validationJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedDefinition, userErrors, validationJob);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition that was updated.
     */
    private MetafieldDefinition updatedDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDefinitionUpdateUserError> userErrors;

    /**
     * The asynchronous job updating the metafield definition's validation_status.
     */
    private Job validationJob;

    public MetafieldDefinitionUpdatePayload build() {
      MetafieldDefinitionUpdatePayload result = new MetafieldDefinitionUpdatePayload();
      result.updatedDefinition = this.updatedDefinition;
      result.userErrors = this.userErrors;
      result.validationJob = this.validationJob;
      return result;
    }

    /**
     * The metafield definition that was updated.
     */
    public Builder updatedDefinition(MetafieldDefinition updatedDefinition) {
      this.updatedDefinition = updatedDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDefinitionUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * The asynchronous job updating the metafield definition's validation_status.
     */
    public Builder validationJob(Job validationJob) {
      this.validationJob = validationJob;
      return this;
    }
  }
}
