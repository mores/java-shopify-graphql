package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldDefinitionPin` mutation.
 */
public class MetafieldDefinitionPinPayload {
  /**
   * The metafield definition that was pinned.
   */
  private MetafieldDefinition pinnedDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDefinitionPinUserError> userErrors;

  public MetafieldDefinitionPinPayload() {
  }

  /**
   * The metafield definition that was pinned.
   */
  public MetafieldDefinition getPinnedDefinition() {
    return pinnedDefinition;
  }

  public void setPinnedDefinition(MetafieldDefinition pinnedDefinition) {
    this.pinnedDefinition = pinnedDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldDefinitionPinUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionPinUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionPinPayload{pinnedDefinition='" + pinnedDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionPinPayload that = (MetafieldDefinitionPinPayload) o;
    return Objects.equals(pinnedDefinition, that.pinnedDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition that was pinned.
     */
    private MetafieldDefinition pinnedDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDefinitionPinUserError> userErrors;

    public MetafieldDefinitionPinPayload build() {
      MetafieldDefinitionPinPayload result = new MetafieldDefinitionPinPayload();
      result.pinnedDefinition = this.pinnedDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The metafield definition that was pinned.
     */
    public Builder pinnedDefinition(MetafieldDefinition pinnedDefinition) {
      this.pinnedDefinition = pinnedDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDefinitionPinUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
