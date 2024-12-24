package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TaxonomyCategoryConnection {
  
  private List<TaxonomyCategoryEdge> edges;

  
  private List<TaxonomyCategory> nodes;

  
  private PageInfo pageInfo;

  public TaxonomyCategoryConnection() {
  }

  
  public List<TaxonomyCategoryEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<TaxonomyCategoryEdge> edges) {
    this.edges = edges;
  }

  
  public List<TaxonomyCategory> getNodes() {
    return nodes;
  }

  public void setNodes(List<TaxonomyCategory> nodes) {
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
    return "TaxonomyCategoryConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyCategoryConnection that = (TaxonomyCategoryConnection) o;
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
    
    private List<TaxonomyCategoryEdge> edges;

    
    private List<TaxonomyCategory> nodes;

    
    private PageInfo pageInfo;

    public TaxonomyCategoryConnection build() {
      TaxonomyCategoryConnection result = new TaxonomyCategoryConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<TaxonomyCategoryEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<TaxonomyCategory> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
