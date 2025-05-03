package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Comments.
 */
public class CommentConnection {
  /**
   * A list of edges.
   */
  private List<CommentEdge> edges;

  /**
   * A list of the nodes contained in CommentEdge.
   */
  private List<Comment> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public CommentConnection() {
  }

  /**
   * A list of edges.
   */
  public List<CommentEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CommentEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in CommentEdge.
   */
  public List<Comment> getNodes() {
    return nodes;
  }

  public void setNodes(List<Comment> nodes) {
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
    return "CommentConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentConnection that = (CommentConnection) o;
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
    private List<CommentEdge> edges;

    /**
     * A list of the nodes contained in CommentEdge.
     */
    private List<Comment> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public CommentConnection build() {
      CommentConnection result = new CommentConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<CommentEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in CommentEdge.
     */
    public Builder nodes(List<Comment> nodes) {
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
