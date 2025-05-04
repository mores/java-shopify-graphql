package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple Images.
 */
public class ImageConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<ImageEdge> edges;

  /**
   * A list of nodes that are contained in ImageEdge. You can fetch data about an
   * individual node, or you can follow the edges to fetch data about a collection
   * of related nodes. At each node, you specify the fields that you want to retrieve.
   */
  private List<Image> nodes;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  public ImageConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<ImageEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ImageEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of nodes that are contained in ImageEdge. You can fetch data about an
   * individual node, or you can follow the edges to fetch data about a collection
   * of related nodes. At each node, you specify the fields that you want to retrieve.
   */
  public List<Image> getNodes() {
    return nodes;
  }

  public void setNodes(List<Image> nodes) {
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
    return "ImageConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageConnection that = (ImageConnection) o;
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
    private List<ImageEdge> edges;

    /**
     * A list of nodes that are contained in ImageEdge. You can fetch data about an
     * individual node, or you can follow the edges to fetch data about a collection
     * of related nodes. At each node, you specify the fields that you want to retrieve.
     */
    private List<Image> nodes;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    public ImageConnection build() {
      ImageConnection result = new ImageConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<ImageEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of nodes that are contained in ImageEdge. You can fetch data about an
     * individual node, or you can follow the edges to fetch data about a collection
     * of related nodes. At each node, you specify the fields that you want to retrieve.
     */
    public Builder nodes(List<Image> nodes) {
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
