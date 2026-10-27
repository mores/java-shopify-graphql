package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentUpdateItemQuantitiesInput;
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
 * Updates items on an inventory shipment.
 */
public class InventoryShipmentUpdateItemQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentUpdateItemQuantitiesGraphQLQuery(String id,
      List<InventoryShipmentUpdateItemQuantitiesInput> items, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public InventoryShipmentUpdateItemQuantitiesGraphQLQuery(String id,
      List<InventoryShipmentUpdateItemQuantitiesInput> items, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryShipmentUpdateItemQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentUpdateItemQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<InventoryShipmentUpdateItemQuantitiesInput> items;

    private String queryName;

    public InventoryShipmentUpdateItemQuantitiesGraphQLQuery build() {
      return new InventoryShipmentUpdateItemQuantitiesGraphQLQuery(id, items, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory shipment to update item quantities.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the inventory shipment to update item quantities.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The list of line items to be updated to the shipment.
     */
    public Builder items(List<InventoryShipmentUpdateItemQuantitiesInput> items) {
      this.items = items;
      this.fieldsSet.add("items");
      return this;
    }

    /**
     * The list of line items to be updated to the shipment.
     */
    public Builder itemsReference(String variableRef) {
      this.variableReferences.put("items", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("InventoryShipmentUpdateItemQuantitiesInput")))).build());
      this.fieldsSet.add("items");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
