package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sets the quantity of a line item on an order that's being edited. Use this
 * mutation to increase, decrease, or remove items by adjusting their quantities.
 *   
 * Setting the quantity to zero effectively removes the line item from the order.
 * The item still exists as a data structure with zero quantity. When decreasing
 * quantities, you can optionally restock the removed items to inventory by
 * setting the `restock` parameter to `true`.
 *   
 * Learn more about [editing workflows for existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 */
public class OrderEditSetQuantityGraphQLQuery extends GraphQLQuery {
  public OrderEditSetQuantityGraphQLQuery(String id, String lineItemId, int quantity,
      Boolean restock, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItemId != null || fieldsSet.contains("lineItemId")) {
        getInput().put("lineItemId", lineItemId);
    }getInput().put("quantity", quantity);                   if (restock != null || fieldsSet.contains("restock")) {
        getInput().put("restock", restock);
    }
  }

  public OrderEditSetQuantityGraphQLQuery(String id, String lineItemId, int quantity,
      Boolean restock, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItemId != null || fieldsSet.contains("lineItemId")) {
        getInput().put("lineItemId", lineItemId);
    }getInput().put("quantity", quantity);                   if (restock != null || fieldsSet.contains("restock")) {
        getInput().put("restock", restock);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderEditSetQuantityGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditSetQuantity";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String lineItemId;

    private int quantity;

    private Boolean restock;

    private String queryName;

    public OrderEditSetQuantityGraphQLQuery build() {
      return new OrderEditSetQuantityGraphQLQuery(id, lineItemId, quantity, restock, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. The edit changes the quantity on the line item.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. The edit changes the quantity on the line item.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the calculated line item to edit.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      this.fieldsSet.add("lineItemId");
      return this;
    }

    /**
     * The ID of the calculated line item to edit.
     */
    public Builder lineItemIdReference(String variableRef) {
      this.variableReferences.put("lineItemId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("lineItemId");
      return this;
    }

    /**
     * The new quantity to set for the line item. This value cannot be negative.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    /**
     * The new quantity to set for the line item. This value cannot be negative.
     */
    public Builder quantityReference(String variableRef) {
      this.variableReferences.put("quantity", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Int"))).build());
      this.fieldsSet.add("quantity");
      return this;
    }

    /**
     * Whether or not to restock the line item when the updated quantity is less than the original quantity.
     */
    public Builder restock(Boolean restock) {
      this.restock = restock;
      this.fieldsSet.add("restock");
      return this;
    }

    /**
     * Whether or not to restock the line item when the updated quantity is less than the original quantity.
     */
    public Builder restockReference(String variableRef) {
      this.variableReferences.put("restock", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("restock");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
