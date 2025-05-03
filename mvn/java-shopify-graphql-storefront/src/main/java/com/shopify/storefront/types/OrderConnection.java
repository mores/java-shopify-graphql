package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Orders.
 */
public class OrderConnection {
  /**
   * A list of edges.
   */
  private List<OrderEdge> edges;

  /**
   * A list of the nodes contained in OrderEdge.
   */
  private List<Order> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  /**
   * The total count of Orders.
   */
  private String totalCount;

  public OrderConnection() {
  }

  /**
   * A list of edges.
   */
  public List<OrderEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<OrderEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in OrderEdge.
   */
  public List<Order> getNodes() {
    return nodes;
  }

  public void setNodes(List<Order> nodes) {
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
   * The total count of Orders.
   */
  public String getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public String toString() {
    return "OrderConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "', totalCount='" + totalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderConnection that = (OrderConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo, totalCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<OrderEdge> edges;

    /**
     * A list of the nodes contained in OrderEdge.
     */
    private List<Order> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    /**
     * The total count of Orders.
     */
    private String totalCount;

    public OrderConnection build() {
      OrderConnection result = new OrderConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      result.totalCount = this.totalCount;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<OrderEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in OrderEdge.
     */
    public Builder nodes(List<Order> nodes) {
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
     * The total count of Orders.
     */
    public Builder totalCount(String totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
