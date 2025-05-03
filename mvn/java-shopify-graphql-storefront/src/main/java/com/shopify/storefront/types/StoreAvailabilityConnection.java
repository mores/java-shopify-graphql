package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple StoreAvailabilities.
 */
public class StoreAvailabilityConnection {
  /**
   * A list of edges.
   */
  private List<StoreAvailabilityEdge> edges;

  /**
   * A list of the nodes contained in StoreAvailabilityEdge.
   */
  private List<StoreAvailability> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public StoreAvailabilityConnection() {
  }

  /**
   * A list of edges.
   */
  public List<StoreAvailabilityEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<StoreAvailabilityEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in StoreAvailabilityEdge.
   */
  public List<StoreAvailability> getNodes() {
    return nodes;
  }

  public void setNodes(List<StoreAvailability> nodes) {
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
    return "StoreAvailabilityConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreAvailabilityConnection that = (StoreAvailabilityConnection) o;
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
    private List<StoreAvailabilityEdge> edges;

    /**
     * A list of the nodes contained in StoreAvailabilityEdge.
     */
    private List<StoreAvailability> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public StoreAvailabilityConnection build() {
      StoreAvailabilityConnection result = new StoreAvailabilityConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<StoreAvailabilityEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in StoreAvailabilityEdge.
     */
    public Builder nodes(List<StoreAvailability> nodes) {
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
