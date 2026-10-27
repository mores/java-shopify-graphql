package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
import com.shopify.admin.types.SubscriptionBillingAttemptInventoryPolicy;
import com.shopify.admin.types.SubscriptionBillingAttemptPaymentProcessingPolicy;
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
 * Asynchronously queries and charges all subscription billing cycles whose [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-billingattemptexpecteddate)
 * values fall within a specified date range and meet additional filtering
 * criteria. The results of this action can be retrieved using the [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscriptionBillingCycleBulkResults) query.
 */
public class SubscriptionBillingCycleBulkChargeGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleBulkChargeGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, SubscriptionActor actor,
      SubscriptionBillingAttemptInventoryPolicy inventoryPolicy,
      SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (inventoryPolicy != null || fieldsSet.contains("inventoryPolicy")) {
        getInput().put("inventoryPolicy", inventoryPolicy);
    }if (paymentProcessingPolicy != null || fieldsSet.contains("paymentProcessingPolicy")) {
        getInput().put("paymentProcessingPolicy", paymentProcessingPolicy);
    }
  }

  public SubscriptionBillingCycleBulkChargeGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, SubscriptionActor actor,
      SubscriptionBillingAttemptInventoryPolicy inventoryPolicy,
      SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (inventoryPolicy != null || fieldsSet.contains("inventoryPolicy")) {
        getInput().put("inventoryPolicy", inventoryPolicy);
    }if (paymentProcessingPolicy != null || fieldsSet.contains("paymentProcessingPolicy")) {
        getInput().put("paymentProcessingPolicy", paymentProcessingPolicy);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleBulkChargeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleBulkCharge";
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

    private SubscriptionActor actor;

    private SubscriptionBillingAttemptInventoryPolicy inventoryPolicy;

    private SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy;

    private String queryName;

    public SubscriptionBillingCycleBulkChargeGraphQLQuery build() {
      return new SubscriptionBillingCycleBulkChargeGraphQLQuery(billingAttemptExpectedDateRange, filters, actor, inventoryPolicy, paymentProcessingPolicy, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actorReference(String variableRef) {
      this.variableReferences.put("actor", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionActor")).build());
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The behaviour to use when updating inventory.
     */
    public Builder inventoryPolicy(SubscriptionBillingAttemptInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      this.fieldsSet.add("inventoryPolicy");
      return this;
    }

    /**
     * The behaviour to use when updating inventory.
     */
    public Builder inventoryPolicyReference(String variableRef) {
      this.variableReferences.put("inventoryPolicy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionBillingAttemptInventoryPolicy")).build());
      this.fieldsSet.add("inventoryPolicy");
      return this;
    }

    /**
     * Selected payment processing policy for the billing attempt. Defaults to FAIL_UNLESS_VALID_PAYMENT_METHOD.
     */
    public Builder paymentProcessingPolicy(
        SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy) {
      this.paymentProcessingPolicy = paymentProcessingPolicy;
      this.fieldsSet.add("paymentProcessingPolicy");
      return this;
    }

    /**
     * Selected payment processing policy for the billing attempt. Defaults to FAIL_UNLESS_VALID_PAYMENT_METHOD.
     */
    public Builder paymentProcessingPolicyReference(String variableRef) {
      this.variableReferences.put("paymentProcessingPolicy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionBillingAttemptPaymentProcessingPolicy")).build());
      this.fieldsSet.add("paymentProcessingPolicy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
