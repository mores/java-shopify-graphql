package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Whether a member, which is a customer, belongs to a segment.
 */
public class CustomerSegmentMembershipGraphQLQuery extends GraphQLQuery {
  public CustomerSegmentMembershipGraphQLQuery(List<String> segmentIds, String customerId,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (segmentIds != null || fieldsSet.contains("segmentIds")) {
        getInput().put("segmentIds", segmentIds);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerSegmentMembershipGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerSegmentMembership";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> segmentIds;

    private String customerId;

    private String queryName;

    public CustomerSegmentMembershipGraphQLQuery build() {
      return new CustomerSegmentMembershipGraphQLQuery(segmentIds, customerId, queryName, fieldsSet);
               
    }

    /**
     * The segments to evaluate for the given customer.
     */
    public Builder segmentIds(List<String> segmentIds) {
      this.segmentIds = segmentIds;
      this.fieldsSet.add("segmentIds");
      return this;
    }

    /**
     * The ID of the customer that has the membership.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
