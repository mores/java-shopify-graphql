package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A customer's return request that hasn't been approved or declined.
 * This mutation sets the value of the `Return.status` field to `REQUESTED`.
 * To create a return that has the `Return.status` field set to `OPEN`, use the `returnCreate` mutation.
 */
public class ReturnRequestGraphQLQuery extends GraphQLQuery {
  public ReturnRequestGraphQLQuery(ReturnRequestInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnRequestInput input;

    private String queryName;

    public ReturnRequestGraphQLQuery build() {
      return new ReturnRequestGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for requesting a return.
     */
    public Builder input(ReturnRequestInput input) {
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
