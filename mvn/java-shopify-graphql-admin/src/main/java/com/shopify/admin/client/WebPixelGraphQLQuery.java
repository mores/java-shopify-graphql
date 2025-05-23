package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a
 * [web pixel](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
 * by ID.
 */
public class WebPixelGraphQLQuery extends GraphQLQuery {
  public WebPixelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public WebPixelGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "webPixel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public WebPixelGraphQLQuery build() {
      return new WebPixelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `WebPixel` object to return.
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
