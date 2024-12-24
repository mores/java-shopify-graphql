package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopifyPaymentsBankAccountConnection {
  
  private List<ShopifyPaymentsBankAccountEdge> edges;

  
  private List<ShopifyPaymentsBankAccount> nodes;

  
  private PageInfo pageInfo;

  public ShopifyPaymentsBankAccountConnection() {
  }

  
  public List<ShopifyPaymentsBankAccountEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ShopifyPaymentsBankAccountEdge> edges) {
    this.edges = edges;
  }

  
  public List<ShopifyPaymentsBankAccount> getNodes() {
    return nodes;
  }

  public void setNodes(List<ShopifyPaymentsBankAccount> nodes) {
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
    return "ShopifyPaymentsBankAccountConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsBankAccountConnection that = (ShopifyPaymentsBankAccountConnection) o;
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
    
    private List<ShopifyPaymentsBankAccountEdge> edges;

    
    private List<ShopifyPaymentsBankAccount> nodes;

    
    private PageInfo pageInfo;

    public ShopifyPaymentsBankAccountConnection build() {
      ShopifyPaymentsBankAccountConnection result = new ShopifyPaymentsBankAccountConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<ShopifyPaymentsBankAccountEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<ShopifyPaymentsBankAccount> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
