package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TagsAddPayload {
  
  private Node node;

  
  private List<UserError> userErrors;

  public TagsAddPayload() {
  }

  
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "TagsAddPayload{node='" + node + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagsAddPayload that = (TagsAddPayload) o;
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
    
    private Node node;

    
    private List<UserError> userErrors;

    public TagsAddPayload build() {
      TagsAddPayload result = new TagsAddPayload();
      result.node = this.node;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder node(Node node) {
      this.node = node;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
