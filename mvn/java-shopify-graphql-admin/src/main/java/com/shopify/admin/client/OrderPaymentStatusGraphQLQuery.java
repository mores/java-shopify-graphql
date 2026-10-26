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
 * Retrieves the status of a deferred payment by its payment reference ID. Use
 * this query to monitor the processing status of payments that are initiated
 * through payment mutations. Deferred payments are called [payment
 * terms](https://shopify.dev/docs/apps/build/checkout/payments/payment-terms) in the API.
 *   
 * The query returns an [`OrderPaymentStatus`](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderPaymentStatus)
 * object that includes the current payment status, any error messages, and
 * associated transactions. Poll this query to track [asynchronous payment
 * processing](https://shopify.dev/docs/apps/build/payments/processing) after
 * initiating a deferred payment.
 */
public class OrderPaymentStatusGraphQLQuery extends GraphQLQuery {
  public OrderPaymentStatusGraphQLQuery(String paymentReferenceId, String orderId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (paymentReferenceId != null || fieldsSet.contains("paymentReferenceId")) {
        getInput().put("paymentReferenceId", paymentReferenceId);
    }if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }
  }

  public OrderPaymentStatusGraphQLQuery(String paymentReferenceId, String orderId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (paymentReferenceId != null || fieldsSet.contains("paymentReferenceId")) {
        getInput().put("paymentReferenceId", paymentReferenceId);
    }if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderPaymentStatusGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "orderPaymentStatus";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String paymentReferenceId;

    private String orderId;

    private String queryName;

    public OrderPaymentStatusGraphQLQuery build() {
      return new OrderPaymentStatusGraphQLQuery(paymentReferenceId, orderId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Unique identifier returned by orderCreatePayment.
     */
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      this.fieldsSet.add("paymentReferenceId");
      return this;
    }

    /**
     * Unique identifier returned by orderCreatePayment.
     */
    public Builder paymentReferenceIdReference(String variableRef) {
      this.variableReferences.put("paymentReferenceId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("paymentReferenceId");
      return this;
    }

    /**
     * ID of the order for which the payment was initiated.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * ID of the order for which the payment was initiated.
     */
    public Builder orderIdReference(String variableRef) {
      this.variableReferences.put("orderId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("orderId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
