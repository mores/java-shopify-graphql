package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryAdjustQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adjusts quantities for inventory items by applying incremental changes at
 * specific locations. Each adjustment modifies the quantity by a delta value
 * rather than setting an absolute amount.
 *   
 * The mutation tracks adjustments with a reason code and optional reference URI
 * for audit trails. Returns an [`InventoryAdjustmentGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryAdjustmentGroup)
 * that records all changes made in the operation.
 *   
 * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#adjust-inventory-quantities).
 *   
 * > Caution:
 * > As of version `2026-01`, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of version `2026-04`, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryAdjustQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryAdjustQuantitiesGraphQLQuery(InventoryAdjustQuantitiesInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryAdjustQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryAdjustQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryAdjustQuantitiesInput input;

    private String queryName;

    public InventoryAdjustQuantitiesGraphQLQuery build() {
      return new InventoryAdjustQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to adjust inventory quantities.
     */
    public Builder input(InventoryAdjustQuantitiesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
