package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns dispute evidence details based on ID.
 */
public class DisputeEvidenceGraphQLQuery extends GraphQLQuery {
  public DisputeEvidenceGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DisputeEvidenceGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "disputeEvidence";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DisputeEvidenceGraphQLQuery build() {
      return new DisputeEvidenceGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ShopifyPaymentsDisputeEvidence` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
