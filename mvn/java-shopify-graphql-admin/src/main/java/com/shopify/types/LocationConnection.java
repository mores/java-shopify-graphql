package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationConnection {
  
  private List<LocationEdge> edges;

  
  private List<Location> nodes;

  
  private PageInfo pageInfo;

  public LocationConnection() {
  }

  
  public List<LocationEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<LocationEdge> edges) {
    this.edges = edges;
  }

  
  public List<Location> getNodes() {
    return nodes;
  }

  public void setNodes(List<Location> nodes) {
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
    return "LocationConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationConnection that = (LocationConnection) o;
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
    
    private List<LocationEdge> edges;

    
    private List<Location> nodes;

    
    private PageInfo pageInfo;

    public LocationConnection build() {
      LocationConnection result = new LocationConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<LocationEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<Location> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
