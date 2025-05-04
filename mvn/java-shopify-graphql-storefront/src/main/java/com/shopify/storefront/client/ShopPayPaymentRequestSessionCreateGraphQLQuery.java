package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ShopPayPaymentRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a new Shop Pay payment request session.
 */
public class ShopPayPaymentRequestSessionCreateGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestSessionCreateGraphQLQuery(String sourceIdentifier,
      ShopPayPaymentRequestInput paymentRequest, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (sourceIdentifier != null || fieldsSet.contains("sourceIdentifier")) {
        getInput().put("sourceIdentifier", sourceIdentifier);
    }if (paymentRequest != null || fieldsSet.contains("paymentRequest")) {
        getInput().put("paymentRequest", paymentRequest);
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

    private String sourceIdentifier;

    private ShopPayPaymentRequestInput paymentRequest;

    private String queryName;

    public ShopPayPaymentRequestSessionCreateGraphQLQuery build() {
      return new ShopPayPaymentRequestSessionCreateGraphQLQuery(sourceIdentifier, paymentRequest, queryName, fieldsSet);
               
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
     * A payment request object.
     */
    public Builder paymentRequest(ShopPayPaymentRequestInput paymentRequest) {
      this.paymentRequest = paymentRequest;
      this.fieldsSet.add("paymentRequest");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
