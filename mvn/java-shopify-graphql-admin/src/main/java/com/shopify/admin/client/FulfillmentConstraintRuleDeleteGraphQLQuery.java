package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a fulfillment constraint rule and its metafields.
 */
public class FulfillmentConstraintRuleDeleteGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRuleDeleteGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentConstraintRuleDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRuleDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public FulfillmentConstraintRuleDeleteGraphQLQuery build() {
      return new FulfillmentConstraintRuleDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * A globally-unique identifier for the fulfillment constraint rule.
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
