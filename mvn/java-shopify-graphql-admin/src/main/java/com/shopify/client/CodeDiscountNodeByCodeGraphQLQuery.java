package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CodeDiscountNodeByCodeGraphQLQuery extends GraphQLQuery {
  public CodeDiscountNodeByCodeGraphQLQuery(String code, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public CodeDiscountNodeByCodeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "codeDiscountNodeByCode";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String code;

    private String queryName;

    public CodeDiscountNodeByCodeGraphQLQuery build() {
      return new CodeDiscountNodeByCodeGraphQLQuery(code, queryName, fieldsSet);
               
    }

    
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
