package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StringConnection {
  
  private List<StringEdge> edges;

  
  private PageInfo pageInfo;

  public StringConnection() {
  }

  
  public List<StringEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<StringEdge> edges) {
    this.edges = edges;
  }

  
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public String toString() {
    return "StringConnection{edges='" + edges + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StringConnection that = (StringConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<StringEdge> edges;

    
    private PageInfo pageInfo;

    public StringConnection build() {
      StringConnection result = new StringConnection();
      result.edges = this.edges;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<StringEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
