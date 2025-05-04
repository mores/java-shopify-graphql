package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Each metafield definition has a type, which defines the type of information that it can store.
 * This type is enforced across every instance of the resource that owns the metafield definition.
 *   
 * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
 */
public class MetafieldDefinitionTypesGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionTypesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public MetafieldDefinitionTypesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionTypes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public MetafieldDefinitionTypesGraphQLQuery build() {
      return new MetafieldDefinitionTypesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
