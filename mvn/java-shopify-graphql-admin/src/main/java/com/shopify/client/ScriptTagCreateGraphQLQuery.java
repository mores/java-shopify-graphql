package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ScriptTagInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ScriptTagCreateGraphQLQuery extends GraphQLQuery {
  public ScriptTagCreateGraphQLQuery(ScriptTagInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ScriptTagCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "scriptTagCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ScriptTagInput input;

    private String queryName;

    public ScriptTagCreateGraphQLQuery build() {
      return new ScriptTagCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(ScriptTagInput input) {
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
