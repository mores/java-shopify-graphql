package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CombinedListingChildConnection {
  
  private List<CombinedListingChildEdge> edges;

  
  private List<CombinedListingChild> nodes;

  
  private PageInfo pageInfo;

  public CombinedListingChildConnection() {
  }

  
  public List<CombinedListingChildEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CombinedListingChildEdge> edges) {
    this.edges = edges;
  }

  
  public List<CombinedListingChild> getNodes() {
    return nodes;
  }

  public void setNodes(List<CombinedListingChild> nodes) {
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
    return "CombinedListingChildConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CombinedListingChildConnection that = (CombinedListingChildConnection) o;
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
    
    private List<CombinedListingChildEdge> edges;

    
    private List<CombinedListingChild> nodes;

    
    private PageInfo pageInfo;

    public CombinedListingChildConnection build() {
      CombinedListingChildConnection result = new CombinedListingChildConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<CombinedListingChildEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<CombinedListingChild> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
