package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldDefinitionDelete` mutation.
 */
public class MetafieldDefinitionDeletePayload {
  /**
   * The metafield definition that was deleted.
   */
  private MetafieldDefinitionIdentifier deletedDefinition;

  /**
   * The ID of the deleted metafield definition.
   */
  private String deletedDefinitionId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDefinitionDeleteUserError> userErrors;

  public MetafieldDefinitionDeletePayload() {
  }

  /**
   * The metafield definition that was deleted.
   */
  public MetafieldDefinitionIdentifier getDeletedDefinition() {
    return deletedDefinition;
  }

  public void setDeletedDefinition(MetafieldDefinitionIdentifier deletedDefinition) {
    this.deletedDefinition = deletedDefinition;
  }

  /**
   * The ID of the deleted metafield definition.
   */
  public String getDeletedDefinitionId() {
    return deletedDefinitionId;
  }

  public void setDeletedDefinitionId(String deletedDefinitionId) {
    this.deletedDefinitionId = deletedDefinitionId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldDefinitionDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionDeletePayload{deletedDefinition='" + deletedDefinition + "', deletedDefinitionId='" + deletedDefinitionId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionDeletePayload that = (MetafieldDefinitionDeletePayload) o;
    return Objects.equals(deletedDefinition, that.deletedDefinition) &&
        Objects.equals(deletedDefinitionId, that.deletedDefinitionId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDefinition, deletedDefinitionId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition that was deleted.
     */
    private MetafieldDefinitionIdentifier deletedDefinition;

    /**
     * The ID of the deleted metafield definition.
     */
    private String deletedDefinitionId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDefinitionDeleteUserError> userErrors;

    public MetafieldDefinitionDeletePayload build() {
      MetafieldDefinitionDeletePayload result = new MetafieldDefinitionDeletePayload();
      result.deletedDefinition = this.deletedDefinition;
      result.deletedDefinitionId = this.deletedDefinitionId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The metafield definition that was deleted.
     */
    public Builder deletedDefinition(MetafieldDefinitionIdentifier deletedDefinition) {
      this.deletedDefinition = deletedDefinition;
      return this;
    }

    /**
     * The ID of the deleted metafield definition.
     */
    public Builder deletedDefinitionId(String deletedDefinitionId) {
      this.deletedDefinitionId = deletedDefinitionId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDefinitionDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
