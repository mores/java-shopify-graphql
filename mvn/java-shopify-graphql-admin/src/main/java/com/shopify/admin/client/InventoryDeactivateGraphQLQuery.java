package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Removes an inventory item's quantities from a location, and turns off inventory at the location.
 */
public class InventoryDeactivateGraphQLQuery extends GraphQLQuery {
  public InventoryDeactivateGraphQLQuery(String inventoryLevelId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryLevelId != null || fieldsSet.contains("inventoryLevelId")) {
        getInput().put("inventoryLevelId", inventoryLevelId);
    }
  }

  public InventoryDeactivateGraphQLQuery(String inventoryLevelId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (inventoryLevelId != null || fieldsSet.contains("inventoryLevelId")) {
        getInput().put("inventoryLevelId", inventoryLevelId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public InventoryDeactivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryDeactivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String inventoryLevelId;

    private String queryName;

    public InventoryDeactivateGraphQLQuery build() {
      return new InventoryDeactivateGraphQLQuery(inventoryLevelId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the inventory level to deactivate.
     */
    public Builder inventoryLevelId(String inventoryLevelId) {
      this.inventoryLevelId = inventoryLevelId;
      this.fieldsSet.add("inventoryLevelId");
      return this;
    }

    /**
     * The ID of the inventory level to deactivate.
     */
    public Builder inventoryLevelIdReference(String variableRef) {
      this.variableReferences.put("inventoryLevelId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("inventoryLevelId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
