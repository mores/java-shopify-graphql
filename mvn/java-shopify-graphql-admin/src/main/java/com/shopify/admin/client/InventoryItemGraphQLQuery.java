package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Retrieves an [inventory
 * item](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
 * by its ID. An inventory item represents the inventory for a [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant),
 * and holds the stock keeping unit (SKU), whether quantities are tracked,
 * shipping requirements, and customs information.
 *   
 * Use the [`inventoryLevels`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem#field-InventoryItem.fields.inventoryLevels) field to get the [inventory level](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
 * for each location that stocks the item, and the level's [`quantities`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel#field-InventoryLevel.fields.quantities)
 * field to read its inventory quantities by name.
 *   
 * Learn more about [inventory object relationships](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#inventory-object-relationships).
 */
public class InventoryItemGraphQLQuery extends GraphQLQuery {
  public InventoryItemGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public InventoryItemGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryItemGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "inventoryItem";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public InventoryItemGraphQLQuery build() {
      return new InventoryItemGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the `InventoryItem` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the `InventoryItem` to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
