package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryLocationLocalPickupEnableInput;
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
 * Enables local pickup for a location so customers can collect their orders in
 * person. Configures the estimated pickup time that customers see at checkout
 * and optional instructions for finding or accessing the pickup location.
 */
public class LocationLocalPickupEnableGraphQLQuery extends GraphQLQuery {
  public LocationLocalPickupEnableGraphQLQuery(
      DeliveryLocationLocalPickupEnableInput localPickupSettings, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (localPickupSettings != null || fieldsSet.contains("localPickupSettings")) {
        getInput().put("localPickupSettings", localPickupSettings);
    }
  }

  public LocationLocalPickupEnableGraphQLQuery(
      DeliveryLocationLocalPickupEnableInput localPickupSettings, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (localPickupSettings != null || fieldsSet.contains("localPickupSettings")) {
        getInput().put("localPickupSettings", localPickupSettings);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public LocationLocalPickupEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationLocalPickupEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DeliveryLocationLocalPickupEnableInput localPickupSettings;

    private String queryName;

    public LocationLocalPickupEnableGraphQLQuery build() {
      return new LocationLocalPickupEnableGraphQLQuery(localPickupSettings, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The settings required to enable local pickup for a location.
     */
    public Builder localPickupSettings(DeliveryLocationLocalPickupEnableInput localPickupSettings) {
      this.localPickupSettings = localPickupSettings;
      this.fieldsSet.add("localPickupSettings");
      return this;
    }

    /**
     * The settings required to enable local pickup for a location.
     */
    public Builder localPickupSettingsReference(String variableRef) {
      this.variableReferences.put("localPickupSettings", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DeliveryLocationLocalPickupEnableInput"))).build());
      this.fieldsSet.add("localPickupSettings");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
