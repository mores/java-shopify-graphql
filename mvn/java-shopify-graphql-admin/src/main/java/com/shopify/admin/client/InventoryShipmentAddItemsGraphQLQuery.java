package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentLineItemInput;
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
 * Adds items to an inventory shipment.
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryShipmentAddItemsGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentAddItemsGraphQLQuery(String id,
      List<InventoryShipmentLineItemInput> lineItems, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }
  }

  public InventoryShipmentAddItemsGraphQLQuery(String id,
      List<InventoryShipmentLineItemInput> lineItems, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryShipmentAddItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentAddItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<InventoryShipmentLineItemInput> lineItems;

    private String queryName;

    public InventoryShipmentAddItemsGraphQLQuery build() {
      return new InventoryShipmentAddItemsGraphQLQuery(id, lineItems, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory shipment to modify.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the inventory shipment to modify.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The list of line items to add to the inventory shipment.
     */
    public Builder lineItems(List<InventoryShipmentLineItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * The list of line items to add to the inventory shipment.
     */
    public Builder lineItemsReference(String variableRef) {
      this.variableReferences.put("lineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("InventoryShipmentLineItemInput"))))).build());
      this.fieldsSet.add("lineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
