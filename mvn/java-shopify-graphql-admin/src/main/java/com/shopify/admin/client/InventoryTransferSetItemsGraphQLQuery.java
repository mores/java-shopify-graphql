package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferSetItemsInput;
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
 * This mutation sets the quantity for one or more line items on a Transfer.
 *   
 * Only the items you include in the `lineItems` field are updated. Items already on
 * the transfer but not referenced in your update will stay unchanged. Each inventory
 * item may appear at most once in `lineItems`; duplicate `inventoryItemId` entries
 * are rejected.
 *   
 * For each entry in `lineItems`:
 * - If the inventory item isn't yet on the transfer, a new line item is added with
 *   the provided quantity.
 * - If the inventory item is already on the transfer, the provided quantity
 *   replaces the line item's [`processableQuantity`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryTransferLineItem#field-InventoryTransferLineItem.fields.processableQuantity).
 *   Any quantity outside the processable portion (for example, already shipped or
 *   picked for shipment) is preserved, so the resulting total quantity equals the
 *   preserved portion plus the provided quantity.
 *   
 * Passing a quantity of `0` is only allowed for transfers in `DRAFT` status; on
 * `READY_TO_SHIP` or `IN_PROGRESS` transfers it returns an `INVALID_QUANTITY` error.
 * On `DRAFT` transfers, `quantity: 0` leaves a zero-quantity line item on the
 * transfer; it does not remove the item. To remove a line item from a transfer, use
 * [`inventoryTransferRemoveItems`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/inventoryTransferRemoveItems).
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryTransferSetItemsGraphQLQuery extends GraphQLQuery {
  public InventoryTransferSetItemsGraphQLQuery(InventoryTransferSetItemsInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferSetItemsGraphQLQuery(InventoryTransferSetItemsInput input,
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

  public InventoryTransferSetItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferSetItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private InventoryTransferSetItemsInput input;

    private String queryName;

    public InventoryTransferSetItemsGraphQLQuery build() {
      return new InventoryTransferSetItemsGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for the InventoryTransferSetItems mutation.
     */
    public Builder input(InventoryTransferSetItemsInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for the InventoryTransferSetItems mutation.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventoryTransferSetItemsInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
