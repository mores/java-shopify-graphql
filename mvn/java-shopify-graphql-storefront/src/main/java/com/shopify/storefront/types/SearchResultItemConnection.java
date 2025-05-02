package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple SearchResultItems.
 */
public class SearchResultItemConnection {
  /**
   * A list of edges.
   */
  private List<SearchResultItemEdge> edges;

  /**
   * A list of the nodes contained in SearchResultItemEdge.
   */
  private List<SearchResultItem> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  /**
   * A list of available filters.
   */
  private List<Filter> productFilters;

  /**
   * The total number of results.
   */
  private int totalCount;

  public SearchResultItemConnection() {
  }

  /**
   * A list of edges.
   */
  public List<SearchResultItemEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<SearchResultItemEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in SearchResultItemEdge.
   */
  public List<SearchResultItem> getNodes() {
    return nodes;
  }

  public void setNodes(List<SearchResultItem> nodes) {
    this.nodes = nodes;
  }

  /**
   * Information to aid in pagination.
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * A list of available filters.
   */
  public List<Filter> getProductFilters() {
    return productFilters;
  }

  public void setProductFilters(List<Filter> productFilters) {
    this.productFilters = productFilters;
  }

  /**
   * The total number of results.
   */
  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public String toString() {
    return "SearchResultItemConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "', productFilters='" + productFilters + "', totalCount='" + totalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchResultItemConnection that = (SearchResultItemConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(productFilters, that.productFilters) &&
        totalCount == that.totalCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo, productFilters, totalCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<SearchResultItemEdge> edges;

    /**
     * A list of the nodes contained in SearchResultItemEdge.
     */
    private List<SearchResultItem> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    /**
     * A list of available filters.
     */
    private List<Filter> productFilters;

    /**
     * The total number of results.
     */
    private int totalCount;

    public SearchResultItemConnection build() {
      SearchResultItemConnection result = new SearchResultItemConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      result.productFilters = this.productFilters;
      result.totalCount = this.totalCount;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<SearchResultItemEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in SearchResultItemEdge.
     */
    public Builder nodes(List<SearchResultItem> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Information to aid in pagination.
     */
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    /**
     * A list of available filters.
     */
    public Builder productFilters(List<Filter> productFilters) {
      this.productFilters = productFilters;
      return this;
    }

    /**
     * The total number of results.
     */
    public Builder totalCount(int totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
