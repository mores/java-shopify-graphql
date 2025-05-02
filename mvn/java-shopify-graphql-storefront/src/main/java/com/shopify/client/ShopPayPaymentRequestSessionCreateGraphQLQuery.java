package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ShopPayPaymentRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a new Shop Pay payment request session.
 */
public class ShopPayPaymentRequestSessionCreateGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestSessionCreateGraphQLQuery(ShopPayPaymentRequestInput paymentRequest,
      String sourceIdentifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (paymentRequest != null || fieldsSet.contains("paymentRequest")) {
        getInput().put("paymentRequest", paymentRequest);
    }if (sourceIdentifier != null || fieldsSet.contains("sourceIdentifier")) {
        getInput().put("sourceIdentifier", sourceIdentifier);
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

    private ShopPayPaymentRequestInput paymentRequest;

    private String sourceIdentifier;

    private String queryName;

    public ShopPayPaymentRequestSessionCreateGraphQLQuery build() {
      return new ShopPayPaymentRequestSessionCreateGraphQLQuery(paymentRequest, sourceIdentifier, queryName, fieldsSet);
               
    }

    /**
     * A payment request object.
     */
    public Builder paymentRequest(ShopPayPaymentRequestInput paymentRequest) {
      this.paymentRequest = paymentRequest;
      this.fieldsSet.add("paymentRequest");
      return this;
    }

    /**
     * A unique identifier for the payment request session.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      this.fieldsSet.add("sourceIdentifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
