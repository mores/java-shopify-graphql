package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Marks a draft inventory shipment as in transit.
 */
public class InventoryShipmentMarkInTransitGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentMarkInTransitGraphQLQuery(String id, OffsetDateTime dateShipped,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (dateShipped != null || fieldsSet.contains("dateShipped")) {
        getInput().put("dateShipped", dateShipped);
    }
  }

  public InventoryShipmentMarkInTransitGraphQLQuery(String id, OffsetDateTime dateShipped,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (dateShipped != null || fieldsSet.contains("dateShipped")) {
        getInput().put("dateShipped", dateShipped);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryShipmentMarkInTransitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentMarkInTransit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private OffsetDateTime dateShipped;

    private String queryName;

    public InventoryShipmentMarkInTransitGraphQLQuery build() {
      return new InventoryShipmentMarkInTransitGraphQLQuery(id, dateShipped, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory shipment to mark in transit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the inventory shipment to mark in transit.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The date the shipment was shipped.
     */
    public Builder dateShipped(OffsetDateTime dateShipped) {
      this.dateShipped = dateShipped;
      this.fieldsSet.add("dateShipped");
      return this;
    }

    /**
     * The date the shipment was shipped.
     */
    public Builder dateShippedReference(String variableRef) {
      this.variableReferences.put("dateShipped", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("dateShipped");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
