package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Articles.
 */
public class ArticleConnection {
  /**
   * A list of edges.
   */
  private List<ArticleEdge> edges;

  /**
   * A list of the nodes contained in ArticleEdge.
   */
  private List<Article> nodes;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  public ArticleConnection() {
  }

  /**
   * A list of edges.
   */
  public List<ArticleEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ArticleEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of the nodes contained in ArticleEdge.
   */
  public List<Article> getNodes() {
    return nodes;
  }

  public void setNodes(List<Article> nodes) {
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
    return "ArticleConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleConnection that = (ArticleConnection) o;
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
    private List<ArticleEdge> edges;

    /**
     * A list of the nodes contained in ArticleEdge.
     */
    private List<Article> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public ArticleConnection build() {
      ArticleConnection result = new ArticleConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<ArticleEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of the nodes contained in ArticleEdge.
     */
    public Builder nodes(List<Article> nodes) {
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
