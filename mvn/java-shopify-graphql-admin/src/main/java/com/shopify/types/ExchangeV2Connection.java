package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ExchangeV2Connection {
  
  private List<ExchangeV2Edge> edges;

  
  private List<ExchangeV2> nodes;

  
  private PageInfo pageInfo;

  public ExchangeV2Connection() {
  }

  
  public List<ExchangeV2Edge> getEdges() {
    return edges;
  }

  public void setEdges(List<ExchangeV2Edge> edges) {
    this.edges = edges;
  }

  
  public List<ExchangeV2> getNodes() {
    return nodes;
  }

  public void setNodes(List<ExchangeV2> nodes) {
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
    return "ExchangeV2Connection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2Connection that = (ExchangeV2Connection) o;
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
    
    private List<ExchangeV2Edge> edges;

    
    private List<ExchangeV2> nodes;

    
    private PageInfo pageInfo;

    public ExchangeV2Connection build() {
      ExchangeV2Connection result = new ExchangeV2Connection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<ExchangeV2Edge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<ExchangeV2> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
