package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketRegionConnection {
  
  private List<MarketRegionEdge> edges;

  
  private List<MarketRegion> nodes;

  
  private PageInfo pageInfo;

  public MarketRegionConnection() {
  }

  
  public List<MarketRegionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MarketRegionEdge> edges) {
    this.edges = edges;
  }

  
  public List<MarketRegion> getNodes() {
    return nodes;
  }

  public void setNodes(List<MarketRegion> nodes) {
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
    return "MarketRegionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionConnection that = (MarketRegionConnection) o;
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
    
    private List<MarketRegionEdge> edges;

    
    private List<MarketRegion> nodes;

    
    private PageInfo pageInfo;

    public MarketRegionConnection build() {
      MarketRegionConnection result = new MarketRegionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<MarketRegionEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<MarketRegion> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
