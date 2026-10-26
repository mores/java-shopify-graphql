package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentReceiveItemInput;
import com.shopify.admin.types.InventoryShipmentReceiveLineItemReason;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Receive an inventory shipment.
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class InventoryShipmentReceiveGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentReceiveGraphQLQuery(String id,
      List<InventoryShipmentReceiveItemInput> lineItems, OffsetDateTime dateReceived,
      InventoryShipmentReceiveLineItemReason bulkReceiveAction, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }if (dateReceived != null || fieldsSet.contains("dateReceived")) {
        getInput().put("dateReceived", dateReceived);
    }if (bulkReceiveAction != null || fieldsSet.contains("bulkReceiveAction")) {
        getInput().put("bulkReceiveAction", bulkReceiveAction);
    }
  }

  public InventoryShipmentReceiveGraphQLQuery(String id,
      List<InventoryShipmentReceiveItemInput> lineItems, OffsetDateTime dateReceived,
      InventoryShipmentReceiveLineItemReason bulkReceiveAction, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }if (dateReceived != null || fieldsSet.contains("dateReceived")) {
        getInput().put("dateReceived", dateReceived);
    }if (bulkReceiveAction != null || fieldsSet.contains("bulkReceiveAction")) {
        getInput().put("bulkReceiveAction", bulkReceiveAction);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryShipmentReceiveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentReceive";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<InventoryShipmentReceiveItemInput> lineItems;

    private OffsetDateTime dateReceived;

    private InventoryShipmentReceiveLineItemReason bulkReceiveAction;

    private String queryName;

    public InventoryShipmentReceiveGraphQLQuery build() {
      return new InventoryShipmentReceiveGraphQLQuery(id, lineItems, dateReceived, bulkReceiveAction, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory shipment to receive.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the inventory shipment to receive.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The list of receive line items for the inventory shipment.
     */
    public Builder lineItems(List<InventoryShipmentReceiveItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * The list of receive line items for the inventory shipment.
     */
    public Builder lineItemsReference(String variableRef) {
      this.variableReferences.put("lineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("InventoryShipmentReceiveItemInput")))).build());
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * The date the inventory shipment was initially received.
     */
    public Builder dateReceived(OffsetDateTime dateReceived) {
      this.dateReceived = dateReceived;
      this.fieldsSet.add("dateReceived");
      return this;
    }

    /**
     * The date the inventory shipment was initially received.
     */
    public Builder dateReceivedReference(String variableRef) {
      this.variableReferences.put("dateReceived", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("dateReceived");
      return this;
    }

    /**
     * The bulk receive action for the inventory shipment.
     */
    public Builder bulkReceiveAction(InventoryShipmentReceiveLineItemReason bulkReceiveAction) {
      this.bulkReceiveAction = bulkReceiveAction;
      this.fieldsSet.add("bulkReceiveAction");
      return this;
    }

    /**
     * The bulk receive action for the inventory shipment.
     */
    public Builder bulkReceiveActionReference(String variableRef) {
      this.variableReferences.put("bulkReceiveAction", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("InventoryShipmentReceiveLineItemReason")).build());
      this.fieldsSet.add("bulkReceiveAction");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
