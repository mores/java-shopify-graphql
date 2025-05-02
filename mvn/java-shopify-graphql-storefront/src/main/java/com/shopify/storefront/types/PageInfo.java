package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Returns information about pagination in a connection, in accordance with the
 * [Relay specification](https://relay.dev/graphql/connections.htm#sec-undefined.PageInfo).
 * For more information, please read our [GraphQL Pagination Usage Guide](https://shopify.dev/api/usage/pagination-graphql).
 */
public class PageInfo {
  /**
   * The cursor corresponding to the last node in edges.
   */
  private String endCursor;

  /**
   * Whether there are more pages to fetch following the current page.
   */
  private boolean hasNextPage;

  /**
   * Whether there are any pages prior to the current page.
   */
  private boolean hasPreviousPage;

  /**
   * The cursor corresponding to the first node in edges.
   */
  private String startCursor;

  public PageInfo() {
  }

  /**
   * The cursor corresponding to the last node in edges.
   */
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  /**
   * Whether there are more pages to fetch following the current page.
   */
  public boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  /**
   * Whether there are any pages prior to the current page.
   */
  public boolean getHasPreviousPage() {
    return hasPreviousPage;
  }

  public void setHasPreviousPage(boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  /**
   * The cursor corresponding to the first node in edges.
   */
  public String getStartCursor() {
    return startCursor;
  }

  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }

  @Override
  public String toString() {
    return "PageInfo{endCursor='" + endCursor + "', hasNextPage='" + hasNextPage + "', hasPreviousPage='" + hasPreviousPage + "', startCursor='" + startCursor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageInfo that = (PageInfo) o;
    return Objects.equals(endCursor, that.endCursor) &&
        hasNextPage == that.hasNextPage &&
        hasPreviousPage == that.hasPreviousPage &&
        Objects.equals(startCursor, that.startCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, hasNextPage, hasPreviousPage, startCursor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cursor corresponding to the last node in edges.
     */
    private String endCursor;

    /**
     * Whether there are more pages to fetch following the current page.
     */
    private boolean hasNextPage;

    /**
     * Whether there are any pages prior to the current page.
     */
    private boolean hasPreviousPage;

    /**
     * The cursor corresponding to the first node in edges.
     */
    private String startCursor;

    public PageInfo build() {
      PageInfo result = new PageInfo();
      result.endCursor = this.endCursor;
      result.hasNextPage = this.hasNextPage;
      result.hasPreviousPage = this.hasPreviousPage;
      result.startCursor = this.startCursor;
      return result;
    }

    /**
     * The cursor corresponding to the last node in edges.
     */
    public Builder endCursor(String endCursor) {
      this.endCursor = endCursor;
      return this;
    }

    /**
     * Whether there are more pages to fetch following the current page.
     */
    public Builder hasNextPage(boolean hasNextPage) {
      this.hasNextPage = hasNextPage;
      return this;
    }

    /**
     * Whether there are any pages prior to the current page.
     */
    public Builder hasPreviousPage(boolean hasPreviousPage) {
      this.hasPreviousPage = hasPreviousPage;
      return this;
    }

    /**
     * The cursor corresponding to the first node in edges.
     */
    public Builder startCursor(String startCursor) {
      this.startCursor = startCursor;
      return this;
    }
  }
}
