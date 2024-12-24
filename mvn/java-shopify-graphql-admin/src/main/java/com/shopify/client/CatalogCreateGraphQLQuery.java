package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CatalogCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CatalogCreateGraphQLQuery extends GraphQLQuery {
  public CatalogCreateGraphQLQuery(CatalogCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CatalogCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "catalogCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CatalogCreateInput input;

    private String queryName;

    public CatalogCreateGraphQLQuery build() {
      return new CatalogCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CatalogCreateInput input) {
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
