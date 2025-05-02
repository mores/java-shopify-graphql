package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple MetafieldReferences.
 */
public class MetafieldReferenceConnection {
  /**
   * A list of edges.
   */
  private List<MetafieldReferenceEdge> edges;

  /**
   * A list of the nodes contained in MetafieldReferenceEdge.
   */
  private List<MetafieldReference> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public MetafieldReferenceConnection() {
  }

  /**
   * A list of edges.
   */
  public List<MetafieldReferenceEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MetafieldReferenceEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in MetafieldReferenceEdge.
   */
  public List<MetafieldReference> getNodes() {
    return nodes;
  }

  public void setNodes(List<MetafieldReference> nodes) {
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
    return "MetafieldReferenceConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldReferenceConnection that = (MetafieldReferenceConnection) o;
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
     * A list of edges.
     */
    private List<MetafieldReferenceEdge> edges;

    /**
     * A list of the nodes contained in MetafieldReferenceEdge.
     */
    private List<MetafieldReference> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public MetafieldReferenceConnection build() {
      MetafieldReferenceConnection result = new MetafieldReferenceConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<MetafieldReferenceEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in MetafieldReferenceEdge.
     */
    public Builder nodes(List<MetafieldReference> nodes) {
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
