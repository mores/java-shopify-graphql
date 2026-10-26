package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentTrackingInput;
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
 * Edits the tracking info on an inventory shipment.
 */
public class InventoryShipmentSetTrackingGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentSetTrackingGraphQLQuery(String id,
      InventoryShipmentTrackingInput tracking, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tracking != null || fieldsSet.contains("tracking")) {
        getInput().put("tracking", tracking);
    }
  }

  public InventoryShipmentSetTrackingGraphQLQuery(String id,
      InventoryShipmentTrackingInput tracking, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tracking != null || fieldsSet.contains("tracking")) {
        getInput().put("tracking", tracking);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryShipmentSetTrackingGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentSetTracking";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private InventoryShipmentTrackingInput tracking;

    private String queryName;

    public InventoryShipmentSetTrackingGraphQLQuery build() {
      return new InventoryShipmentSetTrackingGraphQLQuery(id, tracking, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory shipment whose tracking info is being edited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the inventory shipment whose tracking info is being edited.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The tracking info to edit on the inventory shipment.
     */
    public Builder tracking(InventoryShipmentTrackingInput tracking) {
      this.tracking = tracking;
      this.fieldsSet.add("tracking");
      return this;
    }

    /**
     * The tracking info to edit on the inventory shipment.
     */
    public Builder trackingReference(String variableRef) {
      this.variableReferences.put("tracking", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("InventoryShipmentTrackingInput"))).build());
      this.fieldsSet.add("tracking");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
