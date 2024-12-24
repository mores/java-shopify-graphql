package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectDefinitionConnection {
  
  private List<MetaobjectDefinitionEdge> edges;

  
  private List<MetaobjectDefinition> nodes;

  
  private PageInfo pageInfo;

  public MetaobjectDefinitionConnection() {
  }

  
  public List<MetaobjectDefinitionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MetaobjectDefinitionEdge> edges) {
    this.edges = edges;
  }

  
  public List<MetaobjectDefinition> getNodes() {
    return nodes;
  }

  public void setNodes(List<MetaobjectDefinition> nodes) {
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
    return "MetaobjectDefinitionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionConnection that = (MetaobjectDefinitionConnection) o;
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
    
    private List<MetaobjectDefinitionEdge> edges;

    
    private List<MetaobjectDefinition> nodes;

    
    private PageInfo pageInfo;

    public MetaobjectDefinitionConnection build() {
      MetaobjectDefinitionConnection result = new MetaobjectDefinitionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<MetaobjectDefinitionEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<MetaobjectDefinition> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
