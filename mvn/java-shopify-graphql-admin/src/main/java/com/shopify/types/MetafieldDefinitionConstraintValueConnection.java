package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple MetafieldDefinitionConstraintValues.
 */
public class MetafieldDefinitionConstraintValueConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<MetafieldDefinitionConstraintValueEdge> edges;

  /**
   * A list of nodes that are contained in MetafieldDefinitionConstraintValueEdge.
   * You can fetch data about an individual node, or you can follow the edges to
   * fetch data about a collection of related nodes. At each node, you specify the
   * fields that you want to retrieve.
   */
  private List<MetafieldDefinitionConstraintValue> nodes;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  public MetafieldDefinitionConstraintValueConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<MetafieldDefinitionConstraintValueEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MetafieldDefinitionConstraintValueEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of nodes that are contained in MetafieldDefinitionConstraintValueEdge.
   * You can fetch data about an individual node, or you can follow the edges to
   * fetch data about a collection of related nodes. At each node, you specify the
   * fields that you want to retrieve.
   */
  public List<MetafieldDefinitionConstraintValue> getNodes() {
    return nodes;
  }

  public void setNodes(List<MetafieldDefinitionConstraintValue> nodes) {
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
    return "MetafieldDefinitionConstraintValueConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintValueConnection that = (MetafieldDefinitionConstraintValueConnection) o;
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
    private List<MetafieldDefinitionConstraintValueEdge> edges;

    /**
     * A list of nodes that are contained in MetafieldDefinitionConstraintValueEdge.
     * You can fetch data about an individual node, or you can follow the edges to
     * fetch data about a collection of related nodes. At each node, you specify the
     * fields that you want to retrieve.
     */
    private List<MetafieldDefinitionConstraintValue> nodes;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    public MetafieldDefinitionConstraintValueConnection build() {
      MetafieldDefinitionConstraintValueConnection result = new MetafieldDefinitionConstraintValueConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<MetafieldDefinitionConstraintValueEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of nodes that are contained in MetafieldDefinitionConstraintValueEdge.
     * You can fetch data about an individual node, or you can follow the edges to
     * fetch data about a collection of related nodes. At each node, you specify the
     * fields that you want to retrieve.
     */
    public Builder nodes(List<MetafieldDefinitionConstraintValue> nodes) {
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
