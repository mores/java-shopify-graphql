package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * An app discount type.
 */
public class AppDiscountTypeGraphQLQuery extends GraphQLQuery {
  public AppDiscountTypeGraphQLQuery(String functionId, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }
  }

  public AppDiscountTypeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appDiscountType";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String functionId;

    private String queryName;

    public AppDiscountTypeGraphQLQuery build() {
      return new AppDiscountTypeGraphQLQuery(functionId, queryName, fieldsSet);
               
    }

    /**
     * The ID for the function providing the app discount type.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      this.fieldsSet.add("functionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
