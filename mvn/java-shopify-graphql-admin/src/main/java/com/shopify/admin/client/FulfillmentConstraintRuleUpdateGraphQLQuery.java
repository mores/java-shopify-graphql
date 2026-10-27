package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryMethodType;
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
 * Update a fulfillment constraint rule.
 */
public class FulfillmentConstraintRuleUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRuleUpdateGraphQLQuery(String id,
      List<DeliveryMethodType> deliveryMethodTypes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryMethodTypes != null || fieldsSet.contains("deliveryMethodTypes")) {
        getInput().put("deliveryMethodTypes", deliveryMethodTypes);
    }
  }

  public FulfillmentConstraintRuleUpdateGraphQLQuery(String id,
      List<DeliveryMethodType> deliveryMethodTypes, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryMethodTypes != null || fieldsSet.contains("deliveryMethodTypes")) {
        getInput().put("deliveryMethodTypes", deliveryMethodTypes);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentConstraintRuleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRuleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<DeliveryMethodType> deliveryMethodTypes;

    private String queryName;

    public FulfillmentConstraintRuleUpdateGraphQLQuery build() {
      return new FulfillmentConstraintRuleUpdateGraphQLQuery(id, deliveryMethodTypes, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A globally-unique identifier for the fulfillment constraint rule.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A globally-unique identifier for the fulfillment constraint rule.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the delivery method types to be updated.
     * If not provided or providing an empty list will associate the function with all delivery methods.
     */
    public Builder deliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
      this.deliveryMethodTypes = deliveryMethodTypes;
      this.fieldsSet.add("deliveryMethodTypes");
      return this;
    }

    /**
     * Specifies the delivery method types to be updated.
     * If not provided or providing an empty list will associate the function with all delivery methods.
     */
    public Builder deliveryMethodTypesReference(String variableRef) {
      this.variableReferences.put("deliveryMethodTypes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("DeliveryMethodType"))))).build());
      this.fieldsSet.add("deliveryMethodTypes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
