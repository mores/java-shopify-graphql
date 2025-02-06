package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldDefinitionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a metafield definition. Any metafields existing under the same owner type, namespace, and key will be
 * checked against this definition and will have their type updated accordingly. For metafields that are not
 * valid, they will remain unchanged but any attempts to update them must align with this definition.
 */
public class MetafieldDefinitionCreateGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionCreateGraphQLQuery(MetafieldDefinitionInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetafieldDefinitionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldDefinitionInput definition;

    private String queryName;

    public MetafieldDefinitionCreateGraphQLQuery build() {
      return new MetafieldDefinitionCreateGraphQLQuery(definition, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for a metafield definition.
     */
    public Builder definition(MetafieldDefinitionInput definition) {
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
