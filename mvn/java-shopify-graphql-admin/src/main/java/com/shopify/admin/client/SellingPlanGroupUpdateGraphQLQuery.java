package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SellingPlanGroupInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a Selling Plan Group.
 */
public class SellingPlanGroupUpdateGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupUpdateGraphQLQuery(String id, SellingPlanGroupInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SellingPlanGroupUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private SellingPlanGroupInput input;

    private String queryName;

    public SellingPlanGroupUpdateGraphQLQuery build() {
      return new SellingPlanGroupUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The Selling Plan Group to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The properties of the Selling Plan Group to update.
     */
    public Builder input(SellingPlanGroupInput input) {
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
