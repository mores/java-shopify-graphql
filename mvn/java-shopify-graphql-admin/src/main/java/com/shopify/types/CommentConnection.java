package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CommentConnection {
  
  private List<CommentEdge> edges;

  
  private List<Comment> nodes;

  
  private PageInfo pageInfo;

  public CommentConnection() {
  }

  
  public List<CommentEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CommentEdge> edges) {
    this.edges = edges;
  }

  
  public List<Comment> getNodes() {
    return nodes;
  }

  public void setNodes(List<Comment> nodes) {
    this.nodes = nodes;
  }

  
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
    
    private List<CommentEdge> edges;

    
    private List<Comment> nodes;

    
    private PageInfo pageInfo;

    public CommentConnection build() {
      CommentConnection result = new CommentConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<CommentEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<Comment> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
