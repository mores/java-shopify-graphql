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
 * Finds or creates a cash drawer for cash management. Also ensures the provided device is assigned to the drawer.
 */
public class CashDrawerFindOrCreateGraphQLQuery extends GraphQLQuery {
  public CashDrawerFindOrCreateGraphQLQuery(String locationId, String name,
      String pointOfSaleDeviceId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (pointOfSaleDeviceId != null || fieldsSet.contains("pointOfSaleDeviceId")) {
        getInput().put("pointOfSaleDeviceId", pointOfSaleDeviceId);
    }
  }

  public CashDrawerFindOrCreateGraphQLQuery(String locationId, String name,
      String pointOfSaleDeviceId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
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

  public CashDrawerFindOrCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cashDrawerFindOrCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String locationId;

    private String name;

    private String pointOfSaleDeviceId;

    private String queryName;

    public CashDrawerFindOrCreateGraphQLQuery build() {
      return new CashDrawerFindOrCreateGraphQLQuery(locationId, name, pointOfSaleDeviceId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The location the cash drawer is located in.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The location the cash drawer is located in.
     */
    public Builder locationIdReference(String variableRef) {
      this.variableReferences.put("locationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The name of the cash drawer.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The name of the cash drawer.
     */
    public Builder nameReference(String variableRef) {
      this.variableReferences.put("name", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The point of sale device to assign to the cash drawer.
     */
    public Builder pointOfSaleDeviceId(String pointOfSaleDeviceId) {
      this.pointOfSaleDeviceId = pointOfSaleDeviceId;
      this.fieldsSet.add("pointOfSaleDeviceId");
      return this;
    }

    /**
     * The point of sale device to assign to the cash drawer.
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
