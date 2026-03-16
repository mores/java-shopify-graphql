package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventorySetOnHandQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sets an inventory item's on-hand quantities to specific absolute values at
 * designated locations. The mutation takes a reason for tracking purposes and a
 * reference document URI for audit trails.
 *   
 * Returns an [`InventoryAdjustmentGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryAdjustmentGroup) that tracks all changes made in this operation, including the delta values
 * calculated from the previous quantities.
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventorySetOnHandQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventorySetOnHandQuantitiesGraphQLQuery(InventorySetOnHandQuantitiesInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventorySetOnHandQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventorySetOnHandQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventorySetOnHandQuantitiesInput input;

    private String queryName;

    public InventorySetOnHandQuantitiesGraphQLQuery build() {
      return new InventorySetOnHandQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to set inventory on hand quantities.
     */
    public Builder input(InventorySetOnHandQuantitiesInput input) {
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
