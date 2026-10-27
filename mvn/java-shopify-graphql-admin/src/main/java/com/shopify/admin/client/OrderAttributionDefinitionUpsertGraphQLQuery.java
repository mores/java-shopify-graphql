package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderAttributionDefinitionUpsertInput;
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
 * Upserts an order attribution definition for the calling app on the current shop. Apps can use
 * attribution definitions to label orders they route to a shop, replacing or augmenting any definitions
 * shipped declaratively via the `order_attribution_config` extension.
 *   
 * Learn more in the [order attribution guide](https://shopify.dev/docs/apps/build/sales-channels/order-attribution).
 *   
 * If a definition with the same handle exists for this app on the shop, the supplied input fields are
 * merged onto it; fields omitted from the input are left unchanged. Otherwise a new definition is
 * created. To explicitly clear the stored `icon` on an existing definition, pass `icon: null`.
 */
public class OrderAttributionDefinitionUpsertGraphQLQuery extends GraphQLQuery {
  public OrderAttributionDefinitionUpsertGraphQLQuery(OrderAttributionDefinitionUpsertInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderAttributionDefinitionUpsertGraphQLQuery(OrderAttributionDefinitionUpsertInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderAttributionDefinitionUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderAttributionDefinitionUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private OrderAttributionDefinitionUpsertInput input;

    private String queryName;

    public OrderAttributionDefinitionUpsertGraphQLQuery build() {
      return new OrderAttributionDefinitionUpsertGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for upserting the order attribution definition.
     */
    public Builder input(OrderAttributionDefinitionUpsertInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for upserting the order attribution definition.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("OrderAttributionDefinitionUpsertInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
