package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The connection type for the `CustomerSegmentMembers` object.
 */
public class CustomerSegmentMemberConnection {
  /**
   * A list of edges.
   */
  private List<CustomerSegmentMemberEdge> edges;

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  private PageInfo pageInfo;

  /**
   * The statistics for a given segment.
   */
  private SegmentStatistics statistics;

  /**
   * The total number of members in a given segment.
   */
  private int totalCount;

  public CustomerSegmentMemberConnection() {
  }

  /**
   * A list of edges.
   */
  public List<CustomerSegmentMemberEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<CustomerSegmentMemberEdge> edges) {
    this.edges = edges;
  }

  /**
   * An object that’s used to retrieve [cursor
   * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * The statistics for a given segment.
   */
  public SegmentStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(SegmentStatistics statistics) {
    this.statistics = statistics;
  }

  /**
   * The total number of members in a given segment.
   */
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
    /**
     * A list of edges.
     */
    private List<CustomerSegmentMemberEdge> edges;

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    private PageInfo pageInfo;

    /**
     * The statistics for a given segment.
     */
    private SegmentStatistics statistics;

    /**
     * The total number of members in a given segment.
     */
    private int totalCount;

    public CustomerSegmentMemberConnection build() {
      CustomerSegmentMemberConnection result = new CustomerSegmentMemberConnection();
      result.edges = this.edges;
      result.pageInfo = this.pageInfo;
      result.statistics = this.statistics;
      result.totalCount = this.totalCount;
      return result;
    }

    /**
     * A list of edges.
     */
    public Builder edges(List<CustomerSegmentMemberEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * An object that’s used to retrieve [cursor
     * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
     */
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    /**
     * The statistics for a given segment.
     */
    public Builder statistics(SegmentStatistics statistics) {
      this.statistics = statistics;
      return this;
    }

    /**
     * The total number of members in a given segment.
     */
    public Builder totalCount(int totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
