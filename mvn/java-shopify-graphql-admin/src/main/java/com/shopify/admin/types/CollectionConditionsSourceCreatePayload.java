package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionConditionsSourceCreate` mutation.
 */
public class CollectionConditionsSourceCreatePayload {
  /**
   * The created collection source.
   */
  private CollectionConditionsSource source;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CollectionConditionsSourceCreatePayload() {
  }

  /**
   * The created collection source.
   */
  public CollectionConditionsSource getSource() {
    return source;
  }

  public void setSource(CollectionConditionsSource source) {
    this.source = source;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionConditionsSourceCreatePayload{source='" + source + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionConditionsSourceCreatePayload that = (CollectionConditionsSourceCreatePayload) o;
    return Objects.equals(source, that.source) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created collection source.
     */
    private CollectionConditionsSource source;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CollectionConditionsSourceCreatePayload build() {
      CollectionConditionsSourceCreatePayload result = new CollectionConditionsSourceCreatePayload();
      result.source = this.source;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created collection source.
     */
    public Builder source(CollectionConditionsSource source) {
      this.source = source;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
