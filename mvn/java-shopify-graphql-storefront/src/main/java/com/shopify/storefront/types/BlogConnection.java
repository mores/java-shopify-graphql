package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Blogs.
 */
public class BlogConnection {
  /**
   * A list of edges.
   */
  private List<BlogEdge> edges;

  /**
   * A list of the nodes contained in BlogEdge.
   */
  private List<Blog> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public BlogConnection() {
  }

  /**
   * A list of edges.
   */
  public List<BlogEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<BlogEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in BlogEdge.
   */
  public List<Blog> getNodes() {
    return nodes;
  }

  public void setNodes(List<Blog> nodes) {
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
    return "BlogConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogConnection that = (BlogConnection) o;
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
    private List<BlogEdge> edges;

    /**
     * A list of the nodes contained in BlogEdge.
     */
    private List<Blog> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public BlogConnection build() {
      BlogConnection result = new BlogConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<BlogEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in BlogEdge.
     */
    public Builder nodes(List<Blog> nodes) {
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
