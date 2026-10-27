package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Summary of cash management data for a location. Data is returned only if the location has a POS Pro subscription.
 */
public class CashManagementLocationSummaryGraphQLQuery extends GraphQLQuery {
  public CashManagementLocationSummaryGraphQLQuery(String locationId, LocalDate startDate,
      LocalDate endDate, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (startDate != null || fieldsSet.contains("startDate")) {
        getInput().put("startDate", startDate);
    }if (endDate != null || fieldsSet.contains("endDate")) {
        getInput().put("endDate", endDate);
    }
  }

  public CashManagementLocationSummaryGraphQLQuery(String locationId, LocalDate startDate,
      LocalDate endDate, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (startDate != null || fieldsSet.contains("startDate")) {
        getInput().put("startDate", startDate);
    }if (endDate != null || fieldsSet.contains("endDate")) {
        getInput().put("endDate", endDate);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CashManagementLocationSummaryGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cashManagementLocationSummary";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String locationId;

    private LocalDate startDate;

    private LocalDate endDate;

    private String queryName;

    public CashManagementLocationSummaryGraphQLQuery build() {
      return new CashManagementLocationSummaryGraphQLQuery(locationId, startDate, endDate, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Identifies the location to get the summary for.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * Identifies the location to get the summary for.
     */
    public Builder locationIdReference(String variableRef) {
      this.variableReferences.put("locationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The start date to summarize from.
     */
    public Builder startDate(LocalDate startDate) {
      this.startDate = startDate;
      this.fieldsSet.add("startDate");
      return this;
    }

    /**
     * The start date to summarize from.
     */
    public Builder startDateReference(String variableRef) {
      this.variableReferences.put("startDate", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Date"))).build());
      this.fieldsSet.add("startDate");
      return this;
    }

    /**
     * The end date to summarize to.
     */
    public Builder endDate(LocalDate endDate) {
      this.endDate = endDate;
      this.fieldsSet.add("endDate");
      return this;
    }

    /**
     * The end date to summarize to.
     */
    public Builder endDateReference(String variableRef) {
      this.variableReferences.put("endDate", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Date"))).build());
      this.fieldsSet.add("endDate");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
