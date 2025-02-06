package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An auto-generated type for paginating through multiple OnlineStoreThemeFiles.
 */
public class OnlineStoreThemeFileConnection {
  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  private List<OnlineStoreThemeFileEdge> edges;

  /**
   * A list of nodes that are contained in OnlineStoreThemeFileEdge. You can fetch
   * data about an individual node, or you can follow the edges to fetch data about
   * a collection of related nodes. At each node, you specify the fields that you
   * want to retrieve.
   */
  private List<OnlineStoreThemeFile> nodes;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  /**
   * List of errors that occurred during the request.
   */
  private List<OnlineStoreThemeFileReadResult> userErrors;

  public OnlineStoreThemeFileConnection() {
  }

  /**
   * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
   */
  public List<OnlineStoreThemeFileEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<OnlineStoreThemeFileEdge> edges) {
    this.edges = edges;
  }

  /**
   * A list of nodes that are contained in OnlineStoreThemeFileEdge. You can fetch
   * data about an individual node, or you can follow the edges to fetch data about
   * a collection of related nodes. At each node, you specify the fields that you
   * want to retrieve.
   */
  public List<OnlineStoreThemeFile> getNodes() {
    return nodes;
  }

  public void setNodes(List<OnlineStoreThemeFile> nodes) {
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

  /**
   * List of errors that occurred during the request.
   */
  public List<OnlineStoreThemeFileReadResult> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OnlineStoreThemeFileReadResult> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileConnection that = (OnlineStoreThemeFileConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    private List<OnlineStoreThemeFileEdge> edges;

    /**
     * A list of nodes that are contained in OnlineStoreThemeFileEdge. You can fetch
     * data about an individual node, or you can follow the edges to fetch data about
     * a collection of related nodes. At each node, you specify the fields that you
     * want to retrieve.
     */
    private List<OnlineStoreThemeFile> nodes;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    /**
     * List of errors that occurred during the request.
     */
    private List<OnlineStoreThemeFileReadResult> userErrors;

    public OnlineStoreThemeFileConnection build() {
      OnlineStoreThemeFileConnection result = new OnlineStoreThemeFileConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor and the node.
     */
    public Builder edges(List<OnlineStoreThemeFileEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * A list of nodes that are contained in OnlineStoreThemeFileEdge. You can fetch
     * data about an individual node, or you can follow the edges to fetch data about
     * a collection of related nodes. At each node, you specify the fields that you
     * want to retrieve.
     */
    public Builder nodes(List<OnlineStoreThemeFile> nodes) {
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

    /**
     * List of errors that occurred during the request.
     */
    public Builder userErrors(List<OnlineStoreThemeFileReadResult> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
