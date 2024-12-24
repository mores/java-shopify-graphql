package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldRelationConnection {
  
  private List<MetafieldRelationEdge> edges;

  
  private List<MetafieldRelation> nodes;

  
  private PageInfo pageInfo;

  public MetafieldRelationConnection() {
  }

  
  public List<MetafieldRelationEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MetafieldRelationEdge> edges) {
    this.edges = edges;
  }

  
  public List<MetafieldRelation> getNodes() {
    return nodes;
  }

  public void setNodes(List<MetafieldRelation> nodes) {
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
    return "MetafieldRelationConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldRelationConnection that = (MetafieldRelationConnection) o;
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
    
    private List<MetafieldRelationEdge> edges;

    
    private List<MetafieldRelation> nodes;

    
    private PageInfo pageInfo;

    public MetafieldRelationConnection build() {
      MetafieldRelationConnection result = new MetafieldRelationConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<MetafieldRelationEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<MetafieldRelation> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
