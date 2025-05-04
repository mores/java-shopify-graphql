package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ShopifyPaymentsDisputeEvidenceUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a dispute evidence.
 */
public class DisputeEvidenceUpdateGraphQLQuery extends GraphQLQuery {
  public DisputeEvidenceUpdateGraphQLQuery(String id,
      ShopifyPaymentsDisputeEvidenceUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DisputeEvidenceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "disputeEvidenceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private ShopifyPaymentsDisputeEvidenceUpdateInput input;

    private String queryName;

    public DisputeEvidenceUpdateGraphQLQuery build() {
      return new DisputeEvidenceUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the dispute evidence to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The updated properties for a dispute evidence.
     */
    public Builder input(ShopifyPaymentsDisputeEvidenceUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
