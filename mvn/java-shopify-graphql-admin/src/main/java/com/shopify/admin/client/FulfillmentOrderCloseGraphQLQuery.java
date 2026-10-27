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
 * Marks an in-progress fulfillment order as incomplete,
 * indicating the fulfillment service is unable to ship any remaining items,
 * and closes the fulfillment request.
 *   
 * This mutation can only be called for fulfillment orders that meet the following criteria:
 *   - Assigned to a fulfillment service location,
 *   - The fulfillment request has been accepted,
 *   - The fulfillment order status is `IN_PROGRESS`.
 *   
 * This mutation can only be called by the fulfillment service app that accepted the fulfillment request.
 * Calling this mutation returns the control of the fulfillment order to the merchant, allowing them to
 * move the fulfillment order line items to another location and fulfill from there,
 * remove and refund the line items, or to request fulfillment from the same fulfillment service again.
 *   
 * Closing a fulfillment order is explained in
 * [the fulfillment service guide](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-7-optional-close-a-fulfillment-order).
 */
public class FulfillmentOrderCloseGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderCloseGraphQLQuery(String id, String message, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentOrderCloseGraphQLQuery(String id, String message, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
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

  public FulfillmentOrderCloseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderClose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String message;

    private String queryName;

    public FulfillmentOrderCloseGraphQLQuery build() {
      return new FulfillmentOrderCloseGraphQLQuery(id, message, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the fulfillment order to mark as incomplete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the fulfillment order to mark as incomplete.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * An optional reason for marking the fulfillment order as incomplete.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * An optional reason for marking the fulfillment order as incomplete.
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
