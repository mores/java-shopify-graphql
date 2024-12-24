package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldDefinitionConnection {
  
  private List<MetafieldDefinitionEdge> edges;

  
  private List<MetafieldDefinition> nodes;

  
  private PageInfo pageInfo;

  public MetafieldDefinitionConnection() {
  }

  
  public List<MetafieldDefinitionEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<MetafieldDefinitionEdge> edges) {
    this.edges = edges;
  }

  
  public List<MetafieldDefinition> getNodes() {
    return nodes;
  }

  public void setNodes(List<MetafieldDefinition> nodes) {
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
    return "MetafieldDefinitionConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConnection that = (MetafieldDefinitionConnection) o;
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
    
    private List<MetafieldDefinitionEdge> edges;

    
    private List<MetafieldDefinition> nodes;

    
    private PageInfo pageInfo;

    public MetafieldDefinitionConnection build() {
      MetafieldDefinitionConnection result = new MetafieldDefinitionConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<MetafieldDefinitionEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<MetafieldDefinition> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
