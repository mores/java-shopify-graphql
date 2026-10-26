package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferCreateAsReadyToShipInput;
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
 * Creates an inventory transfer in ready to ship.
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryTransferCreateAsReadyToShipGraphQLQuery extends GraphQLQuery {
  public InventoryTransferCreateAsReadyToShipGraphQLQuery(
      InventoryTransferCreateAsReadyToShipInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferCreateAsReadyToShipGraphQLQuery(
      InventoryTransferCreateAsReadyToShipInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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

  public InventoryTransferCreateAsReadyToShipGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferCreateAsReadyToShip";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private InventoryTransferCreateAsReadyToShipInput input;

    private String queryName;

    public InventoryTransferCreateAsReadyToShipGraphQLQuery build() {
      return new InventoryTransferCreateAsReadyToShipGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for the inventory transfer.
     */
    public Builder input(InventoryTransferCreateAsReadyToShipInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for the inventory transfer.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventoryTransferCreateAsReadyToShipInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
