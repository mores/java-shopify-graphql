package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ThemeCreateGraphQLQuery extends GraphQLQuery {
  public ThemeCreateGraphQLQuery(String source, String name, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (source != null || fieldsSet.contains("source")) {
        getInput().put("source", source);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }
  }

  public ThemeCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String source;

    private String name;

    private String queryName;

    public ThemeCreateGraphQLQuery build() {
      return new ThemeCreateGraphQLQuery(source, name, queryName, fieldsSet);
               
    }

    
    public Builder source(String source) {
      this.source = source;
      this.fieldsSet.add("source");
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
