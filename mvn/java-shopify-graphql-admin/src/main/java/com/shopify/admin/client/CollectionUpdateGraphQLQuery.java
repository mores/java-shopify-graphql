package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionUpdateInput;
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
 * Updates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection),
 * modifying its properties, products, or publication settings. Collections help organize
 * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) together
 * in the [online store](https://shopify.dev/docs/apps/build/online-store) and
 * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
 *   
 * Use the `collectionUpdate` mutation to programmatically modify collections in scenarios such as:
 *   
 * - Updating collection details, like title, description, or image
 * - Modifying SEO metadata for better search visibility
 * - Changing which products are included in a collection by updating its rules, sources, or conditions
 * - Updating custom data using [metafields](https://shopify.dev/docs/apps/build/custom-data/metafields)
 *   
 * Collections can include products manually and can also include products automatically based on rules, sources,
 * or conditions. When product membership is updated through rules, sources, or conditions, the operation might
 * be processed asynchronously. In these cases, the mutation returns a
 * [`job`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Job) object
 * that you can use to track the progress of the update.
 *   
 * To publish or unpublish collections to specific sales channels, use the dedicated
 * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublish) and
 * [`publishableUnpublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishableUnpublish) mutations.
 *   
 * Learn more about [using metafields with collection conditions](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
 */
public class CollectionUpdateGraphQLQuery extends GraphQLQuery {
  public CollectionUpdateGraphQLQuery(CollectionUpdateInput collection, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (collection != null || fieldsSet.contains("collection")) {
        getInput().put("collection", collection);
    }
  }

  public CollectionUpdateGraphQLQuery(CollectionUpdateInput collection, String queryName,
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

  public CollectionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CollectionUpdateInput collection;

    private String queryName;

    public CollectionUpdateGraphQLQuery build() {
      return new CollectionUpdateGraphQLQuery(collection, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties and sources to use when updating the collection.
     */
    public Builder collection(CollectionUpdateInput collection) {
      this.collection = collection;
      this.fieldsSet.add("collection");
      return this;
    }

    /**
     * The properties and sources to use when updating the collection.
     */
    public Builder collectionReference(String variableRef) {
      this.variableReferences.put("collection", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CollectionUpdateInput")).build());
      this.fieldsSet.add("collection");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
