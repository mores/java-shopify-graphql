package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete a Selling Plan Group. This does not affect subscription contracts.
 */
public class SellingPlanGroupDeleteGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SellingPlanGroupDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public SellingPlanGroupDeleteGraphQLQuery build() {
      return new SellingPlanGroupDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The id of the selling plan group to delete.
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
