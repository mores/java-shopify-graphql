package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SavedSearchCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SavedSearchCreateGraphQLQuery extends GraphQLQuery {
  public SavedSearchCreateGraphQLQuery(SavedSearchCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SavedSearchCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "savedSearchCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SavedSearchCreateInput input;

    private String queryName;

    public SavedSearchCreateGraphQLQuery build() {
      return new SavedSearchCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(SavedSearchCreateInput input) {
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
