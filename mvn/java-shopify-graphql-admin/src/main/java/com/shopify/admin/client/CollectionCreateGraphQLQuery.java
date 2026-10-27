package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionCreateInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
 * to group [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) together
 * in the [online store](https://shopify.dev/docs/apps/build/online-store) and
 * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
 * For example, an athletics store might create different collections for running attire, shoes, and accessories.
 *   
 * Use the `collectionCreate` mutation when you need to:
 *   
 * - Create a new collection for a product launch or campaign
 * - Organize products by category, season, or promotion
 * - Automate product grouping using conditions (for example, by tag, type, or price)
 *   
 * Collections can include products manually and can also include products automatically based on rules, sources,
 * or conditions.
 *   
 * **Defining a collection's membership**
 *   
 * Define membership with `sources` on the `collection` argument
 * ([`CollectionCreateInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CollectionCreateInput)).
 * Each source adds products through `conditions` (such as product tag, title, or metafield—see
 * [`CollectionSourceInclusionConditionInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CollectionSourceInclusionConditionInput)
 * for the full list) and through manual `selections`.
 *   
 * > Note:
 * > The `input` argument and its `ruleSet` field are deprecated. Existing integrations should migrate to
 * `collection` and `sources` — a `ruleSet` rule maps to an equivalent source `condition` (for example, a
 * tag rule becomes a `productTag` condition). If both `collection` and `input` are provided, `collection`
 * is used.
 *   
 * > Note:
 * > The created collection is unpublished by default. To make it available to customers,
 * use the [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublish)
 * mutation after creation.
 *   
 * Learn more about [using metafields with collection conditions](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
 */
public class CollectionCreateGraphQLQuery extends GraphQLQuery {
  public CollectionCreateGraphQLQuery(CollectionCreateInput collection, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (collection != null || fieldsSet.contains("collection")) {
        getInput().put("collection", collection);
    }
  }

  public CollectionCreateGraphQLQuery(CollectionCreateInput collection, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (collection != null || fieldsSet.contains("collection")) {
        getInput().put("collection", collection);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CollectionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CollectionCreateInput collection;

    private String queryName;

    public CollectionCreateGraphQLQuery build() {
      return new CollectionCreateGraphQLQuery(collection, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties and sources to use when creating the collection. Define
     * product membership with `sources` (conditions and manual selections) instead
     * of the legacy `ruleSet`.
     */
    public Builder collection(CollectionCreateInput collection) {
      this.collection = collection;
      this.fieldsSet.add("collection");
      return this;
    }

    /**
     * The properties and sources to use when creating the collection. Define
     * product membership with `sources` (conditions and manual selections) instead
     * of the legacy `ruleSet`.
     */
    public Builder collectionReference(String variableRef) {
      this.variableReferences.put("collection", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CollectionCreateInput")).build());
      this.fieldsSet.add("collection");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
