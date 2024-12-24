package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DraftOrderDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DraftOrderDeleteGraphQLQuery extends GraphQLQuery {
  public DraftOrderDeleteGraphQLQuery(DraftOrderDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DraftOrderDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DraftOrderDeleteInput input;

    private String queryName;

    public DraftOrderDeleteGraphQLQuery build() {
      return new DraftOrderDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(DraftOrderDeleteInput input) {
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
