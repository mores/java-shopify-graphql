package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldDefinitionCreate` mutation.
 */
public class MetafieldDefinitionCreatePayload {
  /**
   * The metafield definition that was created.
   */
  private MetafieldDefinition createdDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDefinitionCreateUserError> userErrors;

  public MetafieldDefinitionCreatePayload() {
  }

  /**
   * The metafield definition that was created.
   */
  public MetafieldDefinition getCreatedDefinition() {
    return createdDefinition;
  }

  public void setCreatedDefinition(MetafieldDefinition createdDefinition) {
    this.createdDefinition = createdDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldDefinitionCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionCreatePayload{createdDefinition='" + createdDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionCreatePayload that = (MetafieldDefinitionCreatePayload) o;
    return Objects.equals(createdDefinition, that.createdDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition that was created.
     */
    private MetafieldDefinition createdDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDefinitionCreateUserError> userErrors;

    public MetafieldDefinitionCreatePayload build() {
      MetafieldDefinitionCreatePayload result = new MetafieldDefinitionCreatePayload();
      result.createdDefinition = this.createdDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The metafield definition that was created.
     */
    public Builder createdDefinition(MetafieldDefinition createdDefinition) {
      this.createdDefinition = createdDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDefinitionCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
