package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields and values for creating a customer segment members query.
 */
public class CustomerSegmentMembersQueryInput {
  /**
   * The ID of the segment.
   */
  private String segmentId;

  /**
   * The query that's used to filter the members. The query is composed of a
   * combination of conditions on facts about customers such as
   * `email_subscription_status = 'SUBSCRIBED'` with [this
   * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
   */
  private String query;

  /**
   * Reverse the order of the list. The sorting behaviour defaults to ascending order.
   */
  private Boolean reverse = false;

  /**
   * Sort the list by a given key.
   */
  private String sortKey;

  public CustomerSegmentMembersQueryInput() {
  }

  /**
   * The ID of the segment.
   */
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  /**
   * The query that's used to filter the members. The query is composed of a
   * combination of conditions on facts about customers such as
   * `email_subscription_status = 'SUBSCRIBED'` with [this
   * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Reverse the order of the list. The sorting behaviour defaults to ascending order.
   */
  public Boolean getReverse() {
    return reverse;
  }

  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

  /**
   * Sort the list by a given key.
   */
  public String getSortKey() {
    return sortKey;
  }

  public void setSortKey(String sortKey) {
    this.sortKey = sortKey;
  }

  @Override
  public String toString() {
    return "CustomerSegmentMembersQueryInput{segmentId='" + segmentId + "', query='" + query + "', reverse='" + reverse + "', sortKey='" + sortKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMembersQueryInput that = (CustomerSegmentMembersQueryInput) o;
    return Objects.equals(segmentId, that.segmentId) &&
        Objects.equals(query, that.query) &&
        Objects.equals(reverse, that.reverse) &&
        Objects.equals(sortKey, that.sortKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, query, reverse, sortKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the segment.
     */
    private String segmentId;

    /**
     * The query that's used to filter the members. The query is composed of a
     * combination of conditions on facts about customers such as
     * `email_subscription_status = 'SUBSCRIBED'` with [this
     * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
     */
    private String query;

    /**
     * Reverse the order of the list. The sorting behaviour defaults to ascending order.
     */
    private Boolean reverse = false;

    /**
     * Sort the list by a given key.
     */
    private String sortKey;

    public CustomerSegmentMembersQueryInput build() {
      CustomerSegmentMembersQueryInput result = new CustomerSegmentMembersQueryInput();
      result.segmentId = this.segmentId;
      result.query = this.query;
      result.reverse = this.reverse;
      result.sortKey = this.sortKey;
      return result;
    }

    /**
     * The ID of the segment.
     */
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    /**
     * The query that's used to filter the members. The query is composed of a
     * combination of conditions on facts about customers such as
     * `email_subscription_status = 'SUBSCRIBED'` with [this
     * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Reverse the order of the list. The sorting behaviour defaults to ascending order.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      return this;
    }

    /**
     * Sort the list by a given key.
     */
    public Builder sortKey(String sortKey) {
      this.sortKey = sortKey;
      return this;
    }
  }
}
