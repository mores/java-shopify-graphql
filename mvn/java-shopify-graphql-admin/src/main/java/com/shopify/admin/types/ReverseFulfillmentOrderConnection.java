package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple ReverseFulfillmentOrders.
 */
public class ReverseFulfillmentOrderConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<ReverseFulfillmentOrderEdge> edges;

  /**
   * A list of nodes that are contained in ReverseFulfillmentOrderEdge. You can
   * fetch data about an individual node, or you can follow the edges to fetch data
   * about a collection of related nodes. At each node, you specify the fields that
   * you want to retrieve.
   */
  private List<ReverseFulfillmentOrder> nodes;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  public ReverseFulfillmentOrderConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<ReverseFulfillmentOrderEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ReverseFulfillmentOrderEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of nodes that are contained in ReverseFulfillmentOrderEdge. You can
   * fetch data about an individual node, or you can follow the edges to fetch data
   * about a collection of related nodes. At each node, you specify the fields that
   * you want to retrieve.
   */
  public List<ReverseFulfillmentOrder> getNodes() {
    return nodes;
  }

  public void setNodes(List<ReverseFulfillmentOrder> nodes) {
    this.nodes = nodes;
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

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderConnection that = (ReverseFulfillmentOrderConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    private List<ReverseFulfillmentOrderEdge> edges;

    /**
     * A list of nodes that are contained in ReverseFulfillmentOrderEdge. You can
     * fetch data about an individual node, or you can follow the edges to fetch data
     * about a collection of related nodes. At each node, you specify the fields that
     * you want to retrieve.
     */
    private List<ReverseFulfillmentOrder> nodes;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    public ReverseFulfillmentOrderConnection build() {
      ReverseFulfillmentOrderConnection result = new ReverseFulfillmentOrderConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<ReverseFulfillmentOrderEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of nodes that are contained in ReverseFulfillmentOrderEdge. You can
     * fetch data about an individual node, or you can follow the edges to fetch data
     * about a collection of related nodes. At each node, you specify the fields that
     * you want to retrieve.
     */
    public Builder nodes(List<ReverseFulfillmentOrder> nodes) {
      this.nodes = nodes;
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
  }
}
