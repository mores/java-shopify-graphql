package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppUsageRecordConnection {
  
  private List<AppUsageRecordEdge> edges;

  
  private List<AppUsageRecord> nodes;

  
  private PageInfo pageInfo;

  public AppUsageRecordConnection() {
  }

  
  public List<AppUsageRecordEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<AppUsageRecordEdge> edges) {
    this.edges = edges;
  }

  
  public List<AppUsageRecord> getNodes() {
    return nodes;
  }

  public void setNodes(List<AppUsageRecord> nodes) {
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
    return "AppUsageRecordConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsageRecordConnection that = (AppUsageRecordConnection) o;
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
    
    private List<AppUsageRecordEdge> edges;

    
    private List<AppUsageRecord> nodes;

    
    private PageInfo pageInfo;

    public AppUsageRecordConnection build() {
      AppUsageRecordConnection result = new AppUsageRecordConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<AppUsageRecordEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<AppUsageRecord> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
