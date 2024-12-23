package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metaobjectDefinitionUpdate` mutation.
 */
public class MetaobjectDefinitionUpdatePayload {
  /**
   * The updated metaobject definition.
   */
  private MetaobjectDefinition metaobjectDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetaobjectUserError> userErrors;

  public MetaobjectDefinitionUpdatePayload() {
  }

  /**
   * The updated metaobject definition.
   */
  public MetaobjectDefinition getMetaobjectDefinition() {
    return metaobjectDefinition;
  }

  public void setMetaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
    this.metaobjectDefinition = metaobjectDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetaobjectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetaobjectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionUpdatePayload{metaobjectDefinition='" + metaobjectDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionUpdatePayload that = (MetaobjectDefinitionUpdatePayload) o;
    return Objects.equals(metaobjectDefinition, that.metaobjectDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaobjectDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated metaobject definition.
     */
    private MetaobjectDefinition metaobjectDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetaobjectUserError> userErrors;

    public MetaobjectDefinitionUpdatePayload build() {
      MetaobjectDefinitionUpdatePayload result = new MetaobjectDefinitionUpdatePayload();
      result.metaobjectDefinition = this.metaobjectDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated metaobject definition.
     */
    public Builder metaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
      this.metaobjectDefinition = metaobjectDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetaobjectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
