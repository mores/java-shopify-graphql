package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `standardMetaobjectDefinitionEnable` mutation.
 */
public class StandardMetaobjectDefinitionEnablePayload {
  /**
   * The metaobject definition that was enabled using the standard template.
   */
  private MetaobjectDefinition metaobjectDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetaobjectUserError> userErrors;

  public StandardMetaobjectDefinitionEnablePayload() {
  }

  /**
   * The metaobject definition that was enabled using the standard template.
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
    return "StandardMetaobjectDefinitionEnablePayload{metaobjectDefinition='" + metaobjectDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetaobjectDefinitionEnablePayload that = (StandardMetaobjectDefinitionEnablePayload) o;
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
     * The metaobject definition that was enabled using the standard template.
     */
    private MetaobjectDefinition metaobjectDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetaobjectUserError> userErrors;

    public StandardMetaobjectDefinitionEnablePayload build() {
      StandardMetaobjectDefinitionEnablePayload result = new StandardMetaobjectDefinitionEnablePayload();
      result.metaobjectDefinition = this.metaobjectDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The metaobject definition that was enabled using the standard template.
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
