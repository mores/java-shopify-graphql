package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryMoveQuantitiesInput;
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
 * Moves inventory quantities for a single inventory item between different
 * states at a single location. Use this mutation to reallocate inventory across
 * quantity states without moving it between locations.
 *   
 * Each change specifies the quantity to move, the source state and location, and
 * the destination state and location. The mutation returns an [`InventoryAdjustmentGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryAdjustmentGroup)
 * that tracks all changes made in a single operation, providing an audit trail
 * with the reason and reference document URI.
 *   
 * > Caution:
 * > As of version `2026-01`, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of version `2026-04`, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryMoveQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryMoveQuantitiesGraphQLQuery(InventoryMoveQuantitiesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryMoveQuantitiesGraphQLQuery(InventoryMoveQuantitiesInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
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

  public InventoryMoveQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryMoveQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private InventoryMoveQuantitiesInput input;

    private String queryName;

    public InventoryMoveQuantitiesGraphQLQuery build() {
      return new InventoryMoveQuantitiesGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The information required to move inventory quantities.
     */
    public Builder input(InventoryMoveQuantitiesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The information required to move inventory quantities.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventoryMoveQuantitiesInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
