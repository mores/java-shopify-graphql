package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one SearchResultItem and a cursor during pagination.
 */
public class SearchResultItemEdge {
  /**
   * A cursor for use in pagination.
   */
  private String cursor;

  /**
   * The item at the end of SearchResultItemEdge.
   */
  private SearchResultItem node;

  public SearchResultItemEdge() {
  }

  /**
   * A cursor for use in pagination.
   */
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  /**
   * The item at the end of SearchResultItemEdge.
   */
  public SearchResultItem getNode() {
    return node;
  }

  public void setNode(SearchResultItem node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "SearchResultItemEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchResultItemEdge that = (SearchResultItemEdge) o;
    return Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, node);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A cursor for use in pagination.
     */
    private String cursor;

    /**
     * The item at the end of SearchResultItemEdge.
     */
    private SearchResultItem node;

    public SearchResultItemEdge build() {
      SearchResultItemEdge result = new SearchResultItemEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    /**
     * A cursor for use in pagination.
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of SearchResultItemEdge.
     */
    public Builder node(SearchResultItem node) {
      this.node = node;
      return this;
    }
  }
}
