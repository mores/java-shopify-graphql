package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a `MetafieldStorefrontVisibility` record. All metafields that belongs to the specified record will no
 * longer be visible in the Storefront API.
 */
public class MetafieldStorefrontVisibilityDeleteGraphQLQuery extends GraphQLQuery {
  public MetafieldStorefrontVisibilityDeleteGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MetafieldStorefrontVisibilityDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldStorefrontVisibilityDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public MetafieldStorefrontVisibilityDeleteGraphQLQuery build() {
      return new MetafieldStorefrontVisibilityDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `MetafieldStorefrontVisibility` record to delete.
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
