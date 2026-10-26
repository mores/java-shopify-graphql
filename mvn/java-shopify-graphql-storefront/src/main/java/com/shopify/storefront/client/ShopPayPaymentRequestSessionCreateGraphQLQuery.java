package com.shopify.storefront.client;

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
 * Creates a [Shop Pay payment request session](https://shopify.dev/docs/api/storefront/current/objects/ShopPayPaymentRequestSession)
 * for processing payments. The session includes a checkout URL where customers
 * complete their purchase and a token for subsequent operations like submitting the payment.
 *   
 * The `sourceIdentifier` must be unique across all orders to ensure accurate reconciliation.
 *   
 * For a complete integration guide including the JavaScript SDK setup and
 * checkout flow, refer to the [Shop Component API
 * documentation](https://shopify.dev/docs/api/commerce-components/pay). For
 * implementation steps, see the [development journey guide](https://shopify.dev/docs/api/commerce-components/pay/development-journey).
 * For common error scenarios, see the [troubleshooting guide](https://shopify.dev/docs/api/commerce-components/pay/troubleshooting-guide).
 */
public class ShopPayPaymentRequestSessionCreateGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestSessionCreateGraphQLQuery(String sourceIdentifier, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (sourceIdentifier != null || fieldsSet.contains("sourceIdentifier")) {
        getInput().put("sourceIdentifier", sourceIdentifier);
    }
  }

  public ShopPayPaymentRequestSessionCreateGraphQLQuery(String sourceIdentifier, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (sourceIdentifier != null || fieldsSet.contains("sourceIdentifier")) {
        getInput().put("sourceIdentifier", sourceIdentifier);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopPayPaymentRequestSessionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopPayPaymentRequestSessionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String sourceIdentifier;

    private String queryName;

    public ShopPayPaymentRequestSessionCreateGraphQLQuery build() {
      return new ShopPayPaymentRequestSessionCreateGraphQLQuery(sourceIdentifier, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A unique identifier for the payment request session.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      this.fieldsSet.add("sourceIdentifier");
      return this;
    }

    /**
     * A unique identifier for the payment request session.
     */
    public Builder sourceIdentifierReference(String variableRef) {
      this.variableReferences.put("sourceIdentifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("sourceIdentifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
