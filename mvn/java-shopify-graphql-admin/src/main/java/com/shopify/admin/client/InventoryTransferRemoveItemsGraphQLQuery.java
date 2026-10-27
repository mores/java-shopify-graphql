package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferRemoveItemsInput;
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
 * This mutation removes [`InventoryTransferLineItem`s](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryTransferLineItem),
 * or portions of them, from a `DRAFT` or `READY_TO_SHIP` Transfer.
 *   
 * For each referenced line item, if its entire quantity is still unallocated to a
 * shipment, the line item is removed; otherwise the line item remains on the
 * transfer with its quantity reduced to the allocated portion. Quantity allocated
 * to a shipment (whether the shipment is in draft, in transit, or already
 * received) is preserved.
 *   
 * On `READY_TO_SHIP` transfers, removing items also returns the affected reserved
 * quantity to available inventory at the origin location.
 *   
 * To change the quantity of a line item without removing it, use
 * [`inventoryTransferSetItems`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/inventoryTransferSetItems).
 */
public class InventoryTransferRemoveItemsGraphQLQuery extends GraphQLQuery {
  public InventoryTransferRemoveItemsGraphQLQuery(InventoryTransferRemoveItemsInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferRemoveItemsGraphQLQuery(InventoryTransferRemoveItemsInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryTransferRemoveItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferRemoveItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private InventoryTransferRemoveItemsInput input;

    private String queryName;

    public InventoryTransferRemoveItemsGraphQLQuery build() {
      return new InventoryTransferRemoveItemsGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for the InventoryTransferRemoveItems mutation.
     */
    public Builder input(InventoryTransferRemoveItemsInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for the InventoryTransferRemoveItems mutation.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventoryTransferRemoveItemsInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
