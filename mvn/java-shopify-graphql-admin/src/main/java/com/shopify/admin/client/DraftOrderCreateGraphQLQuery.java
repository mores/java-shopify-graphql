package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DraftOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a draft order.
 */
public class DraftOrderCreateGraphQLQuery extends GraphQLQuery {
  public DraftOrderCreateGraphQLQuery(DraftOrderInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DraftOrderCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DraftOrderInput input;

    private String queryName;

    public DraftOrderCreateGraphQLQuery build() {
      return new DraftOrderCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields used to create the draft order.
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
