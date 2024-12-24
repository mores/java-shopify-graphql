package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ResourcePublicationV2Connection {
  
  private List<ResourcePublicationV2Edge> edges;

  
  private List<ResourcePublicationV2> nodes;

  
  private PageInfo pageInfo;

  public ResourcePublicationV2Connection() {
  }

  
  public List<ResourcePublicationV2Edge> getEdges() {
    return edges;
  }

  public void setEdges(List<ResourcePublicationV2Edge> edges) {
    this.edges = edges;
  }

  
  public List<ResourcePublicationV2> getNodes() {
    return nodes;
  }

  public void setNodes(List<ResourcePublicationV2> nodes) {
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
    return "ResourcePublicationV2Connection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourcePublicationV2Connection that = (ResourcePublicationV2Connection) o;
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
    
    private List<ResourcePublicationV2Edge> edges;

    
    private List<ResourcePublicationV2> nodes;

    
    private PageInfo pageInfo;

    public ResourcePublicationV2Connection build() {
      ResourcePublicationV2Connection result = new ResourcePublicationV2Connection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<ResourcePublicationV2Edge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<ResourcePublicationV2> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
