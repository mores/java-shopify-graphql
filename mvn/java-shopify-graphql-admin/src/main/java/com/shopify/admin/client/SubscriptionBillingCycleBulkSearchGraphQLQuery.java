package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCycleBulkFilters;
import com.shopify.admin.types.SubscriptionBillingCyclesDateRangeSelector;
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
 * Asynchronously queries all subscription billing cycles whose [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-billingattemptexpecteddate)
 * values fall within a specified date range and meet additional filtering
 * criteria. The results of this action can be retrieved using the [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscriptionBillingCycleBulkResults) query.
 */
public class SubscriptionBillingCycleBulkSearchGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleBulkSearchGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }
  }

  public SubscriptionBillingCycleBulkSearchGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleBulkSearchGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleBulkSearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange;

    private SubscriptionBillingCycleBulkFilters filters;

    private String queryName;

    public SubscriptionBillingCycleBulkSearchGraphQLQuery build() {
      return new SubscriptionBillingCycleBulkSearchGraphQLQuery(billingAttemptExpectedDateRange, filters, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the date range within which the `billingAttemptExpectedDate` values of the billing cycles should fall.
     */
    public Builder billingAttemptExpectedDateRange(
        SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange) {
      this.billingAttemptExpectedDateRange = billingAttemptExpectedDateRange;
      this.fieldsSet.add("billingAttemptExpectedDateRange");
      return this;
    }

    /**
     * Specifies the date range within which the `billingAttemptExpectedDate` values of the billing cycles should fall.
     */
    public Builder billingAttemptExpectedDateRangeReference(String variableRef) {
      this.variableReferences.put("billingAttemptExpectedDateRange", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCyclesDateRangeSelector"))).build());
      this.fieldsSet.add("billingAttemptExpectedDateRange");
      return this;
    }

    /**
     * Criteria to filter the billing cycles on which the action is executed.
     */
    public Builder filters(SubscriptionBillingCycleBulkFilters filters) {
      this.filters = filters;
      this.fieldsSet.add("filters");
      return this;
    }

    /**
     * Criteria to filter the billing cycles on which the action is executed.
     */
    public Builder filtersReference(String variableRef) {
      this.variableReferences.put("filters", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionBillingCycleBulkFilters")).build());
      this.fieldsSet.add("filters");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
