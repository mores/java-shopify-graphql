package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a `MetafieldStorefrontVisibility` record by ID. A `MetafieldStorefrontVisibility` record lists the
 * metafields to make visible in the Storefront API.
 */
public class MetafieldStorefrontVisibilityGraphQLQuery extends GraphQLQuery {
  public MetafieldStorefrontVisibilityGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MetafieldStorefrontVisibilityGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metafieldStorefrontVisibility";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public MetafieldStorefrontVisibilityGraphQLQuery build() {
      return new MetafieldStorefrontVisibilityGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `MetafieldStorefrontVisibility` to return.
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
