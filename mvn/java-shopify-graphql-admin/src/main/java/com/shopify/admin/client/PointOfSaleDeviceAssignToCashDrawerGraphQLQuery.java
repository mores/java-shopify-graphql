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
 * Assigns a point of sale device to a cash drawer, removing any prior assignment.
 */
public class PointOfSaleDeviceAssignToCashDrawerGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDeviceAssignToCashDrawerGraphQLQuery(String cashDrawerId,
      String pointOfSaleDeviceId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cashDrawerId != null || fieldsSet.contains("cashDrawerId")) {
        getInput().put("cashDrawerId", cashDrawerId);
    }if (pointOfSaleDeviceId != null || fieldsSet.contains("pointOfSaleDeviceId")) {
        getInput().put("pointOfSaleDeviceId", pointOfSaleDeviceId);
    }
  }

  public PointOfSaleDeviceAssignToCashDrawerGraphQLQuery(String cashDrawerId,
      String pointOfSaleDeviceId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cashDrawerId != null || fieldsSet.contains("cashDrawerId")) {
        getInput().put("cashDrawerId", cashDrawerId);
    }if (pointOfSaleDeviceId != null || fieldsSet.contains("pointOfSaleDeviceId")) {
        getInput().put("pointOfSaleDeviceId", pointOfSaleDeviceId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PointOfSaleDeviceAssignToCashDrawerGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDeviceAssignToCashDrawer";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cashDrawerId;

    private String pointOfSaleDeviceId;

    private String queryName;

    public PointOfSaleDeviceAssignToCashDrawerGraphQLQuery build() {
      return new PointOfSaleDeviceAssignToCashDrawerGraphQLQuery(cashDrawerId, pointOfSaleDeviceId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The cash drawer to assign the device to.
     */
    public Builder cashDrawerId(String cashDrawerId) {
      this.cashDrawerId = cashDrawerId;
      this.fieldsSet.add("cashDrawerId");
      return this;
    }

    /**
     * The cash drawer to assign the device to.
     */
    public Builder cashDrawerIdReference(String variableRef) {
      this.variableReferences.put("cashDrawerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("cashDrawerId");
      return this;
    }

    /**
     * The point of sale device to assign.
     */
    public Builder pointOfSaleDeviceId(String pointOfSaleDeviceId) {
      this.pointOfSaleDeviceId = pointOfSaleDeviceId;
      this.fieldsSet.add("pointOfSaleDeviceId");
      return this;
    }

    /**
     * The point of sale device to assign.
     */
    public Builder pointOfSaleDeviceIdReference(String variableRef) {
      this.variableReferences.put("pointOfSaleDeviceId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("pointOfSaleDeviceId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
