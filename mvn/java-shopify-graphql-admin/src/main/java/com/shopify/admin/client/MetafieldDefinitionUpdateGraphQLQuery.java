package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a metafield definition.
 */
public class MetafieldDefinitionUpdateGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionUpdateGraphQLQuery(MetafieldDefinitionUpdateInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetafieldDefinitionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldDefinitionUpdateInput definition;

    private String queryName;

    public MetafieldDefinitionUpdateGraphQLQuery build() {
      return new MetafieldDefinitionUpdateGraphQLQuery(definition, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the metafield definition update.
     */
    public Builder definition(MetafieldDefinitionUpdateInput definition) {
      this.definition = definition;
      this.fieldsSet.add("definition");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
