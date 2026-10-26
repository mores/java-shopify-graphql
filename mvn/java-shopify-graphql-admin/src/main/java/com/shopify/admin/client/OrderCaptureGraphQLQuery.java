package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderCaptureInput;
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
 * Captures payment for an authorized transaction on an order. Use this mutation to claim the money that was previously
 * reserved by an authorization transaction.
 *   
 * The `orderCapture` mutation can be used in the following scenarios:
 *   
 * - To capture the full amount of an authorized transaction
 * - To capture a partial payment by specifying an amount less than the total order amount
 * - To perform multiple captures on the same order, as long as the order transaction is
 * [multi-capturable](https://shopify.dev/docs/api/admin-graphql/latest/objects/ordertransaction#field-OrderTransaction.fields.multiCapturable)
 *   
 * > Note:
 * > Multi-capture functionality is only available to stores on a
 * [Shopify Plus plan](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/plans-features/shopify-plus-plan).
 * For multi-currency orders, the [`currency`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCapture#arguments-input.fields.currency)
 * field is required and should match the presentment currency from the order.
 *   
 * After capturing a payment, you can:
 *   
 * - View the transaction details including status, amount, and processing information.
 * - Track the captured amount in both shop and presentment currencies.
 * - Monitor the transaction's settlement status.
 *   
 * Learn more about [order transactions](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction).
 */
public class OrderCaptureGraphQLQuery extends GraphQLQuery {
  public OrderCaptureGraphQLQuery(OrderCaptureInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderCaptureGraphQLQuery(OrderCaptureInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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

  public OrderCaptureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCapture";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private OrderCaptureInput input;

    private String queryName;

    public OrderCaptureGraphQLQuery build() {
      return new OrderCaptureGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderCaptureInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input for the mutation.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("OrderCaptureInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
