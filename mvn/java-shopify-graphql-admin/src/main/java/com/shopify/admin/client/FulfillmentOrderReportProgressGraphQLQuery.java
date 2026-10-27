package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderReportProgressInput;
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
 * Reports the progress of an open or in-progress fulfillment order.
 */
public class FulfillmentOrderReportProgressGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderReportProgressGraphQLQuery(String id,
      FulfillmentOrderReportProgressInput progressReport, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (progressReport != null || fieldsSet.contains("progressReport")) {
        getInput().put("progressReport", progressReport);
    }
  }

  public FulfillmentOrderReportProgressGraphQLQuery(String id,
      FulfillmentOrderReportProgressInput progressReport, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (progressReport != null || fieldsSet.contains("progressReport")) {
        getInput().put("progressReport", progressReport);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrderReportProgressGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderReportProgress";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private FulfillmentOrderReportProgressInput progressReport;

    private String queryName;

    public FulfillmentOrderReportProgressGraphQLQuery build() {
      return new FulfillmentOrderReportProgressGraphQLQuery(id, progressReport, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the fulfillment order for which the progress report is targetting.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the fulfillment order for which the progress report is targetting.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The details of the progress report for the fulfillment order.
     */
    public Builder progressReport(FulfillmentOrderReportProgressInput progressReport) {
      this.progressReport = progressReport;
      this.fieldsSet.add("progressReport");
      return this;
    }

    /**
     * The details of the progress report for the fulfillment order.
     */
    public Builder progressReportReference(String variableRef) {
      this.variableReferences.put("progressReport", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("FulfillmentOrderReportProgressInput")).build());
      this.fieldsSet.add("progressReport");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
