package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the product resource feedback for the currently authenticated app.
 */
public class ProductResourceFeedbackGraphQLQuery extends GraphQLQuery {
  public ProductResourceFeedbackGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductResourceFeedbackGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productResourceFeedback";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductResourceFeedbackGraphQLQuery build() {
      return new ProductResourceFeedbackGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The product associated with the resource feedback.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
