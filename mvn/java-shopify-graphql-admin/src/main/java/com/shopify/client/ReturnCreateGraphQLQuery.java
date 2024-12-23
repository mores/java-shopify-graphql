package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a return.
 */
public class ReturnCreateGraphQLQuery extends GraphQLQuery {
  public ReturnCreateGraphQLQuery(ReturnInput returnInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (returnInput != null || fieldsSet.contains("returnInput")) {
        getInput().put("returnInput", returnInput);
    }
  }

  public ReturnCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnInput returnInput;

    private String queryName;

    public ReturnCreateGraphQLQuery build() {
      return new ReturnCreateGraphQLQuery(returnInput, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for a return.
     */
    public Builder returnInput(ReturnInput returnInput) {
      this.returnInput = returnInput;
      this.fieldsSet.add("returnInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
