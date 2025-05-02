package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Collections.
 */
public class CollectionConnection {
  /**
   * A list of edges.
   */
  private List<CollectionEdge> edges;

  /**
   * A list of the nodes contained in CollectionEdge.
   */
  private List<Collection> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  /**
   * The total count of Collections.
   */
  private String totalCount;

  public CollectionConnection() {
  }

  /**
   * A list of edges.
   */
  public List<CollectionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CollectionEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in CollectionEdge.
   */
  public List<Collection> getNodes() {
    return nodes;
  }

  public void setNodes(List<Collection> nodes) {
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
   * The total count of Collections.
   */
  public String getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public String toString() {
    return "CollectionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "', totalCount='" + totalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionConnection that = (CollectionConnection) o;
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
    private List<CollectionEdge> edges;

    /**
     * A list of the nodes contained in CollectionEdge.
     */
    private List<Collection> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    /**
     * The total count of Collections.
     */
    private String totalCount;

    public CollectionConnection build() {
      CollectionConnection result = new CollectionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      result.totalCount = this.totalCount;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<CollectionEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in CollectionEdge.
     */
    public Builder nodes(List<Collection> nodes) {
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
     * The total count of Collections.
     */
    public Builder totalCount(String totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
