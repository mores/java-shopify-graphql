package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [`MetafieldDefinition`](https://shopify.dev/docs/api/admin-graphql/current/objects/MetafieldDefinition) by its identifier. You can identify a definition using either its owner type,
 * namespace, and key, or its global ID.
 *   
 * Use this query to inspect a definition's configuration, including its data
 * type, validations, access settings, and the count of [metafields](https://shopify.dev/docs/api/admin-graphql/current/objects/Metafield) using it.
 */
public class MetafieldDefinitionGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionGraphQLQuery(MetafieldDefinitionIdentifierInput identifier,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public MetafieldDefinitionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinition";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldDefinitionIdentifierInput identifier;

    private String queryName;

    public MetafieldDefinitionGraphQLQuery build() {
      return new MetafieldDefinitionGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the MetafieldDefinition to return.
     */
    public Builder identifier(MetafieldDefinitionIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
