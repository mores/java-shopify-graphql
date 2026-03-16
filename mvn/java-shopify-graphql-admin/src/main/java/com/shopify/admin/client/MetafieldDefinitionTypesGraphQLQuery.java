package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The available metafield types that you can use when creating [`MetafieldDefinition`](https://shopify.dev/docs/api/admin-graphql/current/objects/MetafieldDefinition)
 * objects. Each type specifies what kind of data it stores (such as boolean,
 * color, date, or references), its category, and which validations it supports.
 *   
 * For a list of supported types and their capabilities, refer to the [metafield
 * types documentation](https://shopify.dev/docs/apps/metafields/types).
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
