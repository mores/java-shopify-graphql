package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `scriptTagDelete` mutation.
 */
public class ScriptTagDeletePayload {
  /**
   * The ID of the deleted script tag.
   */
  private String deletedScriptTagId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ScriptTagDeletePayload() {
  }

  /**
   * The ID of the deleted script tag.
   */
  public String getDeletedScriptTagId() {
    return deletedScriptTagId;
  }

  public void setDeletedScriptTagId(String deletedScriptTagId) {
    this.deletedScriptTagId = deletedScriptTagId;
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
    return "ScriptTagDeletePayload{deletedScriptTagId='" + deletedScriptTagId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagDeletePayload that = (ScriptTagDeletePayload) o;
    return Objects.equals(deletedScriptTagId, that.deletedScriptTagId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedScriptTagId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted script tag.
     */
    private String deletedScriptTagId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ScriptTagDeletePayload build() {
      ScriptTagDeletePayload result = new ScriptTagDeletePayload();
      result.deletedScriptTagId = this.deletedScriptTagId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted script tag.
     */
    public Builder deletedScriptTagId(String deletedScriptTagId) {
      this.deletedScriptTagId = deletedScriptTagId;
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
