package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class GiftCardTransactionConnection {
  
  private List<GiftCardTransactionEdge> edges;

  
  private List<GiftCardTransaction> nodes;

  
  private PageInfo pageInfo;

  public GiftCardTransactionConnection() {
  }

  
  public List<GiftCardTransactionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<GiftCardTransactionEdge> edges) {
    this.edges = edges;
  }

  
  public List<GiftCardTransaction> getNodes() {
    return nodes;
  }

  public void setNodes(List<GiftCardTransaction> nodes) {
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
    return "GiftCardTransactionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardTransactionConnection that = (GiftCardTransactionConnection) o;
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
    
    private List<GiftCardTransactionEdge> edges;

    
    private List<GiftCardTransaction> nodes;

    
    private PageInfo pageInfo;

    public GiftCardTransactionConnection build() {
      GiftCardTransactionConnection result = new GiftCardTransactionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<GiftCardTransactionEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<GiftCardTransaction> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
