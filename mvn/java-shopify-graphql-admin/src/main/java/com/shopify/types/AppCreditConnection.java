package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppCreditConnection {
  
  private List<AppCreditEdge> edges;

  
  private List<AppCredit> nodes;

  
  private PageInfo pageInfo;

  public AppCreditConnection() {
  }

  
  public List<AppCreditEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<AppCreditEdge> edges) {
    this.edges = edges;
  }

  
  public List<AppCredit> getNodes() {
    return nodes;
  }

  public void setNodes(List<AppCredit> nodes) {
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
    return "AppCreditConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppCreditConnection that = (AppCreditConnection) o;
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
    
    private List<AppCreditEdge> edges;

    
    private List<AppCredit> nodes;

    
    private PageInfo pageInfo;

    public AppCreditConnection build() {
      AppCreditConnection result = new AppCreditConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<AppCreditEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<AppCredit> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
