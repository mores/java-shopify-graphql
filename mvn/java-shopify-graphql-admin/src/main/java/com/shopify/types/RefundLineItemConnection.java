package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class RefundLineItemConnection {
  
  private List<RefundLineItemEdge> edges;

  
  private List<RefundLineItem> nodes;

  
  private PageInfo pageInfo;

  public RefundLineItemConnection() {
  }

  
  public List<RefundLineItemEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<RefundLineItemEdge> edges) {
    this.edges = edges;
  }

  
  public List<RefundLineItem> getNodes() {
    return nodes;
  }

  public void setNodes(List<RefundLineItem> nodes) {
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
    return "RefundLineItemConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundLineItemConnection that = (RefundLineItemConnection) o;
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
    
    private List<RefundLineItemEdge> edges;

    
    private List<RefundLineItem> nodes;

    
    private PageInfo pageInfo;

    public RefundLineItemConnection build() {
      RefundLineItemConnection result = new RefundLineItemConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<RefundLineItemEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<RefundLineItem> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
