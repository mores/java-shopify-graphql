package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnDeclineRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Declines a return on an order.
 * When a return is declined, each `ReturnLineItem.fulfillmentLineItem` can be associated to a new return.
 * Use the `ReturnCreate` or `ReturnRequest` mutation to initiate a new return.
 */
public class ReturnDeclineRequestGraphQLQuery extends GraphQLQuery {
  public ReturnDeclineRequestGraphQLQuery(ReturnDeclineRequestInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnDeclineRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnDeclineRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnDeclineRequestInput input;

    private String queryName;

    public ReturnDeclineRequestGraphQLQuery build() {
      return new ReturnDeclineRequestGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for declining a customer's return request.
     */
    public Builder input(ReturnDeclineRequestInput input) {
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
