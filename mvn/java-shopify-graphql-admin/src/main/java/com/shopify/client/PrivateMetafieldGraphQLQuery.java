package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a private metafield by ID.
 * Private metafields are accessible only by the application that created them.
 */
public class PrivateMetafieldGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PrivateMetafieldGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "privateMetafield";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PrivateMetafieldGraphQLQuery build() {
      return new PrivateMetafieldGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `PrivateMetafield` to return.
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
