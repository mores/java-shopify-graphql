package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventorySetQuantitiesInput;
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
 * Set quantities of specified name using absolute values. This mutation supports
 * compare-and-swap (CAS) functionality to handle
 * concurrent requests properly.
 *   
 * As of 2026-04, each quantity in `quantities` must include a `changeFromQuantity` value. The mutation only updates the
 * quantity if the persisted quantity matches `changeFromQuantity`, and otherwise
 * returns a `CHANGE_FROM_QUANTITY_STALE` error.
 * In order to opt out of the check for a quantity, explicitly pass `null` as its `changeFromQuantity`. Omitting
 * `changeFromQuantity` returns an error.
 *   
 * Before 2026-04, if `ignoreCompareQuantity` is not set to true,
 * the mutation will only update the quantity if the persisted quantity matches the `compareQuantity` value.
 * If the `compareQuantity` value does not match the persisted value, the mutation will return an error. In order to opt out
 * of the `compareQuantity` check, the `ignoreCompareQuantity` argument can be set to true.
 *   
 * > Note:
 * > Only use this mutation if calling on behalf of a system that acts as the source of truth for inventory quantities,
 * > otherwise please consider using the [inventoryAdjustQuantities](https://shopify.dev/api/admin-graphql/latest/mutations/inventoryAdjustQuantities) mutation.
 * >
 * >
 * > Opting out of the compare-and-swap check can lead to inaccurate inventory
 * quantities if multiple requests are made concurrently.
 * > It is recommended to always pass the expected current quantity as
 * `changeFromQuantity` (or `compareQuantity` before 2026-04)
 * > to ensure the accuracy of the inventory quantities, and to opt out of the check (with a `null` `changeFromQuantity`, or
 * > `ignoreCompareQuantity` before 2026-04) only when necessary.
 * > For more information, refer to the [compare and swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventorySetQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventorySetQuantitiesGraphQLQuery(InventorySetQuantitiesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventorySetQuantitiesGraphQLQuery(InventorySetQuantitiesInput input, String queryName,
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

  public InventorySetQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventorySetQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private InventorySetQuantitiesInput input;

    private String queryName;

    public InventorySetQuantitiesGraphQLQuery build() {
      return new InventorySetQuantitiesGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The information required to set inventory quantities.
     */
    public Builder input(InventorySetQuantitiesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The information required to set inventory quantities.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventorySetQuantitiesInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
