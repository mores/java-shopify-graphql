package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
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
 * Creates or updates a delivery promise provider. Currently restricted to select approved delivery promise partners.
 */
public class DeliveryPromiseProviderUpsertGraphQLQuery extends GraphQLQuery {
  public DeliveryPromiseProviderUpsertGraphQLQuery(Boolean active, Integer fulfillmentDelay,
      String timeZone, String locationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (active != null || fieldsSet.contains("active")) {
        getInput().put("active", active);
    }if (fulfillmentDelay != null || fieldsSet.contains("fulfillmentDelay")) {
        getInput().put("fulfillmentDelay", fulfillmentDelay);
    }if (timeZone != null || fieldsSet.contains("timeZone")) {
        getInput().put("timeZone", timeZone);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public DeliveryPromiseProviderUpsertGraphQLQuery(Boolean active, Integer fulfillmentDelay,
      String timeZone, String locationId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (active != null || fieldsSet.contains("active")) {
        getInput().put("active", active);
    }if (fulfillmentDelay != null || fieldsSet.contains("fulfillmentDelay")) {
        getInput().put("fulfillmentDelay", fulfillmentDelay);
    }if (timeZone != null || fieldsSet.contains("timeZone")) {
        getInput().put("timeZone", timeZone);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DeliveryPromiseProviderUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryPromiseProviderUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Boolean active;

    private Integer fulfillmentDelay;

    private String timeZone;

    private String locationId;

    private String queryName;

    public DeliveryPromiseProviderUpsertGraphQLQuery build() {
      return new DeliveryPromiseProviderUpsertGraphQLQuery(active, fulfillmentDelay, timeZone, locationId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
     */
    public Builder active(Boolean active) {
      this.active = active;
      this.fieldsSet.add("active");
      return this;
    }

    /**
     * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
     */
    public Builder activeReference(String variableRef) {
      this.variableReferences.put("active", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("active");
      return this;
    }

    /**
     * The number of seconds to add to the current time as a buffer when looking up
     * delivery promises. Represents how long the shop requires before releasing an
     * order to the fulfillment provider.
     */
    public Builder fulfillmentDelay(Integer fulfillmentDelay) {
      this.fulfillmentDelay = fulfillmentDelay;
      this.fieldsSet.add("fulfillmentDelay");
      return this;
    }

    /**
     * The number of seconds to add to the current time as a buffer when looking up
     * delivery promises. Represents how long the shop requires before releasing an
     * order to the fulfillment provider.
     */
    public Builder fulfillmentDelayReference(String variableRef) {
      this.variableReferences.put("fulfillmentDelay", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("fulfillmentDelay");
      return this;
    }

    /**
     * The time zone to be used for interpreting day of week and cutoff times in
     * delivery schedules when looking up delivery promises. Defaults to `UTC` when
     * creating a provider.
     */
    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      this.fieldsSet.add("timeZone");
      return this;
    }

    /**
     * The time zone to be used for interpreting day of week and cutoff times in
     * delivery schedules when looking up delivery promises. Defaults to `UTC` when
     * creating a provider.
     */
    public Builder timeZoneReference(String variableRef) {
      this.variableReferences.put("timeZone", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("timeZone");
      return this;
    }

    /**
     * The ID of the location that will be associated with the delivery promise provider.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The ID of the location that will be associated with the delivery promise provider.
     */
    public Builder locationIdReference(String variableRef) {
      this.variableReferences.put("locationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("locationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
