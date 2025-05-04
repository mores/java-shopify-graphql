package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventorySetQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set quantities of specified name using absolute values. This mutation supports compare-and-set functionality to handle
 * concurrent requests properly. If `ignoreCompareQuantity` is not set to true,
 * the mutation will only update the quantity if the persisted quantity matches the `compareQuantity` value.
 * If the `compareQuantity` value does not match the persisted value, the mutation will return an error. In order to opt out
 * of the `compareQuantity` check, the `ignoreCompareQuantity` argument can be set to true.
 *   
 * > Note:
 * > Only use this mutation if calling on behalf of a system that acts as the source of truth for inventory quantities,
 * > otherwise please consider using the [inventoryAdjustQuantities](https://shopify.dev/api/admin-graphql/latest/mutations/inventoryAdjustQuantities) mutation.
 * >
 * >
 * > Opting out of the `compareQuantity` check can lead to inaccurate inventory
 * quantities if multiple requests are made concurrently.
 * > It is recommended to always include the `compareQuantity` value to ensure
 * the accuracy of the inventory quantities and to opt out
 * > of the check using `ignoreCompareQuantity` only when necessary.
 */
public class InventorySetQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventorySetQuantitiesGraphQLQuery(InventorySetQuantitiesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
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

    private InventorySetQuantitiesInput input;

    private String queryName;

    public InventorySetQuantitiesGraphQLQuery build() {
      return new InventorySetQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to set inventory quantities.
     */
    public Builder input(InventorySetQuantitiesInput input) {
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
