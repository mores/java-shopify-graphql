package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ShippingLabelPurchaseInput;
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
 * Purchases a shipping label for a fulfillment order.
 *   
 * The `shippingLabelPurchase` mutation buys one shipping label for one fulfillment order using Shopify Shipping.
 * The mutation validates the fulfillment order, shipment details, package
 * information, and available rates before it starts an asynchronous label purchase.
 *   
 * > Note:
 * > The shop must have accepted the Shopify Shipping terms of service before an app can purchase labels.
 * >
 * > FedEx label purchases are not supported.
 *   
 * After validation, the mutation builds the shipment details, fetches available
 * rates, selects a rate, and enqueues the label purchase. If you provide
 * `preferredRateSelection`, the mutation attempts to purchase the matching
 * carrier and service. If you don't provide `preferredRateSelection`, the
 * mutation uses Shopify Shipping's default rate selection.
 *   
 * Default rate selection first tries to keep the fulfillment order's
 * buyer-selected delivery method when available. If no buyer-selected rate
 * matches, the mutation uses the shop's preferred carrier and service when
 * configured. Otherwise, it uses Shopify's recommended rate for the shipment destination.
 *   
 * For Merchant of Record (MoR) and Markets Pro orders, the mutation first
 * removes rates from carriers that don't support Markets Pro.
 *   
 * A shipping label can be purchased only when the fulfillment order meets the following criteria:
 *   
 * - The fulfillment order is fulfillable and requires shipping.
 * - The order has a destination shipping address.
 * - The fulfillment order has an assigned location that can be used as the origin address.
 * - The shipment has a valid shipping date, package, weight, and required customs information.
 * - At least one shipping rate is available for the shipment.
 *   
 * The mutation can return errors in two places:
 *   
 * - Synchronous validation errors are returned in the mutation's `userErrors`
 * field. For example, invalid fulfillment orders, invalid package dimensions,
 * missing customs information, or unavailable rates.
 * - Asynchronous purchase-processing errors are returned in the
 * `ShippingLabelPurchaseResult.errors` field after the purchase starts. For
 * example, carrier availability, connection, billing, or other
 * purchase-processing failures.
 *   
 * Use the returned `ShippingLabelPurchaseResult.id` to poll the purchase status
 * with the `node` query. The result starts with a status of `PENDING_PURCHASE`
 * and ends with `PURCHASED` or `PURCHASE_FAILED`. When the purchase succeeds,
 * `shippingLabels` contains the purchased label.
 */
public class ShippingLabelPurchaseGraphQLQuery extends GraphQLQuery {
  public ShippingLabelPurchaseGraphQLQuery(ShippingLabelPurchaseInput shippingLabelPurchase,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (shippingLabelPurchase != null || fieldsSet.contains("shippingLabelPurchase")) {
        getInput().put("shippingLabelPurchase", shippingLabelPurchase);
    }
  }

  public ShippingLabelPurchaseGraphQLQuery(ShippingLabelPurchaseInput shippingLabelPurchase,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (shippingLabelPurchase != null || fieldsSet.contains("shippingLabelPurchase")) {
        getInput().put("shippingLabelPurchase", shippingLabelPurchase);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShippingLabelPurchaseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shippingLabelPurchase";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ShippingLabelPurchaseInput shippingLabelPurchase;

    private String queryName;

    public ShippingLabelPurchaseGraphQLQuery build() {
      return new ShippingLabelPurchaseGraphQLQuery(shippingLabelPurchase, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The shipment, package, and rate preferences for the label purchase.
     */
    public Builder shippingLabelPurchase(ShippingLabelPurchaseInput shippingLabelPurchase) {
      this.shippingLabelPurchase = shippingLabelPurchase;
      this.fieldsSet.add("shippingLabelPurchase");
      return this;
    }

    /**
     * The shipment, package, and rate preferences for the label purchase.
     */
    public Builder shippingLabelPurchaseReference(String variableRef) {
      this.variableReferences.put("shippingLabelPurchase", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ShippingLabelPurchaseInput"))).build());
      this.fieldsSet.add("shippingLabelPurchase");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
