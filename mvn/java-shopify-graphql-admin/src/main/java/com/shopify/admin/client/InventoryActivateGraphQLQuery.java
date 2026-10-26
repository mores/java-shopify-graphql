package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Activates an inventory item at a [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location) by creating an [`InventoryLevel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
 * that tracks stock quantities. This enables you to manage inventory for a [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * at the specified location.
 *   
 * When you activate an inventory item, you can set its initial quantities. The [`available`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/inventoryActivate#arguments-available)
 * argument sets the quantity that's available for sale. [`onHand`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/inventoryActivate#arguments-onHand)
 * argument sets the total physical quantity at the location. If you don't
 * specify quantities, then `available` and `onHand` default to zero.
 *   
 * > Caution:
 * > As of version `2026-01`, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of version `2026-04`, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 *   
 * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
 */
public class InventoryActivateGraphQLQuery extends GraphQLQuery {
  public InventoryActivateGraphQLQuery(String inventoryItemId, String locationId, Integer available,
      Integer onHand, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryItemId != null || fieldsSet.contains("inventoryItemId")) {
        getInput().put("inventoryItemId", inventoryItemId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (available != null || fieldsSet.contains("available")) {
        getInput().put("available", available);
    }if (onHand != null || fieldsSet.contains("onHand")) {
        getInput().put("onHand", onHand);
    }
  }

  public InventoryActivateGraphQLQuery(String inventoryItemId, String locationId, Integer available,
      Integer onHand, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (inventoryItemId != null || fieldsSet.contains("inventoryItemId")) {
        getInput().put("inventoryItemId", inventoryItemId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (available != null || fieldsSet.contains("available")) {
        getInput().put("available", available);
    }if (onHand != null || fieldsSet.contains("onHand")) {
        getInput().put("onHand", onHand);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String inventoryItemId;

    private String locationId;

    private Integer available;

    private Integer onHand;

    private String queryName;

    public InventoryActivateGraphQLQuery build() {
      return new InventoryActivateGraphQLQuery(inventoryItemId, locationId, available, onHand, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory item to activate.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      this.fieldsSet.add("inventoryItemId");
      return this;
    }

    /**
     * The ID of the inventory item to activate.
     */
    public Builder inventoryItemIdReference(String variableRef) {
      this.variableReferences.put("inventoryItemId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("inventoryItemId");
      return this;
    }

    /**
     * The ID of the location of the inventory item being activated.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The ID of the location of the inventory item being activated.
     */
    public Builder locationIdReference(String variableRef) {
      this.variableReferences.put("locationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The initial available quantity of the inventory item being activated at the location.
     */
    public Builder available(Integer available) {
      this.available = available;
      this.fieldsSet.add("available");
      return this;
    }

    /**
     * The initial available quantity of the inventory item being activated at the location.
     */
    public Builder availableReference(String variableRef) {
      this.variableReferences.put("available", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("available");
      return this;
    }

    /**
     * The initial on_hand quantity of the inventory item being activated at the location.
     */
    public Builder onHand(Integer onHand) {
      this.onHand = onHand;
      this.fieldsSet.add("onHand");
      return this;
    }

    /**
     * The initial on_hand quantity of the inventory item being activated at the location.
     */
    public Builder onHandReference(String variableRef) {
      this.variableReferences.put("onHand", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("onHand");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
