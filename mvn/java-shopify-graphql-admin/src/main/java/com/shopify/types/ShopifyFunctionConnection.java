package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopifyFunctionConnection {
  
  private List<ShopifyFunctionEdge> edges;

  
  private List<ShopifyFunction> nodes;

  
  private PageInfo pageInfo;

  public ShopifyFunctionConnection() {
  }

  
  public List<ShopifyFunctionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ShopifyFunctionEdge> edges) {
    this.edges = edges;
  }

  
  public List<ShopifyFunction> getNodes() {
    return nodes;
  }

  public void setNodes(List<ShopifyFunction> nodes) {
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
    return "ShopifyFunctionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyFunctionConnection that = (ShopifyFunctionConnection) o;
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
    
    private List<ShopifyFunctionEdge> edges;

    
    private List<ShopifyFunction> nodes;

    
    private PageInfo pageInfo;

    public ShopifyFunctionConnection build() {
      ShopifyFunctionConnection result = new ShopifyFunctionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<ShopifyFunctionEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<ShopifyFunction> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
