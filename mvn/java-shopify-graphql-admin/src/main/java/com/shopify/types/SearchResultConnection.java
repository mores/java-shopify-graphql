package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SearchResultConnection {
  
  private List<SearchResultEdge> edges;

  
  private PageInfo pageInfo;

  
  private int resultsAfterCount;

  public SearchResultConnection() {
  }

  
  public List<SearchResultEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<SearchResultEdge> edges) {
    this.edges = edges;
  }

  
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  
  public int getResultsAfterCount() {
    return resultsAfterCount;
  }

  public void setResultsAfterCount(int resultsAfterCount) {
    this.resultsAfterCount = resultsAfterCount;
  }

  @Override
  public String toString() {
    return "SearchResultConnection{edges='" + edges + "', pageInfo='" + pageInfo + "', resultsAfterCount='" + resultsAfterCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchResultConnection that = (SearchResultConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        resultsAfterCount == that.resultsAfterCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, pageInfo, resultsAfterCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SearchResultEdge> edges;

    
    private PageInfo pageInfo;

    
    private int resultsAfterCount;

    public SearchResultConnection build() {
      SearchResultConnection result = new SearchResultConnection();
      result.edges = this.edges;
      result.pageInfo = this.pageInfo;
      result.resultsAfterCount = this.resultsAfterCount;
      return result;
    }

    
    public Builder edges(List<SearchResultEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    
    public Builder resultsAfterCount(int resultsAfterCount) {
      this.resultsAfterCount = resultsAfterCount;
      return this;
    }
  }
}
