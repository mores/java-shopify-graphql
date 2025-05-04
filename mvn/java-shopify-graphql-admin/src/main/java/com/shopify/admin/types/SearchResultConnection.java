package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The connection type for SearchResult.
 */
public class SearchResultConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<SearchResultEdge> edges;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private int resultsAfterCount;

  public SearchResultConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<SearchResultEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<SearchResultEdge> edges) {
    this.edges = edges;
  }

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  public int getResultsAfterCount() {
    return resultsAfterCount;
  }

  public void setResultsAfterCount(int resultsAfterCount) {
    this.resultsAfterCount = resultsAfterCount;
  }

  @Override
  public String toString() {
    return "SearchResultConnection{edges='" + edges + "', pageInfo='" + pageInfo + "', resultsAfterCount='" + resultsAfterCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchResultConnection that = (SearchResultConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        resultsAfterCount == that.resultsAfterCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, pageInfo, resultsAfterCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    private List<SearchResultEdge> edges;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private int resultsAfterCount;

    public SearchResultConnection build() {
      SearchResultConnection result = new SearchResultConnection();
      result.edges = this.edges;
      result.pageInfo = this.pageInfo;
      result.resultsAfterCount = this.resultsAfterCount;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<SearchResultEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    public Builder resultsAfterCount(int resultsAfterCount) {
      this.resultsAfterCount = resultsAfterCount;
      return this;
    }
  }
}
