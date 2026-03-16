package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a [`MetafieldDefinition`](https://shopify.dev/docs/api/admin-graphql/current/objects/MetafieldDefinition)'s configuration and settings. You can modify the definition's name, description,
 * validation rules, access settings, capabilities, and constraints.
 *   
 * The mutation updates access settings that control visibility across different
 * APIs, such as the [GraphQL Admin
 * API](https://shopify.dev/docs/api/admin-graphql), [Storefront
 * API](https://shopify.dev/docs/api/storefront), and [Customer Account
 * API](https://shopify.dev/docs/api/customer). It also enables capabilities like
 * admin filtering or unique value validation, and modifies constraints that
 * determine which resource subtypes the definition applies to.
 *   
 * > Note: The type, namespace, key, and owner type identify the definition and so can't be changed.
 *   
 * Learn more about [updating metafield definitions](https://shopify.dev/docs/apps/build/custom-data/metafields/definitions).
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
