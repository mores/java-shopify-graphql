package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DraftOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Calculates the properties of a draft order. Useful for determining information
 * such as total taxes or price without actually creating a draft order.
 */
public class DraftOrderCalculateGraphQLQuery extends GraphQLQuery {
  public DraftOrderCalculateGraphQLQuery(DraftOrderInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DraftOrderCalculateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DraftOrderInput input;

    private String queryName;

    public DraftOrderCalculateGraphQLQuery build() {
      return new DraftOrderCalculateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields for the draft order.
     */
    public Builder input(DraftOrderInput input) {
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
