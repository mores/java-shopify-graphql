package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentV2Input;
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
 * Creates a fulfillment for one or many fulfillment orders.
 * The fulfillment orders are associated with the same order and are assigned to the same location.
 */
public class FulfillmentCreateV2GraphQLQuery extends GraphQLQuery {
  public FulfillmentCreateV2GraphQLQuery(FulfillmentV2Input fulfillment, String message,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillment != null || fieldsSet.contains("fulfillment")) {
        getInput().put("fulfillment", fulfillment);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentCreateV2GraphQLQuery(FulfillmentV2Input fulfillment, String message,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (fulfillment != null || fieldsSet.contains("fulfillment")) {
        getInput().put("fulfillment", fulfillment);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentCreateV2GraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentCreateV2";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private FulfillmentV2Input fulfillment;

    private String message;

    private String queryName;

    public FulfillmentCreateV2GraphQLQuery build() {
      return new FulfillmentCreateV2GraphQLQuery(fulfillment, message, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields used to create a fulfillment from fulfillment orders.
     */
    public Builder fulfillment(FulfillmentV2Input fulfillment) {
      this.fulfillment = fulfillment;
      this.fieldsSet.add("fulfillment");
      return this;
    }

    /**
     * The input fields used to create a fulfillment from fulfillment orders.
     */
    public Builder fulfillmentReference(String variableRef) {
      this.variableReferences.put("fulfillment", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("FulfillmentV2Input"))).build());
      this.fieldsSet.add("fulfillment");
      return this;
    }

    /**
     * An optional message for the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * An optional message for the fulfillment request.
     */
    public Builder messageReference(String variableRef) {
      this.variableReferences.put("message", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("message");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
