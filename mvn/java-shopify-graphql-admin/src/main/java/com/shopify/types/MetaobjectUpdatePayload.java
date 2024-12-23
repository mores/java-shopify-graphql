package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metaobjectUpdate` mutation.
 */
public class MetaobjectUpdatePayload {
  /**
   * The updated metaobject.
   */
  private Metaobject metaobject;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetaobjectUserError> userErrors;

  public MetaobjectUpdatePayload() {
  }

  /**
   * The updated metaobject.
   */
  public Metaobject getMetaobject() {
    return metaobject;
  }

  public void setMetaobject(Metaobject metaobject) {
    this.metaobject = metaobject;
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
    return "MetaobjectUpdatePayload{metaobject='" + metaobject + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUpdatePayload that = (MetaobjectUpdatePayload) o;
    return Objects.equals(metaobject, that.metaobject) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaobject, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated metaobject.
     */
    private Metaobject metaobject;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetaobjectUserError> userErrors;

    public MetaobjectUpdatePayload build() {
      MetaobjectUpdatePayload result = new MetaobjectUpdatePayload();
      result.metaobject = this.metaobject;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated metaobject.
     */
    public Builder metaobject(Metaobject metaobject) {
      this.metaobject = metaobject;
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
