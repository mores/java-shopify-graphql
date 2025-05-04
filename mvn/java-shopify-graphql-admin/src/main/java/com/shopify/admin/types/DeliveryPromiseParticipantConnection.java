package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple DeliveryPromiseParticipants.
 */
public class DeliveryPromiseParticipantConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<DeliveryPromiseParticipantEdge> edges;

  /**
   * A list of nodes that are contained in DeliveryPromiseParticipantEdge. You can
   * fetch data about an individual node, or you can follow the edges to fetch data
   * about a collection of related nodes. At each node, you specify the fields that
   * you want to retrieve.
   */
  private List<DeliveryPromiseParticipant> nodes;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  public DeliveryPromiseParticipantConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<DeliveryPromiseParticipantEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<DeliveryPromiseParticipantEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of nodes that are contained in DeliveryPromiseParticipantEdge. You can
   * fetch data about an individual node, or you can follow the edges to fetch data
   * about a collection of related nodes. At each node, you specify the fields that
   * you want to retrieve.
   */
  public List<DeliveryPromiseParticipant> getNodes() {
    return nodes;
  }

  public void setNodes(List<DeliveryPromiseParticipant> nodes) {
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
    return "DeliveryPromiseParticipantConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseParticipantConnection that = (DeliveryPromiseParticipantConnection) o;
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
    private List<DeliveryPromiseParticipantEdge> edges;

    /**
     * A list of nodes that are contained in DeliveryPromiseParticipantEdge. You can
     * fetch data about an individual node, or you can follow the edges to fetch data
     * about a collection of related nodes. At each node, you specify the fields that
     * you want to retrieve.
     */
    private List<DeliveryPromiseParticipant> nodes;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    public DeliveryPromiseParticipantConnection build() {
      DeliveryPromiseParticipantConnection result = new DeliveryPromiseParticipantConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<DeliveryPromiseParticipantEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of nodes that are contained in DeliveryPromiseParticipantEdge. You can
     * fetch data about an individual node, or you can follow the edges to fetch data
     * about a collection of related nodes. At each node, you specify the fields that
     * you want to retrieve.
     */
    public Builder nodes(List<DeliveryPromiseParticipant> nodes) {
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
