package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnProcessInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Process a return.
 */
public class ReturnProcessGraphQLQuery extends GraphQLQuery {
  public ReturnProcessGraphQLQuery(ReturnProcessInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnProcessGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnProcess";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnProcessInput input;

    private String queryName;

    public ReturnProcessGraphQLQuery build() {
      return new ReturnProcessGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for processing a return.
     */
    public Builder input(ReturnProcessInput input) {
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
