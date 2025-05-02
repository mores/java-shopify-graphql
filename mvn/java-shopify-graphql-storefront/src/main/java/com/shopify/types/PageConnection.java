package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Pages.
 */
public class PageConnection {
  /**
   * A list of edges.
   */
  private List<PageEdge> edges;

  /**
   * A list of the nodes contained in PageEdge.
   */
  private List<Page> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public PageConnection() {
  }

  /**
   * A list of edges.
   */
  public List<PageEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<PageEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in PageEdge.
   */
  public List<Page> getNodes() {
    return nodes;
  }

  public void setNodes(List<Page> nodes) {
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
    return "PageConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageConnection that = (PageConnection) o;
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
    private List<PageEdge> edges;

    /**
     * A list of the nodes contained in PageEdge.
     */
    private List<Page> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public PageConnection build() {
      PageConnection result = new PageConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<PageEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in PageEdge.
     */
    public Builder nodes(List<Page> nodes) {
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
