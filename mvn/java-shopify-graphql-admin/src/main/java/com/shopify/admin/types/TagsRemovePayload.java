package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `tagsRemove` mutation.
 */
public class TagsRemovePayload {
  /**
   * The object that was updated.
   */
  private Node node;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public TagsRemovePayload() {
  }

  /**
   * The object that was updated.
   */
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
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
    return "TagsRemovePayload{node='" + node + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagsRemovePayload that = (TagsRemovePayload) o;
    return Objects.equals(node, that.node) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The object that was updated.
     */
    private Node node;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public TagsRemovePayload build() {
      TagsRemovePayload result = new TagsRemovePayload();
      result.node = this.node;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The object that was updated.
     */
    public Builder node(Node node) {
      this.node = node;
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
