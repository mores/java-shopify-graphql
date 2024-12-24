package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerSegmentMemberConnection {
  
  private List<CustomerSegmentMemberEdge> edges;

  
  private PageInfo pageInfo;

  
  private SegmentStatistics statistics;

  
  private int totalCount;

  public CustomerSegmentMemberConnection() {
  }

  
  public List<CustomerSegmentMemberEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CustomerSegmentMemberEdge> edges) {
    this.edges = edges;
  }

  
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  
  public SegmentStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(SegmentStatistics statistics) {
    this.statistics = statistics;
  }

  
  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public String toString() {
    return "CustomerSegmentMemberConnection{edges='" + edges + "', pageInfo='" + pageInfo + "', statistics='" + statistics + "', totalCount='" + totalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMemberConnection that = (CustomerSegmentMemberConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(statistics, that.statistics) &&
        totalCount == that.totalCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, pageInfo, statistics, totalCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CustomerSegmentMemberEdge> edges;

    
    private PageInfo pageInfo;

    
    private SegmentStatistics statistics;

    
    private int totalCount;

    public CustomerSegmentMemberConnection build() {
      CustomerSegmentMemberConnection result = new CustomerSegmentMemberConnection();
      result.edges = this.edges;
      result.pageInfo = this.pageInfo;
      result.statistics = this.statistics;
      result.totalCount = this.totalCount;
      return result;
    }

    
    public Builder edges(List<CustomerSegmentMemberEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    
    public Builder statistics(SegmentStatistics statistics) {
      this.statistics = statistics;
      return this;
    }

    
    public Builder totalCount(int totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
