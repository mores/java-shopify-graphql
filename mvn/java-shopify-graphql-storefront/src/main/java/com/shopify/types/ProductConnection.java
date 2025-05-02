package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Products.
 */
public class ProductConnection {
  /**
   * A list of edges.
   */
  private List<ProductEdge> edges;

  /**
   * A list of available filters.
   */
  private List<Filter> filters;

  /**
   * A list of the nodes contained in ProductEdge.
   */
  private List<Product> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public ProductConnection() {
  }

  /**
   * A list of edges.
   */
  public List<ProductEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ProductEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of available filters.
   */
  public List<Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }

  /**
   * A list of the nodes contained in ProductEdge.
   */
  public List<Product> getNodes() {
    return nodes;
  }

  public void setNodes(List<Product> nodes) {
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

  @Override
  public String toString() {
    return "ProductConnection{edges='" + edges + "', filters='" + filters + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductConnection that = (ProductConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(filters, that.filters) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, filters, nodes, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<ProductEdge> edges;

    /**
     * A list of available filters.
     */
    private List<Filter> filters;

    /**
     * A list of the nodes contained in ProductEdge.
     */
    private List<Product> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public ProductConnection build() {
      ProductConnection result = new ProductConnection();
      result.edges = this.edges;
      result.filters = this.filters;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<ProductEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of available filters.
     */
    public Builder filters(List<Filter> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * A list of the nodes contained in ProductEdge.
     */
    public Builder nodes(List<Product> nodes) {
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
  }
}
