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
 * Route the fulfillment orders to an alternative location, according to the shop's order routing settings. This involves:
 * * Finding an alternate location that can fulfill the fulfillment orders.
 * * Assigning the fulfillment orders to the new location.
 */
public class FulfillmentOrdersRerouteGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersRerouteGraphQLQuery(List<String> fulfillmentOrderIds,
      List<String> includedLocationIds, List<String> excludedLocationIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderIds != null || fieldsSet.contains("fulfillmentOrderIds")) {
        getInput().put("fulfillmentOrderIds", fulfillmentOrderIds);
    }if (includedLocationIds != null || fieldsSet.contains("includedLocationIds")) {
        getInput().put("includedLocationIds", includedLocationIds);
    }if (excludedLocationIds != null || fieldsSet.contains("excludedLocationIds")) {
        getInput().put("excludedLocationIds", excludedLocationIds);
    }
  }

  public FulfillmentOrdersRerouteGraphQLQuery(List<String> fulfillmentOrderIds,
      List<String> includedLocationIds, List<String> excludedLocationIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (fulfillmentOrderIds != null || fieldsSet.contains("fulfillmentOrderIds")) {
        getInput().put("fulfillmentOrderIds", fulfillmentOrderIds);
    }if (includedLocationIds != null || fieldsSet.contains("includedLocationIds")) {
        getInput().put("includedLocationIds", includedLocationIds);
    }if (excludedLocationIds != null || fieldsSet.contains("excludedLocationIds")) {
        getInput().put("excludedLocationIds", excludedLocationIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrdersRerouteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrdersReroute";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> fulfillmentOrderIds;

    private List<String> includedLocationIds;

    private List<String> excludedLocationIds;

    private String queryName;

    public FulfillmentOrdersRerouteGraphQLQuery build() {
      return new FulfillmentOrdersRerouteGraphQLQuery(fulfillmentOrderIds, includedLocationIds, excludedLocationIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The list of IDs of the fulfillment orders.
     */
    public Builder fulfillmentOrderIds(List<String> fulfillmentOrderIds) {
      this.fulfillmentOrderIds = fulfillmentOrderIds;
      this.fieldsSet.add("fulfillmentOrderIds");
      return this;
    }

    /**
     * The list of IDs of the fulfillment orders.
     */
    public Builder fulfillmentOrderIdsReference(String variableRef) {
      this.variableReferences.put("fulfillmentOrderIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("fulfillmentOrderIds");
      return this;
    }

    /**
     * The list of IDs of the locations to include for rerouting. By default, all locations are included.
     */
    public Builder includedLocationIds(List<String> includedLocationIds) {
      this.includedLocationIds = includedLocationIds;
      this.fieldsSet.add("includedLocationIds");
      return this;
    }

    /**
     * The list of IDs of the locations to include for rerouting. By default, all locations are included.
     */
    public Builder includedLocationIdsReference(String variableRef) {
      this.variableReferences.put("includedLocationIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("includedLocationIds");
      return this;
    }

    /**
     * The list of IDs of the locations to exclude for rerouting. Excluded
     * locations specified here take precedence over included locations provided
     * through included_location_ids.
     */
    public Builder excludedLocationIds(List<String> excludedLocationIds) {
      this.excludedLocationIds = excludedLocationIds;
      this.fieldsSet.add("excludedLocationIds");
      return this;
    }

    /**
     * The list of IDs of the locations to exclude for rerouting. Excluded
     * locations specified here take precedence over included locations provided
     * through included_location_ids.
     */
    public Builder excludedLocationIdsReference(String variableRef) {
      this.variableReferences.put("excludedLocationIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("excludedLocationIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
