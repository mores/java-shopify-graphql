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
 * Creates a tax summary for a given order.
 * If both an order ID and a start and end time are provided, the order ID will be used.
 */
public class TaxSummaryCreateGraphQLQuery extends GraphQLQuery {
  public TaxSummaryCreateGraphQLQuery(String orderId, OffsetDateTime startTime,
      OffsetDateTime endTime, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (startTime != null || fieldsSet.contains("startTime")) {
        getInput().put("startTime", startTime);
    }if (endTime != null || fieldsSet.contains("endTime")) {
        getInput().put("endTime", endTime);
    }
  }

  public TaxSummaryCreateGraphQLQuery(String orderId, OffsetDateTime startTime,
      OffsetDateTime endTime, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (startTime != null || fieldsSet.contains("startTime")) {
        getInput().put("startTime", startTime);
    }if (endTime != null || fieldsSet.contains("endTime")) {
        getInput().put("endTime", endTime);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public TaxSummaryCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "taxSummaryCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String orderId;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private String queryName;

    public TaxSummaryCreateGraphQLQuery build() {
      return new TaxSummaryCreateGraphQLQuery(orderId, startTime, endTime, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the order to create the tax summary for.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The ID of the order to create the tax summary for.
     */
    public Builder orderIdReference(String variableRef) {
      this.variableReferences.put("orderId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The start time of the range of orders to create the tax summary for.
     */
    public Builder startTime(OffsetDateTime startTime) {
      this.startTime = startTime;
      this.fieldsSet.add("startTime");
      return this;
    }

    /**
     * The start time of the range of orders to create the tax summary for.
     */
    public Builder startTimeReference(String variableRef) {
      this.variableReferences.put("startTime", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("startTime");
      return this;
    }

    /**
     * The end time of the range of orders to create the tax summary for.
     */
    public Builder endTime(OffsetDateTime endTime) {
      this.endTime = endTime;
      this.fieldsSet.add("endTime");
      return this;
    }

    /**
     * The end time of the range of orders to create the tax summary for.
     */
    public Builder endTimeReference(String variableRef) {
      this.variableReferences.put("endTime", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("endTime");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
