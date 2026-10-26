package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderRejectionReason;
import com.shopify.admin.types.IncomingRequestLineItemInput;
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
 * Rejects a fulfillment request sent to a fulfillment service for a fulfillment order.
 */
public class FulfillmentOrderRejectFulfillmentRequestGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderRejectFulfillmentRequestGraphQLQuery(String id,
      FulfillmentOrderRejectionReason reason, String message,
      List<IncomingRequestLineItemInput> lineItems, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (reason != null || fieldsSet.contains("reason")) {
        getInput().put("reason", reason);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }
  }

  public FulfillmentOrderRejectFulfillmentRequestGraphQLQuery(String id,
      FulfillmentOrderRejectionReason reason, String message,
      List<IncomingRequestLineItemInput> lineItems, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (reason != null || fieldsSet.contains("reason")) {
        getInput().put("reason", reason);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrderRejectFulfillmentRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderRejectFulfillmentRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private FulfillmentOrderRejectionReason reason;

    private String message;

    private List<IncomingRequestLineItemInput> lineItems;

    private String queryName;

    public FulfillmentOrderRejectFulfillmentRequestGraphQLQuery build() {
      return new FulfillmentOrderRejectFulfillmentRequestGraphQLQuery(id, reason, message, lineItems, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the fulfillment order associated with the fulfillment request.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the fulfillment order associated with the fulfillment request.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The reason for the fulfillment order rejection.
     */
    public Builder reason(FulfillmentOrderRejectionReason reason) {
      this.reason = reason;
      this.fieldsSet.add("reason");
      return this;
    }

    /**
     * The reason for the fulfillment order rejection.
     */
    public Builder reasonReference(String variableRef) {
      this.variableReferences.put("reason", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("FulfillmentOrderRejectionReason")).build());
      this.fieldsSet.add("reason");
      return this;
    }

    /**
     * An optional reason for rejecting the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * An optional reason for rejecting the fulfillment request.
     */
    public Builder messageReference(String variableRef) {
      this.variableReferences.put("message", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * An optional array of line item rejection details. If none are provided, all
     * line items will be assumed to be unfulfillable.
     *     
     * **Note**: After the fulfillment request has been rejected, none of the line
     * items will be able to be fulfilled. This field documents which line items
     * specifically were unable to be fulfilled and why.
     */
    public Builder lineItems(List<IncomingRequestLineItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * An optional array of line item rejection details. If none are provided, all
     * line items will be assumed to be unfulfillable.
     *     
     * **Note**: After the fulfillment request has been rejected, none of the line
     * items will be able to be fulfilled. This field documents which line items
     * specifically were unable to be fulfilled and why.
     */
    public Builder lineItemsReference(String variableRef) {
      this.variableReferences.put("lineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("IncomingRequestLineItemInput")))).build());
      this.fieldsSet.add("lineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
